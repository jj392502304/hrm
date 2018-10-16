package com.adc.da.manager.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.manager.dao.PersondepartmentpositionEODao;
import com.adc.da.manager.entity.PersondepartmentpositionEO;


/**
 *
 * <br>
 * <b>功能：</b>PERSONDEPARTMENTPOSITION PersondepartmentpositionEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("persondepartmentpositionEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class PersondepartmentpositionEOService extends BaseService<PersondepartmentpositionEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(PersondepartmentpositionEOService.class);

    @Autowired
    private PersondepartmentpositionEODao dao;

    public PersondepartmentpositionEODao getDao() {
        return dao;
    }

}
