package com.adc.da.manager.uitl;


import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;
/**
 * Binding result utils and this class is use to handle field binding result(绑定数据实体的工具类,可以处理后台实体类字段验证)
 *
 * @author LiuEnYuan(刘恩源)[2036185346@qq.com]
 * @version 2.0.0
 **/
public class BindingResultUtils {

    private static final Logger logger = LoggerFactory.getLogger(BindingResultUtils.class);

    /**
     * handle @link(BindingResult) logger
     * **/
    public static ResponseMessage<?> bindingResult(BindingResult errors){
        List<ObjectError> fieldErrors=errors.getAllErrors();
        List<ResultError> resultErrors=new ArrayList<>();
        for(ObjectError error : fieldErrors){
            ResultError resultError=new ResultError(error.getObjectName(),((FieldError)error).getField(),error.getDefaultMessage());
            resultErrors.add(resultError);
            logger.info("error object = {},error filed = {},error message = {}",error.getObjectName(),((FieldError)error).getField(),error.getDefaultMessage());
        }
        return Result.error("500","插入数据错误|更新数据错误",resultErrors);
    }
}
