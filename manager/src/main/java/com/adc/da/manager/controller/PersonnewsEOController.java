package com.adc.da.manager.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.io.UnsupportedEncodingException;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adc.da.base.web.BaseController;

import com.adc.da.manager.entity.PersonnewsEO;
import com.adc.da.manager.entity.UserNewsSelectEO;
import com.adc.da.manager.entity.UserlogEO;
import com.adc.da.manager.page.PersonnewsEOPage;
import com.adc.da.manager.service.PersonnewsEOService;
import com.adc.da.util.http.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/${restPath}/manager/personnews")
@Api(description = "|PersonnewsEO|")
public class PersonnewsEOController extends BaseController<PersonnewsEO> {

    private static final Logger logger = LoggerFactory.getLogger(PersonnewsEOController.class);

    @Autowired
    private PersonnewsEOService personnewsEOService;

    @ApiOperation(value = "|PersonnewsEO|分页查询")
    @GetMapping("/page")
    public ResponseMessage<PageInfo<PersonnewsEO>> page(PersonnewsEOPage page) throws Exception {
        List<PersonnewsEO> rows = personnewsEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

    @ApiOperation(value = "|PersonnewsEO|查询")
    @GetMapping("")
    public ResponseMessage<List<PersonnewsEO>> list(PersonnewsEOPage page) throws Exception {
        return Result.success(personnewsEOService.queryByList(page));
    }

    @ApiOperation(value = "|PersonnewsEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<PersonnewsEO> create(@RequestBody PersonnewsEO personnewsEO) throws Exception {
        personnewsEOService.insertSelective(personnewsEO);
        return Result.success(personnewsEO);
    }
    @ApiOperation(value = "|PersonnewsEO|信息查询")
    @PostMapping(value="/UserLogin/UserLoginSelect")
    public ResponseMessage userNewsSelect(@RequestParam int index,@RequestParam int offset,@RequestParam String name ,@RequestParam String state) throws  ParseException {
        Map<String,Object> map=new HashMap<>();
        int count=personnewsEOService.getCount();
        if(("".equals(name)||name==null)&&(state==null||"".equals(state))){
        //得到所有用户信息
            List<UserNewsSelectEO> list=personnewsEOService.userNewsSelect(index,offset);
            map.put("User",list);
            map.put("count",count);
            return Result.success(map);
        }
        else{
            List<UserNewsSelectEO> list = personnewsEOService.userNewsVagueSelect(index, offset, name, state);
            map.put("User", list);
            map.put("count",count);
            return Result.success(map);
        }
    }
    @ApiOperation(value = "|PersonnewsEO|删除用户")
    @PostMapping(value="/UserLogin/UserLoginDelete")
    public ResponseMessage userNewsDelete(@RequestParam String personNewsID){
        //判断登录日志里是否存在数据
        List<UserlogEO> list=personnewsEOService.loginLogSelect(personNewsID);
        if(list.size()==0){
            personnewsEOService.userNewsDelete(personNewsID);
            return Result.success(true);
        }
        else{
            return Result.success("该用户不能删除");
        }

    }
}
