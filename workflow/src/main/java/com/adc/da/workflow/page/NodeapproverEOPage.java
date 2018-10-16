package com.adc.da.workflow.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>NODEAPPROVER NodeapproverEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class NodeapproverEOPage extends BasePage {

    private String nodeapproverkey;
    private String nodeapproverkeyOperator = "=";
    private String approverkey;
    private String approverkeyOperator = "=";
    private String nodekey;
    private String nodekeyOperator = "=";

    public String getNodeapproverkey() {
        return this.nodeapproverkey;
    }

    public void setNodeapproverkey(String nodeapproverkey) {
        this.nodeapproverkey = nodeapproverkey;
    }

    public String getNodeapproverkeyOperator() {
        return this.nodeapproverkeyOperator;
    }

    public void setNodeapproverkeyOperator(String nodeapproverkeyOperator) {
        this.nodeapproverkeyOperator = nodeapproverkeyOperator;
    }

    public String getApproverkey() {
        return this.approverkey;
    }

    public void setApproverkey(String approverkey) {
        this.approverkey = approverkey;
    }

    public String getApproverkeyOperator() {
        return this.approverkeyOperator;
    }

    public void setApproverkeyOperator(String approverkeyOperator) {
        this.approverkeyOperator = approverkeyOperator;
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

}
