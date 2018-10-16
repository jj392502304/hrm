package com.adc.da.manager.service;


import com.adc.da.base.service.BaseService;
import com.adc.da.manager.dao.PersonnewsEODao;
import com.adc.da.manager.entity.PersonnewsEO;
import com.adc.da.manager.entity.UserNewsSelectEO;
import com.adc.da.manager.entity.UserlogEO;
import org.omg.CORBA.OBJ_ADAPTER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 *
 * <br>
 * <b>功能：</b>PERSONNEWS PersonnewsEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("personnewsEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class PersonnewsEOService extends BaseService<PersonnewsEO, Void> {

    private static final Logger logger = LoggerFactory.getLogger(PersonnewsEOService.class);

    @Autowired
    private PersonnewsEODao dao;

    public PersonnewsEODao getDao() {
        return dao;
    }

    /**
     * 查询所有的数据
     * @param index//当前的页面值
     * @param offset//每个页面显示的条数
     * @return
     */
    public List userNewsSelect(int index, int offset) throws ParseException {
        Map<String,Integer> map=getPages(index,offset);
        List<UserNewsSelectEO> allUser=dao.userNewsSelect(map.get("beginIndex"),map.get("endIndex"));
        return allUser;
    }

    /**
     * 模糊查询
     * @param index//当前的页面值
     * @param offset//每个页面显示的条数
     * @param name//用户名字
     * @param state//用户状态（停用启用全部）
     * @return
     */
    public List userNewsVagueSelect(int index,int offset,String name, String state) {
        Map<String,Integer> map=getPages(index,offset);
        List<UserNewsSelectEO> vagueSelect=null;
        //用于判断启用，停用，全部三种状态调用两种dao里的方法
        if("2".equals(state)) {
            vagueSelect = dao.userNewsVagueSelectAll(map.get("beginIndex"), map.get("endIndex"),name,state);
        }
        else{
             vagueSelect = dao.userNewsVagueSelect(map.get("beginIndex"), map.get("endIndex"),name,state);
        }
        return vagueSelect;
    }

    /**
     * /获取数据库中数据的当前页面开始条数和结尾条数
     * @param index//当前的页面值
     * @param offset//每个页面显示的条数
     * @return
     */
    public Map<String, Integer> getPages(int index,int offset){
        int beginIndex=(index-1)*offset+1;
        int endIndex=(index*offset);
        Map<String,Integer> map=new HashMap<>();
        map.put("beginIndex",beginIndex);
        map.put("endIndex",endIndex);
        return map;
    }

    /**
     * //查询登录日志里是否有数据，即用户是否含有有过登陆数据
     * @param personNewsID//用户id
     * @return
     */
    public List loginLogSelect(String personNewsID) {
        List<UserlogEO> list=dao.loginLogSelect(personNewsID);
        return list;
    }

    /**
     * //业务删除多各表中的数据
     * @param personNewsID
     */
    @Transactional
    public void userNewsDelete(String personNewsID) {
        dao.departmentPositionDelete(personNewsID);
        dao.userNewsDelete(personNewsID);
        dao.userLoginDelete(personNewsID);
        dao.personDepartmentPositionDelete(personNewsID);
    }

    /**
     *得到数据库中的条数
     * @return
     */
    public int getCount() {
        return dao.getCount();
    }
}
