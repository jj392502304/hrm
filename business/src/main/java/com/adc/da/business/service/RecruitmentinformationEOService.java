package com.adc.da.business.service;

import com.adc.da.business.dao.RecruitmentinformationEODao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.entity.RecruitmentinformationEO;

import java.util.List;


/**
 *
 * <br>
 * <b>功能：</b>RECRUITMENTINFORMATION RecruitmentinformationEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("recruitmentinformationEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class RecruitmentinformationEOService extends BaseService<RecruitmentinformationEO, Void> {

    private static final Logger logger = LoggerFactory.getLogger(RecruitmentinformationEOService.class);

    @Autowired
    private RecruitmentinformationEODao dao;

    public RecruitmentinformationEODao getDao() {
        return dao;
    }
    /*
       * 对Recruitmenttype招聘类型字段进行去重查询
       * */

    public List<RecruitmentinformationEO> listRecruitmentinformationEOByRecruitmenttype(){
        return dao.getRecruitmentType();
    }

}
