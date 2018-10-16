package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import com.adc.da.business.entity.AnnounceEO;
import com.adc.da.business.page.AnnounceEOPage;
import com.adc.da.business.service.AnnounceEOService;
import com.adc.da.business.util.BindingResultUtils;
import com.adc.da.util.http.ResponseMessageCodeEnum;
import com.adc.da.util.utils.DateUtils;
import com.adc.da.util.utils.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.adc.da.base.web.BaseController;


import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * 2018-3-26
 * sun liuenyuan

 *保存：ANNOUNCE/ANNOUNCESave
 修改：ANNOUNCE/ANNOUNCEModify
 删除：ANNOUNCE/ANNOUNCEDelete
 发布：ANNOUNCE/ANNOUNCERelease
 取消发布：ANNOUNCE/ANNOUNCEQuxRelease
 查询：ANNOUNCE/ANNOUNCESelect【自动过滤掉发布到期】
 * **/

@RestController
@RequestMapping("/sys/TS_ANNOUNCE")
@Api(description = "|AnnounceEO|公告通知")
public class AnnounceEOController extends BaseController<AnnounceEO>{

    private static final Logger logger = LoggerFactory.getLogger(AnnounceEOController.class);

    @Autowired
    private AnnounceEOService announceEOService;

    /**
     *2018-3-27
     * sun liuenyuan
     * 功能：求职网网站配置通知公告接口
     * 查询
     * 移动端查询接口：WEBSITECONFIGURATION/MoveWEBSITECONFIGUR
     * PC端查询接口：WEBSITECONFIGURATION/PCWEBSITECONFIGURATIONSelect
     * 查询：自动过滤掉发布过期：ANNOUNCE/ANNOUNCESelect
     * **/
	@ApiOperation(value = "|AnnounceEO|分页查询")
    @GetMapping(value = {"WEBSITECONFIGURATION/PCWEBSITECONFIGURATIONSelect/page","WEBSITECONFIGURATION/MoveWEBSITECONFIGURATIONSelect/page",
            "ANNOUNCE/ANNOUNCESelect"})


    public ResponseMessage<PageInfo<AnnounceEO>> page(AnnounceEOPage page) throws Exception {
	    if(page.getExpriytime1()==null){
            page.setExpriytime1(DateUtils.dateToString(new Date(System.currentTimeMillis()),DateUtils.yyyy_MM_dd_HH_mm_ss_EN));
        }

        List<AnnounceEO> rows = announceEOService.queryByPage(page);
        logger.info("超过过期时间: "+page.getExpriytime1());
        return Result.success(getPageInfo(page.getPager(), rows));
    }




    /**
	@ApiOperation(value = "|AnnounceEO|查询")
    @GetMapping("")
    public ResponseMessage<List<AnnounceEO>> list(AnnounceEOPage page) throws Exception {
        logger.info("过期时间:"+page.getExpriytime());
        if(page.getExpriytime()!=null){ //如果有到期时间,进入该条件
            page.setExpriytime1(DateUtils.dateToString(new Date(System.currentTimeMillis()),DateUtils.yyyy_MM_dd_HH_mm_ss_EN));
        }
        return Result.success(announceEOService.queryByList(page));
	}**/


    /**
     * 2018-3-27
     * sun liuenyuan
     * 通知公告详情
     * 通知公告详情接口pkAnnounce
     *
     * 前端显示：
     * 通知公告滚动条
     * **/
    @ApiOperation(value = "|AnnounceEO|详情")
    @GetMapping(value = {"WEBSITECONFIGURATION/PCWEBSITECONFIGURATIONSelect/{pkAnnounce}",
            "WEBSITECONFIGURATION/MoveWEBSITECONFIGURATIONSelect/{pkAnnounce}"})
    public ResponseMessage<AnnounceEO> find(@PathVariable String pkAnnounce) throws Exception {
        return Result.success(announceEOService.selectByPrimaryKey(pkAnnounce));
    }

    /**
     * 2018-3-27
     * sun liuenyuan
     * 通知公告保存
     * 通知保存接口：ANNOUNCESave
     * **/
    @ApiOperation(value = "|AnnounceEO|保存")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE,value = "/ANNOUNCESave")
    public ResponseMessage<?> create(@Validated @RequestBody AnnounceEO announceEO, BindingResult errors) throws Exception {
        if(errors.hasErrors()){ //如果字段验证有错误,该方法不会进入service层
            return BindingResultUtils.bindingResult(errors,AnnounceEO.class.getName());
        }else{
            announceEO.setPkannounce(UUID.randomUUID());
            announceEO.setCreatetime(new Date(System.currentTimeMillis()));
            logger.info(announceEO.toString());
            announceEOService.insertSelective(announceEO);
            return Result.success(announceEO);
        }
    }


    /**
     * 2018-3-27
     * sun liuenyuan
     * 通知公告修改
     * 修改接口ANNOUNCEModify
     * 发布接口ANNOUNCERelease
     * 未发布接口ANNOUNCEQuxRelease
     * **/
    @ApiOperation(value = "|AnnounceEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE,value = {"/ANNOUNCEModify","/ANNOUNCERelease","/ANNOUNCEQuxRelease"})
    public ResponseMessage<?> update(@Validated @RequestBody  AnnounceEO announceEO,BindingResult errors) throws Exception {
        if(errors.hasErrors()){
            return BindingResultUtils.bindingResult(errors,AnnounceEO.class.getName());
        }else{
            announceEOService.updateByPrimaryKeySelective(announceEO);
            return Result.success(announceEO);
        }
    }

    /**
     * 2018-3-27
     * sun liuenyuan
     * 通知公告删除
     * 删除接口名称pkAnnounce
     * **/
    @ApiOperation(value = "|AnnounceEO|删除")
    @DeleteMapping("/{pkAnnounce}")
    public ResponseMessage delete(@PathVariable String pkAnnounce) throws Exception {
        announceEOService.deleteByPrimaryKey(pkAnnounce);
        logger.info("delete from TS_ANNOUNCE where pkAnnounce = {}", pkAnnounce);
        return Result.success();
    }
    @ApiOperation(value = "|AnnounceEO|批量删除")
    @DeleteMapping("/deleteBatch")
    public ResponseMessage deleteAll(@RequestBody String pkannounce) throws Exception {

        String[] strings=pkannounce.split(",");
        List<String> list= Arrays.asList(strings);
        announceEOService.deleteBatchByPrimaryKeys(list);
        return Result.success();

    }

}
