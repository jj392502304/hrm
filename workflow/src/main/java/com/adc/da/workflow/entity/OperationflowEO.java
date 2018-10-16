package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>OPERATIONFLOW OperationflowEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class OperationflowEO extends BaseEntity {

    private String procedurekey;
    private String modulename;
    private Integer isenabled;
    private String remarks;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private String founder;
    private Integer flowtype;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>procedurekey -> procedurekey</li>
     * <li>modulename -> modulename</li>
     * <li>isenabled -> isenabled</li>
     * <li>remarks -> remarks</li>
     * <li>createtime -> createtime</li>
     * <li>founder -> founder</li>
     * <li>flowtype -> flowtype</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "procedurekey": return "procedurekey";
            case "modulename": return "modulename";
            case "isenabled": return "isenabled";
            case "remarks": return "remarks";
            case "createtime": return "createtime";
            case "founder": return "founder";
            case "flowtype": return "flowtype";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>procedurekey -> procedurekey</li>
     * <li>modulename -> modulename</li>
     * <li>isenabled -> isenabled</li>
     * <li>remarks -> remarks</li>
     * <li>createtime -> createtime</li>
     * <li>founder -> founder</li>
     * <li>flowtype -> flowtype</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "procedurekey": return "procedurekey";
            case "modulename": return "modulename";
            case "isenabled": return "isenabled";
            case "remarks": return "remarks";
            case "createtime": return "createtime";
            case "founder": return "founder";
            case "flowtype": return "flowtype";
            default: return null;
        }
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
    public String getModulename() {
        return this.modulename;
    }

    /**  **/
    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    /**  **/
    public Integer getIsenabled() {
        return this.isenabled;
    }

    /**  **/
    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
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
    public Date getCreatetime() {
        return this.createtime;
    }

    /**  **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**  **/
    public String getFounder() {
        return this.founder;
    }

    /**  **/
    public void setFounder(String founder) {
        this.founder = founder;
    }

    /**  **/
    public Integer getFlowtype() {
        return this.flowtype;
    }

    /**  **/
    public void setFlowtype(Integer flowtype) {
        this.flowtype = flowtype;
    }

}
