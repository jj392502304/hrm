package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.JobpositionEO;
import com.adc.da.business.page.JobpositionEOPage;
import com.adc.da.business.service.JobpositionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/jobposition")
@Api(description = "|JobpositionEO|")
public class JobpositionEOController extends BaseController<JobpositionEO>{

    private static final Logger logger = LoggerFactory.getLogger(JobpositionEOController.class);

    @Autowired
    private JobpositionEOService jobpositionEOService;

	@ApiOperation(value = "|JobpositionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:jobposition:page")
    public ResponseMessage<PageInfo<JobpositionEO>> page(JobpositionEOPage page) throws Exception {
        List<JobpositionEO> rows = jobpositionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|JobpositionEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:jobposition:list")
    public ResponseMessage<List<JobpositionEO>> list(JobpositionEOPage page) throws Exception {
        return Result.success(jobpositionEOService.queryByList(page));
	}

    @ApiOperation(value = "|JobpositionEO|详情")
    @GetMapping("/{pkjobposition}")
    @RequiresPermissions("business:jobposition:get")
    public ResponseMessage<JobpositionEO> find(@PathVariable String pkjobposition) throws Exception {
        return Result.success(jobpositionEOService.selectByPrimaryKey(pkjobposition));
    }

    @ApiOperation(value = "|JobpositionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:jobposition:save")
    public ResponseMessage<JobpositionEO> create(@RequestBody JobpositionEO jobpositionEO) throws Exception {
        jobpositionEOService.insertSelective(jobpositionEO);
        return Result.success(jobpositionEO);
    }

    @ApiOperation(value = "|JobpositionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:jobposition:update")
    public ResponseMessage<JobpositionEO> update(@RequestBody JobpositionEO jobpositionEO) throws Exception {
        jobpositionEOService.updateByPrimaryKeySelective(jobpositionEO);
        return Result.success(jobpositionEO);
    }

    @ApiOperation(value = "|JobpositionEO|删除")
    @DeleteMapping("/{pkjobposition}")
    @RequiresPermissions("business:jobposition:delete")
    public ResponseMessage delete(@PathVariable String pkjobposition) throws Exception {
        jobpositionEOService.deleteByPrimaryKey(pkjobposition);
        logger.info("delete from JOBPOSITION where pkjobposition = {}", pkjobposition);
        return Result.success();
    }

}
