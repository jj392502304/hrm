package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>APPLICATIONTEMPLATE ApplicationtemplateEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ApplicationtemplateEO extends BaseEntity {

    private String pkapplicationtemplate;
    private String modulename;
    private Integer moduletype;
    private Integer modulestate;
    private String personnewskey;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationtime;
    private Integer share;
    private String departmentprimarykey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkapplicationtemplate -> pkapplicationtemplate</li>
     * <li>modulename -> modulename</li>
     * <li>moduletype -> moduletype</li>
     * <li>modulestate -> modulestate</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>creationtime -> creationtime</li>
     * <li>share -> share</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkapplicationtemplate": return "pkapplicationtemplate";
            case "modulename": return "modulename";
            case "moduletype": return "moduletype";
            case "modulestate": return "modulestate";
            case "personnewskey": return "personnewskey";
            case "creationtime": return "creationtime";
            case "share": return "share";
            case "departmentprimarykey": return "departmentprimarykey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkapplicationtemplate -> pkapplicationtemplate</li>
     * <li>modulename -> modulename</li>
     * <li>moduletype -> moduletype</li>
     * <li>modulestate -> modulestate</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>creationtime -> creationtime</li>
     * <li>share -> share</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkapplicationtemplate": return "pkapplicationtemplate";
            case "modulename": return "modulename";
            case "moduletype": return "moduletype";
            case "modulestate": return "modulestate";
            case "personnewskey": return "personnewskey";
            case "creationtime": return "creationtime";
            case "share": return "share";
            case "departmentprimarykey": return "departmentprimarykey";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkapplicationtemplate() {
        return this.pkapplicationtemplate;
    }

    /**  **/
    public void setPkapplicationtemplate(String pkapplicationtemplate) {
        this.pkapplicationtemplate = pkapplicationtemplate;
    }

    /**  **/
    public String getModulename() {
        return this.modulename;
    }

    /**  **/
    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    /**  **/
    public Integer getModuletype() {
        return this.moduletype;
    }

    /**  **/
    public void setModuletype(Integer moduletype) {
        this.moduletype = moduletype;
    }

    /**  **/
    public Integer getModulestate() {
        return this.modulestate;
    }

    /**  **/
    public void setModulestate(Integer modulestate) {
        this.modulestate = modulestate;
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
    public Date getCreationtime() {
        return this.creationtime;
    }

    /**  **/
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**  **/
    public Integer getShare() {
        return this.share;
    }

    /**  **/
    public void setShare(Integer share) {
        this.share = share;
    }

    /**  **/
    public String getDepartmentprimarykey() {
        return this.departmentprimarykey;
    }

    /**  **/
    public void setDepartmentprimarykey(String departmentprimarykey) {
        this.departmentprimarykey = departmentprimarykey;
    }

}
