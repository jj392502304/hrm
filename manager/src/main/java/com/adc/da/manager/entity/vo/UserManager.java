package com.adc.da.manager.entity.vo;

import java.io.Serializable;
import java.util.Date;

public class UserManager implements Serializable{
     private String personnewsid;
     private String personname;
     private String accountnumber;
     private String  phone;
     private String   email;
     private String  flag;
     private String  roleprimarykey;
     private String  positionkey;
     private String  departmentalfreignkey;
     private String  departmentjobkey;
     private String loginid;
     private String persondepartmentpositionid;
     private String personnewskey;

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
     private Date createtime;
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

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRoleprimarykey() {
        return roleprimarykey;
    }

    public void setRoleprimarykey(String roleprimarykey) {
        this.roleprimarykey = roleprimarykey;
    }

    public String getPositionkey() {
        return positionkey;
    }

    public void setPositionkey(String positionkey) {
        this.positionkey = positionkey;
    }

    public String getDepartmentalfreignkey() {
        return departmentalfreignkey;
    }

    public void setDepartmentalfreignkey(String departmentalfreignkey) {
        this.departmentalfreignkey = departmentalfreignkey;
    }

    public String getDepartmentjobkey() {
        return departmentjobkey;
    }

    public void setDepartmentjobkey(String departmentjobkey) {
        this.departmentjobkey = departmentjobkey;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }
    public String getPersondepartmentpositionid() {
        return persondepartmentpositionid;
    }

    public void setPersondepartmentpositionid(String persondepartmentpositionid) {
        this.persondepartmentpositionid = persondepartmentpositionid;
    }

    public String getPersonnewskey() {
        return personnewskey;
    }

    public void setPersonnewskey(String personnewskey) {
        this.personnewskey = personnewskey;
    }


    @Override
    public String toString() {
        return "UserManager{" +
                "personnewsid='" + personnewsid + '\'' +
                ", personname='" + personname + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", flag='" + flag + '\'' +
                ", roleprimarykey='" + roleprimarykey + '\'' +
                ", positionkey='" + positionkey + '\'' +
                ", departmentalfreignkey='" + departmentalfreignkey + '\'' +
                ", departmentjobkey='" + departmentjobkey + '\'' +
                ", loginid='" + loginid + '\'' +
                ", persondepartmentpositionid='" + persondepartmentpositionid + '\'' +
                ", personnewskey='" + personnewskey + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
