package com.adc.da.manager.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.manager.entity.RoledistributionEO;
import com.adc.da.manager.entity.RolefunctionEO;

import java.util.List;

/**
 *
 * <br>
 * <b>功能：</b>ROLEDISTRIBUTION RoledistributionEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface RoledistributionEODao extends BaseDao<RoledistributionEO> {

    public Integer insertList(List<RoledistributionEO> list);
    public Integer updateList(List<RoledistributionEO> list);
    public Integer deleteByRoleprimarykey(List<String> list);
    public List<RolefunctionEO> getFunctionByName(List<RolefunctionEO> list);
    public List<RolefunctionEO> getRolefunctionByRoleId(String roleprimarykey);

}
