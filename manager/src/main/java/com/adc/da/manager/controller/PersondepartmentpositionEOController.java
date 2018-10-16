package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.entity.PersondepartmentpositionEO;
import com.adc.da.manager.page.PersondepartmentpositionEOPage;
import com.adc.da.manager.service.PersondepartmentpositionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/manager/persondepartmentposition")
@Api(description = "|PersondepartmentpositionEO|")
public class PersondepartmentpositionEOController extends BaseController<PersondepartmentpositionEO>{

    private static final Logger logger = LoggerFactory.getLogger(PersondepartmentpositionEOController.class);

    @Autowired
    private PersondepartmentpositionEOService persondepartmentpositionEOService;

	@ApiOperation(value = "|PersondepartmentpositionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:persondepartmentposition:page")
    public ResponseMessage<PageInfo<PersondepartmentpositionEO>> page(PersondepartmentpositionEOPage page) throws Exception {
        List<PersondepartmentpositionEO> rows = persondepartmentpositionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|PersondepartmentpositionEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:persondepartmentposition:list")
    public ResponseMessage<List<PersondepartmentpositionEO>> list(PersondepartmentpositionEOPage page) throws Exception {
        return Result.success(persondepartmentpositionEOService.queryByList(page));
	}

    @ApiOperation(value = "|PersondepartmentpositionEO|详情")
    @GetMapping("/{persondepartmentpositionid}")
    @RequiresPermissions("manager:persondepartmentposition:get")
    public ResponseMessage<PersondepartmentpositionEO> find(@PathVariable String persondepartmentpositionid) throws Exception {
        return Result.success(persondepartmentpositionEOService.selectByPrimaryKey(persondepartmentpositionid));
    }

    @ApiOperation(value = "|PersondepartmentpositionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:persondepartmentposition:save")
    public ResponseMessage<PersondepartmentpositionEO> create(@RequestBody PersondepartmentpositionEO persondepartmentpositionEO) throws Exception {
        persondepartmentpositionEOService.insertSelective(persondepartmentpositionEO);
        return Result.success(persondepartmentpositionEO);
    }

    @ApiOperation(value = "|PersondepartmentpositionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:persondepartmentposition:update")
    public ResponseMessage<PersondepartmentpositionEO> update(@RequestBody PersondepartmentpositionEO persondepartmentpositionEO) throws Exception {
        persondepartmentpositionEOService.updateByPrimaryKeySelective(persondepartmentpositionEO);
        return Result.success(persondepartmentpositionEO);
    }

    @ApiOperation(value = "|PersondepartmentpositionEO|删除")
    @DeleteMapping("/{persondepartmentpositionid}")
    @RequiresPermissions("manager:persondepartmentposition:delete")
    public ResponseMessage delete(@PathVariable String persondepartmentpositionid) throws Exception {
        persondepartmentpositionEOService.deleteByPrimaryKey(persondepartmentpositionid);
        logger.info("delete from PERSONDEPARTMENTPOSITION where persondepartmentpositionid = {}", persondepartmentpositionid);
        return Result.success();
    }

}
