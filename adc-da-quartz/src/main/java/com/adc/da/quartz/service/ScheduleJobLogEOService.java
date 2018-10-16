package com.adc.da.quartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.quartz.dao.ScheduleJobLogEODao;
import com.adc.da.quartz.entity.ScheduleJobLogEO;

/**
 * 定时任务日志Service
 * 
 * @author ZhangChao
 *
 */
@Service("scheduleJobLogEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class ScheduleJobLogEOService extends BaseService<ScheduleJobLogEO, Integer> {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleJobLogEOService.class);

	@Autowired
	private ScheduleJobLogEODao dao;

	public ScheduleJobLogEODao getDao() {
		return dao;
	}

}
