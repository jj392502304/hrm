package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>JOBCANDIDATESPOST JobcandidatespostEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class JobcandidatespostEO extends BaseEntity {

    private String pkschoolkey;
    private String applymemberkey;
    private String titleofdutyatschool;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date starttime;
    private String jobdescriptioninschool;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkschoolkey -> pkschoolkey</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>titleofdutyatschool -> titleofdutyatschool</li>
     * <li>starttime -> starttime</li>
     * <li>jobdescriptioninschool -> jobdescriptioninschool</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkschoolkey": return "pkschoolkey";
            case "applymemberkey": return "applymemberkey";
            case "titleofdutyatschool": return "titleofdutyatschool";
            case "starttime": return "starttime";
            case "jobdescriptioninschool": return "jobdescriptioninschool";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkschoolkey -> pkschoolkey</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>titleofdutyatschool -> titleofdutyatschool</li>
     * <li>starttime -> starttime</li>
     * <li>jobdescriptioninschool -> jobdescriptioninschool</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkschoolkey": return "pkschoolkey";
            case "applymemberkey": return "applymemberkey";
            case "titleofdutyatschool": return "titleofdutyatschool";
            case "starttime": return "starttime";
            case "jobdescriptioninschool": return "jobdescriptioninschool";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkschoolkey() {
        return this.pkschoolkey;
    }

    /**  **/
    public void setPkschoolkey(String pkschoolkey) {
        this.pkschoolkey = pkschoolkey;
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
    public String getTitleofdutyatschool() {
        return this.titleofdutyatschool;
    }

    /**  **/
    public void setTitleofdutyatschool(String titleofdutyatschool) {
        this.titleofdutyatschool = titleofdutyatschool;
    }

    /**  **/
    public Date getStarttime() {
        return this.starttime;
    }

    /**  **/
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**  **/
    public String getJobdescriptioninschool() {
        return this.jobdescriptioninschool;
    }

    /**  **/
    public void setJobdescriptioninschool(String jobdescriptioninschool) {
        this.jobdescriptioninschool = jobdescriptioninschool;
    }

}
