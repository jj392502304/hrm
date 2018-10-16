package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adc.da.business.dao.WebsiteconfigurationEODao;
import com.adc.da.business.entity.AnnounceEO;
import com.adc.da.business.entity.RecruitmentinformationEO;
import com.adc.da.business.page.AnnounceEOPage;
import com.adc.da.business.service.AnnounceEOService;
import com.adc.da.business.service.RecruitmentinformationEOService;
import com.adc.da.util.utils.DateUtils;
import org.bouncycastle.crypto.tls.MACAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.WebsiteconfigurationEO;
import com.adc.da.business.page.WebsiteconfigurationEOPage;
import com.adc.da.business.service.WebsiteconfigurationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/business/websiteconfiguration")
@Api(description = "|WebsiteconfigurationEO|网站配置")
public class WebsiteconfigurationEOController extends BaseController<WebsiteconfigurationEO>{

    private static final Logger logger = LoggerFactory.getLogger(WebsiteconfigurationEOController.class);

    @Autowired
    private WebsiteconfigurationEOService websiteconfigurationEOService;

    @Autowired
    private RecruitmentinformationEOService recruitmentinformationEOService;

    @Autowired
    private AnnounceEOService announceEOService;


    /**
     * 分页查询
     * sun
     * 20108-3-29
     *
     * 前端的动态的背景图片Logo和动态文字
     * **/
	@ApiOperation(value = "|WebsiteconfigurationEO|分页查询 ")
    @GetMapping("")
    @RequiresPermissions("business:websiteconfiguration:page")
    public ResponseMessage<PageInfo<WebsiteconfigurationEO>> page(WebsiteconfigurationEOPage page) throws Exception {

        List<WebsiteconfigurationEO> rows = websiteconfigurationEOService.queryByPage(page);
        page.setPageSize(30);
        return Result.success(getPageInfo(page.getPager(), rows));
    }


	@ApiOperation(value = "|WebsiteconfigurationEO|查询 根据配置类型查询")
    @GetMapping("/getPageItem")
    @RequiresPermissions("business:websiteconfiguration:list")
    public ResponseMessage<List<WebsiteconfigurationEO>> list(WebsiteconfigurationEOPage page) throws Exception {
		List<WebsiteconfigurationEO> rows =websiteconfigurationEOService.queryByList(page);
        return Result.success(rows);
	}

    @ApiOperation(value = "|WebsiteconfigurationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:websiteconfiguration:save")
    public ResponseMessage<WebsiteconfigurationEO> create(@RequestBody WebsiteconfigurationEO websiteconfigurationEO) throws Exception {
        websiteconfigurationEOService.insertSelective(websiteconfigurationEO);
        return Result.success(websiteconfigurationEO);
    }


    /**
     * 2018-3-27
     * sun jieyingjian
     * 对Recruitmenttype招聘类型字段进行去重查询1 校招 2社招  3研究生  4博士
     * **/

    @ApiOperation(value = "|AnnounceEO|去重查询 首页的下拉列表")
    @PostMapping(value = "/getRecruitmentType")
    @RequiresPermissions("business:websiteconfiguration:list")
    public ResponseMessage<List<RecruitmentinformationEO>> getRecruitmentType() throws Exception {
        return Result.success(recruitmentinformationEOService.listRecruitmentinformationEOByRecruitmenttype());
    }



    /**
     * 2018-3-27
     * sun jieyingjian
     * 根据配置类型Configuration字段查询
     * 并且根据ExplicitState查询数据
     *
     * **/
//    @ApiOperation(value = "|WebsiteconfigurationEO|根据配置类型查询")
//    @GetMapping("/getPageItem/{configurationType}")
//    @RequiresPermissions("business:websiteconfiguration:list")
//    public ResponseMessage<List<WebsiteconfigurationEODao>> getPageItem(@PathVariable Integer configurationType) throws Exception {
//        return Result.success(websiteconfigurationEOService.getPageItem(configurationType));
//    }

/**
 * sun
 * 2018-3-29
 * 前端是首页的公告查询（滚动的公告栏）
 *
 * **/
    @ApiOperation(value = "|AnnounceEO|公告查询（滚动公告栏）")
    @GetMapping(value = {"/getAnnounce"})
    public ResponseMessage<List<AnnounceEO>>  page(AnnounceEOPage page) throws Exception {
        if(page.getExpriytime1()==null){
            page.setExpriytime1(DateUtils.dateToString(new Date(System.currentTimeMillis()),DateUtils.yyyy_MM_dd_HH_mm_ss_EN));
        }
        List<AnnounceEO> rows = announceEOService.queryByPage(page);
        logger.info("超过过期时间: "+page.getExpriytime1());
        return Result.success(announceEOService.queryByList(page));
    }
    /***
     * 2018-3-29
     * 李云强
     * 网站配置信息保存
     * */
    @ApiOperation(value = "|saveWebAllInfo|网站配置信息保存")
    @PostMapping("/saveWebAllInfo")
    @RequiresPermissions("business:websiteconfiguration:page")
    public ResponseMessage<Boolean> saveWebAllInfo(@RequestBody HashMap map) throws Exception {
        try {
            Integer temp = websiteconfigurationEOService.saveWebsiteconfigurationInfo(map);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error();
        }
        return Result.success(true);
    }

    /***
     * 2018-3-29
     * 李云强
     * 网站配置信息获取
     * */
    @ApiOperation(value = "|getWebAllInfo|网站配置信息获取")
    @PostMapping("/getWebAllInfo")
    @RequiresPermissions("business:websiteconfiguration:page")
    public ResponseMessage<Map> getWebAllInfo() throws Exception {
        Map map = websiteconfigurationEOService.getAllInfo();
        if (map==null){
            return Result.error();
        }
        return Result.success(map);
    }


}
