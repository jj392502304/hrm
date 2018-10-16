package com.adc.da.manager.page;

import com.adc.da.base.page.BasePage;

import java.util.Date;

/**
 * <b>功能：</b>USERLOG UserlogEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class UserlogEOPage extends BasePage {

    private String loginway;
    private String loginwayOperator = "=";
    private String loginip;
    private String loginipOperator = "=";
    private String logindate;
    private String logindate1;
    private String logindate2;
    private String logindateOperator = "=";
    private String userid;
    private String useridOperator = "=";
    private String pklog;
    private String pklogOperator = "=";

    public String getLoginway() {
        return this.loginway;
    }

    public void setLoginway(String loginway) {
        this.loginway = loginway;
    }

    public String getLoginwayOperator() {
        return this.loginwayOperator;
    }

    public void setLoginwayOperator(String loginwayOperator) {
        this.loginwayOperator = loginwayOperator;
    }

    public String getLoginip() {
        return this.loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public String getLoginipOperator() {
        return this.loginipOperator;
    }

    public void setLoginipOperator(String loginipOperator) {
        this.loginipOperator = loginipOperator;
    }

    public String getLogindate() {
        return this.logindate;
    }

    public void setLogindate(String logindate) {
        this.logindate = logindate;
    }

    public String getLogindate1() {
        return this.logindate1;
    }

    public void setLogindate1(String logindate1) {
        this.logindate1 = logindate1;
    }

    public String getLogindate2() {
        return this.logindate2;
    }

    public void setLogindate2(String logindate2) {
        this.logindate2 = logindate2;
    }

    public String getLogindateOperator() {
        return this.logindateOperator;
    }

    public void setLogindateOperator(String logindateOperator) {
        this.logindateOperator = logindateOperator;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUseridOperator() {
        return this.useridOperator;
    }

    public void setUseridOperator(String useridOperator) {
        this.useridOperator = useridOperator;
    }

    public String getPklog() {
        return this.pklog;
    }

    public void setPklog(String pklog) {
        this.pklog = pklog;
    }

    public String getPklogOperator() {
        return this.pklogOperator;
    }

    public void setPklogOperator(String pklogOperator) {
        this.pklogOperator = pklogOperator;
    }

}
