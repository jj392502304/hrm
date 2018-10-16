package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>STAFFSTYLE StaffstyleEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class StaffstyleEO extends BaseEntity {

    private String pkstaffstyle;
    private String title;
    private String content;
    private Integer isrelease;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date applicationtime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date releasetime;
    private String imageurl;
    private String videourl;
    private Long sequencenumber;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkstaffstyle -> pkstaffstyle</li>
     * <li>title -> title</li>
     * <li>content -> content</li>
     * <li>isrelease -> isrelease</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>releasetime -> releasetime</li>
     * <li>imageurl -> imageurl</li>
     * <li>videourl -> videourl</li>
     * <li>sequencenumber -> sequencenumber</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkstaffstyle": return "pkstaffstyle";
            case "title": return "title";
            case "content": return "content";
            case "isrelease": return "isrelease";
            case "applicationtime": return "applicationtime";
            case "releasetime": return "releasetime";
            case "imageurl": return "imageurl";
            case "videourl": return "videourl";
            case "sequencenumber": return "sequencenumber";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkstaffstyle -> pkstaffstyle</li>
     * <li>title -> title</li>
     * <li>content -> content</li>
     * <li>isrelease -> isrelease</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>releasetime -> releasetime</li>
     * <li>imageurl -> imageurl</li>
     * <li>videourl -> videourl</li>
     * <li>sequencenumber -> sequencenumber</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkstaffstyle": return "pkstaffstyle";
            case "title": return "title";
            case "content": return "content";
            case "isrelease": return "isrelease";
            case "applicationtime": return "applicationtime";
            case "releasetime": return "releasetime";
            case "imageurl": return "imageurl";
            case "videourl": return "videourl";
            case "sequencenumber": return "sequencenumber";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkstaffstyle() {
        return this.pkstaffstyle;
    }

    /**  **/
    public void setPkstaffstyle(String pkstaffstyle) {
        this.pkstaffstyle = pkstaffstyle;
    }

    /**  **/
    public String getTitle() {
        return this.title;
    }

    /**  **/
    public void setTitle(String title) {
        this.title = title;
    }

    /**  **/
    public String getContent() {
        return this.content;
    }

    /**  **/
    public void setContent(String content) {
        this.content = content;
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
    public Date getApplicationtime() {
        return this.applicationtime;
    }

    /**  **/
    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
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
    public String getImageurl() {
        return this.imageurl;
    }

    /**  **/
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    /**  **/
    public String getVideourl() {
        return this.videourl;
    }

    /**  **/
    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    /**  **/
    public Long getSequencenumber() {
        return this.sequencenumber;
    }

    /**  **/
    public void setSequencenumber(Long sequencenumber) {
        this.sequencenumber = sequencenumber;
    }

}
