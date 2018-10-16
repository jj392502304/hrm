package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>TEMPORARYINFORMATION TemporaryinformationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class TemporaryinformationEO extends BaseEntity {

    private String pktemporary;
    private Integer temporarytype;
    private String connectiondata;
    private Integer sequencenumber;
    private String createtime;
    private String applymemberkey;
    private String title;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pktemporary -> pktemporary</li>
     * <li>temporarytype -> temporarytype</li>
     * <li>connectiondata -> connectiondata</li>
     * <li>sequencenumber -> sequencenumber</li>
     * <li>createtime -> createtime</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>title -> title</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pktemporary": return "pktemporary";
            case "temporarytype": return "temporarytype";
            case "connectiondata": return "connectiondata";
            case "sequencenumber": return "sequencenumber";
            case "createtime": return "createtime";
            case "applymemberkey": return "applymemberkey";
            case "title": return "title";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pktemporary -> pktemporary</li>
     * <li>temporarytype -> temporarytype</li>
     * <li>connectiondata -> connectiondata</li>
     * <li>sequencenumber -> sequencenumber</li>
     * <li>createtime -> createtime</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>title -> title</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pktemporary": return "pktemporary";
            case "temporarytype": return "temporarytype";
            case "connectiondata": return "connectiondata";
            case "sequencenumber": return "sequencenumber";
            case "createtime": return "createtime";
            case "applymemberkey": return "applymemberkey";
            case "title": return "title";
            default: return null;
        }
    }
    
    /**  **/
    public String getPktemporary() {
        return this.pktemporary;
    }

    /**  **/
    public void setPktemporary(String pktemporary) {
        this.pktemporary = pktemporary;
    }

    /**  **/
    public Integer getTemporarytype() {
        return this.temporarytype;
    }

    /**  **/
    public void setTemporarytype(Integer temporarytype) {
        this.temporarytype = temporarytype;
    }

    /**  **/
    public String getConnectiondata() {
        return this.connectiondata;
    }

    /**  **/
    public void setConnectiondata(String connectiondata) {
        this.connectiondata = connectiondata;
    }

    /**  **/
    public Integer getSequencenumber() {
        return this.sequencenumber;
    }

    /**  **/
    public void setSequencenumber(Integer sequencenumber) {
        this.sequencenumber = sequencenumber;
    }

    /**  **/
    public String getCreatetime() {
        return this.createtime;
    }

    /**  **/
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
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
    public String getTitle() {
        return this.title;
    }

    /**  **/
    public void setTitle(String title) {
        this.title = title;
    }

}
