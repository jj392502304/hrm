package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.MailmoduletemplateEO;
import com.adc.da.business.page.MailmoduletemplateEOPage;
import com.adc.da.business.service.MailmoduletemplateEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/mailmoduletemplate")
@Api(description = "|MailmoduletemplateEO|")
public class MailmoduletemplateEOController extends BaseController<MailmoduletemplateEO>{

    private static final Logger logger = LoggerFactory.getLogger(MailmoduletemplateEOController.class);

    @Autowired
    private MailmoduletemplateEOService mailmoduletemplateEOService;

	@ApiOperation(value = "|MailmoduletemplateEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:mailmoduletemplate:page")
    public ResponseMessage<PageInfo<MailmoduletemplateEO>> page(MailmoduletemplateEOPage page) throws Exception {
        List<MailmoduletemplateEO> rows = mailmoduletemplateEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|MailmoduletemplateEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:mailmoduletemplate:list")
    public ResponseMessage<List<MailmoduletemplateEO>> list(MailmoduletemplateEOPage page) throws Exception {
        return Result.success(mailmoduletemplateEOService.queryByList(page));
	}

    @ApiOperation(value = "|MailmoduletemplateEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:mailmoduletemplate:save")
    public ResponseMessage<MailmoduletemplateEO> create(@RequestBody MailmoduletemplateEO mailmoduletemplateEO) throws Exception {
        mailmoduletemplateEOService.insertSelective(mailmoduletemplateEO);
        return Result.success(mailmoduletemplateEO);
    }

}
