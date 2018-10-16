package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>USERROLE UserroleEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class UserroleEO extends BaseEntity {

    private String describe;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date enadletime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationtime;
    private Integer isenabled;
    private String rolename;
    private String roleprimarykey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>describe -> describe</li>
     * <li>enadletime -> enadletime</li>
     * <li>creationtime -> creationtime</li>
     * <li>isenabled -> isenabled</li>
     * <li>rolename -> rolename</li>
     * <li>roleprimarykey -> roleprimarykey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "describe": return "describe";
            case "enadletime": return "enadletime";
            case "creationtime": return "creationtime";
            case "isenabled": return "isenabled";
            case "rolename": return "rolename";
            case "roleprimarykey": return "roleprimarykey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>describe -> describe</li>
     * <li>enadletime -> enadletime</li>
     * <li>creationtime -> creationtime</li>
     * <li>isenabled -> isenabled</li>
     * <li>rolename -> rolename</li>
     * <li>roleprimarykey -> roleprimarykey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "describe": return "describe";
            case "enadletime": return "enadletime";
            case "creationtime": return "creationtime";
            case "isenabled": return "isenabled";
            case "rolename": return "rolename";
            case "roleprimarykey": return "roleprimarykey";
            default: return null;
        }
    }
    
    /**  **/
    public String getDescribe() {
        return this.describe;
    }

    /**  **/
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**  **/
    public Date getEnadletime() {
        return this.enadletime;
    }

    /**  **/
    public void setEnadletime(Date enadletime) {
        this.enadletime = enadletime;
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
    public Integer getIsenabled() {
        return this.isenabled;
    }

    /**  **/
    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
    }

    /**  **/
    public String getRolename() {
        return this.rolename;
    }

    /**  **/
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**  **/
    public String getRoleprimarykey() {
        return this.roleprimarykey;
    }

    /**  **/
    public void setRoleprimarykey(String roleprimarykey) {
        this.roleprimarykey = roleprimarykey;
    }

}
