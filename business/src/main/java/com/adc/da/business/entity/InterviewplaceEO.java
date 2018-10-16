package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>INTERVIEWPLACE InterviewplaceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class InterviewplaceEO extends BaseEntity {

    private String interviewplace;
    private String placename;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdate;
    private String remarks;
    private Integer isdel;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>interviewplace -> interviewplace</li>
     * <li>placename -> placename</li>
     * <li>createdate -> createdate</li>
     * <li>remarks -> remarks</li>
     * <li>isdel -> isdel</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "interviewplace": return "interviewplace";
            case "placename": return "placename";
            case "createdate": return "createdate";
            case "remarks": return "remarks";
            case "isdel": return "isdel";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>interviewplace -> interviewplace</li>
     * <li>placename -> placename</li>
     * <li>createdate -> createdate</li>
     * <li>remarks -> remarks</li>
     * <li>isdel -> isdel</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "interviewplace": return "interviewplace";
            case "placename": return "placename";
            case "createdate": return "createdate";
            case "remarks": return "remarks";
            case "isdel": return "isdel";
            default: return null;
        }
    }
    
    /**  **/
    public String getInterviewplace() {
        return this.interviewplace;
    }

    /**  **/
    public void setInterviewplace(String interviewplace) {
        this.interviewplace = interviewplace;
    }

    /**  **/
    public String getPlacename() {
        return this.placename;
    }

    /**  **/
    public void setPlacename(String placename) {
        this.placename = placename;
    }

    /**  **/
    public Date getCreatedate() {
        return this.createdate;
    }

    /**  **/
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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
    public Integer getIsdel() {
        return this.isdel;
    }

    /**  **/
    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

}
