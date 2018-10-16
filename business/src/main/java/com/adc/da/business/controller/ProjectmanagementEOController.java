package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.ProjectmanagementEO;
import com.adc.da.business.page.ProjectmanagementEOPage;
import com.adc.da.business.service.ProjectmanagementEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/projectmanagement")
@Api(description = "|ProjectmanagementEO|")
public class ProjectmanagementEOController extends BaseController<ProjectmanagementEO>{

    private static final Logger logger = LoggerFactory.getLogger(ProjectmanagementEOController.class);

    @Autowired
    private ProjectmanagementEOService projectmanagementEOService;

	@ApiOperation(value = "|ProjectmanagementEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:projectmanagement:page")
    public ResponseMessage<PageInfo<ProjectmanagementEO>> page(ProjectmanagementEOPage page) throws Exception {
        List<ProjectmanagementEO> rows = projectmanagementEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ProjectmanagementEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:projectmanagement:list")
    public ResponseMessage<List<ProjectmanagementEO>> list(ProjectmanagementEOPage page) throws Exception {
        return Result.success(projectmanagementEOService.queryByList(page));
	}

    @ApiOperation(value = "|ProjectmanagementEO|详情")
    @GetMapping("/{pkprojectmanagement}")
    @RequiresPermissions("business:projectmanagement:get")
    public ResponseMessage<ProjectmanagementEO> find(@PathVariable String pkprojectmanagement) throws Exception {
        return Result.success(projectmanagementEOService.selectByPrimaryKey(pkprojectmanagement));
    }

    @ApiOperation(value = "|ProjectmanagementEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:projectmanagement:save")
    public ResponseMessage<ProjectmanagementEO> create(@RequestBody ProjectmanagementEO projectmanagementEO) throws Exception {
        projectmanagementEOService.insertSelective(projectmanagementEO);
        return Result.success(projectmanagementEO);
    }

    @ApiOperation(value = "|ProjectmanagementEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:projectmanagement:update")
    public ResponseMessage<ProjectmanagementEO> update(@RequestBody ProjectmanagementEO projectmanagementEO) throws Exception {
        projectmanagementEOService.updateByPrimaryKeySelective(projectmanagementEO);
        return Result.success(projectmanagementEO);
    }

    @ApiOperation(value = "|ProjectmanagementEO|删除")
    @DeleteMapping("/{pkprojectmanagement}")
    @RequiresPermissions("business:projectmanagement:delete")
    public ResponseMessage delete(@PathVariable String pkprojectmanagement) throws Exception {
        projectmanagementEOService.deleteByPrimaryKey(pkprojectmanagement);
        logger.info("delete from PROJECTMANAGEMENT where pkprojectmanagement = {}", pkprojectmanagement);
        return Result.success();
    }

}
