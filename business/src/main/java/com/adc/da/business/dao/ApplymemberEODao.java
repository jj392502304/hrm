package com.adc.da.business.dao;

import com.adc.da.base.dao.BaseDao;
import com.adc.da.business.entity.ApplymemberEO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 *
 * <br>
 * <b>功能：</b>APPLYMEMBER ApplymemberEODao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public interface ApplymemberEODao extends BaseDao<ApplymemberEO> {

    /**
     * Select applymember by account and password(根据应聘人员的账户和密码选择),用于网站的登录和登出
     * @param account
     *          应聘人员账号
     * @param  password
     *          应聘人员密码
     * @return  {@linkplain ApplymemberEO}
     * **/
   public ApplymemberEO selectApplymemberByAccountAndPassword(@Param("account") String account, @Param("password") String password);

    /**
     * Updates applymember password by primary key(根据应聘人员主键修改密码),{@link ApplymemberEO}这个实体类字段很多,sql语句if
     * 判断低下,所以对于修改字段很少的话,重新写个方法,运行更高效
     * @param  newPassword
     *              应聘人员密码
     * @param  account 用户账号
     * **/
   public void updateApplymemberPasswordByAccount(@Param("newPassword") String newPassword, @Param("account") String account);

    /**
     * 用户注册前对注册账号进行查询
     * @param account
     * @return
     */
   public List<String> selectNameRegistered(@Param("account") String account);
}
