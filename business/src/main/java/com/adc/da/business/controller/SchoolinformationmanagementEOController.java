package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.SchoolinformationmanagementEO;
import com.adc.da.business.page.SchoolinformationmanagementEOPage;
import com.adc.da.business.service.SchoolinformationmanagementEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/schoolinformationmanagement")
@Api(description = "|SchoolinformationmanagementEO|")
public class SchoolinformationmanagementEOController extends BaseController<SchoolinformationmanagementEO>{

    private static final Logger logger = LoggerFactory.getLogger(SchoolinformationmanagementEOController.class);

    @Autowired
    private SchoolinformationmanagementEOService schoolinformationmanagementEOService;

	@ApiOperation(value = "|SchoolinformationmanagementEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:schoolinformationmanagement:page")
    public ResponseMessage<PageInfo<SchoolinformationmanagementEO>> page(SchoolinformationmanagementEOPage page) throws Exception {
        List<SchoolinformationmanagementEO> rows = schoolinformationmanagementEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|SchoolinformationmanagementEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:schoolinformationmanagement:list")
    public ResponseMessage<List<SchoolinformationmanagementEO>> list(SchoolinformationmanagementEOPage page) throws Exception {
        return Result.success(schoolinformationmanagementEOService.queryByList(page));
	}

    @ApiOperation(value = "|SchoolinformationmanagementEO|详情")
    @GetMapping("/{pkschoolinformation}")
    @RequiresPermissions("business:schoolinformationmanagement:get")
    public ResponseMessage<SchoolinformationmanagementEO> find(@PathVariable String pkschoolinformation) throws Exception {
        return Result.success(schoolinformationmanagementEOService.selectByPrimaryKey(pkschoolinformation));
    }

    @ApiOperation(value = "|SchoolinformationmanagementEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:schoolinformationmanagement:save")
    public ResponseMessage<SchoolinformationmanagementEO> create(@RequestBody SchoolinformationmanagementEO schoolinformationmanagementEO) throws Exception {
        schoolinformationmanagementEOService.insertSelective(schoolinformationmanagementEO);
        return Result.success(schoolinformationmanagementEO);
    }

    @ApiOperation(value = "|SchoolinformationmanagementEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:schoolinformationmanagement:update")
    public ResponseMessage<SchoolinformationmanagementEO> update(@RequestBody SchoolinformationmanagementEO schoolinformationmanagementEO) throws Exception {
        schoolinformationmanagementEOService.updateByPrimaryKeySelective(schoolinformationmanagementEO);
        return Result.success(schoolinformationmanagementEO);
    }

    @ApiOperation(value = "|SchoolinformationmanagementEO|删除")
    @DeleteMapping("/{pkschoolinformation}")
    @RequiresPermissions("business:schoolinformationmanagement:delete")
    public ResponseMessage delete(@PathVariable String pkschoolinformation) throws Exception {
        schoolinformationmanagementEOService.deleteByPrimaryKey(pkschoolinformation);
        logger.info("delete from SCHOOLINFORMATIONMANAGEMENT where pkschoolinformation = {}", pkschoolinformation);
        return Result.success();
    }

}
