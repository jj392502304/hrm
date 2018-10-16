package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.JobcandidatespostEO;
import com.adc.da.business.page.JobcandidatespostEOPage;
import com.adc.da.business.service.JobcandidatespostEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/jobcandidatespost")
@Api(description = "|JobcandidatespostEO|")
public class JobcandidatespostEOController extends BaseController<JobcandidatespostEO>{

    private static final Logger logger = LoggerFactory.getLogger(JobcandidatespostEOController.class);

    @Autowired
    private JobcandidatespostEOService jobcandidatespostEOService;

	@ApiOperation(value = "|JobcandidatespostEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:jobcandidatespost:page")
    public ResponseMessage<PageInfo<JobcandidatespostEO>> page(JobcandidatespostEOPage page) throws Exception {
        List<JobcandidatespostEO> rows = jobcandidatespostEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|JobcandidatespostEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:jobcandidatespost:list")
    public ResponseMessage<List<JobcandidatespostEO>> list(JobcandidatespostEOPage page) throws Exception {
        return Result.success(jobcandidatespostEOService.queryByList(page));
	}

    @ApiOperation(value = "|JobcandidatespostEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:jobcandidatespost:save")
    public ResponseMessage<JobcandidatespostEO> create(@RequestBody JobcandidatespostEO jobcandidatespostEO) throws Exception {
        jobcandidatespostEOService.insertSelective(jobcandidatespostEO);
        return Result.success(jobcandidatespostEO);
    }

}
