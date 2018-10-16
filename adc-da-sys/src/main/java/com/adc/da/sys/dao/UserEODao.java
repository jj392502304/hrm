package com.adc.da.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.sys.entity.UserEO;

/**
 *
 * <br>
 * <b>功能：</b>TS_USER UserEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2017-12-18 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface UserEODao extends BaseDao<UserEO> {

	public void updatePassword(@Param("userId") Integer userId, @Param("oldPassword") String oldPassword,
			@Param("newPassword") String newPassword);

	public void updateUserEO(UserEO userEO);

	public List<Integer> getRoleIdListByUserId(Integer usid);

	public void saveUserRole(@Param("usid") String usid, @Param("roleId") String roleId);
	
	public void saveUserOrg(@Param("usid") String usid, @Param("orgId") String orgId);

	/**
	 * 物理删除用户角色关联
	 * 
	 * @param usid
	 *            用户ID
	 */
	public void deleteUserRoleByUsid(String usid);
	/**
	 * 物理删除用户组织机构关联
	 * 
	 * @param usid
	 *            用户ID
	 */
	public void deleteUserOrgByUsid(String usid);

	public void deleteLogicInBatch(List<String> usids);

	/**
	 * 批量删除用户角色关联
	 * 
	 * @param usids
	 *            用户ID集合
	 */
	public void deleteUserRoleByUsidInBatch(List<String> usids);
	
	/**
	 * 批量删除用户组织机构关联
	 * 
	 * @param usids
	 *            用户ID集合
	 */
	public void deleteUserOrgByUsidInBatch(List<String> usids);

	public UserEO getUserEOByAccount(String account);

	/**
	 * 查询用户及用户所对应的角色
	 */
	public UserEO getUserWithRoles(String id);

	public UserEO get(String id);
}
