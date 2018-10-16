package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>PERSONNEWS PersonnewsEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class PersonnewsEO extends BaseEntity {

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date statuscreatetime;
    private Integer personstatus;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date enadletime;
    private Integer flag;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private String email;
    private Long phone;
    private String personsex;
    private String personidnumber;
    private String personname;
    private String personnewsid;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>statuscreatetime -> statuscreatetime</li>
     * <li>personstatus -> personstatus</li>
     * <li>enadletime -> enadletime</li>
     * <li>flag -> flag</li>
     * <li>createtime -> createtime</li>
     * <li>email -> email</li>
     * <li>phone -> phone</li>
     * <li>personsex -> personsex</li>
     * <li>personidnumber -> personidnumber</li>
     * <li>personname -> personname</li>
     * <li>personnewsid -> personnewsid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "statuscreatetime": return "statuscreatetime";
            case "personstatus": return "personstatus";
            case "enadletime": return "enadletime";
            case "flag": return "flag";
            case "createtime": return "createtime";
            case "email": return "email";
            case "phone": return "phone";
            case "personsex": return "personsex";
            case "personidnumber": return "personidnumber";
            case "personname": return "personname";
            case "personnewsid": return "personnewsid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>statuscreatetime -> statuscreatetime</li>
     * <li>personstatus -> personstatus</li>
     * <li>enadletime -> enadletime</li>
     * <li>flag -> flag</li>
     * <li>createtime -> createtime</li>
     * <li>email -> email</li>
     * <li>phone -> phone</li>
     * <li>personsex -> personsex</li>
     * <li>personidnumber -> personidnumber</li>
     * <li>personname -> personname</li>
     * <li>personnewsid -> personnewsid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "statuscreatetime": return "statuscreatetime";
            case "personstatus": return "personstatus";
            case "enadletime": return "enadletime";
            case "flag": return "flag";
            case "createtime": return "createtime";
            case "email": return "email";
            case "phone": return "phone";
            case "personsex": return "personsex";
            case "personidnumber": return "personidnumber";
            case "personname": return "personname";
            case "personnewsid": return "personnewsid";
            default: return null;
        }
    }
    
    /**  **/
    public Date getStatuscreatetime() {
        return this.statuscreatetime;
    }

    /**  **/
    public void setStatuscreatetime(Date statuscreatetime) {
        this.statuscreatetime = statuscreatetime;
    }

    /**  **/
    public Integer getPersonstatus() {
        return this.personstatus;
    }

    /**  **/
    public void setPersonstatus(Integer personstatus) {
        this.personstatus = personstatus;
    }

    /**  **/
    public Date getEnadletime() {
        return this.enadletime;
    }

    /**  **/
    public void setEnadletime(Date enadletime) {
        this.enadletime = enadletime;
    }

    /**  **/
    public Integer getFlag() {
        return this.flag;
    }

    /**  **/
    public void setFlag(Integer flag) {
        this.flag = flag;
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
    public String getEmail() {
        return this.email;
    }

    /**  **/
    public void setEmail(String email) {
        this.email = email;
    }

    /**  **/
    public Long getPhone() {
        return this.phone;
    }

    /**  **/
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**  **/
    public String getPersonsex() {
        return this.personsex;
    }

    /**  **/
    public void setPersonsex(String personsex) {
        this.personsex = personsex;
    }

    /**  **/
    public String getPersonidnumber() {
        return this.personidnumber;
    }

    /**  **/
    public void setPersonidnumber(String personidnumber) {
        this.personidnumber = personidnumber;
    }

    /**  **/
    public String getPersonname() {
        return this.personname;
    }

    /**  **/
    public void setPersonname(String personname) {
        this.personname = personname;
    }

    /**  **/
    public String getPersonnewsid() {
        return this.personnewsid;
    }

    /**  **/
    public void setPersonnewsid(String personnewsid) {
        this.personnewsid = personnewsid;
    }

}
