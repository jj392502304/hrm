package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>ABILITY AbilityEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class AbilityEO extends BaseEntity {

    private String primarykeyoflanguageability;
    private String applymemberkey;
    private String degreeofmastery;
    private String listeningandspeaking;
    private String readandwrite;
    private String languagetype;
    private String abilitytype;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>primarykeyoflanguageability -> primarykeyoflanguageability</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>degreeofmastery -> degreeofmastery</li>
     * <li>listeningandspeaking -> listeningandspeaking</li>
     * <li>readandwrite -> readandwrite</li>
     * <li>languagetype -> languagetype</li>
     * <li>abilitytype -> abilitytype</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "primarykeyoflanguageability": return "primarykeyoflanguageability";
            case "applymemberkey": return "applymemberkey";
            case "degreeofmastery": return "degreeofmastery";
            case "listeningandspeaking": return "listeningandspeaking";
            case "readandwrite": return "readandwrite";
            case "languagetype": return "languagetype";
            case "abilitytype": return "abilitytype";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>primarykeyoflanguageability -> primarykeyoflanguageability</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>degreeofmastery -> degreeofmastery</li>
     * <li>listeningandspeaking -> listeningandspeaking</li>
     * <li>readandwrite -> readandwrite</li>
     * <li>languagetype -> languagetype</li>
     * <li>abilitytype -> abilitytype</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "primarykeyoflanguageability": return "primarykeyoflanguageability";
            case "applymemberkey": return "applymemberkey";
            case "degreeofmastery": return "degreeofmastery";
            case "listeningandspeaking": return "listeningandspeaking";
            case "readandwrite": return "readandwrite";
            case "languagetype": return "languagetype";
            case "abilitytype": return "abilitytype";
            default: return null;
        }
    }
    
    /**  **/
    public String getPrimarykeyoflanguageability() {
        return this.primarykeyoflanguageability;
    }

    /**  **/
    public void setPrimarykeyoflanguageability(String primarykeyoflanguageability) {
        this.primarykeyoflanguageability = primarykeyoflanguageability;
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
    public String getDegreeofmastery() {
        return this.degreeofmastery;
    }

    /**  **/
    public void setDegreeofmastery(String degreeofmastery) {
        this.degreeofmastery = degreeofmastery;
    }

    /**  **/
    public String getListeningandspeaking() {
        return this.listeningandspeaking;
    }

    /**  **/
    public void setListeningandspeaking(String listeningandspeaking) {
        this.listeningandspeaking = listeningandspeaking;
    }

    /**  **/
    public String getReadandwrite() {
        return this.readandwrite;
    }

    /**  **/
    public void setReadandwrite(String readandwrite) {
        this.readandwrite = readandwrite;
    }

    /**  **/
    public String getLanguagetype() {
        return this.languagetype;
    }

    /**  **/
    public void setLanguagetype(String languagetype) {
        this.languagetype = languagetype;
    }

    /**  **/
    public String getAbilitytype() {
        return this.abilitytype;
    }

    /**  **/
    public void setAbilitytype(String abilitytype) {
        this.abilitytype = abilitytype;
    }

}
