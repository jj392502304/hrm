package com.adc.da.sys.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>TS_USER UserEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2017-12-18 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class UserEO extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 3658632939727891047L;

	private String usname;
    private String password;
    private Integer delFlag;
    private String account;
    private String usid;
    // 扩展字段
    private String extInfo;

    private List<String> roleIdList = new ArrayList<>();
    private List<RoleEO> roleEOList = new ArrayList<>();
    
    private List<String> orgIdList = new ArrayList<>();
    private List<OrgEO> orgEOList = new ArrayList<>();

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>extInfo -> ext_info</li>
     * <li>usname -> usname</li>
     * <li>password -> password</li>
     * <li>delFlag -> del_flag</li>
     * <li>account -> account</li>
     * <li>usid -> usid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "extInfo": return "ext_info";
            case "usname": return "usname";
            case "password": return "password";
            case "delFlag": return "del_flag";
            case "account": return "account";
            case "usid": return "usid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>ext_info -> extInfo</li>
     * <li>usname -> usname</li>
     * <li>password -> password</li>
     * <li>del_flag -> delFlag</li>
     * <li>account -> account</li>
     * <li>usid -> usid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "ext_info": return "extInfo";
            case "usname": return "usname";
            case "password": return "password";
            case "del_flag": return "delFlag";
            case "account": return "account";
            case "usid": return "usid";
            default: return null;
        }
    }
    
    /**  **/
    public String getExtInfo() {
        return this.extInfo;
    }

    /**  **/
    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    /**  **/
    public String getUsname() {
        return this.usname;
    }

    /**  **/
    public void setUsname(String usname) {
        this.usname = usname;
    }

    /**  **/
    public String getPassword() {
        return this.password;
    }

    /**  **/
    public void setPassword(String password) {
        this.password = password;
    }

    /**  **/
    public Integer getDelFlag() {
        return this.delFlag;
    }

    /**  **/
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**  **/
    public String getAccount() {
        return this.account;
    }

    /**  **/
    public void setAccount(String account) {
        this.account = account;
    }

    /**  **/
    public String getUsid() {
        return this.usid;
    }

    /**  **/
    public void setUsid(String usid) {
        this.usid = usid;
    }

	public List<String> getRoleIdList() {
		return roleIdList;
	}

	public void setRoleIdList(List<String> roleIdList) {
		this.roleIdList = roleIdList;
	}

	public List<RoleEO> getRoleEOList() {
		return roleEOList;
	}

	public void setRoleEOList(List<RoleEO> roleEOList) {
		this.roleEOList = roleEOList;
	}

	public List<String> getOrgIdList() {
		return orgIdList;
	}

	public void setOrgIdList(List<String> orgIdList) {
		this.orgIdList = orgIdList;
	}

	public List<OrgEO> getOrgEOList() {
		return orgEOList;
	}

	public void setOrgEOList(List<OrgEO> orgEOList) {
		this.orgEOList = orgEOList;
	}
	
	
}
