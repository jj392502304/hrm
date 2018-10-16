package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>USERLOGIN UserloginEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class UserloginEO extends BaseEntity {

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date enadletime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private Integer isenable;
    private String personnewskey;
    private String password;
    private String accountnumber;
    private String loginid;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>enadletime -> enadletime</li>
     * <li>createtime -> createtime</li>
     * <li>isenable -> isenable</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>password -> password</li>
     * <li>accountnumber -> accountnumber</li>
     * <li>loginid -> loginid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "enadletime": return "enadletime";
            case "createtime": return "createtime";
            case "isenable": return "isenable";
            case "personnewskey": return "personnewskey";
            case "password": return "password";
            case "accountnumber": return "accountnumber";
            case "loginid": return "loginid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>enadletime -> enadletime</li>
     * <li>createtime -> createtime</li>
     * <li>isenable -> isenable</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>password -> password</li>
     * <li>accountnumber -> accountnumber</li>
     * <li>loginid -> loginid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "enadletime": return "enadletime";
            case "createtime": return "createtime";
            case "isenable": return "isenable";
            case "personnewskey": return "personnewskey";
            case "password": return "password";
            case "accountnumber": return "accountnumber";
            case "loginid": return "loginid";
            default: return null;
        }
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
    public Date getCreatetime() {
        return this.createtime;
    }

    /**  **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**  **/
    public Integer getIsenable() {
        return this.isenable;
    }

    /**  **/
    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
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
    public String getPassword() {
        return this.password;
    }

    /**  **/
    public void setPassword(String password) {
        this.password = password;
    }

    /**  **/
    public String getAccountnumber() {
        return this.accountnumber;
    }

    /**  **/
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    /**  **/
    public String getLoginid() {
        return this.loginid;
    }

    /**  **/
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

}
