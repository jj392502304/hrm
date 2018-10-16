package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.DepartmentalEO;
import com.adc.da.manager.page.DepartmentalEOPage;
import com.adc.da.manager.service.DepartmentalEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/departmental")
@Api(description = "|DepartmentalEO|")
public class DepartmentalEOController extends BaseController<DepartmentalEO>{

    private static final Logger logger = LoggerFactory.getLogger(DepartmentalEOController.class);

    @Autowired
    private DepartmentalEOService departmentalEOService;

	@ApiOperation(value = "|DepartmentalEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:departmental:page")
    public ResponseMessage<PageInfo<DepartmentalEO>> page(DepartmentalEOPage page) throws Exception {
        List<DepartmentalEO> rows = departmentalEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|DepartmentalEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:departmental:list")
    public ResponseMessage<List<DepartmentalEO>> list(DepartmentalEOPage page) throws Exception {
        return Result.success(departmentalEOService.queryByList(page));
	}

    @ApiOperation(value = "|DepartmentalEO|详情")
    @GetMapping("/{departmentprimarykey}")
    @RequiresPermissions("manager:departmental:get")
    public ResponseMessage<DepartmentalEO> find(@PathVariable String departmentprimarykey) throws Exception {
        return Result.success(departmentalEOService.selectByPrimaryKey(departmentprimarykey));
    }

    @ApiOperation(value = "|DepartmentalEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:departmental:save")
    public ResponseMessage<DepartmentalEO> create(@RequestBody DepartmentalEO departmentalEO) throws Exception {
        departmentalEOService.insertSelective(departmentalEO);
        return Result.success(departmentalEO);
    }

    @ApiOperation(value = "|DepartmentalEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:departmental:update")
    public ResponseMessage<DepartmentalEO> update(@RequestBody DepartmentalEO departmentalEO) throws Exception {
        departmentalEOService.updateByPrimaryKeySelective(departmentalEO);
        return Result.success(departmentalEO);
    }

    @ApiOperation(value = "|DepartmentalEO|删除")
    @DeleteMapping("/{departmentprimarykey}")
    @RequiresPermissions("manager:departmental:delete")
    public ResponseMessage delete(@PathVariable String departmentprimarykey) throws Exception {
        departmentalEOService.deleteByPrimaryKey(departmentprimarykey);
        logger.info("delete from DEPARTMENTAL where departmentprimarykey = {}", departmentprimarykey);
        return Result.success();
    }

}
