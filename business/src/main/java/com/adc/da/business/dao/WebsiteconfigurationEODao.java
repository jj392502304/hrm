package com.adc.da.business.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.business.entity.WebsiteconfigurationEO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * <br>
 * <b>功能：</b>WEBSITECONFIGURATION WebsiteconfigurationEODao<br>
 * <b>作者：</b>sun jieyingjian <br>
 * <b>日期：</b> 2018-03-27 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface WebsiteconfigurationEODao extends BaseDao<WebsiteconfigurationEO> {
  public List<RecruitmentinformationEODao> getRecruitmentType(Integer recruitmenttype);
  public List<AnnounceEODao> getAnnounce();
  public List<WebsiteconfigurationEODao> getPageItem(Integer configurationType);
    public Integer updataInfoList(List<WebsiteconfigurationEO> list);
    @Select("select * from WEBSITECONFIGURATION")
    public List<WebsiteconfigurationEO> selectAllInfo();
}
