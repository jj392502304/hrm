package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>FEEDBACKINFORMATION FeedbackinformationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class FeedbackinformationEO extends BaseEntity {

    private String feedbackcontentkey;
    private String feedbackcontent;
    private String approverkey;
    private Integer stateofapproval;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date examinetime;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>feedbackcontentkey -> feedbackcontentkey</li>
     * <li>feedbackcontent -> feedbackcontent</li>
     * <li>approverkey -> approverkey</li>
     * <li>stateofapproval -> stateofapproval</li>
     * <li>examinetime -> examinetime</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "feedbackcontentkey": return "feedbackcontentkey";
            case "feedbackcontent": return "feedbackcontent";
            case "approverkey": return "approverkey";
            case "stateofapproval": return "stateofapproval";
            case "examinetime": return "examinetime";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>feedbackcontentkey -> feedbackcontentkey</li>
     * <li>feedbackcontent -> feedbackcontent</li>
     * <li>approverkey -> approverkey</li>
     * <li>stateofapproval -> stateofapproval</li>
     * <li>examinetime -> examinetime</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "feedbackcontentkey": return "feedbackcontentkey";
            case "feedbackcontent": return "feedbackcontent";
            case "approverkey": return "approverkey";
            case "stateofapproval": return "stateofapproval";
            case "examinetime": return "examinetime";
            default: return null;
        }
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
    public String getFeedbackcontent() {
        return this.feedbackcontent;
    }

    /**  **/
    public void setFeedbackcontent(String feedbackcontent) {
        this.feedbackcontent = feedbackcontent;
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
    public Integer getStateofapproval() {
        return this.stateofapproval;
    }

    /**  **/
    public void setStateofapproval(Integer stateofapproval) {
        this.stateofapproval = stateofapproval;
    }

    /**  **/
    public Date getExaminetime() {
        return this.examinetime;
    }

    /**  **/
    public void setExaminetime(Date examinetime) {
        this.examinetime = examinetime;
    }

}
