package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.NodefunctionEO;
import com.adc.da.workflow.page.NodefunctionEOPage;
import com.adc.da.workflow.service.NodefunctionEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/nodefunction")
@Api(description = "|NodefunctionEO|")
public class NodefunctionEOController extends BaseController<NodefunctionEO>{

    private static final Logger logger = LoggerFactory.getLogger(NodefunctionEOController.class);

    @Autowired
    private NodefunctionEOService nodefunctionEOService;

	@ApiOperation(value = "|NodefunctionEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:nodefunction:page")
    public ResponseMessage<PageInfo<NodefunctionEO>> page(NodefunctionEOPage page) throws Exception {
        List<NodefunctionEO> rows = nodefunctionEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|NodefunctionEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:nodefunction:list")
    public ResponseMessage<List<NodefunctionEO>> list(NodefunctionEOPage page) throws Exception {
        return Result.success(nodefunctionEOService.queryByList(page));
	}

    @ApiOperation(value = "|NodefunctionEO|详情")
    @GetMapping("/{nodefunctionkey}")
    @RequiresPermissions("workflow:nodefunction:get")
    public ResponseMessage<NodefunctionEO> find(@PathVariable String nodefunctionkey) throws Exception {
        return Result.success(nodefunctionEOService.selectByPrimaryKey(nodefunctionkey));
    }

    @ApiOperation(value = "|NodefunctionEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:nodefunction:save")
    public ResponseMessage<NodefunctionEO> create(@RequestBody NodefunctionEO nodefunctionEO) throws Exception {
        nodefunctionEOService.insertSelective(nodefunctionEO);
        return Result.success(nodefunctionEO);
    }

    @ApiOperation(value = "|NodefunctionEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:nodefunction:update")
    public ResponseMessage<NodefunctionEO> update(@RequestBody NodefunctionEO nodefunctionEO) throws Exception {
        nodefunctionEOService.updateByPrimaryKeySelective(nodefunctionEO);
        return Result.success(nodefunctionEO);
    }

    @ApiOperation(value = "|NodefunctionEO|删除")
    @DeleteMapping("/{nodefunctionkey}")
    @RequiresPermissions("workflow:nodefunction:delete")
    public ResponseMessage delete(@PathVariable String nodefunctionkey) throws Exception {
        nodefunctionEOService.deleteByPrimaryKey(nodefunctionkey);
        logger.info("delete from NODEFUNCTION where nodefunctionkey = {}", nodefunctionkey);
        return Result.success();
    }

}
