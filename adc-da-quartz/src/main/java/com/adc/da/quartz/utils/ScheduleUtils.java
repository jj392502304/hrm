package com.adc.da.quartz.utils;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;

import com.adc.da.quartz.entity.ScheduleJobEO;
import com.adc.da.util.exception.AdcDaBaseException;

/**
 * <p>
 * 定时任务工具类
 * </p>
 * <p>
 * 真正进行创建、删除、更新、暂停、恢复、立即执行定时任务的操作
 * </p>
 * 
 * @author ZhangChao
 */
public class ScheduleUtils {
	private final static String JOB_NAME = "TASK_";

	/**
	 * 获取触发器key
	 */
	public static TriggerKey getTriggerKey(Integer jobId) {
		return TriggerKey.triggerKey(JOB_NAME + jobId);
	}

	/**
	 * 获取jobKey
	 */
	public static JobKey getJobKey(Integer jobId) {
		return JobKey.jobKey(JOB_NAME + jobId);
	}

	/**
	 * 获取表达式触发器
	 */
	public static CronTrigger getCronTrigger(Scheduler scheduler, Integer jobId) {
		try {
			return (CronTrigger) scheduler.getTrigger(getTriggerKey(jobId));
		} catch (SchedulerException e) {
			throw new AdcDaBaseException("获取定时任务CronTrigger出现异常");
		}
	}

	/**
	 * 创建定时任务
	 */
	public static void createScheduleJob(Scheduler scheduler, ScheduleJobEO scheduleJob) {
		try {
			// 构建job信息
			JobDetail jobDetail = JobBuilder.newJob(ScheduleJob.class).withIdentity(getJobKey(scheduleJob.getJobId()))
					.build();

			// 表达式调度构建器
			CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression())
					.withMisfireHandlingInstructionDoNothing();

			// 按新的cronExpression表达式构建一个新的trigger
			CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(getTriggerKey(scheduleJob.getJobId()))
					.withSchedule(scheduleBuilder).build();

			// 放入参数，运行时的方法可以获取
			jobDetail.getJobDataMap().put(ScheduleJobEO.JOB_PARAM_KEY, scheduleJob);

			scheduler.scheduleJob(jobDetail, trigger);

			// 暂停任务
			if (scheduleJob.getStatus() == Constant.ScheduleStatus.PAUSE.getValue()) {
				pauseJob(scheduler, scheduleJob.getJobId());
			}
		} catch (SchedulerException e) {
			throw new AdcDaBaseException("创建定时任务失败");
		}
	}

	/**
	 * 更新定时任务
	 */
	public static void updateScheduleJob(Scheduler scheduler, ScheduleJobEO scheduleJob) {
		try {
			TriggerKey triggerKey = getTriggerKey(scheduleJob.getJobId());

			// 表达式调度构建器
			CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression())
					.withMisfireHandlingInstructionDoNothing();

			CronTrigger trigger = getCronTrigger(scheduler, scheduleJob.getJobId());

			// 按新的cronExpression表达式重新构建trigger
			trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();

			// 参数
			trigger.getJobDataMap().put(ScheduleJobEO.JOB_PARAM_KEY, scheduleJob);

			scheduler.rescheduleJob(triggerKey, trigger);

			// 暂停任务
			if (scheduleJob.getStatus() == Constant.ScheduleStatus.PAUSE.getValue()) {
				pauseJob(scheduler, scheduleJob.getJobId());
			}

		} catch (SchedulerException e) {
			throw new AdcDaBaseException("更新定时任务失败");
		}
	}

	/**
	 * 立即执行任务
	 */
	public static void run(Scheduler scheduler, ScheduleJobEO scheduleJob) {
		try {
			// 参数
			JobDataMap dataMap = new JobDataMap();
			dataMap.put(ScheduleJobEO.JOB_PARAM_KEY, scheduleJob);

			scheduler.triggerJob(getJobKey(scheduleJob.getJobId()), dataMap);
		} catch (SchedulerException e) {
			throw new AdcDaBaseException("立即执行定时任务失败");
		}
	}

	/**
	 * 暂停任务
	 */
	public static void pauseJob(Scheduler scheduler, Integer jobId) {
		try {
			scheduler.pauseJob(getJobKey(jobId));
		} catch (SchedulerException e) {
			throw new AdcDaBaseException("暂停定时任务失败");
		}
	}

	/**
	 * 恢复任务
	 */
	public static void resumeJob(Scheduler scheduler, Integer jobId) {
		try {
			scheduler.resumeJob(getJobKey(jobId));
		} catch (SchedulerException e) {
			throw new AdcDaBaseException("暂停定时任务失败");
		}
	}

	/**
	 * 删除定时任务
	 */
	public static void deleteScheduleJob(Scheduler scheduler, Integer jobId) {
		try {
			scheduler.deleteJob(getJobKey(jobId));
		} catch (SchedulerException e) {
			throw new AdcDaBaseException("删除定时任务失败");
		}
	}
}
