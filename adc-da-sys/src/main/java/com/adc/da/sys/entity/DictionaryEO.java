package com.adc.da.sys.entity;

import java.io.Serializable;

import com.adc.da.base.entity.BaseEntity;
import java.util.ArrayList;
import java.util.List;

public class DictionaryEO extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 3658632939727891047L;
	private String id;
    private String dictionaryCode;
    private String dictionaryName;
	private Integer delFlag;
    private List<DicTypeEO> dicTypeEOList = new ArrayList<>();

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>id -> id</li>
     * <li>dictionaryCode -> dictionarycode</li>
     * <li>dictionaryName -> dictionaryname</li>
     * <li>delFlag -> del</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "id": return "id";
            case "dictionaryCode": return "dictionary_code";
            case "dictionaryName": return "dictionary_name";
            case "delFlag": return "del_flag";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>id -> id</li>
     * <li>dictionarycode -> dictionaryCode</li>
     * <li>dictionaryname -> dictionaryName</li>
     * <li>del -> delFlag</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "id": return "id";
            case "dictionary_code": return "dictionaryCode";
            case "dictionary_name": return "dictionaryName";
            case "del_flag": return "delFlag";
            default: return null;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getDictionaryCode() {
		return dictionaryCode;
	}

	public void setDictionaryCode(String dictionaryCode) {
		this.dictionaryCode = dictionaryCode;
	}

	public String getDictionaryName() {
		return dictionaryName;
	}

	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public List<DicTypeEO> getDicTypeEOList() {
		return dicTypeEOList;
	}

	public void setDicTypeEOList(List<DicTypeEO> dicTypeEOList) {
		this.dicTypeEOList = dicTypeEOList;
	}
}
