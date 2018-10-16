package com.adc.da.file.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adc.da.file.entity.FileEO;
import com.adc.da.file.service.FileEOService;
import com.adc.da.file.store.IFileStore;
import com.adc.da.util.exception.AdcDaBaseException;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.Encodes;
import com.adc.da.util.utils.IOUtils;
import com.adc.da.util.utils.StringUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@RestController
//@RequestMapping(value = "/${restPath}/sys/file")
//@Api(description = "文件下载")
public class FileDownloadRestController {

	private static final Logger logger = LoggerFactory.getLogger(FileDownloadRestController.class);

	@Autowired
	private FileEOService fileEOService;

	@Autowired
	private IFileStore iFileStore;

	@ApiOperation(value = "|FileEO|详情")
	@GetMapping("/{fileId}")
	// @RequiresPermissions("sys:file:get")
	public ResponseMessage<FileEO> getById(@NotNull @PathVariable("fileId") String fileId) throws Exception {
		return Result.success(fileEOService.selectByPrimaryKey(fileId));
	}

	@ApiOperation(value = "|FileEO|下载")
	@GetMapping("/{fileId}/download")
	// @RequiresPermissions("sys:file:download")
	public void downFile(HttpServletResponse response, @NotNull @PathVariable("fileId") String fileId,
			String fileName) throws Exception {
		if (StringUtils.isEmpty(fileId)) {
			throw new AdcDaBaseException("FileId不能为空");
		}

		FileEO sysFileEO = fileEOService.selectByPrimaryKey(fileId);
		if (sysFileEO == null) {
			throw new AdcDaBaseException("FileId[" + fileId + "]不存在");
		}

		InputStream is = null;
		OutputStream os = null;
		try {
			if (StringUtils.isEmpty(fileName)) {
				fileName = sysFileEO.getFileName() + "." + sysFileEO.getFileType();
			}

			response.setHeader("Content-Disposition", "attachment; filename=" + Encodes.urlEncode(fileName));
			response.setContentType(sysFileEO.getContentType());
			is = iFileStore.loadFile(sysFileEO.getSavePath());
			os = response.getOutputStream();
			IOUtils.copy(is, os);
			os.flush();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			throw new AdcDaBaseException("下载文件失败，请重试");
		} finally {
			IOUtils.closeQuietly(is);
			IOUtils.closeQuietly(os);
		}
	}
}
