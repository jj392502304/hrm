package com.adc.da.manager.uitl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class ImageUploadService {

    @Value("${IMAGE_SERVER_IP}")
    private String IMAGE_SERVER_IP;

    @Value("${ACCESS_IMAGE_PORT}")
    private String ACCESS_IMAGE_PORT;

    @Value("${IMAGE_SERVER_PORT}")
    private Integer IMAGE_SERVER_PORT;

    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;

    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;

    /*
    * 图片上传到ftp服务器
    * 参数：file--要上传的文件
    *       type--要保存到的文件夹
    * */
    public String uploadeLocalImage(MultipartFile file, String type) {
        String imageAccessUrl = null;
        String localAccessUrl = null;
        try {

            String filePath = "/" + type + "/" + new SimpleDateFormat("yyyy").format(new Date()) + "/"
                    + new SimpleDateFormat("MM").format(new Date()) + "/"
                    + new SimpleDateFormat("dd").format(new Date());

            String newFileName = IDUtils.genImageName()
                    + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            // 访问路径
            imageAccessUrl = type + "\\" + new SimpleDateFormat("yyyy").format(new Date()) + "\\"
                    + new SimpleDateFormat("MM").format(new Date()) + "\\"
                    + new SimpleDateFormat("dd").format(new Date());
            localAccessUrl = "http:\\\\" + IMAGE_SERVER_IP + ":" + ACCESS_IMAGE_PORT + "\\" + imageAccessUrl + "\\"
                    + newFileName;

            // 存入FTP路径
            FtpUtil.uploadFile(IMAGE_SERVER_IP, IMAGE_SERVER_PORT, FTP_USERNAME, FTP_PASSWORD, "/", filePath,
                    newFileName, file.getInputStream());
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("图片上传失败:"+e.getMessage());
            return "图片上传失败";
        }
        return localAccessUrl;

    }

    /**
     * 文件上传，供service中的代码调用
     *
     * @param bs
     * @param type
     * @return
     */
    public String uploadLocalImage(byte[] bs, String fileName, String type) {
        String imageAccessUrl;
        String localAccessUrl;
        try {
            String filePath = "/" + type + "/" + new SimpleDateFormat("yyyy").format(new Date()) + "/"
                    + new SimpleDateFormat("MM").format(new Date()) + "/"
                    + new SimpleDateFormat("dd").format(new Date());
            // String newFileName = IDUtils.genImageName() +
            // file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            // 访问路径
            imageAccessUrl = type + "\\" + new SimpleDateFormat("yyyy").format(new Date()) + "\\"
                    + new SimpleDateFormat("MM").format(new Date()) + "\\"
                    + new SimpleDateFormat("dd").format(new Date());
            localAccessUrl = "http:\\\\" + IMAGE_SERVER_IP + ":" + ACCESS_IMAGE_PORT + "\\" + imageAccessUrl + "\\"
                    + fileName;
            // 存入FTP路径
            FtpUtil.uploadFile(IMAGE_SERVER_IP, IMAGE_SERVER_PORT, FTP_USERNAME, FTP_PASSWORD, "/", filePath, fileName,
                    new ByteArrayInputStream(bs));
        } catch (Exception e) {
            e.printStackTrace();
            return "图片上传失败";
        }
        return localAccessUrl;
    }
}
