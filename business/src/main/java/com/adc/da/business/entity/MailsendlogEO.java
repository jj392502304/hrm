package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>MAILSENDLOG MailsendlogEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class MailsendlogEO extends BaseEntity {

    private String pkmailsendlog;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date mailsendingtime;
    private Integer mailsendingstatus;
    private Integer mailreturnstatus;
    private String pkmailmoduletemplate;
    private String applymemberkey;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date returntime;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkmailsendlog -> pkmailsendlog</li>
     * <li>mailsendingtime -> mailsendingtime</li>
     * <li>mailsendingstatus -> mailsendingstatus</li>
     * <li>mailreturnstatus -> mailreturnstatus</li>
     * <li>pkmailmoduletemplate -> pkmailmoduletemplate</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>returntime -> returntime</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkmailsendlog": return "pkmailsendlog";
            case "mailsendingtime": return "mailsendingtime";
            case "mailsendingstatus": return "mailsendingstatus";
            case "mailreturnstatus": return "mailreturnstatus";
            case "pkmailmoduletemplate": return "pkmailmoduletemplate";
            case "applymemberkey": return "applymemberkey";
            case "returntime": return "returntime";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkmailsendlog -> pkmailsendlog</li>
     * <li>mailsendingtime -> mailsendingtime</li>
     * <li>mailsendingstatus -> mailsendingstatus</li>
     * <li>mailreturnstatus -> mailreturnstatus</li>
     * <li>pkmailmoduletemplate -> pkmailmoduletemplate</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>returntime -> returntime</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkmailsendlog": return "pkmailsendlog";
            case "mailsendingtime": return "mailsendingtime";
            case "mailsendingstatus": return "mailsendingstatus";
            case "mailreturnstatus": return "mailreturnstatus";
            case "pkmailmoduletemplate": return "pkmailmoduletemplate";
            case "applymemberkey": return "applymemberkey";
            case "returntime": return "returntime";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkmailsendlog() {
        return this.pkmailsendlog;
    }

    /**  **/
    public void setPkmailsendlog(String pkmailsendlog) {
        this.pkmailsendlog = pkmailsendlog;
    }

    /**  **/
    public Date getMailsendingtime() {
        return this.mailsendingtime;
    }

    /**  **/
    public void setMailsendingtime(Date mailsendingtime) {
        this.mailsendingtime = mailsendingtime;
    }

    /**  **/
    public Integer getMailsendingstatus() {
        return this.mailsendingstatus;
    }

    /**  **/
    public void setMailsendingstatus(Integer mailsendingstatus) {
        this.mailsendingstatus = mailsendingstatus;
    }

    /**  **/
    public Integer getMailreturnstatus() {
        return this.mailreturnstatus;
    }

    /**  **/
    public void setMailreturnstatus(Integer mailreturnstatus) {
        this.mailreturnstatus = mailreturnstatus;
    }

    /**  **/
    public String getPkmailmoduletemplate() {
        return this.pkmailmoduletemplate;
    }

    /**  **/
    public void setPkmailmoduletemplate(String pkmailmoduletemplate) {
        this.pkmailmoduletemplate = pkmailmoduletemplate;
    }

    /**  **/
    public String getApplymemberkey() {
        return this.applymemberkey;
    }

    /**  **/
    public void setApplymemberkey(String applymemberkey) {
        this.applymemberkey = applymemberkey;
    }

    /**  **/
    public Date getReturntime() {
        return this.returntime;
    }

    /**  **/
    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

}
