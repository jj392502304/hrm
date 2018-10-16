package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>PROJECTEXPERIENCE ProjectexperienceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ProjectexperienceEO extends BaseEntity {

    private String pkprojectexperience;
    private String applymemberkey;
    private String entryname;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date experientialtime;
    private String description;
    private String projectresponsibilities;
    private String post;
    private Integer projectman;
    private String projectresults;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkprojectexperience -> pkprojectexperience</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>entryname -> entryname</li>
     * <li>experientialtime -> experientialtime</li>
     * <li>description -> description</li>
     * <li>projectresponsibilities -> projectresponsibilities</li>
     * <li>post -> post</li>
     * <li>projectman -> projectman</li>
     * <li>projectresults -> projectresults</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkprojectexperience": return "pkprojectexperience";
            case "applymemberkey": return "applymemberkey";
            case "entryname": return "entryname";
            case "experientialtime": return "experientialtime";
            case "description": return "description";
            case "projectresponsibilities": return "projectresponsibilities";
            case "post": return "post";
            case "projectman": return "projectman";
            case "projectresults": return "projectresults";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkprojectexperience -> pkprojectexperience</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>entryname -> entryname</li>
     * <li>experientialtime -> experientialtime</li>
     * <li>description -> description</li>
     * <li>projectresponsibilities -> projectresponsibilities</li>
     * <li>post -> post</li>
     * <li>projectman -> projectman</li>
     * <li>projectresults -> projectresults</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkprojectexperience": return "pkprojectexperience";
            case "applymemberkey": return "applymemberkey";
            case "entryname": return "entryname";
            case "experientialtime": return "experientialtime";
            case "description": return "description";
            case "projectresponsibilities": return "projectresponsibilities";
            case "post": return "post";
            case "projectman": return "projectman";
            case "projectresults": return "projectresults";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkprojectexperience() {
        return this.pkprojectexperience;
    }

    /**  **/
    public void setPkprojectexperience(String pkprojectexperience) {
        this.pkprojectexperience = pkprojectexperience;
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
    public String getEntryname() {
        return this.entryname;
    }

    /**  **/
    public void setEntryname(String entryname) {
        this.entryname = entryname;
    }

    /**  **/
    public Date getExperientialtime() {
        return this.experientialtime;
    }

    /**  **/
    public void setExperientialtime(Date experientialtime) {
        this.experientialtime = experientialtime;
    }

    /**  **/
    public String getDescription() {
        return this.description;
    }

    /**  **/
    public void setDescription(String description) {
        this.description = description;
    }

    /**  **/
    public String getProjectresponsibilities() {
        return this.projectresponsibilities;
    }

    /**  **/
    public void setProjectresponsibilities(String projectresponsibilities) {
        this.projectresponsibilities = projectresponsibilities;
    }

    /**  **/
    public String getPost() {
        return this.post;
    }

    /**  **/
    public void setPost(String post) {
        this.post = post;
    }

    /**  **/
    public Integer getProjectman() {
        return this.projectman;
    }

    /**  **/
    public void setProjectman(Integer projectman) {
        this.projectman = projectman;
    }

    /**  **/
    public String getProjectresults() {
        return this.projectresults;
    }

    /**  **/
    public void setProjectresults(String projectresults) {
        this.projectresults = projectresults;
    }

}
