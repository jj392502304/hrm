package com.adc.da.business.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.business.entity.RecruitmentinformationEO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * <br>
 * <b>功能：</b>RECRUITMENTINFORMATION RecruitmentinformationEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface RecruitmentinformationEODao extends BaseDao<RecruitmentinformationEO> {

    /**
     *
     * **/

   List<RecruitmentinformationEO> getRecruitmentType();

    //List<Integer> getRecruitmentTypes();
}
