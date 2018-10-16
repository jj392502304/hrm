package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.UserloginEO;
import com.adc.da.manager.page.UserloginEOPage;
import com.adc.da.manager.service.UserloginEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/userlogin")
@Api(description = "|UserloginEO|")
public class UserloginEOController extends BaseController<UserloginEO>{

    private static final Logger logger = LoggerFactory.getLogger(UserloginEOController.class);

    @Autowired
    private UserloginEOService userloginEOService;

	@ApiOperation(value = "|UserloginEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:userlogin:page")
    public ResponseMessage<PageInfo<UserloginEO>> page(UserloginEOPage page) throws Exception {
        List<UserloginEO> rows = userloginEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|UserloginEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:userlogin:list")
    public ResponseMessage<List<UserloginEO>> list(UserloginEOPage page) throws Exception {
        return Result.success(userloginEOService.queryByList(page));
	}

    @ApiOperation(value = "|UserloginEO|详情")
    @GetMapping("/{loginid}")
    @RequiresPermissions("manager:userlogin:get")
    public ResponseMessage<UserloginEO> find(@PathVariable String loginid) throws Exception {
        return Result.success(userloginEOService.selectByPrimaryKey(loginid));
    }

    @ApiOperation(value = "|UserloginEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:userlogin:save")
    public ResponseMessage<UserloginEO> create(@RequestBody UserloginEO userloginEO) throws Exception {
        userloginEOService.insertSelective(userloginEO);
        return Result.success(userloginEO);
    }

    @ApiOperation(value = "|UserloginEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:userlogin:update")
    public ResponseMessage<UserloginEO> update(@RequestBody UserloginEO userloginEO) throws Exception {
        userloginEOService.updateByPrimaryKeySelective(userloginEO);
        return Result.success(userloginEO);
    }

    @ApiOperation(value = "|UserloginEO|删除")
    @DeleteMapping("/{loginid}")
    @RequiresPermissions("manager:userlogin:delete")
    public ResponseMessage delete(@PathVariable String loginid) throws Exception {
        userloginEOService.deleteByPrimaryKey(loginid);
        logger.info("delete from USERLOGIN where loginid = {}", loginid);
        return Result.success();
    }

}
