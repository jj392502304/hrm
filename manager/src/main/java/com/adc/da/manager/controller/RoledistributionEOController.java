package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.RoledistributionEO;
import com.adc.da.manager.page.RoledistributionEOPage;
import com.adc.da.manager.service.RoledistributionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/roledistribution")
@Api(description = "|RoledistributionEO|权限分配")
public class RoledistributionEOController extends BaseController<RoledistributionEO>{

    private static final Logger logger = LoggerFactory.getLogger(RoledistributionEOController.class);

    @Autowired
    private RoledistributionEOService roledistributionEOService;

	@ApiOperation(value = "|RoledistributionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:roledistribution:page")
    public ResponseMessage<PageInfo<RoledistributionEO>> page(RoledistributionEOPage page) throws Exception {
        List<RoledistributionEO> rows = roledistributionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|RoledistributionEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:roledistribution:list")
    public ResponseMessage<List<RoledistributionEO>> list(RoledistributionEOPage page) throws Exception {
        return Result.success(roledistributionEOService.queryByList(page));
	}

    @ApiOperation(value = "|RoledistributionEO|详情")
    @GetMapping("/{roledistributionkey}")
    @RequiresPermissions("manager:roledistribution:get")
    public ResponseMessage<RoledistributionEO> find(@PathVariable String roledistributionkey) throws Exception {
        return Result.success(roledistributionEOService.selectByPrimaryKey(roledistributionkey));
    }

    @ApiOperation(value = "|RoledistributionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:roledistribution:save")
    public ResponseMessage<RoledistributionEO> create(@RequestBody RoledistributionEO roledistributionEO) throws Exception {
        roledistributionEOService.insertSelective(roledistributionEO);
        return Result.success(roledistributionEO);
    }

    @ApiOperation(value = "|RoledistributionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:roledistribution:update")
    public ResponseMessage<RoledistributionEO> update(@RequestBody RoledistributionEO roledistributionEO) throws Exception {
        roledistributionEOService.updateByPrimaryKeySelective(roledistributionEO);
        return Result.success(roledistributionEO);
    }

    @ApiOperation(value = "|RoledistributionEO|删除")
    @DeleteMapping("/{roledistributionkey}")
    @RequiresPermissions("manager:roledistribution:delete")
    public ResponseMessage delete(@PathVariable String roledistributionkey) throws Exception {
        roledistributionEOService.deleteByPrimaryKey(roledistributionkey);
        logger.info("delete from ROLEDISTRIBUTION where roledistributionkey = {}", roledistributionkey);
        return Result.success();
    }

}
