package com.adc.da.business.service;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.ApplymemberEODao;
import com.adc.da.business.entity.ApplymemberEO;

import java.util.List;


/**
 *
 * <br>
 * <b>功能：</b>APPLYMEMBER ApplymemberEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("applymemberEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class ApplymemberEOService extends BaseService<ApplymemberEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(ApplymemberEOService.class);

    @Autowired
    private ApplymemberEODao applymemberEODao;

    public ApplymemberEODao getDao() {
        return applymemberEODao;
    }


    /**
     * Judge applymember login(判断应聘人员是否可以登录,当该人员出现没有账户或者密码不正确或者出现在黑名单,登录不成功)
     * @param  account 应聘人员账号
     * @param  password 应聘人员密码
     * @return  {@linkplain ApplymemberEO}
     * **/
    public ApplymemberEO login(String account,String password){
        return applymemberEODao.selectApplymemberByAccountAndPassword(account,password);
    }


    /**
     * 更新应聘人员密码
     * @param  newPassword 新密码
     * @param  account 用户账号
     * **/
    public void updateApplymemberPassword( String newPassword, String account){
         applymemberEODao.updateApplymemberPasswordByAccount(newPassword,account);
    }

    /**
     * 用户注册前对帐户名进行查询是否已经存在
     * @param account
     * @return
     */
    public List<String> selectNameRegistered(String account){
       return applymemberEODao.selectNameRegistered(account);
    }

}
