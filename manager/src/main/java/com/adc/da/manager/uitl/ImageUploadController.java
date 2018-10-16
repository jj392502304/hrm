package com.adc.da.manager.uitl;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/${restPath}/ImageUploadController")
@Api(description = "|ImageUploadController|图片上传")
public class ImageUploadController {

    @Autowired
    private ImageUploadService service;
    /*
    * 图片上传
    * 2018-4-1
    * 李云强
    * 参数：file---要上传的文件
    *       type---要保存到的文件夹
    * 返回值;url---文件的上传地址
    *        size---文件大小（）
    * */
    @ApiOperation(value = "|ImageUpload|分页查询 ")
    @PostMapping("ImageUpload")
    public ResponseMessage<Map<String,String>> ImageUpload(@RequestParam("file") MultipartFile file, @RequestParam("type") String type){
        Long size=null;
        if(!file.isEmpty()){
            System.out.println("文件大小："+file.getSize());
            size=file.getSize()/1024;
        }
        String url = service.uploadeLocalImage(file, type);
        Map<String,String> map = new HashMap<>();
        map.put("url",url);
        map.put("size",size.toString());
        return Result.success(map);
    }
}
