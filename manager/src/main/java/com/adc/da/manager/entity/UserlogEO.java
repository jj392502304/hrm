package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>USERLOG UserlogEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class UserlogEO extends BaseEntity {

    private Integer loginway;
    private String loginip;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date logindate;
    private String userid;
    private String pklog;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>loginway -> loginway</li>
     * <li>loginip -> loginip</li>
     * <li>logindate -> logindate</li>
     * <li>userid -> userid</li>
     * <li>pklog -> pklog</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "loginway": return "loginway";
            case "loginip": return "loginip";
            case "logindate": return "logindate";
            case "userid": return "userid";
            case "pklog": return "pklog";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>loginway -> loginway</li>
     * <li>loginip -> loginip</li>
     * <li>logindate -> logindate</li>
     * <li>userid -> userid</li>
     * <li>pklog -> pklog</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "loginway": return "loginway";
            case "loginip": return "loginip";
            case "logindate": return "logindate";
            case "userid": return "userid";
            case "pklog": return "pklog";
            default: return null;
        }
    }
    
    /**  **/
    public Integer getLoginway() {
        return this.loginway;
    }

    /**  **/
    public void setLoginway(Integer loginway) {
        this.loginway = loginway;
    }

    /**  **/
    public String getLoginip() {
        return this.loginip;
    }

    /**  **/
    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    /**  **/
    public Date getLogindate() {
        return this.logindate;
    }

    /**  **/
    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    /**  **/
    public String getUserid() {
        return this.userid;
    }

    /**  **/
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**  **/
    public String getPklog() {
        return this.pklog;
    }

    /**  **/
    public void setPklog(String pklog) {
        this.pklog = pklog;
    }

}
