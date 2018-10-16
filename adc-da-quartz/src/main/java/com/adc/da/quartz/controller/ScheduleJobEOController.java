package com.adc.da.quartz.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.quartz.entity.ScheduleJobEO;
import com.adc.da.quartz.page.ScheduleJobEOPage;
import com.adc.da.quartz.service.ScheduleJobEOService;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.JwtTokenUtil;
import com.adc.da.util.http.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 定时任务控制器
 * </p>
 * 
 * @author ZhangChao
 *
 */
//@RestController
//@RequestMapping("/schedule/job")
//@Api(description = "|ScheduleJobEO|定时任务管理")
public class ScheduleJobEOController extends BaseController<ScheduleJobEO> {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleJobEOController.class);

	@Autowired
	private ScheduleJobEOService scheduleJobEOService;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@ApiOperation(value = "|ScheduleJobEO|新增")
	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:schedule:save")
	public ResponseMessage<ScheduleJobEO> create(@RequestBody ScheduleJobEO scheduleJobEO) throws Exception {
		scheduleJobEOService.insert(scheduleJobEO);
		return Result.success(scheduleJobEO);
	}

	@ApiOperation(value = "|ScheduleJobEO|删除")
	@DeleteMapping("/{jobId}")
	// @RequiresPermissions("sys:schedule:delete")
	public ResponseMessage delete(@PathVariable Integer jobId) throws Exception {
		scheduleJobEOService.deleteByPrimaryKey(jobId);
		return Result.success();
	}

	@ApiOperation(value = "|ScheduleJobEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
	// @RequiresPermissions("sys:schedule:update")
	public ResponseMessage<ScheduleJobEO> update(@RequestBody ScheduleJobEO scheduleJobEO) throws Exception {
		scheduleJobEOService.updateByPrimaryKeySelective(scheduleJobEO);
		return Result.success(scheduleJobEO);
	}

	@ApiOperation(value = "|ScheduleJobEO|分页查询")
	@GetMapping("/rows")
	// @RequiresPermissions("sys:schedule:rows")
	public ResponseMessage<PageInfo<ScheduleJobEO>> queryRows(ScheduleJobEOPage page) throws Exception {
		List<ScheduleJobEO> rows = scheduleJobEOService.queryByPage(page);
		// 将结果统一封装到PageInfo
		PageInfo<ScheduleJobEO> pageInfo = getPageInfo(page.getPager(), rows);
		return Result.success(pageInfo);
	}

	@ApiOperation(value = "|ScheduleJobEO|详情")
	@GetMapping("/{jobId}")
	// @RequiresPermissions("sys:schedule:info")
	public ResponseMessage<ScheduleJobEO> find(@PathVariable Integer jobId) throws Exception {
		return Result.success(scheduleJobEOService.selectByPrimaryKey(jobId));
	}

	/**
	 * 立即执行任务
	 */
	@ApiOperation(value = "|jobIds|立即执行")
	@PutMapping("/run")
	// @RequiresPermissions("sys:schedule:run")
	public ResponseMessage run(@RequestParam String jobIds) {
		scheduleJobEOService.run(jobIds);
		return Result.success();
	}

	/**
	 * 暂停定时任务
	 */
	@ApiOperation(value = "|jobIds|暂停")
	@PutMapping("/pause")
	// @RequiresPermissions("sys:schedule:pause")
	public ResponseMessage pause(@RequestParam String jobIds) {
		scheduleJobEOService.pause(jobIds);
		return Result.success();
	}

	/**
	 * 恢复定时任务
	 */
	@ApiOperation(value = "|jobIds|恢复")
	@PutMapping("/resume")
	// @RequiresPermissions("sys:schedule:resume")
	public ResponseMessage resume(@RequestParam String jobIds) {
		scheduleJobEOService.resume(jobIds);
		return Result.success();
	}

}
