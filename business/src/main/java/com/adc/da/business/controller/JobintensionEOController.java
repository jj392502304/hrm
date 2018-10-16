package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.JobintensionEO;
import com.adc.da.business.page.JobintensionEOPage;
import com.adc.da.business.service.JobintensionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/jobintension")
@Api(description = "|JobintensionEO|")
public class JobintensionEOController extends BaseController<JobintensionEO>{

    private static final Logger logger = LoggerFactory.getLogger(JobintensionEOController.class);

    @Autowired
    private JobintensionEOService jobintensionEOService;

	@ApiOperation(value = "|JobintensionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:jobintension:page")
    public ResponseMessage<PageInfo<JobintensionEO>> page(JobintensionEOPage page) throws Exception {
        List<JobintensionEO> rows = jobintensionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|JobintensionEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:jobintension:list")
    public ResponseMessage<List<JobintensionEO>> list(JobintensionEOPage page) throws Exception {
        return Result.success(jobintensionEOService.queryByList(page));
	}

    @ApiOperation(value = "|JobintensionEO|详情")
    @GetMapping("/{pkjobintention}")
    @RequiresPermissions("business:jobintension:get")
    public ResponseMessage<JobintensionEO> find(@PathVariable String pkjobintention) throws Exception {
        return Result.success(jobintensionEOService.selectByPrimaryKey(pkjobintention));
    }

    @ApiOperation(value = "|JobintensionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:jobintension:save")
    public ResponseMessage<JobintensionEO> create(@RequestBody JobintensionEO jobintensionEO) throws Exception {
        jobintensionEOService.insertSelective(jobintensionEO);
        return Result.success(jobintensionEO);
    }

    @ApiOperation(value = "|JobintensionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:jobintension:update")
    public ResponseMessage<JobintensionEO> update(@RequestBody JobintensionEO jobintensionEO) throws Exception {
        jobintensionEOService.updateByPrimaryKeySelective(jobintensionEO);
        return Result.success(jobintensionEO);
    }

    @ApiOperation(value = "|JobintensionEO|删除")
    @DeleteMapping("/{pkjobintention}")
    @RequiresPermissions("business:jobintension:delete")
    public ResponseMessage delete(@PathVariable String pkjobintention) throws Exception {
        jobintensionEOService.deleteByPrimaryKey(pkjobintention);
        logger.info("delete from JOBINTENSION where pkjobintention = {}", pkjobintention);
        return Result.success();
    }

}
