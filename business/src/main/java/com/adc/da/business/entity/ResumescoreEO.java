package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>RESUMESCORE ResumescoreEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ResumescoreEO extends BaseEntity {

    private String pkresumescore;
    private String pkapplicationinfomation;
    private Integer score;
    private String personnewskey;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkresumescore -> pkresumescore</li>
     * <li>pkapplicationinfomation -> pkapplicationinfomation</li>
     * <li>score -> score</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>createtime -> createtime</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkresumescore": return "pkresumescore";
            case "pkapplicationinfomation": return "pkapplicationinfomation";
            case "score": return "score";
            case "personnewskey": return "personnewskey";
            case "createtime": return "createtime";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkresumescore -> pkresumescore</li>
     * <li>pkapplicationinfomation -> pkapplicationinfomation</li>
     * <li>score -> score</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>createtime -> createtime</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkresumescore": return "pkresumescore";
            case "pkapplicationinfomation": return "pkapplicationinfomation";
            case "score": return "score";
            case "personnewskey": return "personnewskey";
            case "createtime": return "createtime";
            default: return null;
        }
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
    public String getPkapplicationinfomation() {
        return this.pkapplicationinfomation;
    }

    /**  **/
    public void setPkapplicationinfomation(String pkapplicationinfomation) {
        this.pkapplicationinfomation = pkapplicationinfomation;
    }

    /**  **/
    public Integer getScore() {
        return this.score;
    }

    /**  **/
    public void setScore(Integer score) {
        this.score = score;
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
    public Date getCreatetime() {
        return this.createtime;
    }

    /**  **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}
