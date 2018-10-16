package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.ProcessnodeEO;
import com.adc.da.workflow.page.ProcessnodeEOPage;
import com.adc.da.workflow.service.ProcessnodeEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/processnode")
@Api(description = "|ProcessnodeEO|")
public class ProcessnodeEOController extends BaseController<ProcessnodeEO>{

    private static final Logger logger = LoggerFactory.getLogger(ProcessnodeEOController.class);

    @Autowired
    private ProcessnodeEOService processnodeEOService;

	@ApiOperation(value = "|ProcessnodeEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:processnode:page")
    public ResponseMessage<PageInfo<ProcessnodeEO>> page(ProcessnodeEOPage page) throws Exception {
        List<ProcessnodeEO> rows = processnodeEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ProcessnodeEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:processnode:list")
    public ResponseMessage<List<ProcessnodeEO>> list(ProcessnodeEOPage page) throws Exception {
        return Result.success(processnodeEOService.queryByList(page));
	}

    @ApiOperation(value = "|ProcessnodeEO|详情")
    @GetMapping("/{nodekey}")
    @RequiresPermissions("workflow:processnode:get")
    public ResponseMessage<ProcessnodeEO> find(@PathVariable String nodekey) throws Exception {
        return Result.success(processnodeEOService.selectByPrimaryKey(nodekey));
    }

    @ApiOperation(value = "|ProcessnodeEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:processnode:save")
    public ResponseMessage<ProcessnodeEO> create(@RequestBody ProcessnodeEO processnodeEO) throws Exception {
        processnodeEOService.insertSelective(processnodeEO);
        return Result.success(processnodeEO);
    }

    @ApiOperation(value = "|ProcessnodeEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:processnode:update")
    public ResponseMessage<ProcessnodeEO> update(@RequestBody ProcessnodeEO processnodeEO) throws Exception {
        processnodeEOService.updateByPrimaryKeySelective(processnodeEO);
        return Result.success(processnodeEO);
    }

    @ApiOperation(value = "|ProcessnodeEO|删除")
    @DeleteMapping("/{nodekey}")
    @RequiresPermissions("workflow:processnode:delete")
    public ResponseMessage delete(@PathVariable String nodekey) throws Exception {
        processnodeEOService.deleteByPrimaryKey(nodekey);
        logger.info("delete from PROCESSNODE where nodekey = {}", nodekey);
        return Result.success();
    }

}
