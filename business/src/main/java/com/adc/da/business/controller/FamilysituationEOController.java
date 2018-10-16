package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.FamilysituationEO;
import com.adc.da.business.page.FamilysituationEOPage;
import com.adc.da.business.service.FamilysituationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/familysituation")
@Api(description = "|FamilysituationEO|")
public class FamilysituationEOController extends BaseController<FamilysituationEO>{

    private static final Logger logger = LoggerFactory.getLogger(FamilysituationEOController.class);

    @Autowired
    private FamilysituationEOService familysituationEOService;

	@ApiOperation(value = "|FamilysituationEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:familysituation:page")
    public ResponseMessage<PageInfo<FamilysituationEO>> page(FamilysituationEOPage page) throws Exception {
        List<FamilysituationEO> rows = familysituationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|FamilysituationEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:familysituation:list")
    public ResponseMessage<List<FamilysituationEO>> list(FamilysituationEOPage page) throws Exception {
        return Result.success(familysituationEOService.queryByList(page));
	}

    @ApiOperation(value = "|FamilysituationEO|详情")
    @GetMapping("/{pkfamilysituation}")
    @RequiresPermissions("business:familysituation:get")
    public ResponseMessage<FamilysituationEO> find(@PathVariable String pkfamilysituation) throws Exception {
        return Result.success(familysituationEOService.selectByPrimaryKey(pkfamilysituation));
    }

    @ApiOperation(value = "|FamilysituationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:familysituation:save")
    public ResponseMessage<FamilysituationEO> create(@RequestBody FamilysituationEO familysituationEO) throws Exception {
        familysituationEOService.insertSelective(familysituationEO);
        return Result.success(familysituationEO);
    }

    @ApiOperation(value = "|FamilysituationEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:familysituation:update")
    public ResponseMessage<FamilysituationEO> update(@RequestBody FamilysituationEO familysituationEO) throws Exception {
        familysituationEOService.updateByPrimaryKeySelective(familysituationEO);
        return Result.success(familysituationEO);
    }

    @ApiOperation(value = "|FamilysituationEO|删除")
    @DeleteMapping("/{pkfamilysituation}")
    @RequiresPermissions("business:familysituation:delete")
    public ResponseMessage delete(@PathVariable String pkfamilysituation) throws Exception {
        familysituationEOService.deleteByPrimaryKey(pkfamilysituation);
        logger.info("delete from FAMILYSITUATION where pkfamilysituation = {}", pkfamilysituation);
        return Result.success();
    }

}
