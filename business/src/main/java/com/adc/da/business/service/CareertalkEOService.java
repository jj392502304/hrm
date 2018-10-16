package com.adc.da.business.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.CareertalkEODao;
import com.adc.da.business.entity.CareertalkEO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 *
 * <br>
 * <b>功能：</b>CAREERTALK CareertalkEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-27 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("careertalkEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class CareertalkEOService extends BaseService<CareertalkEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(CareertalkEOService.class);

    @Autowired
    private CareertalkEODao dao;

    public CareertalkEODao getDao() {
        return dao;
    }


    /**
     * 宣讲会增加修改
     * @param careertalkEO
     */
    public String careertalkManager(CareertalkEO careertalkEO){
        if(careertalkEO.getPkcareertalk()==null||"".equals(careertalkEO.getPkcareertalk())){
            //验证新增的序号是不是已经存在
            if(dao.sequenceTestingWithoutPK(careertalkEO)!=null||"".equals(dao.sequenceTestingWithoutPK(careertalkEO))){
                return "当前序号已经存在不能添加";
            }else{
                System.out.println("运行增加方法");
                careertalkEO.setSavetime(new Date());
                careertalkEO.setPkcareertalk(com.adc.da.util.utils.UUID.randomUUID(45));
                dao.careertalkInsert(careertalkEO);
                return "增加成功";
            }
        }else{
            if(dao.sequenceTestingWithPK(careertalkEO)!=null||"".equals(dao.sequenceTestingWithPK(careertalkEO))){
                return "当前序号已存在不能修改";
            }else {
                System.out.println("运行修改方法");
                dao.careertalkUpdate(careertalkEO);
                return "修改成功";
            }

        }

    }

    /**
     * 宣讲会删除
     * @param careertalkEO、
     * 根据Pkcareertalk 删除记录
     */
    public void careertalkDelete(CareertalkEO careertalkEO){
        dao.careertalkDelete(careertalkEO);
    }

    /**
     * 宣讲会查询
     * @return List<CareertalkEO>
     * 根据sequencenumber升序排列查询
     */
    public List<CareertalkEO> careertalkSelect(){
        List<CareertalkEO> careertalkEOList=new ArrayList<CareertalkEO>();
        return dao.careertalkSelect();
    }
}
