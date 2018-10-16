package com.adc.da.manager.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>FUNCTION FunctionEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class FunctionEOPage extends BasePage {

    private String functioninstructions;
    private String functioninstructionsOperator = "=";
    private String functionname;
    private String functionnameOperator = "=";
    private String functionkey;
    private String functionkeyOperator = "=";

    public String getFunctioninstructions() {
        return this.functioninstructions;
    }

    public void setFunctioninstructions(String functioninstructions) {
        this.functioninstructions = functioninstructions;
    }

    public String getFunctioninstructionsOperator() {
        return this.functioninstructionsOperator;
    }

    public void setFunctioninstructionsOperator(String functioninstructionsOperator) {
        this.functioninstructionsOperator = functioninstructionsOperator;
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

    public String getFunctionkey() {
        return this.functionkey;
    }

    public void setFunctionkey(String functionkey) {
        this.functionkey = functionkey;
    }

    public String getFunctionkeyOperator() {
        return this.functionkeyOperator;
    }

    public void setFunctionkeyOperator(String functionkeyOperator) {
        this.functionkeyOperator = functionkeyOperator;
    }

}
