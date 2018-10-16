package com.adc.da.sys.vo;

import java.util.ArrayList;
import java.util.List;

import com.adc.da.sys.entity.MenuEO;

public class RoleVO {
	private String rid;
	private String rname;
	private String rdesc;
	private int enabled;
	private int usercount;
	private int belong;
	// 扩展字段
	private String extInfo;
	private List<MenuEO> menus = new ArrayList<>();
	private List<String> menusstr = new ArrayList<>();

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRdesc() {
		return rdesc;
	}

	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public int getUsercount() {
		return usercount;
	}

	public void setUsercount(int usercount) {
		this.usercount = usercount;
	}

	public int getBelong() {
		return belong;
	}

	public void setBelong(int belong) {
		this.belong = belong;
	}

	public String getExtInfo() {
		return extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<MenuEO> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuEO> menus) {
		this.menus = menus;
	}

	public List<String> getMenusstr() {
		return menusstr;
	}

	public void setMenusstr(List<String> menusstr) {
		this.menusstr = menusstr;
	}
}
