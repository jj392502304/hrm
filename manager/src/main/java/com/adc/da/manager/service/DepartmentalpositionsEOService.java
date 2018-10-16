package com.adc.da.manager.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.manager.dao.DepartmentalpositionsEODao;
import com.adc.da.manager.entity.DepartmentalpositionsEO;


/**
 *
 * <br>
 * <b>功能：</b>DEPARTMENTALPOSITIONS DepartmentalpositionsEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("departmentalpositionsEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class DepartmentalpositionsEOService extends BaseService<DepartmentalpositionsEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentalpositionsEOService.class);

    @Autowired
    private DepartmentalpositionsEODao dao;

    public DepartmentalpositionsEODao getDao() {
        return dao;
    }

}
