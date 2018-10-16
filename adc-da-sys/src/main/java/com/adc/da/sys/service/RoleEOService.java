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
import com.adc.da.sys.entity.RoleEO;
import com.adc.da.sys.entity.UserRoleEO;
import com.adc.da.util.constant.DeleteFlagEnum;
import com.adc.da.util.utils.CollectionUtils;
import com.adc.da.util.utils.UUID;
import com.adc.da.sys.dao.MenuEODao;

/**
 *
 * <br>
 * <b>功能：</b>TS_ROLE RoleEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2017-11-06 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("roleEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class RoleEOService extends BaseService<RoleEO, String> {

	private static final Logger logger = LoggerFactory.getLogger(RoleEOService.class);

	@Autowired
	private RoleEODao dao;

	public RoleEODao getDao() {
		return dao;
	}

	private MenuEODao menuEODao;

	public RoleEO save(RoleEO sysRoleEO) {
		sysRoleEO.setId(UUID.randomUUID10());
		sysRoleEO.setDelFlag(DeleteFlagEnum.NORMAL.getValue());
		dao.insertSelective(sysRoleEO);
		return sysRoleEO;
	}

	@Transactional(readOnly = true)
	public RoleEO getRoleWithMenus(String id) {
		return dao.getRoleWithMenus(id);
	}

	@Transactional(readOnly = true)
	public List<RoleEO> getSysRoleListByUserId(String userId) {
		return dao.getRoleListByUserId(userId);
	}

	/*
	 * @Transactional(readOnly = true) public PageInfo<RoleEO> page(PageInfo
	 * pageInfo, String roleName) { return dao.page(pageInfo, roleName); }
	 */

	/**
	 * 删除角色及角色菜单关联(角色有对应用户则不能被删除)
	 */
	@Transactional(rollbackFor = Exception.class)
	public void delete(String roleId) {
		dao.deleteLogic(roleId);
		dao.deleteRoleMenuByRoleId(roleId);
	}

	@Transactional(readOnly = true)
	public List<RoleEO> findAll() {
		return dao.findAll();
	}

	/**
	 * 查询角色所对应的用户
	 */
	@Transactional(readOnly = true)
	public List<UserRoleEO> getUserRoleListByRoleId(String roleId) {
		return dao.getUserRoleListByRoleId(roleId);
	}

	/**
	 * 设置角色菜单关联
	 */
	@Transactional(rollbackFor = Exception.class)
	public RoleEO saveRoleMenu(RoleEO roleEO) {
		if (CollectionUtils.isNotEmpty(roleEO.getMenuEOIdList())) {
			dao.deleteRoleMenuByRoleId(roleEO.getId());
			for (String menuId : roleEO.getMenuEOIdList()) {
				dao.saveRoleMenu(roleEO.getId(), menuId);
			}
		}
		return roleEO;
	}

	/**
	 * 判断角色是否属于相应用户
	 */
	public boolean isBelong(String userId, String roleId) {
		int count = dao.isBelong(userId, roleId);
		return count > 0;
	}
}
