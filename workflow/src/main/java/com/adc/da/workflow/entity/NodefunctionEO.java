package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>NODEFUNCTION NodefunctionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class NodefunctionEO extends BaseEntity {

    private String nodefunctionkey;
    private String nodekey;
    private String function;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodefunctionkey -> nodefunctionkey</li>
     * <li>nodekey -> nodekey</li>
     * <li>function -> function</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "nodefunctionkey": return "nodefunctionkey";
            case "nodekey": return "nodekey";
            case "function": return "function";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodefunctionkey -> nodefunctionkey</li>
     * <li>nodekey -> nodekey</li>
     * <li>function -> function</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "nodefunctionkey": return "nodefunctionkey";
            case "nodekey": return "nodekey";
            case "function": return "function";
            default: return null;
        }
    }
    
    /**  **/
    public String getNodefunctionkey() {
        return this.nodefunctionkey;
    }

    /**  **/
    public void setNodefunctionkey(String nodefunctionkey) {
        this.nodefunctionkey = nodefunctionkey;
    }

    /**  **/
    public String getNodekey() {
        return this.nodekey;
    }

    /**  **/
    public void setNodekey(String nodekey) {
        this.nodekey = nodekey;
    }

    /**  **/
    public String getFunction() {
        return this.function;
    }

    /**  **/
    public void setFunction(String function) {
        this.function = function;
    }

}
