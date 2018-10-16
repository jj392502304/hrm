package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.ApprovalfunctionEO;
import com.adc.da.workflow.page.ApprovalfunctionEOPage;
import com.adc.da.workflow.service.ApprovalfunctionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/approvalfunction")
@Api(description = "|ApprovalfunctionEO|")
public class ApprovalfunctionEOController extends BaseController<ApprovalfunctionEO>{

    private static final Logger logger = LoggerFactory.getLogger(ApprovalfunctionEOController.class);

    @Autowired
    private ApprovalfunctionEOService approvalfunctionEOService;

	@ApiOperation(value = "|ApprovalfunctionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:approvalfunction:page")
    public ResponseMessage<PageInfo<ApprovalfunctionEO>> page(ApprovalfunctionEOPage page) throws Exception {
        List<ApprovalfunctionEO> rows = approvalfunctionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ApprovalfunctionEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:approvalfunction:list")
    public ResponseMessage<List<ApprovalfunctionEO>> list(ApprovalfunctionEOPage page) throws Exception {
        return Result.success(approvalfunctionEOService.queryByList(page));
	}

    @ApiOperation(value = "|ApprovalfunctionEO|详情")
    @GetMapping("/{approvalfunctionkey}")
    @RequiresPermissions("workflow:approvalfunction:get")
    public ResponseMessage<ApprovalfunctionEO> find(@PathVariable String approvalfunctionkey) throws Exception {
        return Result.success(approvalfunctionEOService.selectByPrimaryKey(approvalfunctionkey));
    }

    @ApiOperation(value = "|ApprovalfunctionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:approvalfunction:save")
    public ResponseMessage<ApprovalfunctionEO> create(@RequestBody ApprovalfunctionEO approvalfunctionEO) throws Exception {
        approvalfunctionEOService.insertSelective(approvalfunctionEO);
        return Result.success(approvalfunctionEO);
    }

    @ApiOperation(value = "|ApprovalfunctionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:approvalfunction:update")
    public ResponseMessage<ApprovalfunctionEO> update(@RequestBody ApprovalfunctionEO approvalfunctionEO) throws Exception {
        approvalfunctionEOService.updateByPrimaryKeySelective(approvalfunctionEO);
        return Result.success(approvalfunctionEO);
    }

    @ApiOperation(value = "|ApprovalfunctionEO|删除")
    @DeleteMapping("/{approvalfunctionkey}")
    @RequiresPermissions("workflow:approvalfunction:delete")
    public ResponseMessage delete(@PathVariable String approvalfunctionkey) throws Exception {
        approvalfunctionEOService.deleteByPrimaryKey(approvalfunctionkey);
        logger.info("delete from APPROVALFUNCTION where approvalfunctionkey = {}", approvalfunctionkey);
        return Result.success();
    }

}
