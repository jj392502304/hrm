package com.adc.da.workflow.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>NODEATTRIBUTE NodeattributeEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class NodeattributeEO extends BaseEntity {

    private String attributekey;
    private String attributenumber;
    private String attributename;
    private String attributedescription;
    private String departmentprimarykey;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>attributekey -> attributekey</li>
     * <li>attributenumber -> attributenumber</li>
     * <li>attributename -> attributename</li>
     * <li>attributedescription -> attributedescription</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "attributekey": return "attributekey";
            case "attributenumber": return "attributenumber";
            case "attributename": return "attributename";
            case "attributedescription": return "attributedescription";
            case "departmentprimarykey": return "departmentprimarykey";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>attributekey -> attributekey</li>
     * <li>attributenumber -> attributenumber</li>
     * <li>attributename -> attributename</li>
     * <li>attributedescription -> attributedescription</li>
     * <li>departmentprimarykey -> departmentprimarykey</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "attributekey": return "attributekey";
            case "attributenumber": return "attributenumber";
            case "attributename": return "attributename";
            case "attributedescription": return "attributedescription";
            case "departmentprimarykey": return "departmentprimarykey";
            default: return null;
        }
    }
    
    /**  **/
    public String getAttributekey() {
        return this.attributekey;
    }

    /**  **/
    public void setAttributekey(String attributekey) {
        this.attributekey = attributekey;
    }

    /**  **/
    public String getAttributenumber() {
        return this.attributenumber;
    }

    /**  **/
    public void setAttributenumber(String attributenumber) {
        this.attributenumber = attributenumber;
    }

    /**  **/
    public String getAttributename() {
        return this.attributename;
    }

    /**  **/
    public void setAttributename(String attributename) {
        this.attributename = attributename;
    }

    /**  **/
    public String getAttributedescription() {
        return this.attributedescription;
    }

    /**  **/
    public void setAttributedescription(String attributedescription) {
        this.attributedescription = attributedescription;
    }

    /**  **/
    public String getDepartmentprimarykey() {
        return this.departmentprimarykey;
    }

    /**  **/
    public void setDepartmentprimarykey(String departmentprimarykey) {
        this.departmentprimarykey = departmentprimarykey;
    }

}
