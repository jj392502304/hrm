package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>ROLEFUNCTION RolefunctionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class RolefunctionEO extends BaseEntity {

    private String pageurl;
    private String functionkey;
    private String pagename;
    private String modulename;
    private String rolefunctionkey;
    private String functionname;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pageurl -> pageurl</li>
     * <li>functionkey -> functionkey</li>
     * <li>pagename -> pagename</li>
     * <li>modulename -> modulename</li>
     * <li>rolefunctionkey -> rolefunctionkey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pageurl": return "pageurl";
            case "functionkey": return "functionkey";
            case "pagename": return "pagename";
            case "modulename": return "modulename";
            case "rolefunctionkey": return "rolefunctionkey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pageurl -> pageurl</li>
     * <li>functionkey -> functionkey</li>
     * <li>pagename -> pagename</li>
     * <li>modulename -> modulename</li>
     * <li>rolefunctionkey -> rolefunctionkey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pageurl": return "pageurl";
            case "functionkey": return "functionkey";
            case "pagename": return "pagename";
            case "modulename": return "modulename";
            case "rolefunctionkey": return "rolefunctionkey";
            default: return null;
        }
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    /**  **/
    public String getPageurl() {
        return this.pageurl;
    }

    /**  **/
    public void setPageurl(String pageurl) {
        this.pageurl = pageurl;
    }

    /**  **/
    public String getFunctionkey() {
        return this.functionkey;
    }

    /**  **/
    public void setFunctionkey(String functionkey) {
        this.functionkey = functionkey;
    }

    /**  **/
    public String getPagename() {
        return this.pagename;
    }

    /**  **/
    public void setPagename(String pagename) {
        this.pagename = pagename;
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
    public String getRolefunctionkey() {
        return this.rolefunctionkey;
    }

    /**  **/
    public void setRolefunctionkey(String rolefunctionkey) {
        this.rolefunctionkey = rolefunctionkey;
    }

}
