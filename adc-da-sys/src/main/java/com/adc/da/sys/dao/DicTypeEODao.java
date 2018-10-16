package com.adc.da.sys.dao;

import java.util.List;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.sys.entity.DicTypeEO;

public interface DicTypeEODao extends BaseDao<DicTypeEO>{

	public DicTypeEO getDicTypeEOById(String id);

	public void deleteDicTypeByIdInBatch(List<String> ids);

}
