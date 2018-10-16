package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>ADDITIONALINFORMATION AdditionalinformationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class AdditionalinformationEO extends BaseEntity {

    private String pkadditionalinformation;
    private String applymemberkey;
    private String hobby;
    private String religiousbelief;
    private String gainhonor;
    private String academicmonographs;
    private String patentresults;
    private String specialty;
    private String socialactivities;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkadditionalinformation -> pkadditionalinformation</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>hobby -> hobby</li>
     * <li>religiousbelief -> religiousbelief</li>
     * <li>gainhonor -> gainhonor</li>
     * <li>academicmonographs -> academicmonographs</li>
     * <li>patentresults -> patentresults</li>
     * <li>specialty -> specialty</li>
     * <li>socialactivities -> socialactivities</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkadditionalinformation": return "pkadditionalinformation";
            case "applymemberkey": return "applymemberkey";
            case "hobby": return "hobby";
            case "religiousbelief": return "religiousbelief";
            case "gainhonor": return "gainhonor";
            case "academicmonographs": return "academicmonographs";
            case "patentresults": return "patentresults";
            case "specialty": return "specialty";
            case "socialactivities": return "socialactivities";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkadditionalinformation -> pkadditionalinformation</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>hobby -> hobby</li>
     * <li>religiousbelief -> religiousbelief</li>
     * <li>gainhonor -> gainhonor</li>
     * <li>academicmonographs -> academicmonographs</li>
     * <li>patentresults -> patentresults</li>
     * <li>specialty -> specialty</li>
     * <li>socialactivities -> socialactivities</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkadditionalinformation": return "pkadditionalinformation";
            case "applymemberkey": return "applymemberkey";
            case "hobby": return "hobby";
            case "religiousbelief": return "religiousbelief";
            case "gainhonor": return "gainhonor";
            case "academicmonographs": return "academicmonographs";
            case "patentresults": return "patentresults";
            case "specialty": return "specialty";
            case "socialactivities": return "socialactivities";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkadditionalinformation() {
        return this.pkadditionalinformation;
    }

    /**  **/
    public void setPkadditionalinformation(String pkadditionalinformation) {
        this.pkadditionalinformation = pkadditionalinformation;
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
    public String getHobby() {
        return this.hobby;
    }

    /**  **/
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**  **/
    public String getReligiousbelief() {
        return this.religiousbelief;
    }

    /**  **/
    public void setReligiousbelief(String religiousbelief) {
        this.religiousbelief = religiousbelief;
    }

    /**  **/
    public String getGainhonor() {
        return this.gainhonor;
    }

    /**  **/
    public void setGainhonor(String gainhonor) {
        this.gainhonor = gainhonor;
    }

    /**  **/
    public String getAcademicmonographs() {
        return this.academicmonographs;
    }

    /**  **/
    public void setAcademicmonographs(String academicmonographs) {
        this.academicmonographs = academicmonographs;
    }

    /**  **/
    public String getPatentresults() {
        return this.patentresults;
    }

    /**  **/
    public void setPatentresults(String patentresults) {
        this.patentresults = patentresults;
    }

    /**  **/
    public String getSpecialty() {
        return this.specialty;
    }

    /**  **/
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**  **/
    public String getSocialactivities() {
        return this.socialactivities;
    }

    /**  **/
    public void setSocialactivities(String socialactivities) {
        this.socialactivities = socialactivities;
    }

}
