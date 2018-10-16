package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.ResumescoreEO;
import com.adc.da.business.page.ResumescoreEOPage;
import com.adc.da.business.service.ResumescoreEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/resumescore")
@Api(description = "|ResumescoreEO|")
public class ResumescoreEOController extends BaseController<ResumescoreEO>{

    private static final Logger logger = LoggerFactory.getLogger(ResumescoreEOController.class);

    @Autowired
    private ResumescoreEOService resumescoreEOService;

	@ApiOperation(value = "|ResumescoreEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:resumescore:page")
    public ResponseMessage<PageInfo<ResumescoreEO>> page(ResumescoreEOPage page) throws Exception {
        List<ResumescoreEO> rows = resumescoreEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|ResumescoreEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:resumescore:list")
    public ResponseMessage<List<ResumescoreEO>> list(ResumescoreEOPage page) throws Exception {
        return Result.success(resumescoreEOService.queryByList(page));
	}

    @ApiOperation(value = "|ResumescoreEO|详情")
    @GetMapping("/{pkresumescore}")
    @RequiresPermissions("business:resumescore:get")
    public ResponseMessage<ResumescoreEO> find(@PathVariable String pkresumescore) throws Exception {
        return Result.success(resumescoreEOService.selectByPrimaryKey(pkresumescore));
    }

    @ApiOperation(value = "|ResumescoreEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:resumescore:save")
    public ResponseMessage<ResumescoreEO> create(@RequestBody ResumescoreEO resumescoreEO) throws Exception {
        resumescoreEOService.insertSelective(resumescoreEO);
        return Result.success(resumescoreEO);
    }

    @ApiOperation(value = "|ResumescoreEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:resumescore:update")
    public ResponseMessage<ResumescoreEO> update(@RequestBody ResumescoreEO resumescoreEO) throws Exception {
        resumescoreEOService.updateByPrimaryKeySelective(resumescoreEO);
        return Result.success(resumescoreEO);
    }

    @ApiOperation(value = "|ResumescoreEO|删除")
    @DeleteMapping("/{pkresumescore}")
    @RequiresPermissions("business:resumescore:delete")
    public ResponseMessage delete(@PathVariable String pkresumescore) throws Exception {
        resumescoreEOService.deleteByPrimaryKey(pkresumescore);
        logger.info("delete from RESUMESCORE where pkresumescore = {}", pkresumescore);
        return Result.success();
    }

}
