package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.HandsonbackgroundEO;
import com.adc.da.business.page.HandsonbackgroundEOPage;
import com.adc.da.business.service.HandsonbackgroundEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/handsonbackground")
@Api(description = "|HandsonbackgroundEO|")
public class HandsonbackgroundEOController extends BaseController<HandsonbackgroundEO>{

    private static final Logger logger = LoggerFactory.getLogger(HandsonbackgroundEOController.class);

    @Autowired
    private HandsonbackgroundEOService handsonbackgroundEOService;

	@ApiOperation(value = "|HandsonbackgroundEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:handsonbackground:page")
    public ResponseMessage<PageInfo<HandsonbackgroundEO>> page(HandsonbackgroundEOPage page) throws Exception {
        List<HandsonbackgroundEO> rows = handsonbackgroundEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|HandsonbackgroundEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:handsonbackground:list")
    public ResponseMessage<List<HandsonbackgroundEO>> list(HandsonbackgroundEOPage page) throws Exception {
        return Result.success(handsonbackgroundEOService.queryByList(page));
	}

    @ApiOperation(value = "|HandsonbackgroundEO|详情")
    @GetMapping("/{handsonbackgroundkey}")
    @RequiresPermissions("business:handsonbackground:get")
    public ResponseMessage<HandsonbackgroundEO> find(@PathVariable String handsonbackgroundkey) throws Exception {
        return Result.success(handsonbackgroundEOService.selectByPrimaryKey(handsonbackgroundkey));
    }

    @ApiOperation(value = "|HandsonbackgroundEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:handsonbackground:save")
    public ResponseMessage<HandsonbackgroundEO> create(@RequestBody HandsonbackgroundEO handsonbackgroundEO) throws Exception {
        handsonbackgroundEOService.insertSelective(handsonbackgroundEO);
        return Result.success(handsonbackgroundEO);
    }

    @ApiOperation(value = "|HandsonbackgroundEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:handsonbackground:update")
    public ResponseMessage<HandsonbackgroundEO> update(@RequestBody HandsonbackgroundEO handsonbackgroundEO) throws Exception {
        handsonbackgroundEOService.updateByPrimaryKeySelective(handsonbackgroundEO);
        return Result.success(handsonbackgroundEO);
    }

    @ApiOperation(value = "|HandsonbackgroundEO|删除")
    @DeleteMapping("/{handsonbackgroundkey}")
    @RequiresPermissions("business:handsonbackground:delete")
    public ResponseMessage delete(@PathVariable String handsonbackgroundkey) throws Exception {
        handsonbackgroundEOService.deleteByPrimaryKey(handsonbackgroundkey);
        logger.info("delete from HANDSONBACKGROUND where handsonbackgroundkey = {}", handsonbackgroundkey);
        return Result.success();
    }

}
