package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.MailsendlogEO;
import com.adc.da.business.page.MailsendlogEOPage;
import com.adc.da.business.service.MailsendlogEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/mailsendlog")
@Api(description = "|MailsendlogEO|")
public class MailsendlogEOController extends BaseController<MailsendlogEO>{

    private static final Logger logger = LoggerFactory.getLogger(MailsendlogEOController.class);

    @Autowired
    private MailsendlogEOService mailsendlogEOService;

	@ApiOperation(value = "|MailsendlogEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:mailsendlog:page")
    public ResponseMessage<PageInfo<MailsendlogEO>> page(MailsendlogEOPage page) throws Exception {
        List<MailsendlogEO> rows = mailsendlogEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|MailsendlogEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:mailsendlog:list")
    public ResponseMessage<List<MailsendlogEO>> list(MailsendlogEOPage page) throws Exception {
        return Result.success(mailsendlogEOService.queryByList(page));
	}

    @ApiOperation(value = "|MailsendlogEO|详情")
    @GetMapping("/{pkmailsendlog}")
    @RequiresPermissions("business:mailsendlog:get")
    public ResponseMessage<MailsendlogEO> find(@PathVariable String pkmailsendlog) throws Exception {
        return Result.success(mailsendlogEOService.selectByPrimaryKey(pkmailsendlog));
    }

    @ApiOperation(value = "|MailsendlogEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:mailsendlog:save")
    public ResponseMessage<MailsendlogEO> create(@RequestBody MailsendlogEO mailsendlogEO) throws Exception {
        mailsendlogEOService.insertSelective(mailsendlogEO);
        return Result.success(mailsendlogEO);
    }

    @ApiOperation(value = "|MailsendlogEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:mailsendlog:update")
    public ResponseMessage<MailsendlogEO> update(@RequestBody MailsendlogEO mailsendlogEO) throws Exception {
        mailsendlogEOService.updateByPrimaryKeySelective(mailsendlogEO);
        return Result.success(mailsendlogEO);
    }

    @ApiOperation(value = "|MailsendlogEO|删除")
    @DeleteMapping("/{pkmailsendlog}")
    @RequiresPermissions("business:mailsendlog:delete")
    public ResponseMessage delete(@PathVariable String pkmailsendlog) throws Exception {
        mailsendlogEOService.deleteByPrimaryKey(pkmailsendlog);
        logger.info("delete from MAILSENDLOG where pkmailsendlog = {}", pkmailsendlog);
        return Result.success();
    }

}
