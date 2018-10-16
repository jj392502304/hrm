package com.adc.da.file.store;

import java.io.IOException;
import java.io.InputStream;

public interface IFileStore {

	/**
	 * 存储文件，并返回文件相对路径
	 *
	 * @param is
	 *            文件IS流
	 * @param fileExtension
	 *            文件后缀名
	 * @return 文件相对路径
	 */
	String storeFile(InputStream is, String fileExtension, String filePath) throws IOException;

	/**
	 * 根据传入的路径返回文件
	 *
	 * @param path
	 *            相对路径
	 * @return
	 */
	InputStream loadFile(String path);

	/**
	 * 根据传入的路径返回二进制数据
	 *
	 * @param path
	 *            相对路径
	 * @return
	 */
	byte[] loadFileBytes(String path);

}
