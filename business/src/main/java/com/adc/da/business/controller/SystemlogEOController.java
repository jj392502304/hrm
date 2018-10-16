package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.SystemlogEO;
import com.adc.da.business.page.SystemlogEOPage;
import com.adc.da.business.service.SystemlogEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/systemlog")
@Api(description = "|SystemlogEO|")
public class SystemlogEOController extends BaseController<SystemlogEO>{

    private static final Logger logger = LoggerFactory.getLogger(SystemlogEOController.class);

    @Autowired
    private SystemlogEOService systemlogEOService;

	@ApiOperation(value = "|SystemlogEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:systemlog:page")
    public ResponseMessage<PageInfo<SystemlogEO>> page(SystemlogEOPage page) throws Exception {
        List<SystemlogEO> rows = systemlogEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|SystemlogEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:systemlog:list")
    public ResponseMessage<List<SystemlogEO>> list(SystemlogEOPage page) throws Exception {
        return Result.success(systemlogEOService.queryByList(page));
	}

    @ApiOperation(value = "|SystemlogEO|详情")
    @GetMapping("/{systemlog}")
    @RequiresPermissions("business:systemlog:get")
    public ResponseMessage<SystemlogEO> find(@PathVariable String systemlog) throws Exception {
        return Result.success(systemlogEOService.selectByPrimaryKey(systemlog));
    }

    @ApiOperation(value = "|SystemlogEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:systemlog:save")
    public ResponseMessage<SystemlogEO> create(@RequestBody SystemlogEO systemlogEO) throws Exception {
        systemlogEOService.insertSelective(systemlogEO);
        return Result.success(systemlogEO);
    }

    @ApiOperation(value = "|SystemlogEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:systemlog:update")
    public ResponseMessage<SystemlogEO> update(@RequestBody SystemlogEO systemlogEO) throws Exception {
        systemlogEOService.updateByPrimaryKeySelective(systemlogEO);
        return Result.success(systemlogEO);
    }

    @ApiOperation(value = "|SystemlogEO|删除")
    @DeleteMapping("/{systemlog}")
    @RequiresPermissions("business:systemlog:delete")
    public ResponseMessage delete(@PathVariable String systemlog) throws Exception {
        systemlogEOService.deleteByPrimaryKey(systemlog);
        logger.info("delete from SYSTEMLOG where systemlog = {}", systemlog);
        return Result.success();
    }

}
