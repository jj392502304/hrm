package com.adc.da.sys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.sys.dao.RoleEODao;
import com.adc.da.sys.dao.UserEODao;
import com.adc.da.sys.entity.UserEO;
import com.adc.da.util.constant.DeleteFlagEnum;
import com.adc.da.util.utils.CollectionUtils;
import com.adc.da.util.utils.PasswordUtils;
import com.adc.da.util.utils.UUID;

/**
 *
 * <br>
 * <b>功能：</b>TS_USER UserEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2017-11-06 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("userEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class UserEOService extends BaseService<UserEO, String> {

	private static final Logger logger = LoggerFactory.getLogger(UserEOService.class);

	@Autowired
	private UserEODao dao;

	private RoleEODao roleEODao;

	public UserEODao getDao() {
		return dao;
	}

	public UserEO save(UserEO userEO) {
		userEO.setUsid(UUID.randomUUID10());
		userEO.setDelFlag(DeleteFlagEnum.NORMAL.getValue());
		userEO.setPassword(PasswordUtils.encryptPassword(userEO.getPassword()));
		if(userEO.getExtInfo() == null){
			userEO.setExtInfo("");
		}
		dao.insert(userEO);
		return userEO;
	}

	@Transactional(readOnly = true)
	public UserEO getUserByLoginName(String userName) {
		return dao.getUserEOByAccount(userName);
	}

	public void updatePassword(Integer userId, String oldPassword, String newPassword) {
		dao.updatePassword(userId, oldPassword, newPassword);
	}

	public void updateUserEO(UserEO userEO) {
		dao.updateUserEO(dao.get(userEO.getUsid()));
	}

	/*
	 * @Transactional(readOnly = true) public PageInfo<UserEO> page(PageInfo
	 * pageInfo, String userName) { PageInfo<UserEO> pi = dao.page(pageInfo,
	 * userName); for (UserEO userEO: pi.getList()) {
	 * userEO.setRoleEOList(roleEODao.getRoleListByUserId(userEO.getUsid())); }
	 * return pi; }
	 */

	/**
	 * 删除用户及用户角色关联
	 */
	public void delete(List<String> ids) {
		dao.deleteLogicInBatch(ids);
		dao.deleteUserRoleByUsidInBatch(ids);
		dao.deleteUserOrgByUsidInBatch(ids);
	}

	/**
	 * 查询用户及用户所对应的角色
	 */
	@Transactional(readOnly = true)
	public UserEO getUserWithRoles(String id) {
		return dao.getUserWithRoles(id);
	}

	/**
	 * 设置用户角色关联
	 */
	@Transactional(rollbackFor = Exception.class)
	public UserEO saveUserRole(UserEO userEO) {
		if (CollectionUtils.isNotEmpty(userEO.getRoleIdList())) {
			dao.deleteUserRoleByUsid(userEO.getUsid());
			for (String roleId : userEO.getRoleIdList()) {
				dao.saveUserRole(userEO.getUsid(), roleId);
			}
		}
		return userEO;
	}
	
	/**
	 * 设置用户组织机构关联
	 */
	@Transactional(rollbackFor = Exception.class)
	public UserEO saveUserOrg(UserEO userEO) {
		if (CollectionUtils.isNotEmpty(userEO.getOrgIdList())) {
			dao.deleteUserOrgByUsid(userEO.getUsid());
			for (String orgId : userEO.getOrgIdList()) {
				dao.saveUserOrg(userEO.getUsid(), orgId);
			}
		}
		return userEO;
	}
}
