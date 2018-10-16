package com.adc.da.manager.service;

import com.adc.da.manager.dao.RoledistributionEODao;
import com.adc.da.manager.entity.*;
import com.adc.da.util.utils.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.manager.dao.UserroleEODao;
import com.adc.da.manager.entity.UserroleEO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * <br>
 * <b>功能：</b>USERROLE UserroleEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-26 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("userroleEOService")
/*@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)*/
public class UserroleEOService extends BaseService<UserroleEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(UserroleEOService.class);

    @Autowired
    private UserroleEODao dao;
    @Autowired
    private RoledistributionEODao disdao;

    public UserroleEODao getDao() {
        return dao;
    }
    /*
    * 功能：新增角色
    * 参数：
    * */
    @Transactional
    public Integer RoleSave(UserRoleAndFunctionVO userRoleAndFunctionVO){
        UserroleEO personroleEO = new UserroleEO();
        personroleEO.setRolename(userRoleAndFunctionVO.getRolename());
        List<UserroleEO> list = new ArrayList<>();
        try {
           list = dao.selectRoleByName(personroleEO);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        if (list!=null&&list.size()>0){
            return null;
        }
        personroleEO.setDescribe(userRoleAndFunctionVO.getDescribe());
        personroleEO.setCreationtime(new Date());

        personroleEO.setIsenabled(1);
        String roleperimaryKey = UUID.randomUUID(45);
        personroleEO.setRoleprimarykey(roleperimaryKey);
        List<RoledistributionEO> roledistributionEOList = new ArrayList<>();
        userRoleAndFunctionVO.setRolefunction(getFunctionByName(userRoleAndFunctionVO.getRolefunction()));
        for (RolefunctionEO rolefunctionEO:userRoleAndFunctionVO.getRolefunction()
                ) {
            RoledistributionEO roledistributionEO = new RoledistributionEO();
            roledistributionEO.setRoledistributionkey(UUID.randomUUID(45));
            roledistributionEO.setRoleforeignkey(roleperimaryKey);
            roledistributionEO.setRolefunctionkey(rolefunctionEO.getRolefunctionkey());
            roledistributionEOList.add(roledistributionEO);
        }
        Integer temp=0;
        try {
            temp=dao.insert(personroleEO);
            if (roledistributionEOList!=null&&roledistributionEOList.size()>0){
                temp+=disdao.insertList(roledistributionEOList);
            }
        }catch (Exception  e){
            System.out.println("新增角色报错："+e.getMessage());
            throw e;
        }
        return temp;
    }
    /*
    * 功能：删除角色
    * 参数：
    * */
    @Transactional
    public Integer RoleDelete(List<String> list){
        String roleprimarykey="";
        List<String> idlist = dao.getIsEmptyByRoleKey(list);
        list.removeAll(idlist);
        Integer temp = 0;
        if (list!=null&&list.size()>0){
            temp = dao.deleteByPrimaryKeyList(list);
            temp += disdao.deleteByRoleprimarykey(list);
        }
        if (idlist!=null&&idlist.size()>0){
            temp = dao.updataIsenabled(idlist);
        }
        return temp;
    }
    /*
    * 功能：修改角色
    * 参数：
    * */
    @Transactional
    public Integer RoleModify(UserRoleAndFunctionVO personroleAndFunctionVO){
        UserroleEO personroleEO = new UserroleEO();
        personroleEO.setRoleprimarykey(personroleAndFunctionVO.getRoleprimarykey());
        personroleEO.setRolename(personroleAndFunctionVO.getRolename());
        List<UserroleEO> list = dao.selectRoleByName(personroleEO);
        if (list!=null&&list.size()>0){
            return null;
        }
        Integer Isenabled = personroleAndFunctionVO.getIsenabled();
        personroleEO.setIsenabled(Isenabled);
        personroleEO.setDescribe(personroleAndFunctionVO.getDescribe());
        if (Isenabled!=null){
            personroleEO.setEnadletime(new Date());
        }
        List<RoledistributionEO> rolelist  = new ArrayList<>();
        personroleAndFunctionVO.setRolefunction(getFunctionByName(personroleAndFunctionVO.getRolefunction()));
        for (RolefunctionEO roledus:personroleAndFunctionVO.getRolefunction()
             ) {
            RoledistributionEO roledistributionEO = new RoledistributionEO();
            roledistributionEO.setRolefunctionkey(roledus.getRolefunctionkey());
            roledistributionEO.setRoleforeignkey(personroleAndFunctionVO.getRoleprimarykey());
            roledistributionEO.setRoledistributionkey(UUID.randomUUID(45));
            rolelist.add(roledistributionEO);
        }
        Integer temp=0;
        try {
            temp = dao.updateByPrimaryKeySelective(personroleEO);
            if (rolelist!=null&&rolelist.size()>0){
                List<String> list1 = new ArrayList<>();
                list1.add(personroleAndFunctionVO.getRoleprimarykey());
                disdao.deleteByRoleprimarykey(list1);
                temp+=disdao.insertList(rolelist);
            }
        }catch (Exception e){
            System.out.println("修改角色报错："+e.getMessage());
            return null;
        }
        return temp;
    }
    /*
    * 功能：查询角色是否存在
    * 参数：
    * */
    public Integer RoleIsEmpty(UserroleEO userroleEO){
        List<UserroleEO> list = new ArrayList<>();
        try {
            list = dao.selectRoleByName(userroleEO);
        }catch (Exception e){
            System.out.println("查询角色出错"+e.getMessage());
        }
        if (list==null||list.size()<1){
            return 0;
        }else {
            return 1;
        }
    }
    /*
    * 功能：查询角色信息通过id
    * 参数：
    * */
    public UserRoleAndFunctionVO seleteRoleById(String roleprimarykey){
        System.out.println("***************************************************");
        UserroleEO userroleEO = new UserroleEO();
        List<RolefunctionEO> list  =new ArrayList<>();
        UserRoleAndFunctionVO userRoleAndFunctionVO = new UserRoleAndFunctionVO();
        try {
            userroleEO = dao.selectByPrimaryKey(roleprimarykey);
            list = disdao.getRolefunctionByRoleId(roleprimarykey);
            userRoleAndFunctionVO.setDescribe(userroleEO.getDescribe());
            userRoleAndFunctionVO.setRolename(userroleEO.getRolename());
            userRoleAndFunctionVO.setIsenabled(userroleEO.getIsenabled());
            userRoleAndFunctionVO.setRoleprimarykey(userroleEO.getRoleprimarykey());
            if (list!=null&&list.size()>0){
                userRoleAndFunctionVO.setRolefunction(list);
            }
        }catch (Exception e){
            System.out.println("查询角色出错"+e.getMessage());
        }
        if (userRoleAndFunctionVO==null){
            return null;
        }else {
            return userRoleAndFunctionVO;
        }
    }
    /*
    * 功能：通过功能名称查询权限的所有信息
    * */
    private List<RolefunctionEO> getFunctionByName(List<RolefunctionEO> list){
        List<RolefunctionEO> roleList = new ArrayList<>();
        try {
            roleList = disdao.getFunctionByName(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        return roleList;

    }
}
