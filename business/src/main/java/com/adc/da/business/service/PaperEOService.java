package com.adc.da.business.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.PaperEODao;
import com.adc.da.business.entity.PaperEO;


/**
 *
 * <br>
 * <b>功能：</b>PAPER PaperEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("paperEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class PaperEOService extends BaseService<PaperEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(PaperEOService.class);

    @Autowired
    private PaperEODao dao;

    public PaperEODao getDao() {
        return dao;
    }

}
