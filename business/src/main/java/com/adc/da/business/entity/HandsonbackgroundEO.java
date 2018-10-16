package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>HANDSONBACKGROUND HandsonbackgroundEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class HandsonbackgroundEO extends BaseEntity {

    private String leavingreason;
    private String enterprisescale;
    private String reportingobject;
    private Long subordinates;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
    private String handsonbackgroundkey;
    private String applymemberkey;
    private String unitname;
    private String positionname;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date workinghours;
    private String operatinduty;
    private String department;
    private String positionlevel;
    private String workingplace;
    private Long monthlysalary;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>leavingreason -> leavingreason</li>
     * <li>enterprisescale -> enterprisescale</li>
     * <li>reportingobject -> reportingobject</li>
     * <li>subordinates -> subordinates</li>
     * <li>updatetime -> updatetime</li>
     * <li>handsonbackgroundkey -> handsonbackgroundkey</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>unitname -> unitname</li>
     * <li>positionname -> positionname</li>
     * <li>workinghours -> workinghours</li>
     * <li>operatinduty -> operatinduty</li>
     * <li>department -> department</li>
     * <li>positionlevel -> positionlevel</li>
     * <li>workingplace -> workingplace</li>
     * <li>monthlysalary -> monthlysalary</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "leavingreason": return "leavingreason";
            case "enterprisescale": return "enterprisescale";
            case "reportingobject": return "reportingobject";
            case "subordinates": return "subordinates";
            case "updatetime": return "updatetime";
            case "handsonbackgroundkey": return "handsonbackgroundkey";
            case "applymemberkey": return "applymemberkey";
            case "unitname": return "unitname";
            case "positionname": return "positionname";
            case "workinghours": return "workinghours";
            case "operatinduty": return "operatinduty";
            case "department": return "department";
            case "positionlevel": return "positionlevel";
            case "workingplace": return "workingplace";
            case "monthlysalary": return "monthlysalary";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>leavingreason -> leavingreason</li>
     * <li>enterprisescale -> enterprisescale</li>
     * <li>reportingobject -> reportingobject</li>
     * <li>subordinates -> subordinates</li>
     * <li>updatetime -> updatetime</li>
     * <li>handsonbackgroundkey -> handsonbackgroundkey</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>unitname -> unitname</li>
     * <li>positionname -> positionname</li>
     * <li>workinghours -> workinghours</li>
     * <li>operatinduty -> operatinduty</li>
     * <li>department -> department</li>
     * <li>positionlevel -> positionlevel</li>
     * <li>workingplace -> workingplace</li>
     * <li>monthlysalary -> monthlysalary</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "leavingreason": return "leavingreason";
            case "enterprisescale": return "enterprisescale";
            case "reportingobject": return "reportingobject";
            case "subordinates": return "subordinates";
            case "updatetime": return "updatetime";
            case "handsonbackgroundkey": return "handsonbackgroundkey";
            case "applymemberkey": return "applymemberkey";
            case "unitname": return "unitname";
            case "positionname": return "positionname";
            case "workinghours": return "workinghours";
            case "operatinduty": return "operatinduty";
            case "department": return "department";
            case "positionlevel": return "positionlevel";
            case "workingplace": return "workingplace";
            case "monthlysalary": return "monthlysalary";
            default: return null;
        }
    }
    
    /**  **/
    public String getLeavingreason() {
        return this.leavingreason;
    }

    /**  **/
    public void setLeavingreason(String leavingreason) {
        this.leavingreason = leavingreason;
    }

    /**  **/
    public String getEnterprisescale() {
        return this.enterprisescale;
    }

    /**  **/
    public void setEnterprisescale(String enterprisescale) {
        this.enterprisescale = enterprisescale;
    }

    /**  **/
    public String getReportingobject() {
        return this.reportingobject;
    }

    /**  **/
    public void setReportingobject(String reportingobject) {
        this.reportingobject = reportingobject;
    }

    /**  **/
    public Long getSubordinates() {
        return this.subordinates;
    }

    /**  **/
    public void setSubordinates(Long subordinates) {
        this.subordinates = subordinates;
    }

    /**  **/
    public Date getUpdatetime() {
        return this.updatetime;
    }

    /**  **/
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**  **/
    public String getHandsonbackgroundkey() {
        return this.handsonbackgroundkey;
    }

    /**  **/
    public void setHandsonbackgroundkey(String handsonbackgroundkey) {
        this.handsonbackgroundkey = handsonbackgroundkey;
    }

    /**  **/
    public String getApplymemberkey() {
        return this.applymemberkey;
    }

    /**  **/
    public void setApplymemberkey(String applymemberkey) {
        this.applymemberkey = applymemberkey;
    }

    /**  **/
    public String getUnitname() {
        return this.unitname;
    }

    /**  **/
    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    /**  **/
    public String getPositionname() {
        return this.positionname;
    }

    /**  **/
    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    /**  **/
    public Date getWorkinghours() {
        return this.workinghours;
    }

    /**  **/
    public void setWorkinghours(Date workinghours) {
        this.workinghours = workinghours;
    }

    /**  **/
    public String getOperatinduty() {
        return this.operatinduty;
    }

    /**  **/
    public void setOperatinduty(String operatinduty) {
        this.operatinduty = operatinduty;
    }

    /**  **/
    public String getDepartment() {
        return this.department;
    }

    /**  **/
    public void setDepartment(String department) {
        this.department = department;
    }

    /**  **/
    public String getPositionlevel() {
        return this.positionlevel;
    }

    /**  **/
    public void setPositionlevel(String positionlevel) {
        this.positionlevel = positionlevel;
    }

    /**  **/
    public String getWorkingplace() {
        return this.workingplace;
    }

    /**  **/
    public void setWorkingplace(String workingplace) {
        this.workingplace = workingplace;
    }

    /**  **/
    public Long getMonthlysalary() {
        return this.monthlysalary;
    }

    /**  **/
    public void setMonthlysalary(Long monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

}
