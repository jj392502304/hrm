package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.RewardEO;
import com.adc.da.business.page.RewardEOPage;
import com.adc.da.business.service.RewardEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/reward")
@Api(description = "|RewardEO|")
public class RewardEOController extends BaseController<RewardEO>{

    private static final Logger logger = LoggerFactory.getLogger(RewardEOController.class);

    @Autowired
    private RewardEOService rewardEOService;

	@ApiOperation(value = "|RewardEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:reward:page")
    public ResponseMessage<PageInfo<RewardEO>> page(RewardEOPage page) throws Exception {
        List<RewardEO> rows = rewardEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|RewardEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:reward:list")
    public ResponseMessage<List<RewardEO>> list(RewardEOPage page) throws Exception {
        return Result.success(rewardEOService.queryByList(page));
	}

    @ApiOperation(value = "|RewardEO|详情")
    @GetMapping("/{reward}")
    @RequiresPermissions("business:reward:get")
    public ResponseMessage<RewardEO> find(@PathVariable String reward) throws Exception {
        return Result.success(rewardEOService.selectByPrimaryKey(reward));
    }

    @ApiOperation(value = "|RewardEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:reward:save")
    public ResponseMessage<RewardEO> create(@RequestBody RewardEO rewardEO) throws Exception {
        rewardEOService.insertSelective(rewardEO);
        return Result.success(rewardEO);
    }

    @ApiOperation(value = "|RewardEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:reward:update")
    public ResponseMessage<RewardEO> update(@RequestBody RewardEO rewardEO) throws Exception {
        rewardEOService.updateByPrimaryKeySelective(rewardEO);
        return Result.success(rewardEO);
    }

    @ApiOperation(value = "|RewardEO|删除")
    @DeleteMapping("/{reward}")
    @RequiresPermissions("business:reward:delete")
    public ResponseMessage delete(@PathVariable String reward) throws Exception {
        rewardEOService.deleteByPrimaryKey(reward);
        logger.info("delete from REWARD where reward = {}", reward);
        return Result.success();
    }

}
