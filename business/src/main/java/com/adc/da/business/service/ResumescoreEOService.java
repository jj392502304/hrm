package com.adc.da.business.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.ResumescoreEODao;
import com.adc.da.business.entity.ResumescoreEO;


/**
 *
 * <br>
 * <b>功能：</b>RESUMESCORE ResumescoreEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("resumescoreEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class ResumescoreEOService extends BaseService<ResumescoreEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(ResumescoreEOService.class);

    @Autowired
    private ResumescoreEODao dao;

    public ResumescoreEODao getDao() {
        return dao;
    }

}
