package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>JOBINTENSION JobintensionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class JobintensionEO extends BaseEntity {

    private String pkjobintention;
    private String applymemberkey;
    private String engagedinindustry;
    private String nowcity;
    private String monthlysalary;
    private String expectedwork;
    private String expectedcareer;
    private String expectedcity;
    private String expectedsalary;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date arrivaltime;
    private String jobstate;
    private String engagedcareer;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkjobintention -> pkjobintention</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>engagedinindustry -> engagedinindustry</li>
     * <li>nowcity -> nowcity</li>
     * <li>monthlysalary -> monthlysalary</li>
     * <li>expectedwork -> expectedwork</li>
     * <li>expectedcareer -> expectedcareer</li>
     * <li>expectedcity -> expectedcity</li>
     * <li>expectedsalary -> expectedsalary</li>
     * <li>arrivaltime -> arrivaltime</li>
     * <li>jobstate -> jobstate</li>
     * <li>engagedcareer -> engagedcareer</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkjobintention": return "pkjobintention";
            case "applymemberkey": return "applymemberkey";
            case "engagedinindustry": return "engagedinindustry";
            case "nowcity": return "nowcity";
            case "monthlysalary": return "monthlysalary";
            case "expectedwork": return "expectedwork";
            case "expectedcareer": return "expectedcareer";
            case "expectedcity": return "expectedcity";
            case "expectedsalary": return "expectedsalary";
            case "arrivaltime": return "arrivaltime";
            case "jobstate": return "jobstate";
            case "engagedcareer": return "engagedcareer";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkjobintention -> pkjobintention</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>engagedinindustry -> engagedinindustry</li>
     * <li>nowcity -> nowcity</li>
     * <li>monthlysalary -> monthlysalary</li>
     * <li>expectedwork -> expectedwork</li>
     * <li>expectedcareer -> expectedcareer</li>
     * <li>expectedcity -> expectedcity</li>
     * <li>expectedsalary -> expectedsalary</li>
     * <li>arrivaltime -> arrivaltime</li>
     * <li>jobstate -> jobstate</li>
     * <li>engagedcareer -> engagedcareer</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkjobintention": return "pkjobintention";
            case "applymemberkey": return "applymemberkey";
            case "engagedinindustry": return "engagedinindustry";
            case "nowcity": return "nowcity";
            case "monthlysalary": return "monthlysalary";
            case "expectedwork": return "expectedwork";
            case "expectedcareer": return "expectedcareer";
            case "expectedcity": return "expectedcity";
            case "expectedsalary": return "expectedsalary";
            case "arrivaltime": return "arrivaltime";
            case "jobstate": return "jobstate";
            case "engagedcareer": return "engagedcareer";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkjobintention() {
        return this.pkjobintention;
    }

    /**  **/
    public void setPkjobintention(String pkjobintention) {
        this.pkjobintention = pkjobintention;
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
    public String getEngagedinindustry() {
        return this.engagedinindustry;
    }

    /**  **/
    public void setEngagedinindustry(String engagedinindustry) {
        this.engagedinindustry = engagedinindustry;
    }

    /**  **/
    public String getNowcity() {
        return this.nowcity;
    }

    /**  **/
    public void setNowcity(String nowcity) {
        this.nowcity = nowcity;
    }

    /**  **/
    public String getMonthlysalary() {
        return this.monthlysalary;
    }

    /**  **/
    public void setMonthlysalary(String monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    /**  **/
    public String getExpectedwork() {
        return this.expectedwork;
    }

    /**  **/
    public void setExpectedwork(String expectedwork) {
        this.expectedwork = expectedwork;
    }

    /**  **/
    public String getExpectedcareer() {
        return this.expectedcareer;
    }

    /**  **/
    public void setExpectedcareer(String expectedcareer) {
        this.expectedcareer = expectedcareer;
    }

    /**  **/
    public String getExpectedcity() {
        return this.expectedcity;
    }

    /**  **/
    public void setExpectedcity(String expectedcity) {
        this.expectedcity = expectedcity;
    }

    /**  **/
    public String getExpectedsalary() {
        return this.expectedsalary;
    }

    /**  **/
    public void setExpectedsalary(String expectedsalary) {
        this.expectedsalary = expectedsalary;
    }

    /**  **/
    public Date getArrivaltime() {
        return this.arrivaltime;
    }

    /**  **/
    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    /**  **/
    public String getJobstate() {
        return this.jobstate;
    }

    /**  **/
    public void setJobstate(String jobstate) {
        this.jobstate = jobstate;
    }

    /**  **/
    public String getEngagedcareer() {
        return this.engagedcareer;
    }

    /**  **/
    public void setEngagedcareer(String engagedcareer) {
        this.engagedcareer = engagedcareer;
    }

}
