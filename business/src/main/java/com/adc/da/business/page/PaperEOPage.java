package com.adc.da.business.page;

import com.adc.da.base.page.BasePage;

import java.util.Date;

/**
 * <b>功能：</b>PAPER PaperEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class PaperEOPage extends BasePage {

    private String mainkeyofpaper;
    private String mainkeyofpaperOperator = "=";
    private String applymemberkey;
    private String applymemberkeyOperator = "=";
    private String name;
    private String nameOperator = "=";
    private String releasetime;
    private String releasetime1;
    private String releasetime2;
    private String releasetimeOperator = "=";
    private String periodicals;
    private String periodicalsOperator = "=";
    private String authororder;
    private String authororderOperator = "=";

    public String getMainkeyofpaper() {
        return this.mainkeyofpaper;
    }

    public void setMainkeyofpaper(String mainkeyofpaper) {
        this.mainkeyofpaper = mainkeyofpaper;
    }

    public String getMainkeyofpaperOperator() {
        return this.mainkeyofpaperOperator;
    }

    public void setMainkeyofpaperOperator(String mainkeyofpaperOperator) {
        this.mainkeyofpaperOperator = mainkeyofpaperOperator;
    }

    public String getApplymemberkey() {
        return this.applymemberkey;
    }

    public void setApplymemberkey(String applymemberkey) {
        this.applymemberkey = applymemberkey;
    }

    public String getApplymemberkeyOperator() {
        return this.applymemberkeyOperator;
    }

    public void setApplymemberkeyOperator(String applymemberkeyOperator) {
        this.applymemberkeyOperator = applymemberkeyOperator;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOperator() {
        return this.nameOperator;
    }

    public void setNameOperator(String nameOperator) {
        this.nameOperator = nameOperator;
    }

    public String getReleasetime() {
        return this.releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public String getReleasetime1() {
        return this.releasetime1;
    }

    public void setReleasetime1(String releasetime1) {
        this.releasetime1 = releasetime1;
    }

    public String getReleasetime2() {
        return this.releasetime2;
    }

    public void setReleasetime2(String releasetime2) {
        this.releasetime2 = releasetime2;
    }

    public String getReleasetimeOperator() {
        return this.releasetimeOperator;
    }

    public void setReleasetimeOperator(String releasetimeOperator) {
        this.releasetimeOperator = releasetimeOperator;
    }

    public String getPeriodicals() {
        return this.periodicals;
    }

    public void setPeriodicals(String periodicals) {
        this.periodicals = periodicals;
    }

    public String getPeriodicalsOperator() {
        return this.periodicalsOperator;
    }

    public void setPeriodicalsOperator(String periodicalsOperator) {
        this.periodicalsOperator = periodicalsOperator;
    }

    public String getAuthororder() {
        return this.authororder;
    }

    public void setAuthororder(String authororder) {
        this.authororder = authororder;
    }

    public String getAuthororderOperator() {
        return this.authororderOperator;
    }

    public void setAuthororderOperator(String authororderOperator) {
        this.authororderOperator = authororderOperator;
    }

}
