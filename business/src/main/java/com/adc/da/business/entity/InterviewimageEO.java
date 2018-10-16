package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>INTERVIEWIMAGE InterviewimageEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class InterviewimageEO extends BaseEntity {

    private String interviewimagekey;
    private String interviewrecordskey;
    private String imageurl;
    private String imagetitle;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>interviewimagekey -> interviewimagekey</li>
     * <li>interviewrecordskey -> interviewrecordskey</li>
     * <li>imageurl -> imageurl</li>
     * <li>imagetitle -> imagetitle</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "interviewimagekey": return "interviewimagekey";
            case "interviewrecordskey": return "interviewrecordskey";
            case "imageurl": return "imageurl";
            case "imagetitle": return "imagetitle";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>interviewimagekey -> interviewimagekey</li>
     * <li>interviewrecordskey -> interviewrecordskey</li>
     * <li>imageurl -> imageurl</li>
     * <li>imagetitle -> imagetitle</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "interviewimagekey": return "interviewimagekey";
            case "interviewrecordskey": return "interviewrecordskey";
            case "imageurl": return "imageurl";
            case "imagetitle": return "imagetitle";
            default: return null;
        }
    }
    
    /**  **/
    public String getInterviewimagekey() {
        return this.interviewimagekey;
    }

    /**  **/
    public void setInterviewimagekey(String interviewimagekey) {
        this.interviewimagekey = interviewimagekey;
    }

    /**  **/
    public String getInterviewrecordskey() {
        return this.interviewrecordskey;
    }

    /**  **/
    public void setInterviewrecordskey(String interviewrecordskey) {
        this.interviewrecordskey = interviewrecordskey;
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
    public String getImagetitle() {
        return this.imagetitle;
    }

    /**  **/
    public void setImagetitle(String imagetitle) {
        this.imagetitle = imagetitle;
    }

}
