package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.AbilityEO;
import com.adc.da.business.page.AbilityEOPage;
import com.adc.da.business.service.AbilityEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/ability")
@Api(description = "|AbilityEO|")
public class AbilityEOController extends BaseController<AbilityEO>{

    private static final Logger logger = LoggerFactory.getLogger(AbilityEOController.class);

    @Autowired
    private AbilityEOService abilityEOService;

	@ApiOperation(value = "|AbilityEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:ability:page")
    public ResponseMessage<PageInfo<AbilityEO>> page(AbilityEOPage page) throws Exception {
        List<AbilityEO> rows = abilityEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|AbilityEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:ability:list")
    public ResponseMessage<List<AbilityEO>> list(AbilityEOPage page) throws Exception {
        return Result.success(abilityEOService.queryByList(page));
	}

    @ApiOperation(value = "|AbilityEO|详情")
    @GetMapping("/{primarykeyoflanguageability}")
    @RequiresPermissions("business:ability:get")
    public ResponseMessage<AbilityEO> find(@PathVariable String primarykeyoflanguageability) throws Exception {
        return Result.success(abilityEOService.selectByPrimaryKey(primarykeyoflanguageability));
    }

    @ApiOperation(value = "|AbilityEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:ability:save")
    public ResponseMessage<AbilityEO> create(@RequestBody AbilityEO abilityEO) throws Exception {
        abilityEOService.insertSelective(abilityEO);
        return Result.success(abilityEO);
    }

    @ApiOperation(value = "|AbilityEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:ability:update")
    public ResponseMessage<AbilityEO> update(@RequestBody AbilityEO abilityEO) throws Exception {
        abilityEOService.updateByPrimaryKeySelective(abilityEO);
        return Result.success(abilityEO);
    }

    @ApiOperation(value = "|AbilityEO|删除")
    @DeleteMapping("/{primarykeyoflanguageability}")
    @RequiresPermissions("business:ability:delete")
    public ResponseMessage delete(@PathVariable String primarykeyoflanguageability) throws Exception {
        abilityEOService.deleteByPrimaryKey(primarykeyoflanguageability);
        logger.info("delete from ABILITY where primarykeyoflanguageability = {}", primarykeyoflanguageability);
        return Result.success();
    }

}
