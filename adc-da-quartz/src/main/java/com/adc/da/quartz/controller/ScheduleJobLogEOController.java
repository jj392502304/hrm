package com.adc.da.quartz.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.quartz.entity.ScheduleJobLogEO;
import com.adc.da.quartz.page.ScheduleJobLogEOPage;
import com.adc.da.quartz.service.ScheduleJobLogEOService;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 定时任务日志控制器，只提供查询功能
 * </p>
 * 
 * @author ZhangChao
 *
 */
//@RestController
//@RequestMapping("/schedule/job/log")
//@Api(description = "|ScheduleJobLogEO|定时任务执行日志查询")
public class ScheduleJobLogEOController extends BaseController<ScheduleJobLogEO> {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleJobLogEOController.class);

	@Autowired
	private ScheduleJobLogEOService scheduleJobLogEOService;

	@ApiOperation(value = "|ScheduleJobLogEO|分页查询")
	@GetMapping("/rows")
	public ResponseMessage<PageInfo<ScheduleJobLogEO>> queryRows(ScheduleJobLogEOPage page) throws Exception {
		List<ScheduleJobLogEO> rows = scheduleJobLogEOService.queryByPage(page);
		// 将结果统一封装到PageInfo
		PageInfo<ScheduleJobLogEO> pageInfo = getPageInfo(page.getPager(), rows);
		return Result.success(pageInfo);
	}

	@ApiOperation(value = "|ScheduleJobLogEO|详情")
	@GetMapping("/{logId}")
	public ResponseMessage<ScheduleJobLogEO> find(@PathVariable Integer logId) throws Exception {
		ScheduleJobLogEO log = scheduleJobLogEOService.selectByPrimaryKey(logId);
		return Result.success(log);
	}

}
