package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>CITYINFORMATION CityinformationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class CityinformationEO extends BaseEntity {

    private String pkcity;
    private String cityname;
    private Integer isenabled;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date applicationtime;
    private String cityintroduction;
    private String citycoordinates;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkcity -> pkcity</li>
     * <li>cityname -> cityname</li>
     * <li>isenabled -> isenabled</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>cityintroduction -> cityintroduction</li>
     * <li>citycoordinates -> citycoordinates</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkcity": return "pkcity";
            case "cityname": return "cityname";
            case "isenabled": return "isenabled";
            case "applicationtime": return "applicationtime";
            case "cityintroduction": return "cityintroduction";
            case "citycoordinates": return "citycoordinates";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkcity -> pkcity</li>
     * <li>cityname -> cityname</li>
     * <li>isenabled -> isenabled</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>cityintroduction -> cityintroduction</li>
     * <li>citycoordinates -> citycoordinates</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkcity": return "pkcity";
            case "cityname": return "cityname";
            case "isenabled": return "isenabled";
            case "applicationtime": return "applicationtime";
            case "cityintroduction": return "cityintroduction";
            case "citycoordinates": return "citycoordinates";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkcity() {
        return this.pkcity;
    }

    /**  **/
    public void setPkcity(String pkcity) {
        this.pkcity = pkcity;
    }

    /**  **/
    public String getCityname() {
        return this.cityname;
    }

    /**  **/
    public void setCityname(String cityname) {
        this.cityname = cityname;
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
    public Date getApplicationtime() {
        return this.applicationtime;
    }

    /**  **/
    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
    }

    /**  **/
    public String getCityintroduction() {
        return this.cityintroduction;
    }

    /**  **/
    public void setCityintroduction(String cityintroduction) {
        this.cityintroduction = cityintroduction;
    }

    /**  **/
    public String getCitycoordinates() {
        return this.citycoordinates;
    }

    /**  **/
    public void setCitycoordinates(String citycoordinates) {
        this.citycoordinates = citycoordinates;
    }

}
