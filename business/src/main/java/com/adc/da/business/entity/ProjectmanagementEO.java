package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>PROJECTMANAGEMENT ProjectmanagementEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ProjectmanagementEO extends BaseEntity {

    private String pkprojectmanagement;
    private String projectname;
    private String creationtime;
    private String departmentprimarykey;
    private String personnewskey;
    private String personnewsid;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkprojectmanagement -> pkprojectmanagement</li>
     * <li>projectname -> projectname</li>
     * <li>creationtime -> creationtime</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>personnewsid -> personnewsid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkprojectmanagement": return "pkprojectmanagement";
            case "projectname": return "projectname";
            case "creationtime": return "creationtime";
            case "departmentprimarykey": return "departmentprimarykey";
            case "personnewskey": return "personnewskey";
            case "personnewsid": return "personnewsid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkprojectmanagement -> pkprojectmanagement</li>
     * <li>projectname -> projectname</li>
     * <li>creationtime -> creationtime</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>personnewsid -> personnewsid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkprojectmanagement": return "pkprojectmanagement";
            case "projectname": return "projectname";
            case "creationtime": return "creationtime";
            case "departmentprimarykey": return "departmentprimarykey";
            case "personnewskey": return "personnewskey";
            case "personnewsid": return "personnewsid";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkprojectmanagement() {
        return this.pkprojectmanagement;
    }

    /**  **/
    public void setPkprojectmanagement(String pkprojectmanagement) {
        this.pkprojectmanagement = pkprojectmanagement;
    }

    /**  **/
    public String getProjectname() {
        return this.projectname;
    }

    /**  **/
    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    /**  **/
    public String getCreationtime() {
        return this.creationtime;
    }

    /**  **/
    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
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
    public String getPersonnewskey() {
        return this.personnewskey;
    }

    /**  **/
    public void setPersonnewskey(String personnewskey) {
        this.personnewskey = personnewskey;
    }

    /**  **/
    public String getPersonnewsid() {
        return this.personnewsid;
    }

    /**  **/
    public void setPersonnewsid(String personnewsid) {
        this.personnewsid = personnewsid;
    }

}
