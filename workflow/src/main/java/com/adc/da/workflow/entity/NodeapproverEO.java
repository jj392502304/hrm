package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>NODEAPPROVER NodeapproverEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class NodeapproverEO extends BaseEntity {

    private String nodeapproverkey;
    private String approverkey;
    private String nodekey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodeapproverkey -> nodeapproverkey</li>
     * <li>approverkey -> approverkey</li>
     * <li>nodekey -> nodekey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "nodeapproverkey": return "nodeapproverkey";
            case "approverkey": return "approverkey";
            case "nodekey": return "nodekey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodeapproverkey -> nodeapproverkey</li>
     * <li>approverkey -> approverkey</li>
     * <li>nodekey -> nodekey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "nodeapproverkey": return "nodeapproverkey";
            case "approverkey": return "approverkey";
            case "nodekey": return "nodekey";
            default: return null;
        }
    }
    
    /**  **/
    public String getNodeapproverkey() {
        return this.nodeapproverkey;
    }

    /**  **/
    public void setNodeapproverkey(String nodeapproverkey) {
        this.nodeapproverkey = nodeapproverkey;
    }

    /**  **/
    public String getApproverkey() {
        return this.approverkey;
    }

    /**  **/
    public void setApproverkey(String approverkey) {
        this.approverkey = approverkey;
    }

    /**  **/
    public String getNodekey() {
        return this.nodekey;
    }

    /**  **/
    public void setNodekey(String nodekey) {
        this.nodekey = nodekey;
    }

}
