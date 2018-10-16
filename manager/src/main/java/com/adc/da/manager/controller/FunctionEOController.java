package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.FunctionEO;
import com.adc.da.manager.page.FunctionEOPage;
import com.adc.da.manager.service.FunctionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/function")
@Api(description = "|FunctionEO|功能")
public class FunctionEOController extends BaseController<FunctionEO>{

    private static final Logger logger = LoggerFactory.getLogger(FunctionEOController.class);

    @Autowired
    private FunctionEOService functionEOService;

	@ApiOperation(value = "|FunctionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:function:page")
    public ResponseMessage<PageInfo<FunctionEO>> page(FunctionEOPage page) throws Exception {
        List<FunctionEO> rows = functionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|FunctionEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:function:list")
    public ResponseMessage<List<FunctionEO>> list(FunctionEOPage page) throws Exception {
        return Result.success(functionEOService.queryByList(page));
	}

    @ApiOperation(value = "|FunctionEO|详情")
    @GetMapping("/{functionkey}")
    @RequiresPermissions("manager:function:get")
    public ResponseMessage<FunctionEO> find(@PathVariable String functionkey) throws Exception {
        return Result.success(functionEOService.selectByPrimaryKey(functionkey));
    }

    @ApiOperation(value = "|FunctionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:function:save")
    public ResponseMessage<FunctionEO> create(@RequestBody FunctionEO functionEO) throws Exception {
        functionEOService.insertSelective(functionEO);
        return Result.success(functionEO);
    }

    @ApiOperation(value = "|FunctionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:function:update")
    public ResponseMessage<FunctionEO> update(@RequestBody FunctionEO functionEO) throws Exception {
        functionEOService.updateByPrimaryKeySelective(functionEO);
        return Result.success(functionEO);
    }

    @ApiOperation(value = "|FunctionEO|删除")
    @DeleteMapping("/{functionkey}")
    @RequiresPermissions("manager:function:delete")
    public ResponseMessage delete(@PathVariable String functionkey) throws Exception {
        functionEOService.deleteByPrimaryKey(functionkey);
        logger.info("delete from FUNCTION where functionkey = {}", functionkey);
        return Result.success();
    }

}
