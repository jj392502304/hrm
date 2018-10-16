package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.InterviewrecordsEO;
import com.adc.da.business.page.InterviewrecordsEOPage;
import com.adc.da.business.service.InterviewrecordsEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/interviewrecords")
@Api(description = "|InterviewrecordsEO|")
public class InterviewrecordsEOController extends BaseController<InterviewrecordsEO>{

    private static final Logger logger = LoggerFactory.getLogger(InterviewrecordsEOController.class);

    @Autowired
    private InterviewrecordsEOService interviewrecordsEOService;

	@ApiOperation(value = "|InterviewrecordsEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:interviewrecords:page")
    public ResponseMessage<PageInfo<InterviewrecordsEO>> page(InterviewrecordsEOPage page) throws Exception {
        List<InterviewrecordsEO> rows = interviewrecordsEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|InterviewrecordsEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:interviewrecords:list")
    public ResponseMessage<List<InterviewrecordsEO>> list(InterviewrecordsEOPage page) throws Exception {
        return Result.success(interviewrecordsEOService.queryByList(page));
	}

    @ApiOperation(value = "|InterviewrecordsEO|详情")
    @GetMapping("/{fkinterviewrecords}")
    @RequiresPermissions("business:interviewrecords:get")
    public ResponseMessage<InterviewrecordsEO> find(@PathVariable String fkinterviewrecords) throws Exception {
        return Result.success(interviewrecordsEOService.selectByPrimaryKey(fkinterviewrecords));
    }

    @ApiOperation(value = "|InterviewrecordsEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:interviewrecords:save")
    public ResponseMessage<InterviewrecordsEO> create(@RequestBody InterviewrecordsEO interviewrecordsEO) throws Exception {
        interviewrecordsEOService.insertSelective(interviewrecordsEO);
        return Result.success(interviewrecordsEO);
    }

    @ApiOperation(value = "|InterviewrecordsEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:interviewrecords:update")
    public ResponseMessage<InterviewrecordsEO> update(@RequestBody InterviewrecordsEO interviewrecordsEO) throws Exception {
        interviewrecordsEOService.updateByPrimaryKeySelective(interviewrecordsEO);
        return Result.success(interviewrecordsEO);
    }

    @ApiOperation(value = "|InterviewrecordsEO|删除")
    @DeleteMapping("/{fkinterviewrecords}")
    @RequiresPermissions("business:interviewrecords:delete")
    public ResponseMessage delete(@PathVariable String fkinterviewrecords) throws Exception {
        interviewrecordsEOService.deleteByPrimaryKey(fkinterviewrecords);
        logger.info("delete from INTERVIEWRECORDS where fkinterviewrecords = {}", fkinterviewrecords);
        return Result.success();
    }

}
