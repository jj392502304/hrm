package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>DEPARTMENTALPOSITIONS DepartmentalpositionsEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class DepartmentalpositionsEO extends BaseEntity {

    private Integer isenabled;
    private String positionkey;
    private String departmentalfreignkey;
    private String departmentjobkey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>isenabled -> isenabled</li>
     * <li>positionkey -> positionkey</li>
     * <li>departmentalfreignkey -> departmentalfreignkey</li>
     * <li>departmentjobkey -> departmentjobkey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "isenabled": return "isenabled";
            case "positionkey": return "positionkey";
            case "departmentalfreignkey": return "departmentalfreignkey";
            case "departmentjobkey": return "departmentjobkey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>isenabled -> isenabled</li>
     * <li>positionkey -> positionkey</li>
     * <li>departmentalfreignkey -> departmentalfreignkey</li>
     * <li>departmentjobkey -> departmentjobkey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "isenabled": return "isenabled";
            case "positionkey": return "positionkey";
            case "departmentalfreignkey": return "departmentalfreignkey";
            case "departmentjobkey": return "departmentjobkey";
            default: return null;
        }
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
    public String getPositionkey() {
        return this.positionkey;
    }

    /**  **/
    public void setPositionkey(String positionkey) {
        this.positionkey = positionkey;
    }

    /**  **/
    public String getDepartmentalfreignkey() {
        return this.departmentalfreignkey;
    }

    /**  **/
    public void setDepartmentalfreignkey(String departmentalfreignkey) {
        this.departmentalfreignkey = departmentalfreignkey;
    }

    /**  **/
    public String getDepartmentjobkey() {
        return this.departmentjobkey;
    }

    /**  **/
    public void setDepartmentjobkey(String departmentjobkey) {
        this.departmentjobkey = departmentjobkey;
    }

}
