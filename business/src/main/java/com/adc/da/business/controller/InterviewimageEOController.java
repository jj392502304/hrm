package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.InterviewimageEO;
import com.adc.da.business.page.InterviewimageEOPage;
import com.adc.da.business.service.InterviewimageEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/interviewimage")
@Api(description = "|InterviewimageEO|")
public class InterviewimageEOController extends BaseController<InterviewimageEO>{

    private static final Logger logger = LoggerFactory.getLogger(InterviewimageEOController.class);

    @Autowired
    private InterviewimageEOService interviewimageEOService;

	@ApiOperation(value = "|InterviewimageEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:interviewimage:page")
    public ResponseMessage<PageInfo<InterviewimageEO>> page(InterviewimageEOPage page) throws Exception {
        List<InterviewimageEO> rows = interviewimageEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|InterviewimageEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:interviewimage:list")
    public ResponseMessage<List<InterviewimageEO>> list(InterviewimageEOPage page) throws Exception {
        return Result.success(interviewimageEOService.queryByList(page));
	}

    @ApiOperation(value = "|InterviewimageEO|详情")
    @GetMapping("/{interviewimagekey}")
    @RequiresPermissions("business:interviewimage:get")
    public ResponseMessage<InterviewimageEO> find(@PathVariable String interviewimagekey) throws Exception {
        return Result.success(interviewimageEOService.selectByPrimaryKey(interviewimagekey));
    }

    @ApiOperation(value = "|InterviewimageEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:interviewimage:save")
    public ResponseMessage<InterviewimageEO> create(@RequestBody InterviewimageEO interviewimageEO) throws Exception {
        interviewimageEOService.insertSelective(interviewimageEO);
        return Result.success(interviewimageEO);
    }

    @ApiOperation(value = "|InterviewimageEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:interviewimage:update")
    public ResponseMessage<InterviewimageEO> update(@RequestBody InterviewimageEO interviewimageEO) throws Exception {
        interviewimageEOService.updateByPrimaryKeySelective(interviewimageEO);
        return Result.success(interviewimageEO);
    }

    @ApiOperation(value = "|InterviewimageEO|删除")
    @DeleteMapping("/{interviewimagekey}")
    @RequiresPermissions("business:interviewimage:delete")
    public ResponseMessage delete(@PathVariable String interviewimagekey) throws Exception {
        interviewimageEOService.deleteByPrimaryKey(interviewimagekey);
        logger.info("delete from INTERVIEWIMAGE where interviewimagekey = {}", interviewimagekey);
        return Result.success();
    }

}
