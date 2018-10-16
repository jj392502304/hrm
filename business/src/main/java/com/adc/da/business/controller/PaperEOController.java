package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.PaperEO;
import com.adc.da.business.page.PaperEOPage;
import com.adc.da.business.service.PaperEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/paper")
@Api(description = "|PaperEO|")
public class PaperEOController extends BaseController<PaperEO>{

    private static final Logger logger = LoggerFactory.getLogger(PaperEOController.class);

    @Autowired
    private PaperEOService paperEOService;

	@ApiOperation(value = "|PaperEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:paper:page")
    public ResponseMessage<PageInfo<PaperEO>> page(PaperEOPage page) throws Exception {
        List<PaperEO> rows = paperEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|PaperEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:paper:list")
    public ResponseMessage<List<PaperEO>> list(PaperEOPage page) throws Exception {
        return Result.success(paperEOService.queryByList(page));
	}

    @ApiOperation(value = "|PaperEO|详情")
    @GetMapping("/{mainkeyofpaper}")
    @RequiresPermissions("business:paper:get")
    public ResponseMessage<PaperEO> find(@PathVariable String mainkeyofpaper) throws Exception {
        return Result.success(paperEOService.selectByPrimaryKey(mainkeyofpaper));
    }

    @ApiOperation(value = "|PaperEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:paper:save")
    public ResponseMessage<PaperEO> create(@RequestBody PaperEO paperEO) throws Exception {
        paperEOService.insertSelective(paperEO);
        return Result.success(paperEO);
    }

    @ApiOperation(value = "|PaperEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:paper:update")
    public ResponseMessage<PaperEO> update(@RequestBody PaperEO paperEO) throws Exception {
        paperEOService.updateByPrimaryKeySelective(paperEO);
        return Result.success(paperEO);
    }

    @ApiOperation(value = "|PaperEO|删除")
    @DeleteMapping("/{mainkeyofpaper}")
    @RequiresPermissions("business:paper:delete")
    public ResponseMessage delete(@PathVariable String mainkeyofpaper) throws Exception {
        paperEOService.deleteByPrimaryKey(mainkeyofpaper);
        logger.info("delete from PAPER where mainkeyofpaper = {}", mainkeyofpaper);
        return Result.success();
    }

}
