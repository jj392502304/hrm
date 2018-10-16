package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>PAPER PaperEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class PaperEO extends BaseEntity {

    private String mainkeyofpaper;
    private String applymemberkey;
    private String name;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date releasetime;
    private String periodicals;
    private String authororder;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>mainkeyofpaper -> mainkeyofpaper</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>name -> name</li>
     * <li>releasetime -> releasetime</li>
     * <li>periodicals -> periodicals</li>
     * <li>authororder -> authororder</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "mainkeyofpaper": return "mainkeyofpaper";
            case "applymemberkey": return "applymemberkey";
            case "name": return "name";
            case "releasetime": return "releasetime";
            case "periodicals": return "periodicals";
            case "authororder": return "authororder";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>mainkeyofpaper -> mainkeyofpaper</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>name -> name</li>
     * <li>releasetime -> releasetime</li>
     * <li>periodicals -> periodicals</li>
     * <li>authororder -> authororder</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "mainkeyofpaper": return "mainkeyofpaper";
            case "applymemberkey": return "applymemberkey";
            case "name": return "name";
            case "releasetime": return "releasetime";
            case "periodicals": return "periodicals";
            case "authororder": return "authororder";
            default: return null;
        }
    }
    
    /**  **/
    public String getMainkeyofpaper() {
        return this.mainkeyofpaper;
    }

    /**  **/
    public void setMainkeyofpaper(String mainkeyofpaper) {
        this.mainkeyofpaper = mainkeyofpaper;
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
    public String getName() {
        return this.name;
    }

    /**  **/
    public void setName(String name) {
        this.name = name;
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
    public String getPeriodicals() {
        return this.periodicals;
    }

    /**  **/
    public void setPeriodicals(String periodicals) {
        this.periodicals = periodicals;
    }

    /**  **/
    public String getAuthororder() {
        return this.authororder;
    }

    /**  **/
    public void setAuthororder(String authororder) {
        this.authororder = authororder;
    }

}
