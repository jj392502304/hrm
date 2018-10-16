package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.ArrayList;
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

import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.DictionaryEO;
import com.adc.da.sys.entity.OrgEO;
import com.adc.da.sys.entity.UserRoleEO;
import com.adc.da.sys.service.MenuEOService;
import com.adc.da.sys.service.OrgEOService;
import com.adc.da.sys.vo.DictionaryVO;
import com.adc.da.sys.vo.MenuVO;
import com.adc.da.sys.vo.OrgVO;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.BeanMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@RestController
//@RequestMapping("/${restPath}/sys/org")
//@Api(description = "组织机构管理")
public class OrgEORestController extends BaseController<OrgEO>{
	private static final Logger logger = LoggerFactory.getLogger(OrgEORestController.class);
	
	@Autowired
	private OrgEOService orgEOService;
	
	@Autowired
	private BeanMapper beanMapper;
	
	@ApiOperation(value = "组织机构列表|OrgEO|")
	@GetMapping("/listOrgByOrgName")
	// @RequiresPermissions("sys:menu:listMenuByUserId")
	public ResponseMessage<List<OrgVO>> listOrgByOrgName(String orgName) {
		return Result.success(beanMapper.mapList(orgEOService.listOrgEOByOrgName(orgName), OrgVO.class));
	}

	@SuppressWarnings("unchecked")
	@ApiOperation(value = "|OrgEO|新增")
	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:user:save")
	public ResponseMessage<OrgVO> create(@RequestBody OrgVO orgVO) throws Exception {
		if (StringUtils.isBlank(orgVO.getName())) {
			return Result.error("r0014", "组织机构名称不能为空");
		} else if (orgEOService.getOrgEOByNameAndPid(orgVO.getName(),orgVO.getParentId()) != null) {
			return Result.error("r0015", "组织机构名称已存在");
		}
		
		OrgEO orgEO = orgEOService.save(beanMapper.map(orgVO, OrgEO.class));
		return Result.success(beanMapper.map(orgEO, OrgVO.class));
	}
	
	@ApiOperation(value = "|OrgEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:role:update")
	public ResponseMessage<OrgVO> update(@RequestBody OrgVO orgVO) throws Exception {
		orgEOService.updateByPrimaryKeySelective(beanMapper.map(orgVO, OrgEO.class));
		return Result.success(orgVO);
	}
	
	@ApiOperation(value = "|OrgEO|详情")
	@GetMapping("/{id}")
	// @RequiresPermissions("sys:user:get")
	public ResponseMessage<OrgVO> getById(@NotNull @PathVariable("id") String id) throws Exception {
		OrgVO orgVO = beanMapper.map(orgEOService.getOrgEOById(id), OrgVO.class);
		return Result.success(orgVO);
	}
	
	@ApiOperation(value = "|OrgEO|删除")
	@DeleteMapping("/delete/{id}")
	// @RequiresPermissions("sys:role:delete")
	public ResponseMessage delete(@NotNull @PathVariable("id") String id) throws Exception {
		List<OrgEO> list = orgEOService.getOrgEOByPid(id);
		// 如果该组织机构下有子机构，则不允许删除
		if (list != null && !list.isEmpty()) {
			return Result.error("r0031", "该组织机构下有子机构，不能删除");
		}
		orgEOService.delete(id);
		return Result.success();
	}
}
