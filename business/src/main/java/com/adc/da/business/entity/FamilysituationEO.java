package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>FAMILYSITUATION FamilysituationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class FamilysituationEO extends BaseEntity {

    private String pkfamilysituation;
    private String applymemberkey;
    private String name;
    private String relation;
    private String workunit;
    private String duty;
    private String phone;
    private Integer age;
    private String political;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkfamilysituation -> pkfamilysituation</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>name -> name</li>
     * <li>relation -> relation</li>
     * <li>workunit -> workunit</li>
     * <li>duty -> duty</li>
     * <li>phone -> phone</li>
     * <li>age -> age</li>
     * <li>political -> political</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkfamilysituation": return "pkfamilysituation";
            case "applymemberkey": return "applymemberkey";
            case "name": return "name";
            case "relation": return "relation";
            case "workunit": return "workunit";
            case "duty": return "duty";
            case "phone": return "phone";
            case "age": return "age";
            case "political": return "political";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkfamilysituation -> pkfamilysituation</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>name -> name</li>
     * <li>relation -> relation</li>
     * <li>workunit -> workunit</li>
     * <li>duty -> duty</li>
     * <li>phone -> phone</li>
     * <li>age -> age</li>
     * <li>political -> political</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkfamilysituation": return "pkfamilysituation";
            case "applymemberkey": return "applymemberkey";
            case "name": return "name";
            case "relation": return "relation";
            case "workunit": return "workunit";
            case "duty": return "duty";
            case "phone": return "phone";
            case "age": return "age";
            case "political": return "political";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkfamilysituation() {
        return this.pkfamilysituation;
    }

    /**  **/
    public void setPkfamilysituation(String pkfamilysituation) {
        this.pkfamilysituation = pkfamilysituation;
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
    public String getRelation() {
        return this.relation;
    }

    /**  **/
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**  **/
    public String getWorkunit() {
        return this.workunit;
    }

    /**  **/
    public void setWorkunit(String workunit) {
        this.workunit = workunit;
    }

    /**  **/
    public String getDuty() {
        return this.duty;
    }

    /**  **/
    public void setDuty(String duty) {
        this.duty = duty;
    }

    /**  **/
    public String getPhone() {
        return this.phone;
    }

    /**  **/
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**  **/
    public Integer getAge() {
        return this.age;
    }

    /**  **/
    public void setAge(Integer age) {
        this.age = age;
    }

    /**  **/
    public String getPolitical() {
        return this.political;
    }

    /**  **/
    public void setPolitical(String political) {
        this.political = political;
    }

}
