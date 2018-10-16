package com.adc.da.quartz.utils;

import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.ReflectionUtils;

import com.adc.da.util.exception.AdcDaBaseException;
import com.adc.da.util.utils.SpringContextHolder;

/**
 * 执行定时任务
 * 
 * @author ZhangChao
 */
public class ScheduleRunnable implements Runnable {
	// 目标类
	private Object target;
	// 目标类的方法
	private Method method;
	// 方法参数
	private String params;

	public ScheduleRunnable(String beanName, String methodName, String params)
			throws NoSuchMethodException, SecurityException {
		this.target = SpringContextHolder.getBean(beanName);
		this.params = params;

		if (StringUtils.isNotBlank(params)) {
			this.method = target.getClass().getDeclaredMethod(methodName, String.class);
		} else {
			this.method = target.getClass().getDeclaredMethod(methodName);
		}
	}

	@Override
	public void run() {
		try {
			ReflectionUtils.makeAccessible(method);
			if (StringUtils.isNotBlank(params)) {
				method.invoke(target, params);
			} else {
				method.invoke(target);
			}
		} catch (Exception e) {
			throw new AdcDaBaseException("执行定时任务失败");
		}
	}

}
