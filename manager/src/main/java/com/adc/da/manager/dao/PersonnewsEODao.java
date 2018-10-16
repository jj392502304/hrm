package com.adc.da.manager.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.base.page.BasePage;

import com.adc.da.manager.entity.PersonnewsEO;
import org.apache.ibatis.annotations.Param;


import java.util.List;
/**
 *
 * <br>
 * <b>功能：</b>PERSONNEWS PersonnewsEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface PersonnewsEODao extends BaseDao<PersonnewsEO> {

    List userNewsSelect(@Param("beginIndex") Integer beginIndex, @Param("endIndex") Integer endIndex);
    List userNewsVagueSelect(@Param("beginIndex") Integer beginIndex, @Param("endIndex") Integer endIndex, @Param("name") String name, @Param("state") String state);
    List userNewsVagueSelectAll(@Param("beginIndex") Integer beginIndex, @Param("endIndex") Integer endIndex, @Param("name") String name, @Param("state") String state);
    List loginLogSelect(@Param("personNewsID") String personNewsID);
    void userNewsDelete(@Param("personNewsID") String personNewsID);
    void userLoginDelete(@Param("personNewsID") String personNewsID);
    void personDepartmentPositionDelete(@Param("personNewsID") String personNewsID);
    void departmentPositionDelete(@Param("personNewsID") String personNewsID);

    @Override
    int insert(PersonnewsEO personnewsEO);

    @Override
    int insertSelective(PersonnewsEO personnewsEO);

    @Override
    int updateByPrimaryKey(PersonnewsEO personnewsEO);

    @Override
    int updateByPrimaryKeySelective(PersonnewsEO personnewsEO);

    @Override
    PersonnewsEO selectByPrimaryKey(Object o);

    @Override
    int deleteByPrimaryKey(Object o);

    @Override
    List<PersonnewsEO> queryByList(BasePage basePage);

    @Override
    int queryByCount(BasePage basePage);

    @Override
    List<PersonnewsEO> queryByPage(BasePage basePage);

    int getCount();


}
