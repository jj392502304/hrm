package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.NodeattributeEO;
import com.adc.da.workflow.page.NodeattributeEOPage;
import com.adc.da.workflow.service.NodeattributeEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/nodeattribute")
@Api(description = "|NodeattributeEO|")
public class NodeattributeEOController extends BaseController<NodeattributeEO>{

    private static final Logger logger = LoggerFactory.getLogger(NodeattributeEOController.class);

    @Autowired
    private NodeattributeEOService nodeattributeEOService;

	@ApiOperation(value = "|NodeattributeEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:nodeattribute:page")
    public ResponseMessage<PageInfo<NodeattributeEO>> page(NodeattributeEOPage page) throws Exception {
        List<NodeattributeEO> rows = nodeattributeEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|NodeattributeEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:nodeattribute:list")
    public ResponseMessage<List<NodeattributeEO>> list(NodeattributeEOPage page) throws Exception {
        return Result.success(nodeattributeEOService.queryByList(page));
	}

    @ApiOperation(value = "|NodeattributeEO|详情")
    @GetMapping("/{attributekey}")
    @RequiresPermissions("workflow:nodeattribute:get")
    public ResponseMessage<NodeattributeEO> find(@PathVariable String attributekey) throws Exception {
        return Result.success(nodeattributeEOService.selectByPrimaryKey(attributekey));
    }

    @ApiOperation(value = "|NodeattributeEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:nodeattribute:save")
    public ResponseMessage<NodeattributeEO> create(@RequestBody NodeattributeEO nodeattributeEO) throws Exception {
        nodeattributeEOService.insertSelective(nodeattributeEO);
        return Result.success(nodeattributeEO);
    }

    @ApiOperation(value = "|NodeattributeEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:nodeattribute:update")
    public ResponseMessage<NodeattributeEO> update(@RequestBody NodeattributeEO nodeattributeEO) throws Exception {
        nodeattributeEOService.updateByPrimaryKeySelective(nodeattributeEO);
        return Result.success(nodeattributeEO);
    }

    @ApiOperation(value = "|NodeattributeEO|删除")
    @DeleteMapping("/{attributekey}")
    @RequiresPermissions("workflow:nodeattribute:delete")
    public ResponseMessage delete(@PathVariable String attributekey) throws Exception {
        nodeattributeEOService.deleteByPrimaryKey(attributekey);
        logger.info("delete from NODEATTRIBUTE where attributekey = {}", attributekey);
        return Result.success();
    }

}
