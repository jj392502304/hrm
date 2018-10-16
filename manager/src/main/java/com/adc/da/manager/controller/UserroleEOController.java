package com.adc.da.manager.controller;

import java.util.ArrayList;
import java.util.List;

import com.adc.da.manager.entity.UserRoleAndFunctionVO;
import com.adc.da.manager.uitl.IsEmpty;
import com.adc.da.util.http.ResponseMessageCodeEnum;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.manager.page.UserroleEOPage;
import com.adc.da.manager.service.UserroleEOService;
import com.adc.da.manager.entity.UserroleEO;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/${restPath}/manager/userrole")
@Api(description = "|UserroleEO|角色")
public class UserroleEOController extends BaseController<UserroleEO>{

    private static final Logger logger = LoggerFactory.getLogger(UserroleEOController.class);

    @Autowired
    private UserroleEOService userroleEOService;
    @ApiOperation(value = "|RoleSelect|全部查询")
    @PostMapping("RoleSelect")
    public ResponseMessage<List<UserroleEO>> RoleSelect(UserroleEOPage page) throws Exception {
        return Result.success(userroleEOService.queryByList(page));
    }
    @ApiOperation(value = "|RoleSave|新增修改角色")
    @PostMapping("RoleSave")
    public ResponseMessage<Boolean> RoleSave(@RequestBody UserRoleAndFunctionVO userRoleAndFunctionVO) throws Exception {
        if (!IsEmpty.isEmpty(true,userRoleAndFunctionVO.getRolename(),userRoleAndFunctionVO.getDescribe())){
            return Result.error("数据填写不全");
        }
        Integer temp=null;
        if (null == userRoleAndFunctionVO.getRoleprimarykey()||"undefined".equals(userRoleAndFunctionVO.getRoleprimarykey())){
            temp = userroleEOService.RoleSave(userRoleAndFunctionVO);
        }else {
            temp = userroleEOService.RoleModify(userRoleAndFunctionVO);
        }

        if (temp==null||temp<1){
            return Result.error();
        }
        return Result.success(ResponseMessageCodeEnum.SAVE_SUCCESS.getCode(),true);
    }
    @ApiOperation(value = "|RoleDelete|删除角色")
    @PostMapping("RoleDelete")
    public ResponseMessage<Boolean> RoleDelete(@RequestBody ArrayList<String> list) throws Exception {
        if (list==null||list.size()<1){
            return Result.error("传入数据有误");
        }
        Integer temp=userroleEOService.RoleDelete(list);
        if (temp==null||temp<1){
            return Result.error();
        }
        return Result.success(ResponseMessageCodeEnum.REMOVE_SUCCESS.getCode(),true);
    }
    /*@ApiOperation(value = "|RoleModify|修改角色")
    @PostMapping("RoleModify")
    public ResponseMessage<String> RoleModify(UserRoleAndFunctionVO PAFVO) throws Exception {
        if (!IsEmpty.isEmpty(true,PAFVO.getUserroleEO().getRoleprimarykey())&&PAFVO.getRolefunction()==null){
            return Result.error("传入数据有误");
        }
        Integer temp=userroleEOService.RoleModify(PAFVO);
        if (temp==null||temp<1){
            return Result.error("修改失败");
        }
        return Result.success(ResponseMessageCodeEnum.UPDATE_SUCCESS.getCode(),"删除成功");
    }*/
    @ApiOperation(value = "|checkIsUsed|检测角色存不存在")
    @PostMapping("checkIsUsed")
    public ResponseMessage<Boolean> checkIsUsed(@RequestBody UserroleEO userroleEO) throws Exception {
        if (!IsEmpty.isEmpty(true,userroleEO.getRolename())){
            return Result.error("传入数据有误");
        }
        Integer temp=userroleEOService.RoleIsEmpty(userroleEO);
        if (temp==null||temp<1){
            return Result.success(true);
        }
        return Result.success(false);
    }
    @ApiOperation(value = "|seleteRoleById|根据id查询角色信息")
    @PostMapping("seleteRoleById")
    public ResponseMessage<UserRoleAndFunctionVO> seleteRoleById(String roleprimarykey) throws Exception {
        System.out.println("***************************************************");
        if (!IsEmpty.isEmpty(true,roleprimarykey)){
            return Result.error("传入数据有误");
        }
        UserRoleAndFunctionVO userRoleAndFunctionVO=userroleEOService.seleteRoleById(roleprimarykey);
        if (userRoleAndFunctionVO==null){
            return Result.error();
        }
        return Result.success(userRoleAndFunctionVO);
    }
    /*#####################################下面是自动生成的############################################*/
	/*@ApiOperation(value = "|UserroleEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("manager:userrole:page")
    public ResponseMessage<PageInfo<UserroleEO>> page(UserroleEOPage page) throws Exception {
        List<UserroleEO> rows = userroleEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|UserroleEO|查询")
    @GetMapping("")
    @RequiresPermissions("manager:userrole:list")
    public ResponseMessage<List<UserroleEO>> list(UserroleEOPage page) throws Exception {
        return Result.success(userroleEOService.queryByList(page));
	}

    @ApiOperation(value = "|UserroleEO|详情")
    @GetMapping("/{roleprimarykey}")
    @RequiresPermissions("manager:userrole:get")
    public ResponseMessage<UserroleEO> find(@PathVariable String roleprimarykey) throws Exception {
        return Result.success(userroleEOService.selectByPrimaryKey(roleprimarykey));
    }

    @ApiOperation(value = "|UserroleEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:userrole:save")
    public ResponseMessage<UserroleEO> create(@RequestBody UserroleEO userroleEO) throws Exception {
        userroleEOService.insertSelective(userroleEO);
        return Result.success(userroleEO);
    }

    @ApiOperation(value = "|UserroleEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("manager:userrole:update")
    public ResponseMessage<UserroleEO> update(@RequestBody UserroleEO userroleEO) throws Exception {
        userroleEOService.updateByPrimaryKeySelective(userroleEO);
        return Result.success(userroleEO);
    }

    @ApiOperation(value = "|UserroleEO|删除")
    @DeleteMapping("/{roleprimarykey}")
    @RequiresPermissions("manager:userrole:delete")
    public ResponseMessage delete(@PathVariable String roleprimarykey) throws Exception {
        userroleEOService.deleteByPrimaryKey(roleprimarykey);
        logger.info("delete from USERROLE where roleprimarykey = {}", roleprimarykey);
        return Result.success();
    }*/

}
