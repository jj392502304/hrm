package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>APPROVALFUNCTION ApprovalfunctionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ApprovalfunctionEO extends BaseEntity {

    private String approvalfunctionkey;
    private String functionname;
    private String functiondescription;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>approvalfunctionkey -> approvalfunctionkey</li>
     * <li>functionname -> functionname</li>
     * <li>functiondescription -> functiondescription</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "approvalfunctionkey": return "approvalfunctionkey";
            case "functionname": return "functionname";
            case "functiondescription": return "functiondescription";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>approvalfunctionkey -> approvalfunctionkey</li>
     * <li>functionname -> functionname</li>
     * <li>functiondescription -> functiondescription</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "approvalfunctionkey": return "approvalfunctionkey";
            case "functionname": return "functionname";
            case "functiondescription": return "functiondescription";
            default: return null;
        }
    }
    
    /**  **/
    public String getApprovalfunctionkey() {
        return this.approvalfunctionkey;
    }

    /**  **/
    public void setApprovalfunctionkey(String approvalfunctionkey) {
        this.approvalfunctionkey = approvalfunctionkey;
    }

    /**  **/
    public String getFunctionname() {
        return this.functionname;
    }

    /**  **/
    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    /**  **/
    public String getFunctiondescription() {
        return this.functiondescription;
    }

    /**  **/
    public void setFunctiondescription(String functiondescription) {
        this.functiondescription = functiondescription;
    }

}
