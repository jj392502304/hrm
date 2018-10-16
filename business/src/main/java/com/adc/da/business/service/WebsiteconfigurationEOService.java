package com.adc.da.business.service;

import com.adc.da.business.dao.AnnounceEODao;
import com.adc.da.business.dao.RecruitmentinformationEODao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.business.dao.WebsiteconfigurationEODao;
import com.adc.da.business.entity.WebsiteconfigurationEO;

import java.util.*;


/**
 *
 * <br>
 * <b>功能：</b>WEBSITECONFIGURATION WebsiteconfigurationEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("websiteconfigurationEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class WebsiteconfigurationEOService extends BaseService<WebsiteconfigurationEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(WebsiteconfigurationEOService.class);

    @Autowired
    private WebsiteconfigurationEODao dao;

    public WebsiteconfigurationEODao getDao() {
        return dao;
    }
/*
* 对Recruitmenttype招聘类型字段进行去重查询
* */
    public List<RecruitmentinformationEODao> getRecruitmentType(Integer recruitmenttype) {
      return  dao.getRecruitmentType(recruitmenttype);
    }
/*
* 根据配置类型Configuration字段查询
 * 并且根据ExplicitState查询数据
* */
    public List<WebsiteconfigurationEODao> getPageItem(Integer configurationType) {
        return dao.getPageItem(configurationType);
    }

    /*
    * 根据时间排序获取公告
 * 根据有效期判断公告是否显示
    * */
    public List<AnnounceEODao> getAnnounce() {
        return dao.getAnnounce();
    }
    /*
   * 2018-3-30
   * 李云强
   * 将页面数据分类好保存到数据库相应字段上
   * */
    public Integer saveWebsiteconfigurationInfo(Map map) {
        List<WebsiteconfigurationEO> list = new ArrayList<>();
        for (Object object:map.keySet()){
            /*try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }*/
            Integer temp = Integer.parseInt((String) object);
            WebsiteconfigurationEO websiteconfigurationEO = new WebsiteconfigurationEO();
            switch (temp){
                case 1:
                case 2:
                case 5:
                    try {
                        websiteconfigurationEO=saveInImageURL(map,temp,websiteconfigurationEO);
                    }catch (Exception e){
                        System.out.println("12510");
                        break;
                    }
                    break;
                case 3:
                case 4:
                    try {
                        websiteconfigurationEO=saveInContent(map,temp,websiteconfigurationEO);
                    }catch (Exception e){
                        System.out.println("34");
                        break;
                    }
                    break;
                case 6:
                case 7:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 25:
                case 27:
                    try {
                        websiteconfigurationEO=saveInExplicitState(map,temp,websiteconfigurationEO);
                    }catch (Exception e){
                        System.out.println("67");
                        break;
                    }
                    break;
                case 10:
                    websiteconfigurationEO.setExplicitstate(Integer.parseInt((String)((List)map.get(temp.toString())).get(0)));
                    websiteconfigurationEO.setImageurl((String)((List)map.get(temp.toString())).get(1));
                    websiteconfigurationEO.setSavetime(new Date());
                    websiteconfigurationEO.setConfigurationtype(temp);
                    break;
                case 26:
                case 24:
                    try {
                        websiteconfigurationEO.setExplicitstate(Integer.parseInt((String)((List)map.get(temp.toString())).get(0)));
                        websiteconfigurationEO.setLimitquantity(Integer.parseInt((String)((List)map.get(temp.toString())).get(1)));
                        websiteconfigurationEO.setSavetime(new Date());
                        websiteconfigurationEO.setConfigurationtype(temp);
                    }catch (Exception e){
                        System.out.println("25："+e.getMessage());
                        break;
                    }
                    break;
                case 8:
                    try {
                        websiteconfigurationEO.setImageurl((String)((List)map.get(temp.toString())).get(0));
                        websiteconfigurationEO.setContent((String)((List)map.get(temp.toString())).get(1));
                        websiteconfigurationEO.setSavetime(new Date());
                        websiteconfigurationEO.setConfigurationtype(temp);
                    }catch (Exception e){
                        System.out.println("8"+e.getMessage());
                        break;
                    }
                    break;
                case 28:
                    try {
                        websiteconfigurationEO.setExplicitstate(Integer.parseInt((String)((List)map.get(temp.toString())).get(0)));
                        websiteconfigurationEO.setLimitquantity(Integer.parseInt((String)((List)map.get(temp.toString())).get(1)));
                        websiteconfigurationEO.setEffective(Integer.parseInt((String)((List)map.get(temp.toString())).get(2)));
                        websiteconfigurationEO.setSavetime(new Date());
                        websiteconfigurationEO.setConfigurationtype(temp);
                    }catch (Exception e){
                        System.out.println("28"+e.getMessage());
                        break;
                    }
                    break;
            }
            if (websiteconfigurationEO!=null&&websiteconfigurationEO.getConfigurationtype()!=null){
                list.add(websiteconfigurationEO);
            }
        }
        Integer temp = null;
        try {
            temp = dao.updataInfoList(list);
        }catch (Exception e){
            System.out.println("保存信息出错："+e.getMessage());
            throw e;
        }
        return null;
    }

    /*
    * 2018-3-30
    * 李云强
    * 将数据库数据按照前台需要的json格式包装好
    * */
    public Map getAllInfo(){
        Map map = new HashMap();
        List<WebsiteconfigurationEO> list;
        WebsiteconfigurationEO websiteconfigurationEO = new WebsiteconfigurationEO();
        try {
            list = dao.selectAllInfo();
        }catch (Exception e){
            System.out.println("查询数据报错："+e.getMessage());
            return null;
        }
        for (WebsiteconfigurationEO web:list
                ) {
            Integer temp = web.getConfigurationtype();
            Object object = null;
           /* try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }*/
            switch (temp){
                case 1:
                case 2:
                case 5:
                    object = web.getImageurl();
                    break;
                case 3:
                case 4:
                    object = web.getContent();
                    break;
                case 6:
                case 7:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 25:
                case 27:
                    object = web.getExplicitstate();
                    break;
                case 10:
                    List list4 = new ArrayList();
                    list4.add(web.getExplicitstate());
                    list4.add(web.getImageurl());
                    object = list4;
                    break;
                case 26:
                case 24:
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(web.getExplicitstate());
                    if (web.getLimitquantity()==null||web.getLimitquantity()==0){
                        list1.add(null);
                    }else {
                        list1.add(web.getLimitquantity());
                    }
                    object = list1;
                    break;
                case 8:
                    List<String> list2 = new ArrayList<>();
                    list2.add(web.getImageurl());
                    list2.add(web.getContent());
                    object = list2;
                    break;
                case 28:
                    List<Integer> list3 = new ArrayList<>();
                    list3.add(web.getExplicitstate());
                    if (web.getLimitquantity()==null||web.getLimitquantity()==0){
                        list3.add(null);
                    }else {
                        list3.add(web.getLimitquantity());
                    }
                    if (web.getEffective()==null||web.getEffective()==0){
                        list3.add(null);
                    }else {
                        list3.add(web.getEffective());
                    }
                    object=list3;
                    break;
                default:break;
            }
            map.put(temp,object);
        }
        return map;
    }
    //将信息保存到ImageUrl字段上
    private WebsiteconfigurationEO saveInImageURL(Map map,Integer key,WebsiteconfigurationEO websiteconfigurationEO){
        try {
            websiteconfigurationEO.setConfigurationtype(key);
            websiteconfigurationEO.setImageurl((String) map.get(key.toString()));
            websiteconfigurationEO.setSavetime(new Date());
        }catch (Exception e){
            return null;
        }
        return websiteconfigurationEO;
    }

    //将信息保存到Content字段上
    private WebsiteconfigurationEO saveInContent(Map map,Integer key,WebsiteconfigurationEO websiteconfigurationEO){
        try {
            websiteconfigurationEO.setConfigurationtype(key);
            websiteconfigurationEO.setContent((String) map.get(key.toString()));
            websiteconfigurationEO.setSavetime(new Date());
        }catch (Exception e){
            return null;
        }
        return websiteconfigurationEO;
    }

    //将信息保存到ExplicitState字段上
    private WebsiteconfigurationEO saveInExplicitState(Map map,Integer key,WebsiteconfigurationEO websiteconfigurationEO){
        try {
            websiteconfigurationEO.setConfigurationtype(key);
            websiteconfigurationEO.setExplicitstate((Integer) map.get(key.toString()));
            websiteconfigurationEO.setSavetime(new Date());
        }catch (Exception e){
            return null;
        }
        return websiteconfigurationEO;
    }

    //将信息保存到Title字段上
    private WebsiteconfigurationEO saveInTitle(Map map,Integer key,WebsiteconfigurationEO websiteconfigurationEO){
        try {
            websiteconfigurationEO.setConfigurationtype(key);
            websiteconfigurationEO.setTitle((String) map.get(key.toString()));
            websiteconfigurationEO.setSavetime(new Date());
        }catch (Exception e){
            return null;
        }
        return websiteconfigurationEO;
    }

    //将信息保存到ProcessSequenceNUmber字段上
    private WebsiteconfigurationEO saveInProcessSequenceNUmber(Map map,Integer key,WebsiteconfigurationEO websiteconfigurationEO){
        try {
            websiteconfigurationEO.setConfigurationtype(key);
            websiteconfigurationEO.setProcesssequencenumber((Integer) map.get(key.toString()));
            websiteconfigurationEO.setSavetime(new Date());
        }catch (Exception e){
            return null;
        }
        return websiteconfigurationEO;
    }

    //将信息保存到LimitQuantity字段上
    private WebsiteconfigurationEO saveInLimitQuantity(Map map,Integer key,WebsiteconfigurationEO websiteconfigurationEO){
        try {
            websiteconfigurationEO.setConfigurationtype(key);
            websiteconfigurationEO.setLimitquantity((Integer) map.get(key.toString()));
            websiteconfigurationEO.setSavetime(new Date());
        }catch (Exception e){
            return null;
        }

        return websiteconfigurationEO;
    }

    //将信息保存到Effective字段上
    private WebsiteconfigurationEO saveInEffective(Map map,Integer key,WebsiteconfigurationEO websiteconfigurationEO){
        try {
            websiteconfigurationEO.setConfigurationtype(key);
            websiteconfigurationEO.setEffective((Integer) map.get(key.toString()));
            websiteconfigurationEO.setSavetime(new Date());
        }catch (Exception e){
            return null;
        }

        return websiteconfigurationEO;
    }
}
