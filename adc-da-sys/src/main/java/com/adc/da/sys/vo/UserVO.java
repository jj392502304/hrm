package com.adc.da.sys.vo;

import java.util.ArrayList;
import java.util.List;

import com.adc.da.sys.entity.OrgEO;
import com.adc.da.sys.entity.RoleEO;

public class UserVO {
  
	private String usid;
	private String account;
	private String usname;
	private String password;
	// 扩展字段
    private String extInfo;
	private List<String> rolesstr = new ArrayList<>();
	private List<RoleEO> roles = new ArrayList<>();
	
	private List<String> orgsstr = new ArrayList<>();
	private List<OrgEO> orgs = new ArrayList<>();
	
	public String getUsid() {
		return usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUsname() {
		return usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getExtInfo() {
		return extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<String> getRolesstr() {
		return rolesstr;
	}

	public void setRolesstr(List<String> rolesstr) {
		this.rolesstr = rolesstr;
	}

	public List<RoleEO> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEO> roles) {
		this.roles = roles;
	}
	
	public List<String> getOrgsstr() {
		return orgsstr;
	}

	public void setOrgsstr(List<String> orgsstr) {
		this.orgsstr = orgsstr;
	}

	public List<OrgEO> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<OrgEO> orgs) {
		this.orgs = orgs;
	}

}
