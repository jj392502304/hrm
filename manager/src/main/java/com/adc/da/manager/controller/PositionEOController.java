package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.PositionEO;
import com.adc.da.manager.page.PositionEOPage;
import com.adc.da.manager.service.PositionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/position")
@Api(description = "|PositionEO|")
public class PositionEOController extends BaseController<PositionEO>{

    private static final Logger logger = LoggerFactory.getLogger(PositionEOController.class);

    @Autowired
    private PositionEOService positionEOService;

	@ApiOperation(value = "|PositionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:position:page")
    public ResponseMessage<PageInfo<PositionEO>> page(PositionEOPage page) throws Exception {
        List<PositionEO> rows = positionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|PositionEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:position:list")
    public ResponseMessage<List<PositionEO>> list(PositionEOPage page) throws Exception {
        return Result.success(positionEOService.queryByList(page));
	}

    @ApiOperation(value = "|PositionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:position:save")
    public ResponseMessage<PositionEO> create(@RequestBody PositionEO positionEO) throws Exception {
        positionEOService.insertSelective(positionEO);
        return Result.success(positionEO);
    }

}
