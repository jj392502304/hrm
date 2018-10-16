package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.DepartmentalpositionsEO;
import com.adc.da.manager.page.DepartmentalpositionsEOPage;
import com.adc.da.manager.service.DepartmentalpositionsEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/departmentalpositions")
@Api(description = "|DepartmentalpositionsEO|")
public class DepartmentalpositionsEOController extends BaseController<DepartmentalpositionsEO>{

    private static final Logger logger = LoggerFactory.getLogger(DepartmentalpositionsEOController.class);

    @Autowired
    private DepartmentalpositionsEOService departmentalpositionsEOService;

	@ApiOperation(value = "|DepartmentalpositionsEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:departmentalpositions:page")
    public ResponseMessage<PageInfo<DepartmentalpositionsEO>> page(DepartmentalpositionsEOPage page) throws Exception {
        List<DepartmentalpositionsEO> rows = departmentalpositionsEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|DepartmentalpositionsEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:departmentalpositions:list")
    public ResponseMessage<List<DepartmentalpositionsEO>> list(DepartmentalpositionsEOPage page) throws Exception {
        return Result.success(departmentalpositionsEOService.queryByList(page));
	}

    @ApiOperation(value = "|DepartmentalpositionsEO|详情")
    @GetMapping("/{departmentjobkey}")
    @RequiresPermissions("manager:departmentalpositions:get")
    public ResponseMessage<DepartmentalpositionsEO> find(@PathVariable String departmentjobkey) throws Exception {
        return Result.success(departmentalpositionsEOService.selectByPrimaryKey(departmentjobkey));
    }

    @ApiOperation(value = "|DepartmentalpositionsEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:departmentalpositions:save")
    public ResponseMessage<DepartmentalpositionsEO> create(@RequestBody DepartmentalpositionsEO departmentalpositionsEO) throws Exception {
        departmentalpositionsEOService.insertSelective(departmentalpositionsEO);
        return Result.success(departmentalpositionsEO);
    }

    @ApiOperation(value = "|DepartmentalpositionsEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:departmentalpositions:update")
    public ResponseMessage<DepartmentalpositionsEO> update(@RequestBody DepartmentalpositionsEO departmentalpositionsEO) throws Exception {
        departmentalpositionsEOService.updateByPrimaryKeySelective(departmentalpositionsEO);
        return Result.success(departmentalpositionsEO);
    }

    @ApiOperation(value = "|DepartmentalpositionsEO|删除")
    @DeleteMapping("/{departmentjobkey}")
    @RequiresPermissions("manager:departmentalpositions:delete")
    public ResponseMessage delete(@PathVariable String departmentjobkey) throws Exception {
        departmentalpositionsEOService.deleteByPrimaryKey(departmentjobkey);
        logger.info("delete from DEPARTMENTALPOSITIONS where departmentjobkey = {}", departmentjobkey);
        return Result.success();
    }

}
