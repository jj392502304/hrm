package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <b>功能：</b>WEBSITECONFIGURATION WebsiteconfigurationEOEntity<br>
 * <b>作者：</b>sun jieyingjian<br>
 * <b>日期：</b> 2018-03-27 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class WebsiteconfigurationEO extends BaseEntity {

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "保存时间不能为空")
    private Date savetime;//保存时间
    private Integer effective;//有效期（30 一个月 90 三个月 183 半年 366 一年）
    private Integer limitquantity;//限制数量
    private Integer explicitstate;//显隐状态
    private Integer processsequencenumber;//流程顺序号
    private String content;//内容
    private String imageurl;//图片路径
    private String title;//标题
    private Integer configurationtype;//配置类型1。背景图片2. 首页logo 3.首页欢迎词4，企业名称5.网站首页名称6.搜索项7.招聘流程8.走进中心
    private String pkwebsiteconfiguration;//主键

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>savetime -> savetime</li>
     * <li>effective -> effective</li>
     * <li>limitquantity -> limitquantity</li>
     * <li>explicitstate -> explicitstate</li>
     * <li>processsequencenumber -> processsequencenumber</li>
     * <li>content -> content</li>
     * <li>imageurl -> imageurl</li>
     * <li>title -> title</li>
     * <li>configurationtype -> configurationtype</li>
     * <li>pkwebsiteconfiguration -> pkwebsiteconfiguration</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "savetime": return "savetime";
            case "effective": return "effective";
            case "limitquantity": return "limitquantity";
            case "explicitstate": return "explicitstate";
            case "processsequencenumber": return "processsequencenumber";
            case "content": return "content";
            case "imageurl": return "imageurl";
            case "title": return "title";
            case "configurationtype": return "configurationtype";
            case "pkwebsiteconfiguration": return "pkwebsiteconfiguration";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>savetime -> savetime</li>
     * <li>effective -> effective</li>
     * <li>limitquantity -> limitquantity</li>
     * <li>explicitstate -> explicitstate</li>
     * <li>processsequencenumber -> processsequencenumber</li>
     * <li>content -> content</li>
     * <li>imageurl -> imageurl</li>
     * <li>title -> title</li>
     * <li>configurationtype -> configurationtype</li>
     * <li>pkwebsiteconfiguration -> pkwebsiteconfiguration</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "savetime": return "savetime";
            case "effective": return "effective";
            case "limitquantity": return "limitquantity";
            case "explicitstate": return "explicitstate";
            case "processsequencenumber": return "processsequencenumber";
            case "content": return "content";
            case "imageurl": return "imageurl";
            case "title": return "title";
            case "configurationtype": return "configurationtype";
            case "pkwebsiteconfiguration": return "pkwebsiteconfiguration";
            default: return null;
        }
    }

    /**  **/
    public String getPkwebsiteconfiguration() {
        return this.pkwebsiteconfiguration;
    }

    /**  **/
    public void setPkwebsiteconfiguration(String pkwebsiteconfiguration) {
        this.pkwebsiteconfiguration = pkwebsiteconfiguration;
    }

    /**  **/
    public Integer getConfigurationtype() {
        return this.configurationtype;
    }

    /**  **/
    public void setConfigurationtype(Integer configurationtype) {
        this.configurationtype = configurationtype;
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
    public String getImageurl() {
        return this.imageurl;
    }

    /**  **/
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
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
    public Integer getProcesssequencenumber() {
        return this.processsequencenumber;
    }

    /**  **/
    public void setProcesssequencenumber(Integer processsequencenumber) {
        this.processsequencenumber = processsequencenumber;
    }

    /**  **/
    public Integer getExplicitstate() {
        return this.explicitstate;
    }

    /**  **/
    public void setExplicitstate(Integer explicitstate) {
        this.explicitstate = explicitstate;
    }

    /**  **/
    public Integer getLimitquantity() {
        return this.limitquantity;
    }

    /**  **/
    public void setLimitquantity(Integer limitquantity) {
        this.limitquantity = limitquantity;
    }

    /**  **/
    public Integer getEffective() {
        return this.effective;
    }

    /**  **/
    public void setEffective(Integer effective) {
        this.effective = effective;
    }

    /**  **/
    public Date getSavetime() {
        return this.savetime;
    }

    /**  **/
    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

}
