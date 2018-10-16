package com.adc.da.sys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.sys.dao.OrgEODao;
import com.adc.da.sys.entity.DictionaryEO;
import com.adc.da.sys.entity.OrgEO;
import com.adc.da.util.constant.DeleteFlagEnum;
import com.adc.da.util.utils.UUID;


@Service("orgEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class OrgEOService extends BaseService<OrgEO, String> {

	private static final Logger logger = LoggerFactory.getLogger(OrgEOService.class);
	
	@Autowired
	private OrgEODao dao;
	
	@Override
	public OrgEODao getDao() {
		return dao;
	}
	
	@Transactional(readOnly = true, rollbackFor = Exception.class)
	public List<OrgEO> listOrgEOByOrgName(String orgName) {
		return dao.listOrgEOByOrgName(orgName);
	}
	
	@Transactional(readOnly = true)
	public OrgEO getOrgEOByNameAndPid(String orgName,String parentId) {
		return dao.getOrgEOByNameAndPid(orgName,parentId);
	}
	
	@Transactional(readOnly = true)
	public List<OrgEO> getOrgEOByPid(String parentId) {
		return dao.getOrgEOByPid(parentId);
	}
	
	public OrgEO save(OrgEO orgEO) {
		orgEO.setId(UUID.randomUUID10());
		orgEO.setDelFlag(DeleteFlagEnum.NORMAL.getValue());
		orgEO.setIsShow(0);
		dao.insert(orgEO);
		return orgEO;
	}
	
	/**
	 * 组织机构详情
	 */
	@Transactional(readOnly = true)
	public OrgEO getOrgEOById(String id) {
		return dao.getOrgEOById(id);
	}
	
	/**
	 * 删除组织机构
	 */
	@Transactional(rollbackFor = Exception.class)
	public void delete(String id) {
		dao.deleteLogic(id);
		//dao.deleteRoleMenuByRoleId(roleId);
	}
}
