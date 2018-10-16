package com.adc.da.log.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adc.da.base.page.Pager;
import com.adc.da.base.web.BaseController;
import com.adc.da.log.entity.LogEO;
import com.adc.da.log.page.LogEOPage;
import com.adc.da.log.service.LogEOService;
import com.adc.da.util.http.PageInfo;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@RestController
//@RequestMapping("/${restPath}/log/log")
//@Api(description = "日志管理")
public class LogEOController extends BaseController<LogEO>{

    private static final Logger logger = LoggerFactory.getLogger(LogEOController.class);

    @Autowired
    private LogEOService logEOService;

	@ApiOperation(value = "|LogEO|分页查询")
    @GetMapping("")
    public ResponseMessage<PageInfo<LogEO>> page(Integer pageNo, Integer pageSize) throws Exception {
		LogEOPage page = new LogEOPage();
		if (pageNo != null) {
			page.setPage(pageNo);
		}
		if (pageSize != null) {
			page.setPageSize(pageSize);
		}
		page.setPager(new Pager());
        List<LogEO> rows = logEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

    @ApiOperation(value = "|LogEO|详情")
    @GetMapping("/{id}")
    public ResponseMessage<LogEO> find(@PathVariable String id) throws Exception {
        return Result.success(logEOService.selectByPrimaryKey(id));
    }

//	@ApiOperation(value = "|LogEO|查询")
//    @GetMapping("")
//    public ResponseMessage<List<LogEO>> list(LogEOPage page) throws Exception {
//        return Result.success(logEOService.queryByList(page));
//	}

//    @ApiOperation(value = "|LogEO|新增")
//    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
//    public ResponseMessage<LogEO> create(@RequestBody LogEO logEO) throws Exception {
//        logEOService.insertSelective(logEO);
//        return Result.success(logEO);
//    }
//
//    @ApiOperation(value = "|LogEO|修改")
//    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
//    public ResponseMessage<LogEO> update(@RequestBody LogEO logEO) throws Exception {
//        logEOService.updateByPrimaryKeySelective(logEO);
//        return Result.success(logEO);
//    }
//
//    @ApiOperation(value = "|LogEO|删除")
//    @DeleteMapping("/{id}")
//    public ResponseMessage delete(@PathVariable String id) throws Exception {
//        logEOService.deleteByPrimaryKey(id);
//        logger.info("delete from TS_LOG where id = {}", id);
//        return Result.success();
//    }

}
