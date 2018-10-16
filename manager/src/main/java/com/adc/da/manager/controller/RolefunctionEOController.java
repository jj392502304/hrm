package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.RolefunctionEO;
import com.adc.da.manager.page.RolefunctionEOPage;
import com.adc.da.manager.service.RolefunctionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/rolefunction")
@Api(description = "|RolefunctionEO|权限功能")
public class RolefunctionEOController extends BaseController<RolefunctionEO>{

    private static final Logger logger = LoggerFactory.getLogger(RolefunctionEOController.class);

    @Autowired
    private RolefunctionEOService rolefunctionEOService;

	@ApiOperation(value = "|RolefunctionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:rolefunction:page")
    public ResponseMessage<PageInfo<RolefunctionEO>> page(RolefunctionEOPage page) throws Exception {
        List<RolefunctionEO> rows = rolefunctionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|RolefunctionEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:rolefunction:list")
    public ResponseMessage<List<RolefunctionEO>> list(RolefunctionEOPage page) throws Exception {
        return Result.success(rolefunctionEOService.queryByList(page));
	}

    @ApiOperation(value = "|RolefunctionEO|详情")
    @GetMapping("/{rolefunctionkey}")
    @RequiresPermissions("manager:rolefunction:get")
    public ResponseMessage<RolefunctionEO> find(@PathVariable String rolefunctionkey) throws Exception {
        return Result.success(rolefunctionEOService.selectByPrimaryKey(rolefunctionkey));
    }

    @ApiOperation(value = "|RolefunctionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:rolefunction:save")
    public ResponseMessage<RolefunctionEO> create(@RequestBody RolefunctionEO rolefunctionEO) throws Exception {
        rolefunctionEOService.insertSelective(rolefunctionEO);
        return Result.success(rolefunctionEO);
    }

    @ApiOperation(value = "|RolefunctionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:rolefunction:update")
    public ResponseMessage<RolefunctionEO> update(@RequestBody RolefunctionEO rolefunctionEO) throws Exception {
        rolefunctionEOService.updateByPrimaryKeySelective(rolefunctionEO);
        return Result.success(rolefunctionEO);
    }

    @ApiOperation(value = "|RolefunctionEO|删除")
    @DeleteMapping("/{rolefunctionkey}")
    @RequiresPermissions("manager:rolefunction:delete")
    public ResponseMessage delete(@PathVariable String rolefunctionkey) throws Exception {
        rolefunctionEOService.deleteByPrimaryKey(rolefunctionkey);
        logger.info("delete from ROLEFUNCTION where rolefunctionkey = {}", rolefunctionkey);
        return Result.success();
    }

}
