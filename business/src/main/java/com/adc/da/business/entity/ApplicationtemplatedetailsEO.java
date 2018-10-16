package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>APPLICATIONTEMPLATEDETAILS ApplicationtemplatedetailsEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ApplicationtemplatedetailsEO extends BaseEntity {

    private String pkapplicationtemplatedetails;
    private String pkapplicationinformationmodule;
    private String pkapplicationinfomation;
    private Integer isenabled;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkapplicationtemplatedetails -> pkapplicationtemplatedetails</li>
     * <li>pkapplicationinformationmodule -> pkapplicationinformationmodule</li>
     * <li>pkapplicationinfomation -> pkapplicationinfomation</li>
     * <li>isenabled -> isenabled</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkapplicationtemplatedetails": return "pkapplicationtemplatedetails";
            case "pkapplicationinformationmodule": return "pkapplicationinformationmodule";
            case "pkapplicationinfomation": return "pkapplicationinfomation";
            case "isenabled": return "isenabled";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkapplicationtemplatedetails -> pkapplicationtemplatedetails</li>
     * <li>pkapplicationinformationmodule -> pkapplicationinformationmodule</li>
     * <li>pkapplicationinfomation -> pkapplicationinfomation</li>
     * <li>isenabled -> isenabled</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkapplicationtemplatedetails": return "pkapplicationtemplatedetails";
            case "pkapplicationinformationmodule": return "pkapplicationinformationmodule";
            case "pkapplicationinfomation": return "pkapplicationinfomation";
            case "isenabled": return "isenabled";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkapplicationtemplatedetails() {
        return this.pkapplicationtemplatedetails;
    }

    /**  **/
    public void setPkapplicationtemplatedetails(String pkapplicationtemplatedetails) {
        this.pkapplicationtemplatedetails = pkapplicationtemplatedetails;
    }

    /**  **/
    public String getPkapplicationinformationmodule() {
        return this.pkapplicationinformationmodule;
    }

    /**  **/
    public void setPkapplicationinformationmodule(String pkapplicationinformationmodule) {
        this.pkapplicationinformationmodule = pkapplicationinformationmodule;
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
    public Integer getIsenabled() {
        return this.isenabled;
    }

    /**  **/
    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
    }

}
