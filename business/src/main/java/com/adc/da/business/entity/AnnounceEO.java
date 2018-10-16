package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>ANNOUNCE AnnounceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class AnnounceEO extends BaseEntity {

    private String title;
    private String pkannounce;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private Integer state;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expriytime;
    private String content;
    private String imageurl;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date releasetime;
    private String personnewskey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>title -> title</li>
     * <li>pkannounce -> pkannounce</li>
     * <li>createtime -> createtime</li>
     * <li>state -> state</li>
     * <li>expriytime -> expriytime</li>
     * <li>content -> content</li>
     * <li>imageurl -> imageurl</li>
     * <li>releasetime -> releasetime</li>
     * <li>personnewskey -> personnewskey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "title": return "title";
            case "pkannounce": return "pkannounce";
            case "createtime": return "createtime";
            case "state": return "state";
            case "expriytime": return "expriytime";
            case "content": return "content";
            case "imageurl": return "imageurl";
            case "releasetime": return "releasetime";
            case "personnewskey": return "personnewskey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>title -> title</li>
     * <li>pkannounce -> pkannounce</li>
     * <li>createtime -> createtime</li>
     * <li>state -> state</li>
     * <li>expriytime -> expriytime</li>
     * <li>content -> content</li>
     * <li>imageurl -> imageurl</li>
     * <li>releasetime -> releasetime</li>
     * <li>personnewskey -> personnewskey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "title": return "title";
            case "pkannounce": return "pkannounce";
            case "createtime": return "createtime";
            case "state": return "state";
            case "expriytime": return "expriytime";
            case "content": return "content";
            case "imageurl": return "imageurl";
            case "releasetime": return "releasetime";
            case "personnewskey": return "personnewskey";
            default: return null;
        }
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
    public String getPkannounce() {
        return this.pkannounce;
    }

    /**  **/
    public void setPkannounce(String pkannounce) {
        this.pkannounce = pkannounce;
    }

    /**  **/
    public Date getCreatetime() {
        return this.createtime;
    }

    /**  **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**  **/
    public Integer getState() {
        return this.state;
    }

    /**  **/
    public void setState(Integer state) {
        this.state = state;
    }

    /**  **/
    public Date getExpriytime() {
        return this.expriytime;
    }

    /**  **/
    public void setExpriytime(Date expriytime) {
        this.expriytime = expriytime;
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
    public String getImageurl() {
        return this.imageurl;
    }

    /**  **/
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
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
    public String getPersonnewskey() {
        return this.personnewskey;
    }

    /**  **/
    public void setPersonnewskey(String personnewskey) {
        this.personnewskey = personnewskey;
    }

}
