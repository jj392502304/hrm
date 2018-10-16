package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.ApplicationtemplateEO;
import com.adc.da.business.page.ApplicationtemplateEOPage;
import com.adc.da.business.service.ApplicationtemplateEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/applicationtemplate")
@Api(description = "|ApplicationtemplateEO|")
public class ApplicationtemplateEOController extends BaseController<ApplicationtemplateEO>{

    private static final Logger logger = LoggerFactory.getLogger(ApplicationtemplateEOController.class);

    @Autowired
    private ApplicationtemplateEOService applicationtemplateEOService;

	@ApiOperation(value = "|ApplicationtemplateEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:applicationtemplate:page")
    public ResponseMessage<PageInfo<ApplicationtemplateEO>> page(ApplicationtemplateEOPage page) throws Exception {
        List<ApplicationtemplateEO> rows = applicationtemplateEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ApplicationtemplateEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:applicationtemplate:list")
    public ResponseMessage<List<ApplicationtemplateEO>> list(ApplicationtemplateEOPage page) throws Exception {
        return Result.success(applicationtemplateEOService.queryByList(page));
	}

    @ApiOperation(value = "|ApplicationtemplateEO|详情")
    @GetMapping("/{pkapplicationtemplate}")
    @RequiresPermissions("business:applicationtemplate:get")
    public ResponseMessage<ApplicationtemplateEO> find(@PathVariable String pkapplicationtemplate) throws Exception {
        return Result.success(applicationtemplateEOService.selectByPrimaryKey(pkapplicationtemplate));
    }

    @ApiOperation(value = "|ApplicationtemplateEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:applicationtemplate:save")
    public ResponseMessage<ApplicationtemplateEO> create(@RequestBody ApplicationtemplateEO applicationtemplateEO) throws Exception {
        applicationtemplateEOService.insertSelective(applicationtemplateEO);
        return Result.success(applicationtemplateEO);
    }

    @ApiOperation(value = "|ApplicationtemplateEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:applicationtemplate:update")
    public ResponseMessage<ApplicationtemplateEO> update(@RequestBody ApplicationtemplateEO applicationtemplateEO) throws Exception {
        applicationtemplateEOService.updateByPrimaryKeySelective(applicationtemplateEO);
        return Result.success(applicationtemplateEO);
    }

    @ApiOperation(value = "|ApplicationtemplateEO|删除")
    @DeleteMapping("/{pkapplicationtemplate}")
    @RequiresPermissions("business:applicationtemplate:delete")
    public ResponseMessage delete(@PathVariable String pkapplicationtemplate) throws Exception {
        applicationtemplateEOService.deleteByPrimaryKey(pkapplicationtemplate);
        logger.info("delete from APPLICATIONTEMPLATE where pkapplicationtemplate = {}", pkapplicationtemplate);
        return Result.success();
    }

}
