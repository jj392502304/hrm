package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.TemporaryinformationEO;
import com.adc.da.business.page.TemporaryinformationEOPage;
import com.adc.da.business.service.TemporaryinformationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/temporaryinformation")
@Api(description = "|TemporaryinformationEO|")
public class TemporaryinformationEOController extends BaseController<TemporaryinformationEO>{

    private static final Logger logger = LoggerFactory.getLogger(TemporaryinformationEOController.class);

    @Autowired
    private TemporaryinformationEOService temporaryinformationEOService;

	@ApiOperation(value = "|TemporaryinformationEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:temporaryinformation:page")
    public ResponseMessage<PageInfo<TemporaryinformationEO>> page(TemporaryinformationEOPage page) throws Exception {
        List<TemporaryinformationEO> rows = temporaryinformationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|TemporaryinformationEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:temporaryinformation:list")
    public ResponseMessage<List<TemporaryinformationEO>> list(TemporaryinformationEOPage page) throws Exception {
        return Result.success(temporaryinformationEOService.queryByList(page));
	}

    @ApiOperation(value = "|TemporaryinformationEO|详情")
    @GetMapping("/{pktemporary}")
    @RequiresPermissions("business:temporaryinformation:get")
    public ResponseMessage<TemporaryinformationEO> find(@PathVariable String pktemporary) throws Exception {
        return Result.success(temporaryinformationEOService.selectByPrimaryKey(pktemporary));
    }

    @ApiOperation(value = "|TemporaryinformationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:temporaryinformation:save")
    public ResponseMessage<TemporaryinformationEO> create(@RequestBody TemporaryinformationEO temporaryinformationEO) throws Exception {
        temporaryinformationEOService.insertSelective(temporaryinformationEO);
        return Result.success(temporaryinformationEO);
    }

    @ApiOperation(value = "|TemporaryinformationEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:temporaryinformation:update")
    public ResponseMessage<TemporaryinformationEO> update(@RequestBody TemporaryinformationEO temporaryinformationEO) throws Exception {
        temporaryinformationEOService.updateByPrimaryKeySelective(temporaryinformationEO);
        return Result.success(temporaryinformationEO);
    }

    @ApiOperation(value = "|TemporaryinformationEO|删除")
    @DeleteMapping("/{pktemporary}")
    @RequiresPermissions("business:temporaryinformation:delete")
    public ResponseMessage delete(@PathVariable String pktemporary) throws Exception {
        temporaryinformationEOService.deleteByPrimaryKey(pktemporary);
        logger.info("delete from TEMPORARYINFORMATION where pktemporary = {}", pktemporary);
        return Result.success();
    }

}
