package com.adc.da.sys.dao;

import java.util.List;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.sys.entity.OrgEO;
import org.apache.ibatis.annotations.Param;


public interface OrgEODao extends BaseDao<OrgEO>{

	public List<OrgEO> listOrgEOByOrgName(@Param("orgName") String orgName);
	
	public OrgEO getOrgEOByNameAndPid(String name,String parentId);
	
	public List<OrgEO> getOrgEOByPid(String parentId);

	public OrgEO getOrgEOById(String id);
	
	public void deleteLogic(String id);
}
