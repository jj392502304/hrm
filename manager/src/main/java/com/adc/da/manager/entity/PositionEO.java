package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>POSITION PositionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class PositionEO extends BaseEntity {

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date enadletime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private Integer isenable;
    private String positionname;
    private String positionkey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>enadletime -> enadletime</li>
     * <li>createtime -> createtime</li>
     * <li>isenable -> isenable</li>
     * <li>positionname -> positionname</li>
     * <li>positionkey -> positionkey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "enadletime": return "enadletime";
            case "createtime": return "createtime";
            case "isenable": return "isenable";
            case "positionname": return "positionname";
            case "positionkey": return "positionkey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>enadletime -> enadletime</li>
     * <li>createtime -> createtime</li>
     * <li>isenable -> isenable</li>
     * <li>positionname -> positionname</li>
     * <li>positionkey -> positionkey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "enadletime": return "enadletime";
            case "createtime": return "createtime";
            case "isenable": return "isenable";
            case "positionname": return "positionname";
            case "positionkey": return "positionkey";
            default: return null;
        }
    }
    
    /**  **/
    public Date getEnadletime() {
        return this.enadletime;
    }

    /**  **/
    public void setEnadletime(Date enadletime) {
        this.enadletime = enadletime;
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
    public Integer getIsenable() {
        return this.isenable;
    }

    /**  **/
    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    /**  **/
    public String getPositionname() {
        return this.positionname;
    }

    /**  **/
    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    /**  **/
    public String getPositionkey() {
        return this.positionkey;
    }

    /**  **/
    public void setPositionkey(String positionkey) {
        this.positionkey = positionkey;
    }

}
