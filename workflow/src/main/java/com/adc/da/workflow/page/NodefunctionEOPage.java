package com.adc.da.workflow.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>NODEFUNCTION NodefunctionEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class NodefunctionEOPage extends BasePage {

    private String nodefunctionkey;
    private String nodefunctionkeyOperator = "=";
    private String nodekey;
    private String nodekeyOperator = "=";
    private String function;
    private String functionOperator = "=";

    public String getNodefunctionkey() {
        return this.nodefunctionkey;
    }

    public void setNodefunctionkey(String nodefunctionkey) {
        this.nodefunctionkey = nodefunctionkey;
    }

    public String getNodefunctionkeyOperator() {
        return this.nodefunctionkeyOperator;
    }

    public void setNodefunctionkeyOperator(String nodefunctionkeyOperator) {
        this.nodefunctionkeyOperator = nodefunctionkeyOperator;
    }

    public String getNodekey() {
        return this.nodekey;
    }

    public void setNodekey(String nodekey) {
        this.nodekey = nodekey;
    }

    public String getNodekeyOperator() {
        return this.nodekeyOperator;
    }

    public void setNodekeyOperator(String nodekeyOperator) {
        this.nodekeyOperator = nodekeyOperator;
    }

    public String getFunction() {
        return this.function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunctionOperator() {
        return this.functionOperator;
    }

    public void setFunctionOperator(String functionOperator) {
        this.functionOperator = functionOperator;
    }

}
