package com.adc.da.sys.vo;

import java.util.ArrayList;
import java.util.List;

import com.adc.da.sys.entity.DicTypeEO;

public class DictionaryVO {
	private String id;
    private String dictionaryCode;
    private String dictionaryName;
	private Integer delFlag;
    private List<DicTypeEO> dicTypeEOList = new ArrayList<>();

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
