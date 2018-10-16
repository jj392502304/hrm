package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.PracticeexperienceEO;
import com.adc.da.business.page.PracticeexperienceEOPage;
import com.adc.da.business.service.PracticeexperienceEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/practiceexperience")
@Api(description = "|PracticeexperienceEO|")
public class PracticeexperienceEOController extends BaseController<PracticeexperienceEO>{

    private static final Logger logger = LoggerFactory.getLogger(PracticeexperienceEOController.class);

    @Autowired
    private PracticeexperienceEOService practiceexperienceEOService;

	@ApiOperation(value = "|PracticeexperienceEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:practiceexperience:page")
    public ResponseMessage<PageInfo<PracticeexperienceEO>> page(PracticeexperienceEOPage page) throws Exception {
        List<PracticeexperienceEO> rows = practiceexperienceEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|PracticeexperienceEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:practiceexperience:list")
    public ResponseMessage<List<PracticeexperienceEO>> list(PracticeexperienceEOPage page) throws Exception {
        return Result.success(practiceexperienceEOService.queryByList(page));
	}

    @ApiOperation(value = "|PracticeexperienceEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:practiceexperience:save")
    public ResponseMessage<PracticeexperienceEO> create(@RequestBody PracticeexperienceEO practiceexperienceEO) throws Exception {
        practiceexperienceEOService.insertSelective(practiceexperienceEO);
        return Result.success(practiceexperienceEO);
    }

}
