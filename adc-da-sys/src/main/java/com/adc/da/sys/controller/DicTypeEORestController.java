package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.Arrays;
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
import com.adc.da.sys.page.DicTypeEOPage;
import com.adc.da.sys.page.DictionaryEOPage;
import com.adc.da.sys.service.DicTypeEOService;
import com.adc.da.sys.vo.DicTypeVO;
import com.adc.da.sys.vo.DictionaryVO;
import com.adc.da.util.http.PageInfo;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.BeanMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//
//@RestController
//@RequestMapping("/${restPath}/sys/dictype")
//@Api(description = "字典类型明细管理")
public class DicTypeEORestController extends BaseController<DicTypeEO>{
	private static final Logger logger = LoggerFactory.getLogger(DicTypeEO.class);
	@Autowired
	private DicTypeEOService dicTypeEOService;

	@Autowired
	BeanMapper beanMapper;
	
	@ApiOperation(value = "|DicTypeEO|新增")
	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:user:save")
	public ResponseMessage<DicTypeVO> create(@RequestBody DicTypeVO dicTypeVO) throws Exception {
		
		DicTypeEO dicTypeEO = dicTypeEOService.save(beanMapper.map(dicTypeVO, DicTypeEO.class));
		return Result.success(beanMapper.map(dicTypeEO, DicTypeVO.class));
	}
	
	@ApiOperation(value = "|DicTypeEO|分页列表")
	@GetMapping("/page")
    public ResponseMessage<PageInfo<DicTypeVO>> pageListByDicId(Integer pageNo, Integer pageSize,String dicId, String dicTypeName) throws Exception{
		DicTypeEOPage page = new DicTypeEOPage();
		if (pageNo != null) {
			page.setPage(pageNo);
		}
		if (pageSize != null) {
			page.setPageSize(pageSize);
		}
		if (StringUtils.isNotEmpty(dicId)) {
			page.setDicId(dicId);
			//page.setDicIdOperator(dicIdOperator);
		}
		if (StringUtils.isNotEmpty(dicTypeName)) {
			page.setDicTypeName(dicTypeName);
			page.setDicTypeNameOperator("LIKE");
		}
		
		page.setPager(new Pager());
		List<DicTypeEO> rows = dicTypeEOService.queryByPage(page);
		return Result.success(beanMapper.mapPage(getPageInfo(page.getPager(), rows), DicTypeVO.class));
    }
	
	@ApiOperation(value = "|DicTypeEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:role:update")
	public ResponseMessage<DicTypeVO> update(@RequestBody DicTypeVO dicTypeVO) throws Exception {
		dicTypeEOService.updateByPrimaryKeySelective(beanMapper.map(dicTypeVO, DicTypeEO.class));
		return Result.success(dicTypeVO);
	}
	
	@ApiOperation(value = "|DicTypeEO|详情")
	@GetMapping("/{id}")
	// @RequiresPermissions("sys:user:get")
	public ResponseMessage<DicTypeVO> getById(@NotNull @PathVariable("id") String id) throws Exception {
		DicTypeVO dicTypeVO = beanMapper.map(dicTypeEOService.getDicTypeById(id), DicTypeVO.class);
		return Result.success(dicTypeVO);
	}
	
	@ApiOperation(value = "|DicTypeEO|删除")
	@DeleteMapping("/delete/{ids}")
	// @RequiresPermissions("sys:role:delete")
	public ResponseMessage delete(@NotNull @PathVariable("ids") String[] ids) throws Exception {
		dicTypeEOService.delete(Arrays.asList(ids));
		return Result.success();
	}
}
