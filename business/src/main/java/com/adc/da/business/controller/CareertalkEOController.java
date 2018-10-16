package com.adc.da.business.controller;

import static org.apache.logging.log4j.ThreadContext.isEmpty;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.*;

import com.adc.da.business.util.IsEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.CareertalkEO;
import com.adc.da.business.page.CareertalkEOPage;
import com.adc.da.business.service.CareertalkEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import sun.plugin2.message.Message;

@RestController
@RequestMapping("/${restPath}/business/careertalk")
@Api(description = "|CareertalkEO|")
public class CareertalkEOController extends BaseController<CareertalkEO>{

    private static final Logger logger = LoggerFactory.getLogger(CareertalkEOController.class);

    @Autowired
    private CareertalkEOService careertalkEOService;

	/*@ApiOperation(value = "|CareertalkEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:careertalk:page")
    public ResponseMessage<PageInfo<CareertalkEO>> page(CareertalkEOPage page) throws Exception {
        List<CareertalkEO> rows = careertalkEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|CareertalkEO|查询")
    @GetMapping("")
    @RequiresPermissions("business:careertalk:list")
    public ResponseMessage<List<CareertalkEO>> list(CareertalkEOPage page) throws Exception {
        return Result.success(careertalkEOService.queryByList(page));
	}

    @ApiOperation(value = "|CareertalkEO|详情")
    @GetMapping("/{pkcareertalk}")
    @RequiresPermissions("business:careertalk:get")
    public ResponseMessage<CareertalkEO> find(@PathVariable String pkcareertalk) throws Exception {
        return Result.success(careertalkEOService.selectByPrimaryKey(pkcareertalk));
    }

    @ApiOperation(value = "|CareertalkEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:careertalk:save")
    public ResponseMessage<CareertalkEO> create(@RequestBody CareertalkEO careertalkEO) throws Exception {
        careertalkEOService.insertSelective(careertalkEO);
        return Result.success(careertalkEO);
    }

    @ApiOperation(value = "|CareertalkEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:careertalk:update")
    public ResponseMessage<CareertalkEO> update(@RequestBody CareertalkEO careertalkEO) throws Exception {
        careertalkEOService.updateByPrimaryKeySelective(careertalkEO);
        return Result.success(careertalkEO);
    }

    @ApiOperation(value = "|CareertalkEO|删除")
    @DeleteMapping("/{pkcareertalk}")
    @RequiresPermissions("business:careertalk:delete")
    public ResponseMessage delete(@PathVariable String pkcareertalk) throws Exception {
        careertalkEOService.deleteByPrimaryKey(pkcareertalk);
        logger.info("delete from CAREERTALK where pkcareertalk = {}", pkcareertalk);
        return Result.success();
    }*/

    /**
     * 宣讲会增加方法
     * @param careertalkEO  宣讲会实体类对象
     * @return
     */
	@ApiOperation("|CareertalkEO|宣讲会增加")
    @PostMapping("CAREERTALK/CAREERTALKSave")
    public ResponseMessage insert(CareertalkEO careertalkEO){
	    String result="";
	    if(IsEmpty.isEmpty(true,careertalkEO.getCity() ,careertalkEO.getSchool() ,careertalkEO.getCampus() ,careertalkEO.getArea())){
            if(careertalkEO.getSchooldate()!=null&&careertalkEO.getSchooltime()!=null){
                if(careertalkEO.getIntroduce()!=null){
                    result = careertalkEOService.careertalkManager(careertalkEO);
                }else{
                    result="介绍为空";
                }
            }else{
                result="时间、日期不能为空";
            }

        }else{
            result="参数不能为空";
        }
	    return Result.success(result);
    }

    /**
     * 宣讲会修改
     * @param careertalkEO  宣讲会实体类对象
     * @return
     */
    @ApiOperation("|CareertalkEO|宣讲会修改")
    @PostMapping("CAREERTALK/CAREERTALKModify")
    public ResponseMessage update(CareertalkEO careertalkEO){
        String result="";
        if(IsEmpty.isEmpty(true,careertalkEO.getPkcareertalk(),careertalkEO.getCity() ,careertalkEO.getSchool() ,careertalkEO.getCampus() ,careertalkEO.getArea())){
            if(careertalkEO.getSchooldate()!=null&&careertalkEO.getSchooltime()!=null){
                if (careertalkEO.getSequencenumber()!=null){
                    result=careertalkEOService.careertalkManager(careertalkEO);
                }else{
                    result="介绍不能为空";
                }
            }else{
                result="时间、日期、介绍不能为空";
            }
        }else{
            result="参数不能为空";
        }
        return Result.success(result);
    }


    /**
     * 宣讲会删除
     * @param careertalkEO 宣讲会实体对象
     * @return
     */
    @ApiOperation(value = "|CareertalkEO|宣讲会删除")
    @PostMapping("CAREERTALK/CAREERTALKDelete")
    public ResponseMessage delete(CareertalkEO careertalkEO){
	    String result="";
	    if(careertalkEO.getPkcareertalk()!=null||"".equals(careertalkEO.getPkcareertalk())){
	        careertalkEOService.careertalkDelete(careertalkEO);
	        result="删除成功";
        }else {
	        result="请求为空";
        }
	    return Result.success(result);
    }


    /**
     * 宣讲会根据sequencenumber升序查询
     * @return
     */
    @ApiOperation("|CareertalkEO|宣讲会查询")
    @PostMapping("CAREERTALK/CAREERTALKSelect")
    ResponseMessage<List<CareertalkEO>> selectAll() {
        List<CareertalkEO> careertalkEOList = new ArrayList<CareertalkEO>();
        careertalkEOList=careertalkEOService.careertalkSelect();
        return Result.success(careertalkEOList);
    }




}
