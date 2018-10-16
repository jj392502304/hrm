package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.AdditionalinformationEO;
import com.adc.da.business.page.AdditionalinformationEOPage;
import com.adc.da.business.service.AdditionalinformationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/additionalinformation")
@Api(description = "|AdditionalinformationEO|")
public class AdditionalinformationEOController extends BaseController<AdditionalinformationEO>{

    private static final Logger logger = LoggerFactory.getLogger(AdditionalinformationEOController.class);

    @Autowired
    private AdditionalinformationEOService additionalinformationEOService;

	@ApiOperation(value = "|AdditionalinformationEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:additionalinformation:page")
    public ResponseMessage<PageInfo<AdditionalinformationEO>> page(AdditionalinformationEOPage page) throws Exception {
        List<AdditionalinformationEO> rows = additionalinformationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|AdditionalinformationEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:additionalinformation:list")
    public ResponseMessage<List<AdditionalinformationEO>> list(AdditionalinformationEOPage page) throws Exception {
        return Result.success(additionalinformationEOService.queryByList(page));
	}

    @ApiOperation(value = "|AdditionalinformationEO|详情")
    @GetMapping("/{pkadditionalinformation}")
    @RequiresPermissions("business:additionalinformation:get")
    public ResponseMessage<AdditionalinformationEO> find(@PathVariable String pkadditionalinformation) throws Exception {
        return Result.success(additionalinformationEOService.selectByPrimaryKey(pkadditionalinformation));
    }

    @ApiOperation(value = "|AdditionalinformationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:additionalinformation:save")
    public ResponseMessage<AdditionalinformationEO> create(@RequestBody AdditionalinformationEO additionalinformationEO) throws Exception {
        additionalinformationEOService.insertSelective(additionalinformationEO);
        return Result.success(additionalinformationEO);
    }

    @ApiOperation(value = "|AdditionalinformationEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:additionalinformation:update")
    public ResponseMessage<AdditionalinformationEO> update(@RequestBody AdditionalinformationEO additionalinformationEO) throws Exception {
        additionalinformationEOService.updateByPrimaryKeySelective(additionalinformationEO);
        return Result.success(additionalinformationEO);
    }

    @ApiOperation(value = "|AdditionalinformationEO|删除")
    @DeleteMapping("/{pkadditionalinformation}")
    @RequiresPermissions("business:additionalinformation:delete")
    public ResponseMessage delete(@PathVariable String pkadditionalinformation) throws Exception {
        additionalinformationEOService.deleteByPrimaryKey(pkadditionalinformation);
        logger.info("delete from ADDITIONALINFORMATION where pkadditionalinformation = {}", pkadditionalinformation);
        return Result.success();
    }

}
