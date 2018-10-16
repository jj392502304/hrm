package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>PRACTICEEXPERIENCE PracticeexperienceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class PracticeexperienceEO extends BaseEntity {

    private String pkpracticeexperience;
    private String applymemberkey;
    private String unitname;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date practisetime;
    private String practisecontent;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkpracticeexperience -> pkpracticeexperience</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>unitname -> unitname</li>
     * <li>practisetime -> practisetime</li>
     * <li>practisecontent -> practisecontent</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkpracticeexperience": return "pkpracticeexperience";
            case "applymemberkey": return "applymemberkey";
            case "unitname": return "unitname";
            case "practisetime": return "practisetime";
            case "practisecontent": return "practisecontent";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkpracticeexperience -> pkpracticeexperience</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>unitname -> unitname</li>
     * <li>practisetime -> practisetime</li>
     * <li>practisecontent -> practisecontent</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkpracticeexperience": return "pkpracticeexperience";
            case "applymemberkey": return "applymemberkey";
            case "unitname": return "unitname";
            case "practisetime": return "practisetime";
            case "practisecontent": return "practisecontent";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkpracticeexperience() {
        return this.pkpracticeexperience;
    }

    /**  **/
    public void setPkpracticeexperience(String pkpracticeexperience) {
        this.pkpracticeexperience = pkpracticeexperience;
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
    public String getUnitname() {
        return this.unitname;
    }

    /**  **/
    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    /**  **/
    public Date getPractisetime() {
        return this.practisetime;
    }

    /**  **/
    public void setPractisetime(Date practisetime) {
        this.practisetime = practisetime;
    }

    /**  **/
    public String getPractisecontent() {
        return this.practisecontent;
    }

    /**  **/
    public void setPractisecontent(String practisecontent) {
        this.practisecontent = practisecontent;
    }

}
