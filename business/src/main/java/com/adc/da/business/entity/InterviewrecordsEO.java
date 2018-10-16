package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>INTERVIEWRECORDS InterviewrecordsEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class InterviewrecordsEO extends BaseEntity {

    private String fkinterviewrecords;
    private String interviewren;
    private String interviewname;
    private String content;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private String departmentprimarykey;
    private String personnewskey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>fkinterviewrecords -> fkinterviewrecords</li>
     * <li>interviewren -> interviewren</li>
     * <li>interviewname -> interviewname</li>
     * <li>content -> content</li>
     * <li>createtime -> createtime</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>personnewskey -> personnewskey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "fkinterviewrecords": return "fkinterviewrecords";
            case "interviewren": return "interviewren";
            case "interviewname": return "interviewname";
            case "content": return "content";
            case "createtime": return "createtime";
            case "departmentprimarykey": return "departmentprimarykey";
            case "personnewskey": return "personnewskey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>fkinterviewrecords -> fkinterviewrecords</li>
     * <li>interviewren -> interviewren</li>
     * <li>interviewname -> interviewname</li>
     * <li>content -> content</li>
     * <li>createtime -> createtime</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>personnewskey -> personnewskey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "fkinterviewrecords": return "fkinterviewrecords";
            case "interviewren": return "interviewren";
            case "interviewname": return "interviewname";
            case "content": return "content";
            case "createtime": return "createtime";
            case "departmentprimarykey": return "departmentprimarykey";
            case "personnewskey": return "personnewskey";
            default: return null;
        }
    }
    
    /**  **/
    public String getFkinterviewrecords() {
        return this.fkinterviewrecords;
    }

    /**  **/
    public void setFkinterviewrecords(String fkinterviewrecords) {
        this.fkinterviewrecords = fkinterviewrecords;
    }

    /**  **/
    public String getInterviewren() {
        return this.interviewren;
    }

    /**  **/
    public void setInterviewren(String interviewren) {
        this.interviewren = interviewren;
    }

    /**  **/
    public String getInterviewname() {
        return this.interviewname;
    }

    /**  **/
    public void setInterviewname(String interviewname) {
        this.interviewname = interviewname;
    }

    /**  **/
    public String getContent() {
        return this.content;
    }

    /**  **/
    public void setContent(String content) {
        this.content = content;
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
    public String getDepartmentprimarykey() {
        return this.departmentprimarykey;
    }

    /**  **/
    public void setDepartmentprimarykey(String departmentprimarykey) {
        this.departmentprimarykey = departmentprimarykey;
    }

    /**  **/
    public String getPersonnewskey() {
        return this.personnewskey;
    }

    /**  **/
    public void setPersonnewskey(String personnewskey) {
        this.personnewskey = personnewskey;
    }

}
