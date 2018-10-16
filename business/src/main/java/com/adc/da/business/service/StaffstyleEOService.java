package com.adc.da.business.service;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.StaffstyleEODao;
import com.adc.da.business.entity.StaffstyleEO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 *
 * <br>
 * <b>功能：</b>STAFFSTYLE StaffstyleEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("staffstyleEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class StaffstyleEOService extends BaseService<StaffstyleEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(StaffstyleEOService.class);

    @Autowired
    private StaffstyleEODao dao;

    public StaffstyleEODao getDao() {
        return dao;
    }

    /**
     * 批量删除员工风采中员工信息
     * @param pkStaffs 员工信息主键
     * @return
     */
    public int deleteStaffList(List<String> pkStaffs){
        return dao.deleteStaffList(pkStaffs);
    }


}
