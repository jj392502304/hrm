package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.InterviewplaceEO;
import com.adc.da.business.page.InterviewplaceEOPage;
import com.adc.da.business.service.InterviewplaceEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/interviewplace")
@Api(description = "|InterviewplaceEO|")
public class InterviewplaceEOController extends BaseController<InterviewplaceEO>{

    private static final Logger logger = LoggerFactory.getLogger(InterviewplaceEOController.class);

    @Autowired
    private InterviewplaceEOService interviewplaceEOService;

	@ApiOperation(value = "|InterviewplaceEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:interviewplace:page")
    public ResponseMessage<PageInfo<InterviewplaceEO>> page(InterviewplaceEOPage page) throws Exception {
        List<InterviewplaceEO> rows = interviewplaceEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|InterviewplaceEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:interviewplace:list")
    public ResponseMessage<List<InterviewplaceEO>> list(InterviewplaceEOPage page) throws Exception {
        return Result.success(interviewplaceEOService.queryByList(page));
	}

    @ApiOperation(value = "|InterviewplaceEO|详情")
    @GetMapping("/{interviewplace}")
    @RequiresPermissions("business:interviewplace:get")
    public ResponseMessage<InterviewplaceEO> find(@PathVariable String interviewplace) throws Exception {
        return Result.success(interviewplaceEOService.selectByPrimaryKey(interviewplace));
    }

    @ApiOperation(value = "|InterviewplaceEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:interviewplace:save")
    public ResponseMessage<InterviewplaceEO> create(@RequestBody InterviewplaceEO interviewplaceEO) throws Exception {
        interviewplaceEOService.insertSelective(interviewplaceEO);
        return Result.success(interviewplaceEO);
    }

    @ApiOperation(value = "|InterviewplaceEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:interviewplace:update")
    public ResponseMessage<InterviewplaceEO> update(@RequestBody InterviewplaceEO interviewplaceEO) throws Exception {
        interviewplaceEOService.updateByPrimaryKeySelective(interviewplaceEO);
        return Result.success(interviewplaceEO);
    }

    @ApiOperation(value = "|InterviewplaceEO|删除")
    @DeleteMapping("/{interviewplace}")
    @RequiresPermissions("business:interviewplace:delete")
    public ResponseMessage delete(@PathVariable String interviewplace) throws Exception {
        interviewplaceEOService.deleteByPrimaryKey(interviewplace);
        logger.info("delete from INTERVIEWPLACE where interviewplace = {}", interviewplace);
        return Result.success();
    }

}
