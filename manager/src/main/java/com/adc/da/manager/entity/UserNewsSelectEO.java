package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

public class UserNewsSelectEO extends BaseEntity{
    private String personnewsid;
    private String personname;
    private Long phone;
    private String email;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private Integer flag;
    private String departmentalname;
    private String accountnumber;
    private String rolename;

    public String getPersonnewsid() {
        return personnewsid;
    }

    public void setPersonnewsid(String personnewsid) {
        this.personnewsid = personnewsid;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getDepartmentalname() {
        return departmentalname;
    }

    public void setDepartmentalname(String departmentalname) {
        this.departmentalname = departmentalname;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
