package com.adc.da.quartz.page;

import com.adc.da.base.page.BasePage;

/**
 * <b>功能：</b>SCHEDULE_JOB ScheduleJobEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2017-11-15 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ScheduleJobEOPage extends BasePage {

	private String jobId;
	private String jobIdOperator = "=";
	private String beanName;
	private String beanNameOperator = "=";
	private String methodName;
	private String methodNameOperator = "=";
	private String cronExpression;
	private String cronExpressionOperator = "=";
	private String params;
	private String paramsOperator = "=";
	private String status;
	private String statusOperator = "=";
	private String remark;
	private String remarkOperator = "=";
	private String createTime;
	private String createTime1;
	private String createTime2;
	private String createTimeOperator = "=";

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobIdOperator() {
		return jobIdOperator;
	}

	public void setJobIdOperator(String jobIdOperator) {
		this.jobIdOperator = jobIdOperator;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanNameOperator() {
		return beanNameOperator;
	}

	public void setBeanNameOperator(String beanNameOperator) {
		this.beanNameOperator = beanNameOperator;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getMethodNameOperator() {
		return methodNameOperator;
	}

	public void setMethodNameOperator(String methodNameOperator) {
		this.methodNameOperator = methodNameOperator;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getCronExpressionOperator() {
		return cronExpressionOperator;
	}

	public void setCronExpressionOperator(String cronExpressionOperator) {
		this.cronExpressionOperator = cronExpressionOperator;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getParamsOperator() {
		return paramsOperator;
	}

	public void setParamsOperator(String paramsOperator) {
		this.paramsOperator = paramsOperator;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusOperator() {
		return statusOperator;
	}

	public void setStatusOperator(String statusOperator) {
		this.statusOperator = statusOperator;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemarkOperator() {
		return remarkOperator;
	}

	public void setRemarkOperator(String remarkOperator) {
		this.remarkOperator = remarkOperator;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateTime1() {
		return createTime1;
	}

	public void setCreateTime1(String createTime1) {
		this.createTime1 = createTime1;
	}

	public String getCreateTime2() {
		return createTime2;
	}

	public void setCreateTime2(String createTime2) {
		this.createTime2 = createTime2;
	}

	public String getCreateTimeOperator() {
		return createTimeOperator;
	}

	public void setCreateTimeOperator(String createTimeOperator) {
		this.createTimeOperator = createTimeOperator;
	}

}
