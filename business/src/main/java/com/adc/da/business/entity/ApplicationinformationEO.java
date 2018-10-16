package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>APPLICATIONINFORMATION ApplicationinformationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ApplicationinformationEO extends BaseEntity {

    private String pkapplicationinfomation;
    private String chinesefield;
    private String englishfield;
    private Integer spacelabel;
    private String verificationstandard;
    private Integer available;
    private String controlinitialvalue;
    private Integer classification;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkapplicationinfomation -> pkapplicationinfomation</li>
     * <li>chinesefield -> chinesefield</li>
     * <li>englishfield -> englishfield</li>
     * <li>spacelabel -> spacelabel</li>
     * <li>verificationstandard -> verificationstandard</li>
     * <li>available -> available</li>
     * <li>controlinitialvalue -> controlinitialvalue</li>
     * <li>classification -> classification</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkapplicationinfomation": return "pkapplicationinfomation";
            case "chinesefield": return "chinesefield";
            case "englishfield": return "englishfield";
            case "spacelabel": return "spacelabel";
            case "verificationstandard": return "verificationstandard";
            case "available": return "available";
            case "controlinitialvalue": return "controlinitialvalue";
            case "classification": return "classification";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkapplicationinfomation -> pkapplicationinfomation</li>
     * <li>chinesefield -> chinesefield</li>
     * <li>englishfield -> englishfield</li>
     * <li>spacelabel -> spacelabel</li>
     * <li>verificationstandard -> verificationstandard</li>
     * <li>available -> available</li>
     * <li>controlinitialvalue -> controlinitialvalue</li>
     * <li>classification -> classification</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkapplicationinfomation": return "pkapplicationinfomation";
            case "chinesefield": return "chinesefield";
            case "englishfield": return "englishfield";
            case "spacelabel": return "spacelabel";
            case "verificationstandard": return "verificationstandard";
            case "available": return "available";
            case "controlinitialvalue": return "controlinitialvalue";
            case "classification": return "classification";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkapplicationinfomation() {
        return this.pkapplicationinfomation;
    }

    /**  **/
    public void setPkapplicationinfomation(String pkapplicationinfomation) {
        this.pkapplicationinfomation = pkapplicationinfomation;
    }

    /**  **/
    public String getChinesefield() {
        return this.chinesefield;
    }

    /**  **/
    public void setChinesefield(String chinesefield) {
        this.chinesefield = chinesefield;
    }

    /**  **/
    public String getEnglishfield() {
        return this.englishfield;
    }

    /**  **/
    public void setEnglishfield(String englishfield) {
        this.englishfield = englishfield;
    }

    /**  **/
    public Integer getSpacelabel() {
        return this.spacelabel;
    }

    /**  **/
    public void setSpacelabel(Integer spacelabel) {
        this.spacelabel = spacelabel;
    }

    /**  **/
    public String getVerificationstandard() {
        return this.verificationstandard;
    }

    /**  **/
    public void setVerificationstandard(String verificationstandard) {
        this.verificationstandard = verificationstandard;
    }

    /**  **/
    public Integer getAvailable() {
        return this.available;
    }

    /**  **/
    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**  **/
    public String getControlinitialvalue() {
        return this.controlinitialvalue;
    }

    /**  **/
    public void setControlinitialvalue(String controlinitialvalue) {
        this.controlinitialvalue = controlinitialvalue;
    }

    /**  **/
    public Integer getClassification() {
        return this.classification;
    }

    /**  **/
    public void setClassification(Integer classification) {
        this.classification = classification;
    }

}
