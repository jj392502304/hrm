package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.ApprovalserviceEO;
import com.adc.da.workflow.page.ApprovalserviceEOPage;
import com.adc.da.workflow.service.ApprovalserviceEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/approvalservice")
@Api(description = "|ApprovalserviceEO|")
public class ApprovalserviceEOController extends BaseController<ApprovalserviceEO>{

    private static final Logger logger = LoggerFactory.getLogger(ApprovalserviceEOController.class);

    @Autowired
    private ApprovalserviceEOService approvalserviceEOService;

	@ApiOperation(value = "|ApprovalserviceEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:approvalservice:page")
    public ResponseMessage<PageInfo<ApprovalserviceEO>> page(ApprovalserviceEOPage page) throws Exception {
        List<ApprovalserviceEO> rows = approvalserviceEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ApprovalserviceEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:approvalservice:list")
    public ResponseMessage<List<ApprovalserviceEO>> list(ApprovalserviceEOPage page) throws Exception {
        return Result.success(approvalserviceEOService.queryByList(page));
	}

    @ApiOperation(value = "|ApprovalserviceEO|详情")
    @GetMapping("/{approvalprimarykey}")
    @RequiresPermissions("workflow:approvalservice:get")
    public ResponseMessage<ApprovalserviceEO> find(@PathVariable String approvalprimarykey) throws Exception {
        return Result.success(approvalserviceEOService.selectByPrimaryKey(approvalprimarykey));
    }

    @ApiOperation(value = "|ApprovalserviceEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:approvalservice:save")
    public ResponseMessage<ApprovalserviceEO> create(@RequestBody ApprovalserviceEO approvalserviceEO) throws Exception {
        approvalserviceEOService.insertSelective(approvalserviceEO);
        return Result.success(approvalserviceEO);
    }

    @ApiOperation(value = "|ApprovalserviceEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:approvalservice:update")
    public ResponseMessage<ApprovalserviceEO> update(@RequestBody ApprovalserviceEO approvalserviceEO) throws Exception {
        approvalserviceEOService.updateByPrimaryKeySelective(approvalserviceEO);
        return Result.success(approvalserviceEO);
    }

    @ApiOperation(value = "|ApprovalserviceEO|删除")
    @DeleteMapping("/{approvalprimarykey}")
    @RequiresPermissions("workflow:approvalservice:delete")
    public ResponseMessage delete(@PathVariable String approvalprimarykey) throws Exception {
        approvalserviceEOService.deleteByPrimaryKey(approvalprimarykey);
        logger.info("delete from APPROVALSERVICE where approvalprimarykey = {}", approvalprimarykey);
        return Result.success();
    }

}
