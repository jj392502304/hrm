package com.adc.da.quartz.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.quartz.dao.ScheduleJobEODao;
import com.adc.da.quartz.entity.ScheduleJobEO;
import com.adc.da.quartz.utils.Constant;
import com.adc.da.quartz.utils.ScheduleUtils;
import com.adc.da.util.utils.StringUtils;

/**
 * 定时任务Service
 * 
 * @author ZhangChao
 *
 */
@Service("scheduleJobEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class ScheduleJobEOService extends BaseService<ScheduleJobEO, Integer> {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleJobEOService.class);

	@Autowired
	private Scheduler scheduler;
	@Autowired
	private ScheduleJobEODao dao;

	public ScheduleJobEODao getDao() {
		return dao;
	}

	/**
	 * 项目启动时，初始化定时器
	 */
	@PostConstruct
	public void init() {
		List<ScheduleJobEO> scheduleJobList = dao.queryAllJobs();
		for (ScheduleJobEO scheduleJob : scheduleJobList) {
			CronTrigger cronTrigger = ScheduleUtils.getCronTrigger(scheduler, scheduleJob.getJobId());
			// 如果不存在，则创建
			if (cronTrigger == null) {
				ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
			} else {
				ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
			}
		}
	}

	@Override
	public int insert(ScheduleJobEO scheduleJob) throws Exception {
		scheduleJob.setCreateTime(new Date());
		scheduleJob.setStatus(Constant.ScheduleStatus.NORMAL.getValue());
		int count = super.insert(scheduleJob);
		// 创建定时任务
		ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
		return count;
	}

	@Override
	public int updateByPrimaryKey(ScheduleJobEO scheduleJob) throws Exception {
		// 更新定时任务
		ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
		return super.updateByPrimaryKey(scheduleJob);
	}

	@Override
	public int updateByPrimaryKeySelective(ScheduleJobEO scheduleJob) throws Exception {
		// 更新定时任务
		ScheduleJobEO entity = dao.selectByPrimaryKey(scheduleJob.getJobId());
		copyFieldValues(scheduleJob, entity);
		ScheduleUtils.updateScheduleJob(scheduler, entity);
		BeanUtils.copyProperties(entity, scheduleJob);
		return super.updateByPrimaryKeySelective(entity);
	}

	/**
	 * 拷贝ScheduleJob字段信息
	 * 
	 * @param scheduleJob
	 * @param entity
	 */
	private void copyFieldValues(ScheduleJobEO scheduleJob, ScheduleJobEO entity) {
		if (StringUtils.isNotBlank(scheduleJob.getBeanName())) {
			entity.setBeanName(scheduleJob.getBeanName());
		}
		if (StringUtils.isNotBlank(scheduleJob.getMethodName())) {
			entity.setMethodName(scheduleJob.getMethodName());
		}
		if (StringUtils.isNotBlank(scheduleJob.getCronExpression())) {
			entity.setCronExpression(scheduleJob.getCronExpression());
		}
		if (StringUtils.isNotBlank(scheduleJob.getParams())) {
			entity.setParams(scheduleJob.getParams());
		}
		if (StringUtils.isNotBlank(scheduleJob.getRemark())) {
			entity.setRemark(scheduleJob.getRemark());
		}
		if (scheduleJob.getStatus() != null) {
			entity.setStatus(scheduleJob.getStatus());
		}
	}

	@Override
	public void deleteByPrimaryKey(Integer jobId) throws Exception {
		// 删除定时任务
		ScheduleUtils.deleteScheduleJob(scheduler, jobId);
		super.deleteByPrimaryKey(jobId);
	}

	/**
	 * 暂停运行
	 * 
	 * @param jobIds
	 *            任务ID，如314,5178,222
	 */
	public void pause(String jobIds) {
		Map<String, Object> map = new HashMap<>();
		String[] jobIdArray = jobIds.split(",");
		Integer[] jobIdIntArray = new Integer[jobIdArray.length];
		for (int i = 0; i < jobIdArray.length; i++) {
			Integer jobIdInt = Integer.parseInt(jobIdArray[i]);
			jobIdIntArray[i] = jobIdInt;
			ScheduleUtils.pauseJob(scheduler, jobIdInt);
		}

		map.put("list", jobIdIntArray);
		map.put("status", Constant.ScheduleStatus.PAUSE.getValue());
		dao.updateBatch(map);
	}

	/**
	 * 恢复运行
	 * 
	 * @param jobIds
	 *            任务ID，如314,5178,222
	 */
	public void resume(String jobIds) {
		Map<String, Object> map = new HashMap<>();
		String[] jobIdArray = jobIds.split(",");
		Integer[] jobIdIntArray = new Integer[jobIdArray.length];
		for (int i = 0; i < jobIdArray.length; i++) {
			Integer jobIdInt = Integer.parseInt(jobIdArray[i]);
			jobIdIntArray[i] = jobIdInt;
			ScheduleUtils.resumeJob(scheduler, jobIdInt);
		}

		map.put("list", jobIdIntArray);
		map.put("status", Constant.ScheduleStatus.NORMAL.getValue());
		dao.updateBatch(map);
	}

	/**
	 * 立即执行任务
	 * 
	 * @param jobIds
	 */
	public void run(String jobIds) {
		String[] jobIdArray = jobIds.split(",");
		for (String jobId : jobIdArray) {
			Integer jobIdInt = Integer.parseInt(jobId);
			ScheduleJobEO scheduleJob = dao.selectByPrimaryKey(jobIdInt);
			ScheduleUtils.run(scheduler, scheduleJob);
		}
	}

}
