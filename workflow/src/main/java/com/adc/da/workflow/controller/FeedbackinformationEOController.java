package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.FeedbackinformationEO;
import com.adc.da.workflow.page.FeedbackinformationEOPage;
import com.adc.da.workflow.service.FeedbackinformationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/feedbackinformation")
@Api(description = "|FeedbackinformationEO|")
public class FeedbackinformationEOController extends BaseController<FeedbackinformationEO>{

    private static final Logger logger = LoggerFactory.getLogger(FeedbackinformationEOController.class);

    @Autowired
    private FeedbackinformationEOService feedbackinformationEOService;

	@ApiOperation(value = "|FeedbackinformationEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:feedbackinformation:page")
    public ResponseMessage<PageInfo<FeedbackinformationEO>> page(FeedbackinformationEOPage page) throws Exception {
        List<FeedbackinformationEO> rows = feedbackinformationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|FeedbackinformationEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:feedbackinformation:list")
    public ResponseMessage<List<FeedbackinformationEO>> list(FeedbackinformationEOPage page) throws Exception {
        return Result.success(feedbackinformationEOService.queryByList(page));
	}

    @ApiOperation(value = "|FeedbackinformationEO|详情")
    @GetMapping("/{feedbackcontentkey}")
    @RequiresPermissions("workflow:feedbackinformation:get")
    public ResponseMessage<FeedbackinformationEO> find(@PathVariable String feedbackcontentkey) throws Exception {
        return Result.success(feedbackinformationEOService.selectByPrimaryKey(feedbackcontentkey));
    }

    @ApiOperation(value = "|FeedbackinformationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:feedbackinformation:save")
    public ResponseMessage<FeedbackinformationEO> create(@RequestBody FeedbackinformationEO feedbackinformationEO) throws Exception {
        feedbackinformationEOService.insertSelective(feedbackinformationEO);
        return Result.success(feedbackinformationEO);
    }

    @ApiOperation(value = "|FeedbackinformationEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:feedbackinformation:update")
    public ResponseMessage<FeedbackinformationEO> update(@RequestBody FeedbackinformationEO feedbackinformationEO) throws Exception {
        feedbackinformationEOService.updateByPrimaryKeySelective(feedbackinformationEO);
        return Result.success(feedbackinformationEO);
    }

    @ApiOperation(value = "|FeedbackinformationEO|删除")
    @DeleteMapping("/{feedbackcontentkey}")
    @RequiresPermissions("workflow:feedbackinformation:delete")
    public ResponseMessage delete(@PathVariable String feedbackcontentkey) throws Exception {
        feedbackinformationEOService.deleteByPrimaryKey(feedbackcontentkey);
        logger.info("delete from FEEDBACKINFORMATION where feedbackcontentkey = {}", feedbackcontentkey);
        return Result.success();
    }

}
