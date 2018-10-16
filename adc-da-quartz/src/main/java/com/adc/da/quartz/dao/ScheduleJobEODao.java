package com.adc.da.quartz.dao;

import java.util.List;
import java.util.Map;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.quartz.entity.ScheduleJobEO;

public interface ScheduleJobEODao extends BaseDao<ScheduleJobEO> {

	/**
	 * 查询任务列表
	 * 
	 * @return
	 */
	List<ScheduleJobEO> queryAllJobs();

	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);

}
