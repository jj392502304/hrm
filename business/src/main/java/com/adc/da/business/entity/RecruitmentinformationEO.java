package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;
import org.hibernate.validator.constraints.Range;

import java.util.Date;

/**
 * <b>功能：</b>RECRUITMENTINFORMATION RecruitmentinformationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-27 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class RecruitmentinformationEO extends BaseEntity {

    private String pkrecruitmentinformation;
    private String pkprojectmanagement;
    private Integer recruitmenttype;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date recruitmenttime;
    private Integer recruitmentnumber;
    private String recruitmentrequirements;
    private Integer issubmit;
    private Integer isrelease;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationtime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date releasetime;
    private String workingplace;
    private String jobtype;
    private Long salarybottomline;
    private Long salaryupline;
    private String professionalduties;
    private String qualification;
    private String distributionchannel;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date arrivaldate;
    private String interviewplacekey;
    private String departmentprimarykey;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date downtime;
    private String procedureid;
    private String personnewsid;
    private Integer education;
    private Integer contracttypr;
    private String onlineapppkapplicationtemplate;
    private String mobileapppkapplicationtemplate;
    private String pkresumescore;
    private Integer worknature;
    private String hiringmanager;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expirytime;
    private String recruitmentname;
    private String recruitmentcode;
    private String personnewskey;
    private String personnewskeyid;
    private String procedurekey;
    private Integer istemplate;
    private String textName;
    private int Page;
    private int Count;
    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkrecruitmentinformation -> pkrecruitmentinformation</li>
     * <li>pkprojectmanagement -> pkprojectmanagement</li>
     * <li>recruitmenttype -> recruitmenttype</li>
     * <li>recruitmenttime -> recruitmenttime</li>
     * <li>recruitmentnumber -> recruitmentnumber</li>
     * <li>recruitmentrequirements -> recruitmentrequirements</li>
     * <li>issubmit -> issubmit</li>
     * <li>isrelease -> isrelease</li>
     * <li>creationtime -> creationtime</li>
     * <li>releasetime -> releasetime</li>
     * <li>workingplace -> workingplace</li>
     * <li>jobtype -> jobtype</li>
     * <li>salarybottomline -> salarybottomline</li>
     * <li>salaryupline -> salaryupline</li>
     * <li>professionalduties -> professionalduties</li>
     * <li>qualification -> qualification</li>
     * <li>distributionchannel -> distributionchannel</li>
     * <li>arrivaldate -> arrivaldate</li>
     * <li>interviewplacekey -> interviewplacekey</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>downtime -> downtime</li>
     * <li>procedureid -> procedureid</li>
     * <li>personnewsid -> personnewsid</li>
     * <li>education -> education</li>
     * <li>contracttypr -> contracttypr</li>
     * <li>onlineapppkapplicationtemplate -> onlineapppkapplicationtemplate</li>
     * <li>mobileapppkapplicationtemplate -> mobileapppkapplicationtemplate</li>
     * <li>pkresumescore -> pkresumescore</li>
     * <li>worknature -> worknature</li>
     * <li>hiringmanager -> hiringmanager</li>
     * <li>expirytime -> expirytime</li>
     * <li>recruitmentname -> recruitmentname</li>
     * <li>recruitmentcode -> recruitmentcode</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>personnewskeyid -> personnewskeyid</li>
     * <li>procedurekey -> procedurekey</li>
     * <li>istemplate -> istemplate</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkrecruitmentinformation": return "pkrecruitmentinformation";
            case "pkprojectmanagement": return "pkprojectmanagement";
            case "recruitmenttype": return "recruitmenttype";
            case "recruitmenttime": return "recruitmenttime";
            case "recruitmentnumber": return "recruitmentnumber";
            case "recruitmentrequirements": return "recruitmentrequirements";
            case "issubmit": return "issubmit";
            case "isrelease": return "isrelease";
            case "creationtime": return "creationtime";
            case "releasetime": return "releasetime";
            case "workingplace": return "workingplace";
            case "jobtype": return "jobtype";
            case "salarybottomline": return "salarybottomline";
            case "salaryupline": return "salaryupline";
            case "professionalduties": return "professionalduties";
            case "qualification": return "qualification";
            case "distributionchannel": return "distributionchannel";
            case "arrivaldate": return "arrivaldate";
            case "interviewplacekey": return "interviewplacekey";
            case "departmentprimarykey": return "departmentprimarykey";
            case "downtime": return "downtime";
            case "procedureid": return "procedureid";
            case "personnewsid": return "personnewsid";
            case "education": return "education";
            case "contracttypr": return "contracttypr";
            case "onlineapppkapplicationtemplate": return "onlineapppkapplicationtemplate";
            case "mobileapppkapplicationtemplate": return "mobileapppkapplicationtemplate";
            case "pkresumescore": return "pkresumescore";
            case "worknature": return "worknature";
            case "hiringmanager": return "hiringmanager";
            case "expirytime": return "expirytime";
            case "recruitmentname": return "recruitmentname";
            case "recruitmentcode": return "recruitmentcode";
            case "personnewskey": return "personnewskey";
            case "personnewskeyid": return "personnewskeyid";
            case "procedurekey": return "procedurekey";
            case "istemplate": return "istemplate";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkrecruitmentinformation -> pkrecruitmentinformation</li>
     * <li>pkprojectmanagement -> pkprojectmanagement</li>
     * <li>recruitmenttype -> recruitmenttype</li>
     * <li>recruitmenttime -> recruitmenttime</li>
     * <li>recruitmentnumber -> recruitmentnumber</li>
     * <li>recruitmentrequirements -> recruitmentrequirements</li>
     * <li>issubmit -> issubmit</li>
     * <li>isrelease -> isrelease</li>
     * <li>creationtime -> creationtime</li>
     * <li>releasetime -> releasetime</li>
     * <li>workingplace -> workingplace</li>
     * <li>jobtype -> jobtype</li>
     * <li>salarybottomline -> salarybottomline</li>
     * <li>salaryupline -> salaryupline</li>
     * <li>professionalduties -> professionalduties</li>
     * <li>qualification -> qualification</li>
     * <li>distributionchannel -> distributionchannel</li>
     * <li>arrivaldate -> arrivaldate</li>
     * <li>interviewplacekey -> interviewplacekey</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     * <li>downtime -> downtime</li>
     * <li>procedureid -> procedureid</li>
     * <li>personnewsid -> personnewsid</li>
     * <li>education -> education</li>
     * <li>contracttypr -> contracttypr</li>
     * <li>onlineapppkapplicationtemplate -> onlineapppkapplicationtemplate</li>
     * <li>mobileapppkapplicationtemplate -> mobileapppkapplicationtemplate</li>
     * <li>pkresumescore -> pkresumescore</li>
     * <li>worknature -> worknature</li>
     * <li>hiringmanager -> hiringmanager</li>
     * <li>expirytime -> expirytime</li>
     * <li>recruitmentname -> recruitmentname</li>
     * <li>recruitmentcode -> recruitmentcode</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>personnewskeyid -> personnewskeyid</li>
     * <li>procedurekey -> procedurekey</li>
     * <li>istemplate -> istemplate</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkrecruitmentinformation": return "pkrecruitmentinformation";
            case "pkprojectmanagement": return "pkprojectmanagement";
            case "recruitmenttype": return "recruitmenttype";
            case "recruitmenttime": return "recruitmenttime";
            case "recruitmentnumber": return "recruitmentnumber";
            case "recruitmentrequirements": return "recruitmentrequirements";
            case "issubmit": return "issubmit";
            case "isrelease": return "isrelease";
            case "creationtime": return "creationtime";
            case "releasetime": return "releasetime";
            case "workingplace": return "workingplace";
            case "jobtype": return "jobtype";
            case "salarybottomline": return "salarybottomline";
            case "salaryupline": return "salaryupline";
            case "professionalduties": return "professionalduties";
            case "qualification": return "qualification";
            case "distributionchannel": return "distributionchannel";
            case "arrivaldate": return "arrivaldate";
            case "interviewplacekey": return "interviewplacekey";
            case "departmentprimarykey": return "departmentprimarykey";
            case "downtime": return "downtime";
            case "procedureid": return "procedureid";
            case "personnewsid": return "personnewsid";
            case "education": return "education";
            case "contracttypr": return "contracttypr";
            case "onlineapppkapplicationtemplate": return "onlineapppkapplicationtemplate";
            case "mobileapppkapplicationtemplate": return "mobileapppkapplicationtemplate";
            case "pkresumescore": return "pkresumescore";
            case "worknature": return "worknature";
            case "hiringmanager": return "hiringmanager";
            case "expirytime": return "expirytime";
            case "recruitmentname": return "recruitmentname";
            case "recruitmentcode": return "recruitmentcode";
            case "personnewskey": return "personnewskey";
            case "personnewskeyid": return "personnewskeyid";
            case "procedurekey": return "procedurekey";
            case "istemplate": return "istemplate";
            default: return null;
        }
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    /**  **/
    public String getPkrecruitmentinformation() {
        return this.pkrecruitmentinformation;
    }

    /**  **/
    public void setPkrecruitmentinformation(String pkrecruitmentinformation) {
        this.pkrecruitmentinformation = pkrecruitmentinformation;
    }

    /**  **/
    public String getPkprojectmanagement() {
        return this.pkprojectmanagement;
    }

    /**  **/
    public void setPkprojectmanagement(String pkprojectmanagement) {
        this.pkprojectmanagement = pkprojectmanagement;
    }

    /**  **/
    public Integer getRecruitmenttype() {
        return this.recruitmenttype;
    }

    /**  **/
    public void setRecruitmenttype(Integer recruitmenttype) {
        this.recruitmenttype = recruitmenttype;
    }

    /**  **/
    public Date getRecruitmenttime() {
        return this.recruitmenttime;
    }

    /**  **/
    public void setRecruitmenttime(Date recruitmenttime) {
        this.recruitmenttime = recruitmenttime;
    }

    /**  **/
    public Integer getRecruitmentnumber() {
        return this.recruitmentnumber;
    }

    /**  **/
    public void setRecruitmentnumber(Integer recruitmentnumber) {
        this.recruitmentnumber = recruitmentnumber;
    }

    /**  **/
    public String getRecruitmentrequirements() {
        return this.recruitmentrequirements;
    }

    /**  **/
    public void setRecruitmentrequirements(String recruitmentrequirements) {
        this.recruitmentrequirements = recruitmentrequirements;
    }

    /**  **/
    public Integer getIssubmit() {
        return this.issubmit;
    }

    /**  **/
    public void setIssubmit(Integer issubmit) {
        this.issubmit = issubmit;
    }

    /**  **/
    public Integer getIsrelease() {
        return this.isrelease;
    }

    /**  **/
    public void setIsrelease(Integer isrelease) {
        this.isrelease = isrelease;
    }

    /**  **/
    public Date getCreationtime() {
        return this.creationtime;
    }

    /**  **/
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**  **/
    public Date getReleasetime() {
        return this.releasetime;
    }

    /**  **/
    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    /**  **/
    public String getWorkingplace() {
        return this.workingplace;
    }

    /**  **/
    public void setWorkingplace(String workingplace) {
        this.workingplace = workingplace;
    }

    /**  **/
    public String getJobtype() {
        return this.jobtype;
    }

    /**  **/
    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    /**  **/
    public Long getSalarybottomline() {
        return this.salarybottomline;
    }

    /**  **/
    public void setSalarybottomline(Long salarybottomline) {
        this.salarybottomline = salarybottomline;
    }

    /**  **/
    public Long getSalaryupline() {
        return this.salaryupline;
    }

    /**  **/
    public void setSalaryupline(Long salaryupline) {
        this.salaryupline = salaryupline;
    }

    /**  **/
    public String getProfessionalduties() {
        return this.professionalduties;
    }

    /**  **/
    public void setProfessionalduties(String professionalduties) {
        this.professionalduties = professionalduties;
    }

    /**  **/
    public String getQualification() {
        return this.qualification;
    }

    /**  **/
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /**  **/
    public String getDistributionchannel() {
        return this.distributionchannel;
    }

    /**  **/
    public void setDistributionchannel(String distributionchannel) {
        this.distributionchannel = distributionchannel;
    }

    /**  **/
    public Date getArrivaldate() {
        return this.arrivaldate;
    }

    /**  **/
    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    /**  **/
    public String getInterviewplacekey() {
        return this.interviewplacekey;
    }

    /**  **/
    public void setInterviewplacekey(String interviewplacekey) {
        this.interviewplacekey = interviewplacekey;
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
    public Date getDowntime() {
        return this.downtime;
    }

    /**  **/
    public void setDowntime(Date downtime) {
        this.downtime = downtime;
    }

    /**  **/
    public String getProcedureid() {
        return this.procedureid;
    }

    /**  **/
    public void setProcedureid(String procedureid) {
        this.procedureid = procedureid;
    }

    /**  **/
    public String getPersonnewsid() {
        return this.personnewsid;
    }

    /**  **/
    public void setPersonnewsid(String personnewsid) {
        this.personnewsid = personnewsid;
    }

    /**  **/
    public Integer getEducation() {
        return this.education;
    }

    /**  **/
    public void setEducation(Integer education) {
        this.education = education;
    }

    /**  **/
    public Integer getContracttypr() {
        return this.contracttypr;
    }

    /**  **/
    public void setContracttypr(Integer contracttypr) {
        this.contracttypr = contracttypr;
    }

    /**  **/
    public String getOnlineapppkapplicationtemplate() {
        return this.onlineapppkapplicationtemplate;
    }

    /**  **/
    public void setOnlineapppkapplicationtemplate(String onlineapppkapplicationtemplate) {
        this.onlineapppkapplicationtemplate = onlineapppkapplicationtemplate;
    }

    /**  **/
    public String getMobileapppkapplicationtemplate() {
        return this.mobileapppkapplicationtemplate;
    }

    /**  **/
    public void setMobileapppkapplicationtemplate(String mobileapppkapplicationtemplate) {
        this.mobileapppkapplicationtemplate = mobileapppkapplicationtemplate;
    }

    /**  **/
    public String getPkresumescore() {
        return this.pkresumescore;
    }

    /**  **/
    public void setPkresumescore(String pkresumescore) {
        this.pkresumescore = pkresumescore;
    }

    /**  **/
    public Integer getWorknature() {
        return this.worknature;
    }

    /**  **/
    public void setWorknature(Integer worknature) {
        this.worknature = worknature;
    }

    /**  **/
    public String getHiringmanager() {
        return this.hiringmanager;
    }

    /**  **/
    public void setHiringmanager(String hiringmanager) {
        this.hiringmanager = hiringmanager;
    }

    /**  **/
    public Date getExpirytime() {
        return this.expirytime;
    }

    /**  **/
    public void setExpirytime(Date expirytime) {
        this.expirytime = expirytime;
    }

    /**  **/
    public String getRecruitmentname() {
        return this.recruitmentname;
    }

    /**  **/
    public void setRecruitmentname(String recruitmentname) {
        this.recruitmentname = recruitmentname;
    }

    /**  **/
    public String getRecruitmentcode() {
        return this.recruitmentcode;
    }

    /**  **/
    public void setRecruitmentcode(String recruitmentcode) {
        this.recruitmentcode = recruitmentcode;
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
    public String getPersonnewskeyid() {
        return this.personnewskeyid;
    }

    /**  **/
    public void setPersonnewskeyid(String personnewskeyid) {
        this.personnewskeyid = personnewskeyid;
    }

    /**  **/
    public String getProcedurekey() {
        return this.procedurekey;
    }

    /**  **/
    public void setProcedurekey(String procedurekey) {
        this.procedurekey = procedurekey;
    }

    /**  **/
    public Integer getIstemplate() {
        return this.istemplate;
    }

    /**  **/
    public void setIstemplate(Integer istemplate) {
        this.istemplate = istemplate;
    }

}
