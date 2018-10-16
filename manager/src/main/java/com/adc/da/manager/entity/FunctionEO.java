package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>FUNCTION FunctionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class FunctionEO extends BaseEntity {

    private String functioninstructions;
    private String functionname;
    private String functionkey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>functioninstructions -> functioninstructions</li>
     * <li>functionname -> functionname</li>
     * <li>functionkey -> functionkey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "functioninstructions": return "functioninstructions";
            case "functionname": return "functionname";
            case "functionkey": return "functionkey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>functioninstructions -> functioninstructions</li>
     * <li>functionname -> functionname</li>
     * <li>functionkey -> functionkey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "functioninstructions": return "functioninstructions";
            case "functionname": return "functionname";
            case "functionkey": return "functionkey";
            default: return null;
        }
    }
    
    /**  **/
    public String getFunctioninstructions() {
        return this.functioninstructions;
    }

    /**  **/
    public void setFunctioninstructions(String functioninstructions) {
        this.functioninstructions = functioninstructions;
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
    public String getFunctionkey() {
        return this.functionkey;
    }

    /**  **/
    public void setFunctionkey(String functionkey) {
        this.functionkey = functionkey;
    }

}
