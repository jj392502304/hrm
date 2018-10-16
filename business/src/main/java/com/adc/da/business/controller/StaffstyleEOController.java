package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.StaffstyleEO;
import com.adc.da.business.page.StaffstyleEOPage;
import com.adc.da.business.service.StaffstyleEOService;
import com.adc.da.business.util.BindingResultUtils;
import com.adc.da.util.http.PageInfo;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.DateUtils;
import com.adc.da.util.utils.UUID;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.text.*;
import java.util.Calendar;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;


@RestController
@RequestMapping("/${restPath}/business/staffstyle")
@Api(description = "|StaffstyleEO|")
public class StaffstyleEOController extends BaseController<StaffstyleEO>{

    private static final Logger logger = LoggerFactory.getLogger(StaffstyleEOController.class);

    @Autowired
    private StaffstyleEOService staffstyleEOService;

    /**
     * 根据顺序号分页显示员工信息列表
     * @return
     * @MethodName:
     * @author: shihuanying
     * @date 2018/3/29 14:16
     * @version V1.0
     */

    @ApiOperation(value = "|StaffstyleEO|分页查询")
    @GetMapping("/StaffStyleSelect/page")
   // @RequiresPermissions("manager:staffstyle:page")
    public ResponseMessage<PageInfo<StaffstyleEO>> page(StaffstyleEOPage page) throws Exception {
        page.setOrder("asc");
        page.setOrderBy("sequencenumber");
        page.setPageSize(2);
        List<StaffstyleEO> rows = staffstyleEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

    /**
     * 显示详情列表
     * @return
     * @MethodName:
     * @author: shihuanying
     * @date 2018/3/29 14:16
     * @version V1.0
    */
    @ApiOperation(value = "|StaffstyleEO|查询")
    @GetMapping("/selectStaffstyleList")
    //@RequiresPermissions("manager:staffstyle:list")
    public ResponseMessage<List<StaffstyleEO>> list(StaffstyleEOPage page) throws Exception {
        return Result.success(staffstyleEOService.queryByList(page));
    }

    /**
     * 对员工风采进行新增及修改  双参的原因是把实体类的类名传输进去
     * @return
     * @MethodName:
     * @author: shihuanying
     * @date 2018/3/29 13:23
     * @version V1.0
    */
    @ApiOperation(value = "|StaffstyleEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, value = {"/staffStyleSave"})
    //@RequiresPermissions("manager:staffstyle:save")
    public ResponseMessage<?> create(@Validated @RequestBody StaffstyleEO staffstyleEO,
            BindingResult errors) throws Exception {
            if(errors.hasErrors()){
                return BindingResultUtils.bindingResult(errors,StaffstyleEO.class.getName());
            }else {
                staffstyleEO.setPkstaffstyle(UUID.randomUUID());
                staffstyleEOService.insertSelective(staffstyleEO);
                return Result.success(staffstyleEO);
            }
    }

    @ApiOperation(value = "|AnnounceEO|更新")
    @PutMapping("/staffStyleModify")
    public ResponseMessage<?> update(@Validated @RequestBody StaffstyleEO staffstyleEO,
        BindingResult errors) throws Exception {
        if(errors.hasErrors()){
            return BindingResultUtils.bindingResult(errors,StaffstyleEO.class.getName());
        }else {
            staffstyleEOService.updateByPrimaryKey(staffstyleEO);
            return Result.success(staffstyleEO);
        }
    }

    /**
     *员工列表中批量删除员工信息
     * @param pkStaffStyles 员工信息主键
     * @return
     * @throws Exception
     * @author: shihuanying
     * @date 2018/3/29 13:23
     */
    @ApiOperation(value = "|AnnounceEO|批量删除")
    @DeleteMapping("/StaffStyleDelete")
    //@RequiresPermissions("manager:staffstyle:delete")
    public ResponseMessage delete(@RequestBody String pkStaffStyles) throws Exception {
        String[] strings=pkStaffStyles.split(",");
        List<String> pkStaffs= Arrays.asList(strings);
        staffstyleEOService.deleteStaffList(pkStaffs);
       // logger.info("delete from ANNOUNCE where pkannounce = {}", pkstaffstyle);
        return Result.success();
    }

}


