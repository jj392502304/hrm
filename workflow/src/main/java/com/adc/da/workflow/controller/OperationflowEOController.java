package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.OperationflowEO;
import com.adc.da.workflow.page.OperationflowEOPage;
import com.adc.da.workflow.service.OperationflowEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/operationflow")
@Api(description = "|OperationflowEO|")
public class OperationflowEOController extends BaseController<OperationflowEO>{

    private static final Logger logger = LoggerFactory.getLogger(OperationflowEOController.class);

    @Autowired
    private OperationflowEOService operationflowEOService;

	@ApiOperation(value = "|OperationflowEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:operationflow:page")
    public ResponseMessage<PageInfo<OperationflowEO>> page(OperationflowEOPage page) throws Exception {
        List<OperationflowEO> rows = operationflowEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|OperationflowEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:operationflow:list")
    public ResponseMessage<List<OperationflowEO>> list(OperationflowEOPage page) throws Exception {
        return Result.success(operationflowEOService.queryByList(page));
	}

    @ApiOperation(value = "|OperationflowEO|详情")
    @GetMapping("/{procedurekey}")
    @RequiresPermissions("workflow:operationflow:get")
    public ResponseMessage<OperationflowEO> find(@PathVariable String procedurekey) throws Exception {
        return Result.success(operationflowEOService.selectByPrimaryKey(procedurekey));
    }

    @ApiOperation(value = "|OperationflowEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:operationflow:save")
    public ResponseMessage<OperationflowEO> create(@RequestBody OperationflowEO operationflowEO) throws Exception {
        operationflowEOService.insertSelective(operationflowEO);
        return Result.success(operationflowEO);
    }

    @ApiOperation(value = "|OperationflowEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:operationflow:update")
    public ResponseMessage<OperationflowEO> update(@RequestBody OperationflowEO operationflowEO) throws Exception {
        operationflowEOService.updateByPrimaryKeySelective(operationflowEO);
        return Result.success(operationflowEO);
    }

    @ApiOperation(value = "|OperationflowEO|删除")
    @DeleteMapping("/{procedurekey}")
    @RequiresPermissions("workflow:operationflow:delete")
    public ResponseMessage delete(@PathVariable String procedurekey) throws Exception {
        operationflowEOService.deleteByPrimaryKey(procedurekey);
        logger.info("delete from OPERATIONFLOW where procedurekey = {}", procedurekey);
        return Result.success();
    }

}
