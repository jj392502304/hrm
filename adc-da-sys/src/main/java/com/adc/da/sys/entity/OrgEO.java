package com.adc.da.sys.entity;

import java.io.Serializable;

import com.adc.da.base.entity.TreeEntity;

public class OrgEO extends TreeEntity implements Serializable{

	private static final long serialVersionUID = 2497292638985614077L;
	
	private String orgDesc;
    private String orgCode;
    private String orgType;
	private Integer isShow;
	private String remarks;
	
	/**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>id -> id</li>
     * <li>name -> org_name</li>
     * <li>orgDesc -> org_desc</li>
     * <li>orgCode -> org_code</li>
     * <li>orgType -> org_type</li>
     * <li>parentIds -> parent_ids</li>
     * <li>parentId -> parent_id</li>
     * <li>isShow -> is_show</li>
     * <li>delFlag -> del_flag</li>
     * <li>remarks -> remarks</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
        	case "id": return "id";
        	case "name": return "org_name";
        	case "orgDesc": return "org_desc";
        	case "orgCode": return "org_code";
        	case "orgType": return "org_type";
        	case "parentIds": return "parent_ids";
            case "parentId": return "parent_id";
            case "isShow": return "is_show";
            case "delFlag": return "del_flag";
            case "remarks": return "remarks";
       
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>id -> id</li>
     * <li>org_name->name</li>
     * <li>org_desc->orgDesc</li>
     * <li>org_code->orgCode</li>
     * <li>org_type -> orgType</li>
     * <li>parent_ids -> parentIds</li>
     * <li>parent_id -> parentId</li>
     * <li>is_show ->isShow</li>
     * <li>del_flag ->delFlag </li>
     * <li>remarks -> remarks</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
	        case "id": return "id";
	    	case "org_name": return "name";
	    	case "org_desc": return "orgDesc";
	    	case "org_code": return "orgCode";
	    	case "org_type": return "orgType";
	    	case "parent_ids": return "parentIds";
	        case "parent_id": return "parentId";
	        case "is_show": return "isShow";
	        case "del_flag": return "delFlag";
	        case "remarks": return "remarks";
            
            default: return null;
        }
    }
	
	public String getOrgDesc() {
		return orgDesc;
	}
	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
