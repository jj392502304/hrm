package com.adc.da.business.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.business.entity.CareertalkEO;

import java.util.List;

/**
 *
 * <br>
 * <b>功能：</b>CAREERTALK CareertalkEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-27 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface CareertalkEODao extends BaseDao<CareertalkEO> {

    //增加
    public void careertalkInsert(CareertalkEO careertalkEO);

    //修改
    public void careertalkUpdate(CareertalkEO careertalkEO);

    //删除
    public void careertalkDelete(CareertalkEO careertalkEO);

    //查询
    public List<CareertalkEO> careertalkSelect();

    //增加时验证序号存在
    public String sequenceTestingWithoutPK(CareertalkEO careertalkEO);

    //修改时验证序号存在
    public String sequenceTestingWithPK(CareertalkEO careertalkEO);

}
