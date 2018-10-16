package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.ProjectexperienceEO;
import com.adc.da.business.page.ProjectexperienceEOPage;
import com.adc.da.business.service.ProjectexperienceEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/projectexperience")
@Api(description = "|ProjectexperienceEO|")
public class ProjectexperienceEOController extends BaseController<ProjectexperienceEO>{

    private static final Logger logger = LoggerFactory.getLogger(ProjectexperienceEOController.class);

    @Autowired
    private ProjectexperienceEOService projectexperienceEOService;

	@ApiOperation(value = "|ProjectexperienceEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:projectexperience:page")
    public ResponseMessage<PageInfo<ProjectexperienceEO>> page(ProjectexperienceEOPage page) throws Exception {
        List<ProjectexperienceEO> rows = projectexperienceEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ProjectexperienceEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:projectexperience:list")
    public ResponseMessage<List<ProjectexperienceEO>> list(ProjectexperienceEOPage page) throws Exception {
        return Result.success(projectexperienceEOService.queryByList(page));
	}

    @ApiOperation(value = "|ProjectexperienceEO|详情")
    @GetMapping("/{pkprojectexperience}")
    @RequiresPermissions("business:projectexperience:get")
    public ResponseMessage<ProjectexperienceEO> find(@PathVariable String pkprojectexperience) throws Exception {
        return Result.success(projectexperienceEOService.selectByPrimaryKey(pkprojectexperience));
    }

    @ApiOperation(value = "|ProjectexperienceEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:projectexperience:save")
    public ResponseMessage<ProjectexperienceEO> create(@RequestBody ProjectexperienceEO projectexperienceEO) throws Exception {
        projectexperienceEOService.insertSelective(projectexperienceEO);
        return Result.success(projectexperienceEO);
    }

    @ApiOperation(value = "|ProjectexperienceEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:projectexperience:update")
    public ResponseMessage<ProjectexperienceEO> update(@RequestBody ProjectexperienceEO projectexperienceEO) throws Exception {
        projectexperienceEOService.updateByPrimaryKeySelective(projectexperienceEO);
        return Result.success(projectexperienceEO);
    }

    @ApiOperation(value = "|ProjectexperienceEO|删除")
    @DeleteMapping("/{pkprojectexperience}")
    @RequiresPermissions("business:projectexperience:delete")
    public ResponseMessage delete(@PathVariable String pkprojectexperience) throws Exception {
        projectexperienceEOService.deleteByPrimaryKey(pkprojectexperience);
        logger.info("delete from PROJECTEXPERIENCE where pkprojectexperience = {}", pkprojectexperience);
        return Result.success();
    }

}
