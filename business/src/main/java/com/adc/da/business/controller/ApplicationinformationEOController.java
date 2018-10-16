package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.ApplicationinformationEO;
import com.adc.da.business.page.ApplicationinformationEOPage;
import com.adc.da.business.service.ApplicationinformationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/applicationinformation")
@Api(description = "|ApplicationinformationEO|")
public class ApplicationinformationEOController extends BaseController<ApplicationinformationEO>{

    private static final Logger logger = LoggerFactory.getLogger(ApplicationinformationEOController.class);

    @Autowired
    private ApplicationinformationEOService applicationinformationEOService;

	@ApiOperation(value = "|ApplicationinformationEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:applicationinformation:page")
    public ResponseMessage<PageInfo<ApplicationinformationEO>> page(ApplicationinformationEOPage page) throws Exception {
        List<ApplicationinformationEO> rows = applicationinformationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ApplicationinformationEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:applicationinformation:list")
    public ResponseMessage<List<ApplicationinformationEO>> list(ApplicationinformationEOPage page) throws Exception {
        return Result.success(applicationinformationEOService.queryByList(page));
	}

    @ApiOperation(value = "|ApplicationinformationEO|详情")
    @GetMapping("/{pkapplicationinfomation}")
    @RequiresPermissions("business:applicationinformation:get")
    public ResponseMessage<ApplicationinformationEO> find(@PathVariable String pkapplicationinfomation) throws Exception {
        return Result.success(applicationinformationEOService.selectByPrimaryKey(pkapplicationinfomation));
    }

    @ApiOperation(value = "|ApplicationinformationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:applicationinformation:save")
    public ResponseMessage<ApplicationinformationEO> create(@RequestBody ApplicationinformationEO applicationinformationEO) throws Exception {
        applicationinformationEOService.insertSelective(applicationinformationEO);
        return Result.success(applicationinformationEO);
    }

    @ApiOperation(value = "|ApplicationinformationEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:applicationinformation:update")
    public ResponseMessage<ApplicationinformationEO> update(@RequestBody ApplicationinformationEO applicationinformationEO) throws Exception {
        applicationinformationEOService.updateByPrimaryKeySelective(applicationinformationEO);
        return Result.success(applicationinformationEO);
    }

    @ApiOperation(value = "|ApplicationinformationEO|删除")
    @DeleteMapping("/{pkapplicationinfomation}")
    @RequiresPermissions("business:applicationinformation:delete")
    public ResponseMessage delete(@PathVariable String pkapplicationinfomation) throws Exception {
        applicationinformationEOService.deleteByPrimaryKey(pkapplicationinfomation);
        logger.info("delete from APPLICATIONINFORMATION where pkapplicationinfomation = {}", pkapplicationinfomation);
        return Result.success();
    }

}
