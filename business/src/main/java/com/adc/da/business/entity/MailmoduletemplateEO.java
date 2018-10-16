package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>MAILMODULETEMPLATE MailmoduletemplateEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class MailmoduletemplateEO extends BaseEntity {

    private String pkmailmoduletemplate;
    private String servicemodulename;
    private Integer dynamictype;
    private String personnewskey;
    private Integer isenabled;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date mailcreatetime;
    private String mailmoduletitle;
    private String mailmodulecontent;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkmailmoduletemplate -> pkmailmoduletemplate</li>
     * <li>servicemodulename -> servicemodulename</li>
     * <li>dynamictype -> dynamictype</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>isenabled -> isenabled</li>
     * <li>mailcreatetime -> mailcreatetime</li>
     * <li>mailmoduletitle -> mailmoduletitle</li>
     * <li>mailmodulecontent -> mailmodulecontent</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkmailmoduletemplate": return "pkmailmoduletemplate";
            case "servicemodulename": return "servicemodulename";
            case "dynamictype": return "dynamictype";
            case "personnewskey": return "personnewskey";
            case "isenabled": return "isenabled";
            case "mailcreatetime": return "mailcreatetime";
            case "mailmoduletitle": return "mailmoduletitle";
            case "mailmodulecontent": return "mailmodulecontent";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkmailmoduletemplate -> pkmailmoduletemplate</li>
     * <li>servicemodulename -> servicemodulename</li>
     * <li>dynamictype -> dynamictype</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>isenabled -> isenabled</li>
     * <li>mailcreatetime -> mailcreatetime</li>
     * <li>mailmoduletitle -> mailmoduletitle</li>
     * <li>mailmodulecontent -> mailmodulecontent</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkmailmoduletemplate": return "pkmailmoduletemplate";
            case "servicemodulename": return "servicemodulename";
            case "dynamictype": return "dynamictype";
            case "personnewskey": return "personnewskey";
            case "isenabled": return "isenabled";
            case "mailcreatetime": return "mailcreatetime";
            case "mailmoduletitle": return "mailmoduletitle";
            case "mailmodulecontent": return "mailmodulecontent";
            default: return null;
        }
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
    public String getServicemodulename() {
        return this.servicemodulename;
    }

    /**  **/
    public void setServicemodulename(String servicemodulename) {
        this.servicemodulename = servicemodulename;
    }

    /**  **/
    public Integer getDynamictype() {
        return this.dynamictype;
    }

    /**  **/
    public void setDynamictype(Integer dynamictype) {
        this.dynamictype = dynamictype;
    }

    /**  **/
    public String getPersonnewskey() {
        return this.personnewskey;
    }

    /**  **/
    public void setPersonnewskey(String personnewskey) {
        this.personnewskey = personnewskey;
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
    public Date getMailcreatetime() {
        return this.mailcreatetime;
    }

    /**  **/
    public void setMailcreatetime(Date mailcreatetime) {
        this.mailcreatetime = mailcreatetime;
    }

    /**  **/
    public String getMailmoduletitle() {
        return this.mailmoduletitle;
    }

    /**  **/
    public void setMailmoduletitle(String mailmoduletitle) {
        this.mailmoduletitle = mailmoduletitle;
    }

    /**  **/
    public String getMailmodulecontent() {
        return this.mailmodulecontent;
    }

    /**  **/
    public void setMailmodulecontent(String mailmodulecontent) {
        this.mailmodulecontent = mailmodulecontent;
    }

}
