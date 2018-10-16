package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>APPROVALSERVICE ApprovalserviceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ApprovalserviceEO extends BaseEntity {

    private String approvalprimarykey;
    private String processprimarykey;
    private String businessdataprimarykey;
    private Integer nextstateofapproval;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>approvalprimarykey -> approvalprimarykey</li>
     * <li>processprimarykey -> processprimarykey</li>
     * <li>businessdataprimarykey -> businessdataprimarykey</li>
     * <li>nextstateofapproval -> nextstateofapproval</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "approvalprimarykey": return "approvalprimarykey";
            case "processprimarykey": return "processprimarykey";
            case "businessdataprimarykey": return "businessdataprimarykey";
            case "nextstateofapproval": return "nextstateofapproval";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>approvalprimarykey -> approvalprimarykey</li>
     * <li>processprimarykey -> processprimarykey</li>
     * <li>businessdataprimarykey -> businessdataprimarykey</li>
     * <li>nextstateofapproval -> nextstateofapproval</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "approvalprimarykey": return "approvalprimarykey";
            case "processprimarykey": return "processprimarykey";
            case "businessdataprimarykey": return "businessdataprimarykey";
            case "nextstateofapproval": return "nextstateofapproval";
            default: return null;
        }
    }
    
    /**  **/
    public String getApprovalprimarykey() {
        return this.approvalprimarykey;
    }

    /**  **/
    public void setApprovalprimarykey(String approvalprimarykey) {
        this.approvalprimarykey = approvalprimarykey;
    }

    /**  **/
    public String getProcessprimarykey() {
        return this.processprimarykey;
    }

    /**  **/
    public void setProcessprimarykey(String processprimarykey) {
        this.processprimarykey = processprimarykey;
    }

    /**  **/
    public String getBusinessdataprimarykey() {
        return this.businessdataprimarykey;
    }

    /**  **/
    public void setBusinessdataprimarykey(String businessdataprimarykey) {
        this.businessdataprimarykey = businessdataprimarykey;
    }

    /**  **/
    public Integer getNextstateofapproval() {
        return this.nextstateofapproval;
    }

    /**  **/
    public void setNextstateofapproval(Integer nextstateofapproval) {
        this.nextstateofapproval = nextstateofapproval;
    }

}
