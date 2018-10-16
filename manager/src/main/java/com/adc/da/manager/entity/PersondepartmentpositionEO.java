package com.adc.da.manager.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>PERSONDEPARTMENTPOSITION PersondepartmentpositionEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class PersondepartmentpositionEO extends BaseEntity {

    private String departmentjobkey;
    private String roleprimarykey;
    private String personnewskey;
    private String persondepartmentpositionid;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>departmentjobkey -> departmentjobkey</li>
     * <li>roleprimarykey -> roleprimarykey</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>persondepartmentpositionid -> persondepartmentpositionid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "departmentjobkey": return "departmentjobkey";
            case "roleprimarykey": return "roleprimarykey";
            case "personnewskey": return "personnewskey";
            case "persondepartmentpositionid": return "persondepartmentpositionid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>departmentjobkey -> departmentjobkey</li>
     * <li>roleprimarykey -> roleprimarykey</li>
     * <li>personnewskey -> personnewskey</li>
     * <li>persondepartmentpositionid -> persondepartmentpositionid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "departmentjobkey": return "departmentjobkey";
            case "roleprimarykey": return "roleprimarykey";
            case "personnewskey": return "personnewskey";
            case "persondepartmentpositionid": return "persondepartmentpositionid";
            default: return null;
        }
    }
    
    /**  **/
    public String getDepartmentjobkey() {
        return this.departmentjobkey;
    }

    /**  **/
    public void setDepartmentjobkey(String departmentjobkey) {
        this.departmentjobkey = departmentjobkey;
    }

    /**  **/
    public String getRoleprimarykey() {
        return this.roleprimarykey;
    }

    /**  **/
    public void setRoleprimarykey(String roleprimarykey) {
        this.roleprimarykey = roleprimarykey;
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
    public String getPersondepartmentpositionid() {
        return this.persondepartmentpositionid;
    }

    /**  **/
    public void setPersondepartmentpositionid(String persondepartmentpositionid) {
        this.persondepartmentpositionid = persondepartmentpositionid;
    }

}
