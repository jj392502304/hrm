package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.NodeapproverEO;
import com.adc.da.workflow.page.NodeapproverEOPage;
import com.adc.da.workflow.service.NodeapproverEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/nodeapprover")
@Api(description = "|NodeapproverEO|")
public class NodeapproverEOController extends BaseController<NodeapproverEO>{

    private static final Logger logger = LoggerFactory.getLogger(NodeapproverEOController.class);

    @Autowired
    private NodeapproverEOService nodeapproverEOService;

	@ApiOperation(value = "|NodeapproverEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:nodeapprover:page")
    public ResponseMessage<PageInfo<NodeapproverEO>> page(NodeapproverEOPage page) throws Exception {
        List<NodeapproverEO> rows = nodeapproverEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|NodeapproverEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:nodeapprover:list")
    public ResponseMessage<List<NodeapproverEO>> list(NodeapproverEOPage page) throws Exception {
        return Result.success(nodeapproverEOService.queryByList(page));
	}

    @ApiOperation(value = "|NodeapproverEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:nodeapprover:save")
    public ResponseMessage<NodeapproverEO> create(@RequestBody NodeapproverEO nodeapproverEO) throws Exception {
        nodeapproverEOService.insertSelective(nodeapproverEO);
        return Result.success(nodeapproverEO);
    }

}
