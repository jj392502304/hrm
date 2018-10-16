package com.adc.da.sys.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>TS_USER UserEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2017-11-06 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class UserEOPage extends BasePage {

    private String usid;
    private String usidOperator = "=";
    private String account;
    private String accountOperator = "=";
    private String delFlag;
    private String delFlagOperator = "=";
    private String password;
    private String passwordOperator = "=";
    private String usname;
    private String usnameOperator = "=";
    private String rolename;
    private String rolenameOperator = "=";

    public String getUsid() {
        return this.usid;
    }

	public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getUsidOperator() {
        return this.usidOperator;
    }

    public void setUsidOperator(String usidOperator) {
        this.usidOperator = usidOperator;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountOperator() {
        return this.accountOperator;
    }

    public void setAccountOperator(String accountOperator) {
        this.accountOperator = accountOperator;
    }

    public String getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getDelFlagOperator() {
        return this.delFlagOperator;
    }

    public void setDelFlagOperator(String delFlagOperator) {
        this.delFlagOperator = delFlagOperator;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordOperator() {
        return this.passwordOperator;
    }

    public void setPasswordOperator(String passwordOperator) {
        this.passwordOperator = passwordOperator;
    }

    public String getUsname() {
        return this.usname;
    }

    public void setUsname(String usname) {
        this.usname = usname;
    }

    public String getUsnameOperator() {
        return this.usnameOperator;
    }

    public void setUsnameOperator(String usnameOperator) {
        this.usnameOperator = usnameOperator;
    }
    public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRolenameOperator() {
		return rolenameOperator;
	}

	public void setRolenameOperator(String rolenameOperator) {
		this.rolenameOperator = rolenameOperator;
	}
}
