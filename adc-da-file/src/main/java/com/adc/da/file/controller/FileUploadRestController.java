package com.adc.da.file.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.adc.da.file.entity.FileEO;
import com.adc.da.file.service.FileEOService;
import com.adc.da.file.store.IFileStore;
import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.utils.FileUtil;
import com.adc.da.util.utils.IOUtils;
import com.adc.da.util.utils.UUID;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@RestController
//@RequestMapping(value = "/${restPath}/sys/file")
//@Api(description = "文件上传")
public class FileUploadRestController {

	private static final Logger logger = LoggerFactory.getLogger(FileUploadRestController.class);

	@Autowired
	private FileEOService fileEOService;

	@Autowired
	private IFileStore iFileStore;

	// 上传文件类型允许白名单
	private List<String> whiteUrls;

	@PostConstruct
	public void init() {
		// 读取文件
		String path = FileUploadRestController.class.getResource("/").getFile();
		whiteUrls = FileUtil.readAsStringList(path + "white/uploadWhite.txt");
	}

	/**
	 * 文件上传
	 * @param filePath 指定文件上传路径，空则在根路径
	 * @return
	 * @throws Exception 
	 */
	@ApiOperation(value = "|FileEO|上传")
	@PostMapping("/upload")
	// @RequiresPermissions("sys:file:upload")
	public ResponseMessage<FileEO> upload(String filePath, String userId, @RequestParam("file") MultipartFile file) throws Exception {
		FileEO fileEO;
		InputStream is = null;
		try {
			String fileExtension = FileUtil.getFileExtension(file.getOriginalFilename());

			if (!whiteUrls.contains(fileExtension)) {
				logger.error("上传文件类型不允许，请重试");
				return Result.error("r0071", "上传文件类型不允许，请重试");
			}

			is = file.getInputStream();
			String path = iFileStore.storeFile(is, fileExtension, filePath);

			fileEO = new FileEO();
			fileEO.setFileId(UUID.randomUUID());
			fileEO.setFileName(FileUtil.getFileName(file.getOriginalFilename()));
			fileEO.setFileType(fileExtension);
			fileEO.setContentType(file.getContentType());
			fileEO.setSavePath(path);
			fileEO.setCreateTime(new Date());
			fileEO.setUserId(userId);
			fileEOService.insertSelective(fileEO);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			return Result.error("r0072", "文件存储失败，请重试");
		} finally {
			IOUtils.closeQuietly(is);
		}
		return Result.success(fileEO);
	}
}
