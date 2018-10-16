package com.adc.da.workflow.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.workflow.dao.ApprovalserviceEODao;
import com.adc.da.workflow.entity.ApprovalserviceEO;


/**
 *
 * <br>
 * <b>功能：</b>APPROVALSERVICE ApprovalserviceEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("approvalserviceEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class ApprovalserviceEOService extends BaseService<ApprovalserviceEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(ApprovalserviceEOService.class);

    @Autowired
    private ApprovalserviceEODao dao;

    public ApprovalserviceEODao getDao() {
        return dao;
    }

}
