package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>PROCESSNODE ProcessnodeEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ProcessnodeEO extends BaseEntity {

    private String nodekey;
    private String procedurekey;
    private Integer nodenumber;
    private String remarks;
    private Integer nodestate;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private String attributekey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodekey -> nodekey</li>
     * <li>procedurekey -> procedurekey</li>
     * <li>nodenumber -> nodenumber</li>
     * <li>remarks -> remarks</li>
     * <li>nodestate -> nodestate</li>
     * <li>createtime -> createtime</li>
     * <li>attributekey -> attributekey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "nodekey": return "nodekey";
            case "procedurekey": return "procedurekey";
            case "nodenumber": return "nodenumber";
            case "remarks": return "remarks";
            case "nodestate": return "nodestate";
            case "createtime": return "createtime";
            case "attributekey": return "attributekey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodekey -> nodekey</li>
     * <li>procedurekey -> procedurekey</li>
     * <li>nodenumber -> nodenumber</li>
     * <li>remarks -> remarks</li>
     * <li>nodestate -> nodestate</li>
     * <li>createtime -> createtime</li>
     * <li>attributekey -> attributekey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "nodekey": return "nodekey";
            case "procedurekey": return "procedurekey";
            case "nodenumber": return "nodenumber";
            case "remarks": return "remarks";
            case "nodestate": return "nodestate";
            case "createtime": return "createtime";
            case "attributekey": return "attributekey";
            default: return null;
        }
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
    public String getProcedurekey() {
        return this.procedurekey;
    }

    /**  **/
    public void setProcedurekey(String procedurekey) {
        this.procedurekey = procedurekey;
    }

    /**  **/
    public Integer getNodenumber() {
        return this.nodenumber;
    }

    /**  **/
    public void setNodenumber(Integer nodenumber) {
        this.nodenumber = nodenumber;
    }

    /**  **/
    public String getRemarks() {
        return this.remarks;
    }

    /**  **/
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**  **/
    public Integer getNodestate() {
        return this.nodestate;
    }

    /**  **/
    public void setNodestate(Integer nodestate) {
        this.nodestate = nodestate;
    }

    /**  **/
    public Date getCreatetime() {
        return this.createtime;
    }

    /**  **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**  **/
    public String getAttributekey() {
        return this.attributekey;
    }

    /**  **/
    public void setAttributekey(String attributekey) {
        this.attributekey = attributekey;
    }

}
