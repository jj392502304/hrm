package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>EDUCATIONALBACKGROUND EducationalbackgroundEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class EducationalbackgroundEO extends BaseEntity {

    private String pkschoolinformation;
    private String applymemberkey;
    private String schoolname;
    private String education;
    private String degree;
    private String city;
    private String collegename;
    private Long achievement;
    private String culturemode;
    private String professionalcourses;
    private String professionalranking;
    private String professionalname;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date graduationtime;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkschoolinformation -> pkschoolinformation</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>schoolname -> schoolname</li>
     * <li>education -> education</li>
     * <li>degree -> degree</li>
     * <li>city -> city</li>
     * <li>collegename -> collegename</li>
     * <li>achievement -> achievement</li>
     * <li>culturemode -> culturemode</li>
     * <li>professionalcourses -> professionalcourses</li>
     * <li>professionalranking -> professionalranking</li>
     * <li>professionalname -> professionalname</li>
     * <li>graduationtime -> graduationtime</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkschoolinformation": return "pkschoolinformation";
            case "applymemberkey": return "applymemberkey";
            case "schoolname": return "schoolname";
            case "education": return "education";
            case "degree": return "degree";
            case "city": return "city";
            case "collegename": return "collegename";
            case "achievement": return "achievement";
            case "culturemode": return "culturemode";
            case "professionalcourses": return "professionalcourses";
            case "professionalranking": return "professionalranking";
            case "professionalname": return "professionalname";
            case "graduationtime": return "graduationtime";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkschoolinformation -> pkschoolinformation</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>schoolname -> schoolname</li>
     * <li>education -> education</li>
     * <li>degree -> degree</li>
     * <li>city -> city</li>
     * <li>collegename -> collegename</li>
     * <li>achievement -> achievement</li>
     * <li>culturemode -> culturemode</li>
     * <li>professionalcourses -> professionalcourses</li>
     * <li>professionalranking -> professionalranking</li>
     * <li>professionalname -> professionalname</li>
     * <li>graduationtime -> graduationtime</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkschoolinformation": return "pkschoolinformation";
            case "applymemberkey": return "applymemberkey";
            case "schoolname": return "schoolname";
            case "education": return "education";
            case "degree": return "degree";
            case "city": return "city";
            case "collegename": return "collegename";
            case "achievement": return "achievement";
            case "culturemode": return "culturemode";
            case "professionalcourses": return "professionalcourses";
            case "professionalranking": return "professionalranking";
            case "professionalname": return "professionalname";
            case "graduationtime": return "graduationtime";
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
    public String getApplymemberkey() {
        return this.applymemberkey;
    }

    /**  **/
    public void setApplymemberkey(String applymemberkey) {
        this.applymemberkey = applymemberkey;
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
    public String getEducation() {
        return this.education;
    }

    /**  **/
    public void setEducation(String education) {
        this.education = education;
    }

    /**  **/
    public String getDegree() {
        return this.degree;
    }

    /**  **/
    public void setDegree(String degree) {
        this.degree = degree;
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
    public String getCollegename() {
        return this.collegename;
    }

    /**  **/
    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    /**  **/
    public Long getAchievement() {
        return this.achievement;
    }

    /**  **/
    public void setAchievement(Long achievement) {
        this.achievement = achievement;
    }

    /**  **/
    public String getCulturemode() {
        return this.culturemode;
    }

    /**  **/
    public void setCulturemode(String culturemode) {
        this.culturemode = culturemode;
    }

    /**  **/
    public String getProfessionalcourses() {
        return this.professionalcourses;
    }

    /**  **/
    public void setProfessionalcourses(String professionalcourses) {
        this.professionalcourses = professionalcourses;
    }

    /**  **/
    public String getProfessionalranking() {
        return this.professionalranking;
    }

    /**  **/
    public void setProfessionalranking(String professionalranking) {
        this.professionalranking = professionalranking;
    }

    /**  **/
    public String getProfessionalname() {
        return this.professionalname;
    }

    /**  **/
    public void setProfessionalname(String professionalname) {
        this.professionalname = professionalname;
    }

    /**  **/
    public Date getGraduationtime() {
        return this.graduationtime;
    }

    /**  **/
    public void setGraduationtime(Date graduationtime) {
        this.graduationtime = graduationtime;
    }

}
