package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>JOBPOSITION JobpositionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class JobpositionEO extends BaseEntity {

    private String pkjobposition;
    private String applymemberkey;
    private String pkrecruit;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date applicationtime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationtime;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkjobposition -> pkjobposition</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>pkrecruit -> pkrecruit</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>creationtime -> creationtime</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkjobposition": return "pkjobposition";
            case "applymemberkey": return "applymemberkey";
            case "pkrecruit": return "pkrecruit";
            case "applicationtime": return "applicationtime";
            case "creationtime": return "creationtime";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkjobposition -> pkjobposition</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>pkrecruit -> pkrecruit</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>creationtime -> creationtime</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkjobposition": return "pkjobposition";
            case "applymemberkey": return "applymemberkey";
            case "pkrecruit": return "pkrecruit";
            case "applicationtime": return "applicationtime";
            case "creationtime": return "creationtime";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkjobposition() {
        return this.pkjobposition;
    }

    /**  **/
    public void setPkjobposition(String pkjobposition) {
        this.pkjobposition = pkjobposition;
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
    public String getPkrecruit() {
        return this.pkrecruit;
    }

    /**  **/
    public void setPkrecruit(String pkrecruit) {
        this.pkrecruit = pkrecruit;
    }

    /**  **/
    public Date getApplicationtime() {
        return this.applicationtime;
    }

    /**  **/
    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
    }

    /**  **/
    public Date getCreationtime() {
        return this.creationtime;
    }

    /**  **/
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

}
