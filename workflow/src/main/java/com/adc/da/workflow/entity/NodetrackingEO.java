package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>NODETRACKING NodetrackingEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class NodetrackingEO extends BaseEntity {

    private String nodetrackingprimarykey;
    private String nodeprimarykey;
    private String approvalprimarykey;
    private String feedbackcontentkey;
    private Integer stateofapproval;
    private Integer approvalnumber;
    private String approvalnote;
    private String nextapprovalnode;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodetrackingprimarykey -> nodetrackingprimarykey</li>
     * <li>nodeprimarykey -> nodeprimarykey</li>
     * <li>approvalprimarykey -> approvalprimarykey</li>
     * <li>feedbackcontentkey -> feedbackcontentkey</li>
     * <li>stateofapproval -> stateofapproval</li>
     * <li>approvalnumber -> approvalnumber</li>
     * <li>approvalnote -> approvalnote</li>
     * <li>nextapprovalnode -> nextapprovalnode</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "nodetrackingprimarykey": return "nodetrackingprimarykey";
            case "nodeprimarykey": return "nodeprimarykey";
            case "approvalprimarykey": return "approvalprimarykey";
            case "feedbackcontentkey": return "feedbackcontentkey";
            case "stateofapproval": return "stateofapproval";
            case "approvalnumber": return "approvalnumber";
            case "approvalnote": return "approvalnote";
            case "nextapprovalnode": return "nextapprovalnode";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>nodetrackingprimarykey -> nodetrackingprimarykey</li>
     * <li>nodeprimarykey -> nodeprimarykey</li>
     * <li>approvalprimarykey -> approvalprimarykey</li>
     * <li>feedbackcontentkey -> feedbackcontentkey</li>
     * <li>stateofapproval -> stateofapproval</li>
     * <li>approvalnumber -> approvalnumber</li>
     * <li>approvalnote -> approvalnote</li>
     * <li>nextapprovalnode -> nextapprovalnode</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "nodetrackingprimarykey": return "nodetrackingprimarykey";
            case "nodeprimarykey": return "nodeprimarykey";
            case "approvalprimarykey": return "approvalprimarykey";
            case "feedbackcontentkey": return "feedbackcontentkey";
            case "stateofapproval": return "stateofapproval";
            case "approvalnumber": return "approvalnumber";
            case "approvalnote": return "approvalnote";
            case "nextapprovalnode": return "nextapprovalnode";
            default: return null;
        }
    }
    
    /**  **/
    public String getNodetrackingprimarykey() {
        return this.nodetrackingprimarykey;
    }

    /**  **/
    public void setNodetrackingprimarykey(String nodetrackingprimarykey) {
        this.nodetrackingprimarykey = nodetrackingprimarykey;
    }

    /**  **/
    public String getNodeprimarykey() {
        return this.nodeprimarykey;
    }

    /**  **/
    public void setNodeprimarykey(String nodeprimarykey) {
        this.nodeprimarykey = nodeprimarykey;
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
    public String getFeedbackcontentkey() {
        return this.feedbackcontentkey;
    }

    /**  **/
    public void setFeedbackcontentkey(String feedbackcontentkey) {
        this.feedbackcontentkey = feedbackcontentkey;
    }

    /**  **/
    public Integer getStateofapproval() {
        return this.stateofapproval;
    }

    /**  **/
    public void setStateofapproval(Integer stateofapproval) {
        this.stateofapproval = stateofapproval;
    }

    /**  **/
    public Integer getApprovalnumber() {
        return this.approvalnumber;
    }

    /**  **/
    public void setApprovalnumber(Integer approvalnumber) {
        this.approvalnumber = approvalnumber;
    }

    /**  **/
    public String getApprovalnote() {
        return this.approvalnote;
    }

    /**  **/
    public void setApprovalnote(String approvalnote) {
        this.approvalnote = approvalnote;
    }

    /**  **/
    public String getNextapprovalnode() {
        return this.nextapprovalnode;
    }

    /**  **/
    public void setNextapprovalnode(String nextapprovalnode) {
        this.nextapprovalnode = nextapprovalnode;
    }

}
