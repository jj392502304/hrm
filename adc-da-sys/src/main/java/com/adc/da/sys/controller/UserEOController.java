package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.page.Pager;
import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.UserEO;
import com.adc.da.sys.page.UserEOPage;
import com.adc.da.sys.service.UserEOService;
import com.adc.da.sys.vo.UserVO;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.BeanMapper;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@RestController
//@RequestMapping("/${restPath}/sys/user")
//@Api(description = "用户管理")
public class UserEOController extends BaseController<UserEO> {

	private static final Logger logger = LoggerFactory.getLogger(UserEOController.class);

	@Autowired
	private UserEOService userEOService;

	@Autowired
	BeanMapper beanMapper;

	@ApiOperation(value = "|UserEO|详情")
	@GetMapping("/{id}")
	// @RequiresPermissions("sys:user:get")
	public ResponseMessage<UserVO> getById(@NotNull @PathVariable("id") String id) throws Exception {
		UserVO userVO = beanMapper.map(userEOService.getUserWithRoles(id), UserVO.class);
		return Result.success(userVO);
	}

	@ApiOperation(value = "|UserEO|分页查询")
	@GetMapping("")
	// @RequiresPermissions("sys:user:list")
	public ResponseMessage<PageInfo<UserVO>> page(Integer pageNo, Integer pageSize, String usname,String rolename) throws Exception {
		UserEOPage page = new UserEOPage();
		if (pageNo != null) {
			page.setPage(pageNo);
		}
		if (pageSize != null) {
			page.setPageSize(pageSize);
		}
		if (StringUtils.isNotEmpty(usname)) {
			page.setUsname(usname);
			page.setUsnameOperator("LIKE");
		}
		if (StringUtils.isNotEmpty(rolename)) {
			page.setRolename(rolename);
			page.setRolenameOperator("LIKE");
		}
		page.setPager(new Pager());
		List<UserEO> rows = userEOService.queryByPage(page);
		return Result.success(beanMapper.mapPage(getPageInfo(page.getPager(), rows), UserVO.class));
	}

	@ApiOperation(value = "|UserEO|新增")
	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:user:save")
	public ResponseMessage<UserVO> create(@RequestBody UserVO userVO) throws Exception {
		if (StringUtils.isBlank(userVO.getAccount())) {
			return Result.error("r0014", "登录名不能为空");
		} else if (userEOService.getUserByLoginName(userVO.getAccount()) != null) {
			return Result.error("r0015", "用户名已存在");
		}
		if (StringUtils.isBlank(userVO.getPassword())) {
			return Result.error("r0016", "密码不能为空");
		} else if (!userVO.getPassword().matches("^(?![0-9]*$)[a-zA-Z0-9]{6,10}$")) {
			return Result.error("r0017", "密码必须6-10位且不能纯数字");
		}
		// 前台如果base64传输密文，则需要解码
		// userVO.setPassword(new String(Encodes.decodeBase64(userVO.getPassword())));
		UserEO userEO = userEOService.save(beanMapper.map(userVO, UserEO.class));
		userEOService.saveUserRole(userEO);
		userEOService.saveUserOrg(userEO);
		return Result.success(beanMapper.map(userEO, UserVO.class));
	}

	@ApiOperation(value = "|UserEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:user:update")
	public ResponseMessage<UserVO> update(@RequestBody UserVO userVO) throws Exception {
		userEOService.updateByPrimaryKeySelective(beanMapper.map(userVO, UserEO.class));
		userEOService.saveUserRole(beanMapper.map(userVO, UserEO.class));
		userEOService.saveUserOrg(beanMapper.map(userVO, UserEO.class));
		return Result.success(userVO);
	}

	@ApiOperation(value = "|UserEO|删除")
	@DeleteMapping("/{ids}")
	// @RequiresPermissions("sys:user:delete")
	public ResponseMessage delete(@NotNull @PathVariable("ids") String[] ids) throws Exception {
		userEOService.delete(Arrays.asList(ids));
		return Result.success();
	}

	@ApiOperation(value = "配置用户角色|UserEO|")
	@PostMapping("/saveUserRole")
//	@RequiresPermissions("sys:user:saveUserRole")
	public ResponseMessage<UserVO> saveUserRole(@RequestBody UserVO userVO) {
		userEOService.saveUserRole(beanMapper.map(userVO, UserEO.class));
		return Result.success(userVO);
	}
}
