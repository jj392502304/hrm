package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.ApplicationtemplatedetailsEO;
import com.adc.da.business.page.ApplicationtemplatedetailsEOPage;
import com.adc.da.business.service.ApplicationtemplatedetailsEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/applicationtemplatedetails")
@Api(description = "|ApplicationtemplatedetailsEO|")
public class ApplicationtemplatedetailsEOController extends BaseController<ApplicationtemplatedetailsEO>{

    private static final Logger logger = LoggerFactory.getLogger(ApplicationtemplatedetailsEOController.class);

    @Autowired
    private ApplicationtemplatedetailsEOService applicationtemplatedetailsEOService;

	@ApiOperation(value = "|ApplicationtemplatedetailsEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:applicationtemplatedetails:page")
    public ResponseMessage<PageInfo<ApplicationtemplatedetailsEO>> page(ApplicationtemplatedetailsEOPage page) throws Exception {
        List<ApplicationtemplatedetailsEO> rows = applicationtemplatedetailsEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ApplicationtemplatedetailsEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:applicationtemplatedetails:list")
    public ResponseMessage<List<ApplicationtemplatedetailsEO>> list(ApplicationtemplatedetailsEOPage page) throws Exception {
        return Result.success(applicationtemplatedetailsEOService.queryByList(page));
	}

    @ApiOperation(value = "|ApplicationtemplatedetailsEO|详情")
    @GetMapping("/{pkapplicationtemplatedetails}")
    @RequiresPermissions("business:applicationtemplatedetails:get")
    public ResponseMessage<ApplicationtemplatedetailsEO> find(@PathVariable String pkapplicationtemplatedetails) throws Exception {
        return Result.success(applicationtemplatedetailsEOService.selectByPrimaryKey(pkapplicationtemplatedetails));
    }

    @ApiOperation(value = "|ApplicationtemplatedetailsEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:applicationtemplatedetails:save")
    public ResponseMessage<ApplicationtemplatedetailsEO> create(@RequestBody ApplicationtemplatedetailsEO applicationtemplatedetailsEO) throws Exception {
        applicationtemplatedetailsEOService.insertSelective(applicationtemplatedetailsEO);
        return Result.success(applicationtemplatedetailsEO);
    }

    @ApiOperation(value = "|ApplicationtemplatedetailsEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:applicationtemplatedetails:update")
    public ResponseMessage<ApplicationtemplatedetailsEO> update(@RequestBody ApplicationtemplatedetailsEO applicationtemplatedetailsEO) throws Exception {
        applicationtemplatedetailsEOService.updateByPrimaryKeySelective(applicationtemplatedetailsEO);
        return Result.success(applicationtemplatedetailsEO);
    }

    @ApiOperation(value = "|ApplicationtemplatedetailsEO|删除")
    @DeleteMapping("/{pkapplicationtemplatedetails}")
    @RequiresPermissions("business:applicationtemplatedetails:delete")
    public ResponseMessage delete(@PathVariable String pkapplicationtemplatedetails) throws Exception {
        applicationtemplatedetailsEOService.deleteByPrimaryKey(pkapplicationtemplatedetails);
        logger.info("delete from APPLICATIONTEMPLATEDETAILS where pkapplicationtemplatedetails = {}", pkapplicationtemplatedetails);
        return Result.success();
    }

}
