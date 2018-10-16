package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.UserlogEO;
import com.adc.da.manager.page.UserlogEOPage;
import com.adc.da.manager.service.UserlogEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/userlog")
@Api(description = "|UserlogEO|")
public class UserlogEOController extends BaseController<UserlogEO>{

    private static final Logger logger = LoggerFactory.getLogger(UserlogEOController.class);

    @Autowired
    private UserlogEOService userlogEOService;

	@ApiOperation(value = "|UserlogEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:userlog:page")
    public ResponseMessage<PageInfo<UserlogEO>> page(UserlogEOPage page) throws Exception {
        List<UserlogEO> rows = userlogEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|UserlogEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:userlog:list")
    public ResponseMessage<List<UserlogEO>> list(UserlogEOPage page) throws Exception {
        return Result.success(userlogEOService.queryByList(page));
	}

    @ApiOperation(value = "|UserlogEO|详情")
    @GetMapping("/{pklog}")
    @RequiresPermissions("manager:userlog:get")
    public ResponseMessage<UserlogEO> find(@PathVariable String pklog) throws Exception {
        return Result.success(userlogEOService.selectByPrimaryKey(pklog));
    }

    @ApiOperation(value = "|UserlogEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:userlog:save")
    public ResponseMessage<UserlogEO> create(@RequestBody UserlogEO userlogEO) throws Exception {
        userlogEOService.insertSelective(userlogEO);
        return Result.success(userlogEO);
    }

    @ApiOperation(value = "|UserlogEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:userlog:update")
    public ResponseMessage<UserlogEO> update(@RequestBody UserlogEO userlogEO) throws Exception {
        userlogEOService.updateByPrimaryKeySelective(userlogEO);
        return Result.success(userlogEO);
    }

    @ApiOperation(value = "|UserlogEO|删除")
    @DeleteMapping("/{pklog}")
    @RequiresPermissions("manager:userlog:delete")
    public ResponseMessage delete(@PathVariable String pklog) throws Exception {
        userlogEOService.deleteByPrimaryKey(pklog);
        logger.info("delete from USERLOG where pklog = {}", pklog);
        return Result.success();
    }

}
