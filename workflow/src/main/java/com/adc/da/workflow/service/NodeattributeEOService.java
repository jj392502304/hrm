package com.adc.da.workflow.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.workflow.dao.NodeattributeEODao;
import com.adc.da.workflow.entity.NodeattributeEO;


/**
 *
 * <br>
 * <b>功能：</b>NODEATTRIBUTE NodeattributeEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-28 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("nodeattributeEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class NodeattributeEOService extends BaseService<NodeattributeEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(NodeattributeEOService.class);

    @Autowired
    private NodeattributeEODao dao;

    public NodeattributeEODao getDao() {
        return dao;
    }

}
