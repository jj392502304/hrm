package com.adc.da.workflow.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.workflow.entity.NodetrackingEO;
import com.adc.da.workflow.page.NodetrackingEOPage;
import com.adc.da.workflow.service.NodetrackingEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/${restPath}/workflow/nodetracking")
@Api(description = "|NodetrackingEO|")
public class NodetrackingEOController extends BaseController<NodetrackingEO>{

    private static final Logger logger = LoggerFactory.getLogger(NodetrackingEOController.class);

    @Autowired
    private NodetrackingEOService nodetrackingEOService;

	@ApiOperation(value = "|NodetrackingEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("workflow:nodetracking:page")
    public ResponseMessage<PageInfo<NodetrackingEO>> page(NodetrackingEOPage page) throws Exception {
        List<NodetrackingEO> rows = nodetrackingEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|NodetrackingEO|查询")
    @GetMapping("")
    @RequiresPermissions("workflow:nodetracking:list")
    public ResponseMessage<List<NodetrackingEO>> list(NodetrackingEOPage page) throws Exception {
        return Result.success(nodetrackingEOService.queryByList(page));
	}

    @ApiOperation(value = "|NodetrackingEO|详情")
    @GetMapping("/{nodetrackingprimarykey}")
    @RequiresPermissions("workflow:nodetracking:get")
    public ResponseMessage<NodetrackingEO> find(@PathVariable String nodetrackingprimarykey) throws Exception {
        return Result.success(nodetrackingEOService.selectByPrimaryKey(nodetrackingprimarykey));
    }

    @ApiOperation(value = "|NodetrackingEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:nodetracking:save")
    public ResponseMessage<NodetrackingEO> create(@RequestBody NodetrackingEO nodetrackingEO) throws Exception {
        nodetrackingEOService.insertSelective(nodetrackingEO);
        return Result.success(nodetrackingEO);
    }

    @ApiOperation(value = "|NodetrackingEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("workflow:nodetracking:update")
    public ResponseMessage<NodetrackingEO> update(@RequestBody NodetrackingEO nodetrackingEO) throws Exception {
        nodetrackingEOService.updateByPrimaryKeySelective(nodetrackingEO);
        return Result.success(nodetrackingEO);
    }

    @ApiOperation(value = "|NodetrackingEO|删除")
    @DeleteMapping("/{nodetrackingprimarykey}")
    @RequiresPermissions("workflow:nodetracking:delete")
    public ResponseMessage delete(@PathVariable String nodetrackingprimarykey) throws Exception {
        nodetrackingEOService.deleteByPrimaryKey(nodetrackingprimarykey);
        logger.info("delete from NODETRACKING where nodetrackingprimarykey = {}", nodetrackingprimarykey);
        return Result.success();
    }

}
