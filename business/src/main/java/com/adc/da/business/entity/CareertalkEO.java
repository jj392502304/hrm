package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>CAREERTALK CareertalkEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class CareertalkEO extends BaseEntity {

    private String pkcareertalk;
    private String city;
    private String school;
    private String campus;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date schooldate;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date schooltime;
    private String area;
    private String introduce;
    private Integer sequencenumber;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date savetime;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkcareertalk -> pkcareertalk</li>
     * <li>city -> city</li>
     * <li>school -> school</li>
     * <li>campus -> campus</li>
     * <li>schooldate -> schooldate</li>
     * <li>schooltime -> schooltime</li>
     * <li>area -> area</li>
     * <li>introduce -> introduce</li>
     * <li>sequencenumber -> sequencenumber</li>
     * <li>savetime -> savetime</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkcareertalk": return "pkcareertalk";
            case "city": return "city";
            case "school": return "school";
            case "campus": return "campus";
            case "schooldate": return "schooldate";
            case "schooltime": return "schooltime";
            case "area": return "area";
            case "introduce": return "introduce";
            case "sequencenumber": return "sequencenumber";
            case "savetime": return "savetime";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkcareertalk -> pkcareertalk</li>
     * <li>city -> city</li>
     * <li>school -> school</li>
     * <li>campus -> campus</li>
     * <li>schooldate -> schooldate</li>
     * <li>schooltime -> schooltime</li>
     * <li>area -> area</li>
     * <li>introduce -> introduce</li>
     * <li>sequencenumber -> sequencenumber</li>
     * <li>savetime -> savetime</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkcareertalk": return "pkcareertalk";
            case "city": return "city";
            case "school": return "school";
            case "campus": return "campus";
            case "schooldate": return "schooldate";
            case "schooltime": return "schooltime";
            case "area": return "area";
            case "introduce": return "introduce";
            case "sequencenumber": return "sequencenumber";
            case "savetime": return "savetime";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkcareertalk() {
        return this.pkcareertalk;
    }

    /**  **/
    public void setPkcareertalk(String pkcareertalk) {
        this.pkcareertalk = pkcareertalk;
    }

    /**  **/
    public String getCity() {
        return this.city;
    }

    /**  **/
    public void setCity(String city) {
        this.city = city;
    }

    /**  **/
    public String getSchool() {
        return this.school;
    }

    /**  **/
    public void setSchool(String school) {
        this.school = school;
    }

    /**  **/
    public String getCampus() {
        return this.campus;
    }

    /**  **/
    public void setCampus(String campus) {
        this.campus = campus;
    }

    /**  **/
    public Date getSchooldate() {
        return this.schooldate;
    }

    /**  **/
    public void setSchooldate(Date schooldate) {
        this.schooldate = schooldate;
    }

    /**  **/
    public Date getSchooltime() {
        return this.schooltime;
    }

    /**  **/
    public void setSchooltime(Date schooltime) {
        this.schooltime = schooltime;
    }

    /**  **/
    public String getArea() {
        return this.area;
    }

    /**  **/
    public void setArea(String area) {
        this.area = area;
    }

    /**  **/
    public String getIntroduce() {
        return this.introduce;
    }

    /**  **/
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**  **/
    public Integer getSequencenumber() {
        return this.sequencenumber;
    }

    /**  **/
    public void setSequencenumber(Integer sequencenumber) {
        this.sequencenumber = sequencenumber;
    }

    /**  **/
    public Date getSavetime() {
        return this.savetime;
    }

    /**  **/
    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

}
