package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.EducationalbackgroundEO;
import com.adc.da.business.page.EducationalbackgroundEOPage;
import com.adc.da.business.service.EducationalbackgroundEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/educationalbackground")
@Api(description = "|EducationalbackgroundEO|")
public class EducationalbackgroundEOController extends BaseController<EducationalbackgroundEO>{

    private static final Logger logger = LoggerFactory.getLogger(EducationalbackgroundEOController.class);

    @Autowired
    private EducationalbackgroundEOService educationalbackgroundEOService;

	@ApiOperation(value = "|EducationalbackgroundEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:educationalbackground:page")
    public ResponseMessage<PageInfo<EducationalbackgroundEO>> page(EducationalbackgroundEOPage page) throws Exception {
        List<EducationalbackgroundEO> rows = educationalbackgroundEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|EducationalbackgroundEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:educationalbackground:list")
    public ResponseMessage<List<EducationalbackgroundEO>> list(EducationalbackgroundEOPage page) throws Exception {
        return Result.success(educationalbackgroundEOService.queryByList(page));
	}

    @ApiOperation(value = "|EducationalbackgroundEO|详情")
    @GetMapping("/{pkschoolinformation}")
    @RequiresPermissions("business:educationalbackground:get")
    public ResponseMessage<EducationalbackgroundEO> find(@PathVariable String pkschoolinformation) throws Exception {
        return Result.success(educationalbackgroundEOService.selectByPrimaryKey(pkschoolinformation));
    }

    @ApiOperation(value = "|EducationalbackgroundEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:educationalbackground:save")
    public ResponseMessage<EducationalbackgroundEO> create(@RequestBody EducationalbackgroundEO educationalbackgroundEO) throws Exception {
        educationalbackgroundEOService.insertSelective(educationalbackgroundEO);
        return Result.success(educationalbackgroundEO);
    }

    @ApiOperation(value = "|EducationalbackgroundEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:educationalbackground:update")
    public ResponseMessage<EducationalbackgroundEO> update(@RequestBody EducationalbackgroundEO educationalbackgroundEO) throws Exception {
        educationalbackgroundEOService.updateByPrimaryKeySelective(educationalbackgroundEO);
        return Result.success(educationalbackgroundEO);
    }

    @ApiOperation(value = "|EducationalbackgroundEO|删除")
    @DeleteMapping("/{pkschoolinformation}")
    @RequiresPermissions("business:educationalbackground:delete")
    public ResponseMessage delete(@PathVariable String pkschoolinformation) throws Exception {
        educationalbackgroundEOService.deleteByPrimaryKey(pkschoolinformation);
        logger.info("delete from EDUCATIONALBACKGROUND where pkschoolinformation = {}", pkschoolinformation);
        return Result.success();
    }

}
