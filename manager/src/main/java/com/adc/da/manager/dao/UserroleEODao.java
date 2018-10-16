package com.adc.da.manager.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.manager.entity.PersondepartmentpositionEO;
import com.adc.da.manager.entity.UserroleEO;

import java.util.List;

/**
 *
 * <br>
 * <b>功能：</b>USERROLE UserroleEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface UserroleEODao extends BaseDao<UserroleEO> {

    public List<UserroleEO> selectRoleByName(UserroleEO userroleEO);
    public List<String> getIsEmptyByRoleKey(List<String> list);
    public Integer updataIsenabled(List<String> list);
    public Integer deleteByPrimaryKeyList(List<String> list);
}
