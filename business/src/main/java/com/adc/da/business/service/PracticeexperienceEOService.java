package com.adc.da.business.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.PracticeexperienceEODao;
import com.adc.da.business.entity.PracticeexperienceEO;


/**
 *
 * <br>
 * <b>功能：</b>PRACTICEEXPERIENCE PracticeexperienceEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("practiceexperienceEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class PracticeexperienceEOService extends BaseService<PracticeexperienceEO, Void> {

    private static final Logger logger = LoggerFactory.getLogger(PracticeexperienceEOService.class);

    @Autowired
    private PracticeexperienceEODao dao;

    public PracticeexperienceEODao getDao() {
        return dao;
    }

}
