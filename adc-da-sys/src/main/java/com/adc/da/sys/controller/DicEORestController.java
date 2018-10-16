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
import com.adc.da.sys.entity.DicTypeEO;
import com.adc.da.sys.entity.DictionaryEO;
import com.adc.da.sys.entity.OrgEO;
import com.adc.da.sys.entity.RoleEO;
import com.adc.da.sys.page.DicTypeEOPage;
import com.adc.da.sys.page.DictionaryEOPage;
import com.adc.da.sys.service.DicEOService;
import com.adc.da.sys.service.DicTypeEOService;
import com.adc.da.sys.vo.DictionaryVO;
import com.adc.da.sys.vo.RoleVO;
import com.adc.da.sys.vo.UserVO;
import com.adc.da.util.http.PageInfo;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.BeanMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@RestController
//@RequestMapping("/${restPath}/sys/dictionary")
//@Api(description = "数据字典管理")
public class DicEORestController extends BaseController<DictionaryEO>{
	private static final Logger logger = LoggerFactory.getLogger(DictionaryEO.class);
	
	@Autowired
	private DicEOService dicEOService;
	
	@Autowired
	private DicTypeEOService dicTypeEOService;

	@Autowired
	BeanMapper beanMapper;
	
	@SuppressWarnings("unchecked")
	@ApiOperation(value = "|DictionaryEO|新增")
	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:user:save")
	public ResponseMessage<DictionaryVO> create(@RequestBody DictionaryVO dicVO) throws Exception {
		if (StringUtils.isBlank(dicVO.getDictionaryCode())) {
			return Result.error("r0014", "字典码不能为空");
		} else if (dicEOService.getDictionaryByDicCode(dicVO.getDictionaryCode()) != null) {
			return Result.error("r0015", "字典码已存在");
		}
		if (StringUtils.isBlank(dicVO.getDictionaryName())) {
			return Result.error("r0016", "字典名称不能为空");
		} else if (dicEOService.getDictionaryByDicCode(dicVO.getDictionaryName()) != null) {
			return Result.error("r0017", "字典名称已存在");
		}
		DictionaryEO dicEO = dicEOService.save(beanMapper.map(dicVO, DictionaryEO.class));
		return Result.success(beanMapper.map(dicEO, DictionaryVO.class));
	}
	
	@ApiOperation(value = "|DictionaryEO|分页查询")
	@GetMapping("")
	// @RequiresPermissions("sys:user:list")
	public ResponseMessage<PageInfo<DictionaryVO>> page(Integer pageNo, Integer pageSize, String dicCode,String dicName) throws Exception {
		DictionaryEOPage page = new DictionaryEOPage();
		if (pageNo != null) {
			page.setPage(pageNo);
		}
		if (pageSize != null) {
			page.setPageSize(pageSize);
		}
		if (StringUtils.isNotEmpty(dicCode)) {
			page.setDictionaryCode(dicCode);
			page.setDictionaryCodeOperator("LIKE");
		}
		if (StringUtils.isNotEmpty(dicName)) {
			page.setDictionaryName(dicName);
			page.setDictionaryNameOperator("LIKE");
		}
		page.setPager(new Pager());
		List<DictionaryEO> rows = dicEOService.queryByPage(page);
		return Result.success(beanMapper.mapPage(getPageInfo(page.getPager(), rows), DictionaryVO.class));
	}
	
	@ApiOperation(value = "|DictionaryEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:role:update")
	public ResponseMessage<DictionaryVO> update(@RequestBody DictionaryVO dictionaryVO) throws Exception {
		dicEOService.updateByPrimaryKeySelective(beanMapper.map(dictionaryVO, DictionaryEO.class));
		return Result.success(dictionaryVO);
	}
	
	@ApiOperation(value = "|DictionaryEO|详情")
	@GetMapping("/{id}")
	// @RequiresPermissions("sys:user:get")
	public ResponseMessage<DictionaryVO> getById(@NotNull @PathVariable("id") String id) throws Exception {
		DictionaryVO dictionaryVO = beanMapper.map(dicEOService.getDictionaryById(id), DictionaryVO.class);
		return Result.success(dictionaryVO);
	}
	
	@ApiOperation(value = "|DictionaryEO|删除")
	@DeleteMapping("/delete/{id}")
	// @RequiresPermissions("sys:role:delete")
	public ResponseMessage delete(@NotNull @PathVariable("id") String id) throws Exception {
		DicTypeEOPage page = new DicTypeEOPage();
		if (StringUtils.isNotEmpty(id)) {
			page.setDicId(id);
			//page.setDicIdOperator(dicIdOperator);
		}
		page.setPager(new Pager());
		List<DicTypeEO> rows = dicTypeEOService.queryByPage(page);
		if(rows!=null && !rows.isEmpty()){
			return Result.error("r0031", "该字典下存在类型明细，确定删除吗？");
		}
		dicEOService.delete(id);
		return Result.success();
	}
}
