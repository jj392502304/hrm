package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>TALENTPOOL TalentpoolEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class TalentpoolEO extends BaseEntity {

    private String pktalentpool;
    private String applymemberkey;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationtime;
    private String talentpooltype;
    private Integer informationsources;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pktalentpool -> pktalentpool</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>creationtime -> creationtime</li>
     * <li>talentpooltype -> talentpooltype</li>
     * <li>informationsources -> informationsources</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pktalentpool": return "pktalentpool";
            case "applymemberkey": return "applymemberkey";
            case "creationtime": return "creationtime";
            case "talentpooltype": return "talentpooltype";
            case "informationsources": return "informationsources";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pktalentpool -> pktalentpool</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>creationtime -> creationtime</li>
     * <li>talentpooltype -> talentpooltype</li>
     * <li>informationsources -> informationsources</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pktalentpool": return "pktalentpool";
            case "applymemberkey": return "applymemberkey";
            case "creationtime": return "creationtime";
            case "talentpooltype": return "talentpooltype";
            case "informationsources": return "informationsources";
            default: return null;
        }
    }
    
    /**  **/
    public String getPktalentpool() {
        return this.pktalentpool;
    }

    /**  **/
    public void setPktalentpool(String pktalentpool) {
        this.pktalentpool = pktalentpool;
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
    public Date getCreationtime() {
        return this.creationtime;
    }

    /**  **/
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**  **/
    public String getTalentpooltype() {
        return this.talentpooltype;
    }

    /**  **/
    public void setTalentpooltype(String talentpooltype) {
        this.talentpooltype = talentpooltype;
    }

    /**  **/
    public Integer getInformationsources() {
        return this.informationsources;
    }

    /**  **/
    public void setInformationsources(Integer informationsources) {
        this.informationsources = informationsources;
    }

}
