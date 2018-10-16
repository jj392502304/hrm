package com.adc.da.business.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;



import com.adc.da.util.http.ResponseMessageCodeEnum;
import com.adc.da.util.utils.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.business.entity.ApplymemberEO;
import com.adc.da.business.page.ApplymemberEOPage;
import com.adc.da.business.service.ApplymemberEOService;
import com.adc.da.business.util.ApplymemberBlackListTypeEnum;
import com.adc.da.business.util.BindingResultUtils;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;



import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/${restPath}/business/applymember")
@Api(description = "|ApplymemberEO|应聘人员注册登录修改密码")
public class ApplymemberEOController extends BaseController<ApplymemberEO> {

    private static final Logger logger = LoggerFactory.getLogger(ApplymemberEOController.class);

    @Autowired
    private ApplymemberEOService applymemberEOService;

    @ApiOperation(value = "|ApplymemberEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("business:applymember:page")
    public ResponseMessage<PageInfo<ApplymemberEO>> page(ApplymemberEOPage page) throws Exception {
        List<ApplymemberEO> rows = applymemberEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

    /**
     *根据用户名对注册用户名进行查重
     * @return
     * @author: shihuanying
     * @date 2018/3/28 14:01
     * @version V1.0
    */
    @ApiOperation(value = "|ApplymemberEO|用户名查重")
    @GetMapping("/selectNameRegistered")
    @RequiresPermissions("business:applymember:list")
    public ResponseMessage<Boolean> selectNameRegistered(String account) throws Exception {
        Boolean flagAccount=false;
        if (account!=""||account!=null){
            if (applymemberEOService.selectNameRegistered(account).size()==0){
                flagAccount = true;
            }
        }
        return Result.success(flagAccount);
    }


    @ApiOperation(value = "|ApplymemberEO|查询")
    @GetMapping("/")
    @RequiresPermissions("business:applymember:list")
    public ResponseMessage<List<ApplymemberEO>> list(ApplymemberEOPage page) throws Exception {
        return Result.success(applymemberEOService.queryByList(page));
    }

    @ApiOperation(value = "|ApplymemberEO|详情")
    @GetMapping("/{applymemberkey}")
    @RequiresPermissions("business:applymember:get")
    public ResponseMessage<ApplymemberEO> find(@PathVariable String applymemberkey) throws Exception {
        return Result.success(applymemberEOService.selectByPrimaryKey(applymemberkey));
    }

    /**
     * 用户注册
     *
     * @return
     * @MethodName:
     * @author: shihuanying
     * @date 2018/3/28 10:28
     * @version V1.0
     */

    @ApiOperation(value = "|ApplymemberEO|注册")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, value = {"/Registered"})
    //@RequiresPermissions("business:applymember:save")
    public ResponseMessage<?> create(@Validated @RequestBody ApplymemberEO applymemberEO, BindingResult errors) throws Exception {
        if (errors.hasErrors()) {
            return BindingResultUtils.bindingResult(errors,ApplymemberEO.class.getName());

        } else {
            applymemberEO.setApplymemberkey(UUID.randomUUID());
            applymemberEOService.insertSelective(applymemberEO);
        }
        return Result.success(applymemberEO);
    }

    /**
     * 用户更改密码
     *
     * @return
     * @MethodName:
     * @author: shihuanying
     * @date 2018/3/28 10:28
     * @version V1.0
     */
    @ApiOperation(value = "|ApplymemberEO|用户更改密码")
    @PostMapping(value = {"/updatePwd"})
    //@RequiresPermissions("manager:websiteconfiguration:updatePwd")
    public ResponseMessage<ApplymemberEO> modifyApplymemberPassword(@RequestParam String newPassword,
                                                                    @RequestParam String account) {
        ApplymemberEO applymemberEO = new ApplymemberEO();
        applymemberEO.setPassword(newPassword);
        applymemberEO.setAccount(account);
        applymemberEOService.updateApplymemberPassword(newPassword, account);
        logger.info("after update password applymember: = {} " + applymemberEO);
        return Result.success("修改密码成功", applymemberEO);
    }


    /**
     * 网站配置之应聘人员登录,如果登录成功,将{@linkplain ApplymemberEO}放入session中,名字:"applyMember"
     *
     * @param account  应聘人员账户
     * @param applyMemberPassword 应聘人员密码
     * @author: shihuanying
     **/
    @ApiOperation(value = "|ApplymemberEO|用户登录")
    @PostMapping(value = {"/login"})
    //@RequiresPermissions("manager:websiteconfiguration:login")
    public ResponseMessage<ApplymemberEO> login(@RequestParam String account, @RequestParam String applyMemberPassword,
                                                HttpSession session) {
        ApplymemberEO applymemberEO = applymemberEOService.login(account, applyMemberPassword);
        if (applymemberEO == null) {
            return Result.error(ResponseMessageCodeEnum.VALID_ERROR.getCode(), "用户不存在|密码错误！");
        } else if (account != null && applymemberEO.getBlacklist() == ApplymemberBlackListTypeEnum.BLACK_LIST.getType()) {
            return Result.error(ResponseMessageCodeEnum.VALID_ERROR.getCode(), "用户登录禁止登录");
        } else {
            session.setAttribute("applyMember", applymemberEO); //放入Session中
            logger.info("after login: = {}" + session.getAttribute("applyMember"));
            return Result.success("用户登录成功", applymemberEO);
        }
    }

    /**
     * 用户注销
     *
     * @return
     * @MethodName:
     * @author: shihuanying
     * @date 2018/3/28 10:28
     * @version V1.0
     */
    @ApiOperation(value = "|ApplymemberEO|用户注销")
    @GetMapping(value = {"/logout"})
    //@RequiresPermissions("manager:websiteconfiguration:logout")
    public ResponseMessage<String> logout(HttpSession session) {
        logger.info("before logout: = {}" + session.getAttribute("applyMember"));
        session.invalidate();
        return Result.success(ResponseMessageCodeEnum.SUCCESS.getCode(),"用户注销成功");
    }


    @ApiOperation(value = "|ApplymemberEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("business:applymember:update")
    public ResponseMessage<ApplymemberEO> update(@RequestBody ApplymemberEO applymemberEO) throws Exception {
        applymemberEOService.updateByPrimaryKeySelective(applymemberEO);
        return Result.success(applymemberEO);
    }

    @ApiOperation(value = "|ApplymemberEO|删除")
    @DeleteMapping("/{applymemberkey}")
    @RequiresPermissions("business:applymember:delete")
    public ResponseMessage delete(@PathVariable String applymemberkey) throws Exception {
        applymemberEOService.deleteByPrimaryKey(applymemberkey);
        logger.info("delete from APPLYMEMBER where applymemberkey = {}", applymemberkey);
        return Result.success();
    }

}
