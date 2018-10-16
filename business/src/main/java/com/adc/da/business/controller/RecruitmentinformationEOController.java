package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.RecruitmentinformationEO;
import com.adc.da.business.page.RecruitmentinformationEOPage;
import com.adc.da.business.service.RecruitmentinformationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/recruitmentinformation")
@Api(description = "|RecruitmentinformationEO|")
public class RecruitmentinformationEOController extends BaseController<RecruitmentinformationEO>{

    private static final Logger logger = LoggerFactory.getLogger(RecruitmentinformationEOController.class);

    @Autowired
    private RecruitmentinformationEOService recruitmentinformationEOService;

	@ApiOperation(value = "|RecruitmentinformationEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:recruitmentinformation:page")
    public ResponseMessage<PageInfo<RecruitmentinformationEO>> page(RecruitmentinformationEOPage page) throws Exception {
        List<RecruitmentinformationEO> rows = recruitmentinformationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|RecruitmentinformationEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:recruitmentinformation:list")
    public ResponseMessage<List<RecruitmentinformationEO>> list(RecruitmentinformationEOPage page) throws Exception {
        return Result.success(recruitmentinformationEOService.queryByList(page));
	}

    @ApiOperation(value = "|RecruitmentinformationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:recruitmentinformation:save")
    public ResponseMessage<RecruitmentinformationEO> create(@RequestBody RecruitmentinformationEO recruitmentinformationEO) throws Exception {
        recruitmentinformationEOService.insertSelective(recruitmentinformationEO);
        return Result.success(recruitmentinformationEO);
    }

}
