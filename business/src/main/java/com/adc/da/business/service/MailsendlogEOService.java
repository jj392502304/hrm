package com.adc.da.business.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.MailsendlogEODao;
import com.adc.da.business.entity.MailsendlogEO;


/**
 *
 * <br>
 * <b>功能：</b>MAILSENDLOG MailsendlogEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("mailsendlogEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class MailsendlogEOService extends BaseService<MailsendlogEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(MailsendlogEOService.class);

    @Autowired
    private MailsendlogEODao dao;

    public MailsendlogEODao getDao() {
        return dao;
    }

}
