package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.TalentpoolEO;
import com.adc.da.business.page.TalentpoolEOPage;
import com.adc.da.business.service.TalentpoolEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/talentpool")
@Api(description = "|TalentpoolEO|")
public class TalentpoolEOController extends BaseController<TalentpoolEO>{

    private static final Logger logger = LoggerFactory.getLogger(TalentpoolEOController.class);

    @Autowired
    private TalentpoolEOService talentpoolEOService;

	@ApiOperation(value = "|TalentpoolEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:talentpool:page")
    public ResponseMessage<PageInfo<TalentpoolEO>> page(TalentpoolEOPage page) throws Exception {
        List<TalentpoolEO> rows = talentpoolEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|TalentpoolEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:talentpool:list")
    public ResponseMessage<List<TalentpoolEO>> list(TalentpoolEOPage page) throws Exception {
        return Result.success(talentpoolEOService.queryByList(page));
	}

    @ApiOperation(value = "|TalentpoolEO|详情")
    @GetMapping("/{pktalentpool}")
    @RequiresPermissions("business:talentpool:get")
    public ResponseMessage<TalentpoolEO> find(@PathVariable String pktalentpool) throws Exception {
        return Result.success(talentpoolEOService.selectByPrimaryKey(pktalentpool));
    }

    @ApiOperation(value = "|TalentpoolEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:talentpool:save")
    public ResponseMessage<TalentpoolEO> create(@RequestBody TalentpoolEO talentpoolEO) throws Exception {
        talentpoolEOService.insertSelective(talentpoolEO);
        return Result.success(talentpoolEO);
    }

    @ApiOperation(value = "|TalentpoolEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:talentpool:update")
    public ResponseMessage<TalentpoolEO> update(@RequestBody TalentpoolEO talentpoolEO) throws Exception {
        talentpoolEOService.updateByPrimaryKeySelective(talentpoolEO);
        return Result.success(talentpoolEO);
    }

    @ApiOperation(value = "|TalentpoolEO|删除")
    @DeleteMapping("/{pktalentpool}")
    @RequiresPermissions("business:talentpool:delete")
    public ResponseMessage delete(@PathVariable String pktalentpool) throws Exception {
        talentpoolEOService.deleteByPrimaryKey(pktalentpool);
        logger.info("delete from TALENTPOOL where pktalentpool = {}", pktalentpool);
        return Result.success();
    }

}
