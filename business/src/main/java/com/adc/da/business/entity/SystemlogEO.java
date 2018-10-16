package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>SYSTEMLOG SystemlogEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class SystemlogEO extends BaseEntity {

    private String systemlog;
    private Integer logtype;
    private String templatename;
    private String loginformation;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationtime;
    private String applymemberkey;
    private String informationsource;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>systemlog -> systemlog</li>
     * <li>logtype -> logtype</li>
     * <li>templatename -> templatename</li>
     * <li>loginformation -> loginformation</li>
     * <li>creationtime -> creationtime</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>informationsource -> informationsource</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "systemlog": return "systemlog";
            case "logtype": return "logtype";
            case "templatename": return "templatename";
            case "loginformation": return "loginformation";
            case "creationtime": return "creationtime";
            case "applymemberkey": return "applymemberkey";
            case "informationsource": return "informationsource";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>systemlog -> systemlog</li>
     * <li>logtype -> logtype</li>
     * <li>templatename -> templatename</li>
     * <li>loginformation -> loginformation</li>
     * <li>creationtime -> creationtime</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>informationsource -> informationsource</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "systemlog": return "systemlog";
            case "logtype": return "logtype";
            case "templatename": return "templatename";
            case "loginformation": return "loginformation";
            case "creationtime": return "creationtime";
            case "applymemberkey": return "applymemberkey";
            case "informationsource": return "informationsource";
            default: return null;
        }
    }
    
    /**  **/
    public String getSystemlog() {
        return this.systemlog;
    }

    /**  **/
    public void setSystemlog(String systemlog) {
        this.systemlog = systemlog;
    }

    /**  **/
    public Integer getLogtype() {
        return this.logtype;
    }

    /**  **/
    public void setLogtype(Integer logtype) {
        this.logtype = logtype;
    }

    /**  **/
    public String getTemplatename() {
        return this.templatename;
    }

    /**  **/
    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    /**  **/
    public String getLoginformation() {
        return this.loginformation;
    }

    /**  **/
    public void setLoginformation(String loginformation) {
        this.loginformation = loginformation;
    }

    /**  **/
    public Date getCreationtime() {
        return this.creationtime;
    }

    /**  **/
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
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
    public String getInformationsource() {
        return this.informationsource;
    }

    /**  **/
    public void setInformationsource(String informationsource) {
        this.informationsource = informationsource;
    }

}
