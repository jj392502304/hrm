package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>SCHOOLINFORMATIONMANAGEMENT SchoolinformationmanagementEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class SchoolinformationmanagementEO extends BaseEntity {

    private String pkschoolinformation;
    private String schoolname;
    private String schooladdress;
    private Integer isenabled;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date applicationtime;
    private String pkcity;
    private String cod;
    private String competentdepartment;
    private String region;
    private String schoollevel;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkschoolinformation -> pkschoolinformation</li>
     * <li>schoolname -> schoolname</li>
     * <li>schooladdress -> schooladdress</li>
     * <li>isenabled -> isenabled</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>pkcity -> pkcity</li>
     * <li>cod -> cod</li>
     * <li>competentdepartment -> competentdepartment</li>
     * <li>region -> region</li>
     * <li>schoollevel -> schoollevel</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkschoolinformation": return "pkschoolinformation";
            case "schoolname": return "schoolname";
            case "schooladdress": return "schooladdress";
            case "isenabled": return "isenabled";
            case "applicationtime": return "applicationtime";
            case "pkcity": return "pkcity";
            case "cod": return "cod";
            case "competentdepartment": return "competentdepartment";
            case "region": return "region";
            case "schoollevel": return "schoollevel";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkschoolinformation -> pkschoolinformation</li>
     * <li>schoolname -> schoolname</li>
     * <li>schooladdress -> schooladdress</li>
     * <li>isenabled -> isenabled</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>pkcity -> pkcity</li>
     * <li>cod -> cod</li>
     * <li>competentdepartment -> competentdepartment</li>
     * <li>region -> region</li>
     * <li>schoollevel -> schoollevel</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkschoolinformation": return "pkschoolinformation";
            case "schoolname": return "schoolname";
            case "schooladdress": return "schooladdress";
            case "isenabled": return "isenabled";
            case "applicationtime": return "applicationtime";
            case "pkcity": return "pkcity";
            case "cod": return "cod";
            case "competentdepartment": return "competentdepartment";
            case "region": return "region";
            case "schoollevel": return "schoollevel";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkschoolinformation() {
        return this.pkschoolinformation;
    }

    /**  **/
    public void setPkschoolinformation(String pkschoolinformation) {
        this.pkschoolinformation = pkschoolinformation;
    }

    /**  **/
    public String getSchoolname() {
        return this.schoolname;
    }

    /**  **/
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    /**  **/
    public String getSchooladdress() {
        return this.schooladdress;
    }

    /**  **/
    public void setSchooladdress(String schooladdress) {
        this.schooladdress = schooladdress;
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
    public String getPkcity() {
        return this.pkcity;
    }

    /**  **/
    public void setPkcity(String pkcity) {
        this.pkcity = pkcity;
    }

    /**  **/
    public String getCod() {
        return this.cod;
    }

    /**  **/
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**  **/
    public String getCompetentdepartment() {
        return this.competentdepartment;
    }

    /**  **/
    public void setCompetentdepartment(String competentdepartment) {
        this.competentdepartment = competentdepartment;
    }

    /**  **/
    public String getRegion() {
        return this.region;
    }

    /**  **/
    public void setRegion(String region) {
        this.region = region;
    }

    /**  **/
    public String getSchoollevel() {
        return this.schoollevel;
    }

    /**  **/
    public void setSchoollevel(String schoollevel) {
        this.schoollevel = schoollevel;
    }

}
