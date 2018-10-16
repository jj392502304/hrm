package com.adc.da.workflow.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>APPROVALFUNCTION ApprovalfunctionEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ApprovalfunctionEOPage extends BasePage {

    private String approvalfunctionkey;
    private String approvalfunctionkeyOperator = "=";
    private String functionname;
    private String functionnameOperator = "=";
    private String functiondescription;
    private String functiondescriptionOperator = "=";

    public String getApprovalfunctionkey() {
        return this.approvalfunctionkey;
    }

    public void setApprovalfunctionkey(String approvalfunctionkey) {
        this.approvalfunctionkey = approvalfunctionkey;
    }

    public String getApprovalfunctionkeyOperator() {
        return this.approvalfunctionkeyOperator;
    }

    public void setApprovalfunctionkeyOperator(String approvalfunctionkeyOperator) {
        this.approvalfunctionkeyOperator = approvalfunctionkeyOperator;
    }

    public String getFunctionname() {
        return this.functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    public String getFunctionnameOperator() {
        return this.functionnameOperator;
    }

    public void setFunctionnameOperator(String functionnameOperator) {
        this.functionnameOperator = functionnameOperator;
    }

    public String getFunctiondescription() {
        return this.functiondescription;
    }

    public void setFunctiondescription(String functiondescription) {
        this.functiondescription = functiondescription;
    }

    public String getFunctiondescriptionOperator() {
        return this.functiondescriptionOperator;
    }

    public void setFunctiondescriptionOperator(String functiondescriptionOperator) {
        this.functiondescriptionOperator = functiondescriptionOperator;
    }

}
