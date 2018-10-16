package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adc.da.base.page.Pager;
import com.adc.da.base.web.BaseController;
import com.adc.da.sys.constant.IsBelongEnum;
import com.adc.da.sys.entity.RoleEO;
import com.adc.da.sys.entity.UserRoleEO;
import com.adc.da.sys.page.RoleEOPage;
import com.adc.da.sys.service.RoleEOService;
import com.adc.da.sys.vo.RoleVO;
import com.adc.da.util.http.PageInfo;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.BeanMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@RestController
//@RequestMapping("/${restPath}/sys/role")
//@Api(description = "角色管理")
public class RoleEOController extends BaseController<RoleEO> {

	private static final Logger logger = LoggerFactory.getLogger(RoleEOController.class);

	@Autowired
	private RoleEOService roleEOService;

	@Autowired
	BeanMapper beanMapper;

	@ApiOperation(value = "|RoleEO|分页查询")
	@GetMapping("/page")
	// @RequiresPermissions("sys:role:pageList")
	public ResponseMessage<PageInfo<RoleVO>> page(Integer pageNo, Integer pageSize, String roleName) throws Exception {
		RoleEOPage page = new RoleEOPage();
		if (pageNo != null) {
			page.setPage(pageNo);
		}
		if (pageSize != null) {
			page.setPageSize(pageSize);
		}
		if (StringUtils.isNotEmpty(roleName)) {
			page.setName(roleName);
		}
		page.setPager(new Pager());
		List<RoleEO> rows = roleEOService.queryByPage(page);
		return Result.success(beanMapper.mapPage(getPageInfo(page.getPager(), rows), RoleVO.class));
	}

	@ApiOperation(value = "|RoleEO|详情")
	@GetMapping("/{id}")
	// @RequiresPermissions("sys:role:get")
	public ResponseMessage<RoleVO> getById(@NotNull @PathVariable("id") String id) throws Exception {
		RoleEO roleEO = roleEOService.getRoleWithMenus(id);
		return Result.success(beanMapper.map(roleEO, RoleVO.class));
	}

	@ApiOperation(value = "|RoleEO|列表")
	@GetMapping("")
	// @RequiresPermissions("sys:role:list")
	public ResponseMessage<List<RoleVO>> list(String userId) {
		List<RoleVO> roleVOs = beanMapper.mapList(roleEOService.findAll(), RoleVO.class);
		if (userId != null) {
			for (RoleVO roleVO : roleVOs) {
				if (roleEOService.isBelong(userId, roleVO.getRid())) {
					roleVO.setBelong(IsBelongEnum.BELONG.getValue());
				}
			}
		}
		return Result.success(roleVOs);
	}

	@ApiOperation(value = "|RoleEO|新增")
	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:role:save")
	public ResponseMessage<RoleVO> create(@RequestBody RoleVO roleVO) throws Exception {
		RoleEO roleEO = roleEOService.save(beanMapper.map(roleVO, RoleEO.class));
		roleVO.setRid(roleEO.getId());
		return Result.success(roleVO);
	}

	@ApiOperation(value = "|RoleEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:role:update")
	public ResponseMessage<RoleVO> update(@RequestBody RoleVO roleVO) throws Exception {
		roleEOService.updateByPrimaryKeySelective(beanMapper.map(roleVO, RoleEO.class));
		return Result.success(roleVO);
	}

	@ApiOperation(value = "|RoleEO|删除")
	@DeleteMapping("/{id}")
	// @RequiresPermissions("sys:role:delete")
	public ResponseMessage delete(@NotNull @PathVariable("id") String id) throws Exception {
		List<UserRoleEO> list = roleEOService.getUserRoleListByRoleId(id);
		// 如果角色有对应用户，则不允许删除
		if (list != null && list.size() > 0) {
			return Result.error("r0031", "该角色有对应用户，不能删除");
		}
		roleEOService.delete(id);
		return Result.success();
	}

	@ApiOperation(value = "配置角色菜单|RoleEO|")
	@PostMapping("/saveRoleMenu")
	// @RequiresPermissions("sys:role:saveRoleMenu")
	public ResponseMessage<RoleVO> saveRoleMenu(@RequestBody RoleVO roleVO) throws Exception {
		roleEOService.saveRoleMenu(beanMapper.map(roleVO, RoleEO.class));
		return Result.success(roleVO);
	}
}
