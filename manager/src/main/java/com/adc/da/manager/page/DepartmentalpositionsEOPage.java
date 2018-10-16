package com.adc.da.manager.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>DEPARTMENTALPOSITIONS DepartmentalpositionsEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class DepartmentalpositionsEOPage extends BasePage {

    private String isenabled;
    private String isenabledOperator = "=";
    private String positionkey;
    private String positionkeyOperator = "=";
    private String departmentalfreignkey;
    private String departmentalfreignkeyOperator = "=";
    private String departmentjobkey;
    private String departmentjobkeyOperator = "=";

    public String getIsenabled() {
        return this.isenabled;
    }

    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled;
    }

    public String getIsenabledOperator() {
        return this.isenabledOperator;
    }

    public void setIsenabledOperator(String isenabledOperator) {
        this.isenabledOperator = isenabledOperator;
    }

    public String getPositionkey() {
        return this.positionkey;
    }

    public void setPositionkey(String positionkey) {
        this.positionkey = positionkey;
    }

    public String getPositionkeyOperator() {
        return this.positionkeyOperator;
    }

    public void setPositionkeyOperator(String positionkeyOperator) {
        this.positionkeyOperator = positionkeyOperator;
    }

    public String getDepartmentalfreignkey() {
        return this.departmentalfreignkey;
    }

    public void setDepartmentalfreignkey(String departmentalfreignkey) {
        this.departmentalfreignkey = departmentalfreignkey;
    }

    public String getDepartmentalfreignkeyOperator() {
        return this.departmentalfreignkeyOperator;
    }

    public void setDepartmentalfreignkeyOperator(String departmentalfreignkeyOperator) {
        this.departmentalfreignkeyOperator = departmentalfreignkeyOperator;
    }

    public String getDepartmentjobkey() {
        return this.departmentjobkey;
    }

    public void setDepartmentjobkey(String departmentjobkey) {
        this.departmentjobkey = departmentjobkey;
    }

    public String getDepartmentjobkeyOperator() {
        return this.departmentjobkeyOperator;
    }

    public void setDepartmentjobkeyOperator(String departmentjobkeyOperator) {
        this.departmentjobkeyOperator = departmentjobkeyOperator;
    }

}
