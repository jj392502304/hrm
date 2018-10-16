package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>DEPARTMENTAL DepartmentalEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class DepartmentalEO extends BaseEntity {

    private Integer departmentordernumber;
    private String departmentprimarykey;
    private String departmentalname;
    private String departmentaldescribe;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationtime;
    private String departmentkey;
    private Integer isenabled;
    private String abbreviations;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>departmentordernumber -> departmentordernumber</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>departmentalname -> departmentalname</li>
     * <li>departmentaldescribe -> departmentaldescribe</li>
     * <li>creationtime -> creationtime</li>
     * <li>departmentkey -> departmentkey</li>
     * <li>isenabled -> isenabled</li>
     * <li>abbreviations -> abbreviations</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "departmentordernumber": return "departmentordernumber";
            case "departmentprimarykey": return "departmentprimarykey";
            case "departmentalname": return "departmentalname";
            case "departmentaldescribe": return "departmentaldescribe";
            case "creationtime": return "creationtime";
            case "departmentkey": return "departmentkey";
            case "isenabled": return "isenabled";
            case "abbreviations": return "abbreviations";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>departmentordernumber -> departmentordernumber</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>departmentalname -> departmentalname</li>
     * <li>departmentaldescribe -> departmentaldescribe</li>
     * <li>creationtime -> creationtime</li>
     * <li>departmentkey -> departmentkey</li>
     * <li>isenabled -> isenabled</li>
     * <li>abbreviations -> abbreviations</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "departmentordernumber": return "departmentordernumber";
            case "departmentprimarykey": return "departmentprimarykey";
            case "departmentalname": return "departmentalname";
            case "departmentaldescribe": return "departmentaldescribe";
            case "creationtime": return "creationtime";
            case "departmentkey": return "departmentkey";
            case "isenabled": return "isenabled";
            case "abbreviations": return "abbreviations";
            default: return null;
        }
    }
    
    /**  **/
    public Integer getDepartmentordernumber() {
        return this.departmentordernumber;
    }

    /**  **/
    public void setDepartmentordernumber(Integer departmentordernumber) {
        this.departmentordernumber = departmentordernumber;
    }

    /**  **/
    public String getDepartmentprimarykey() {
        return this.departmentprimarykey;
    }

    /**  **/
    public void setDepartmentprimarykey(String departmentprimarykey) {
        this.departmentprimarykey = departmentprimarykey;
    }

    /**  **/
    public String getDepartmentalname() {
        return this.departmentalname;
    }

    /**  **/
    public void setDepartmentalname(String departmentalname) {
        this.departmentalname = departmentalname;
    }

    /**  **/
    public String getDepartmentaldescribe() {
        return this.departmentaldescribe;
    }

    /**  **/
    public void setDepartmentaldescribe(String departmentaldescribe) {
        this.departmentaldescribe = departmentaldescribe;
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
    public String getDepartmentkey() {
        return this.departmentkey;
    }

    /**  **/
    public void setDepartmentkey(String departmentkey) {
        this.departmentkey = departmentkey;
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
    public String getAbbreviations() {
        return this.abbreviations;
    }

    /**  **/
    public void setAbbreviations(String abbreviations) {
        this.abbreviations = abbreviations;
    }

}
