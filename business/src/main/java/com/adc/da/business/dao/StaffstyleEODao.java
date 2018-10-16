package com.adc.da.business.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.business.entity.StaffstyleEO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * <br>
 * <b>功能：</b>STAFFSTYLE StaffstyleEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface StaffstyleEODao extends BaseDao<StaffstyleEO> {
    /**
     * 加载列表
     * @return
     */
    public List<StaffstyleEO> queryByList1();


    /**
     * 批量删除员工风采中员工信息
     * @param pkStaffs 员工信息主键
     * @return
     */
    int deleteStaffList(@Param("pkStaffs") List<String> pkStaffs);
}
