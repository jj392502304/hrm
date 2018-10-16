package com.adc.da.manager.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.manager.dao.FunctionEODao;
import com.adc.da.manager.entity.FunctionEO;


/**
 *
 * <br>
 * <b>功能：</b>FUNCTION FunctionEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("functionEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class FunctionEOService extends BaseService<FunctionEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(FunctionEOService.class);

    @Autowired
    private FunctionEODao dao;

    public FunctionEODao getDao() {
        return dao;
    }

}
