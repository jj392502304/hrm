package com.adc.da.business.util;


import com.adc.da.business.entity.AnnounceEO;
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
 * @author LiuEnYuan(刘恩源)
 * @version 2.0.0
 **/
public class BindingResultUtils {

    private static final Logger logger = LoggerFactory.getLogger(BindingResultUtils.class);

    /**
     * Handles entity class fields errors and this method use for example<b>(处理实体类实体域错误和使用方法如下):看@see
     * and commons annotations(常用注解).</b><br>
     * <b>For example(例如):见链接:https://www.cnblogs.com/atai/p/6943404.html</b>
     * @param errors    binding result errors
     * @param className the error object class name
     * @return Returns {@link ResponseMessage},报500错误,错误信息:"插入数据错误|更新数据错误"
     * @see com.adc.da.business.controller.AnnounceEOController#create(AnnounceEO, BindingResult)
     **/
    public static ResponseMessage<?> bindingResult(BindingResult errors, String className) {
        List<ObjectError> fieldErrors = errors.getAllErrors();
        List<ResultError> resultErrors = new ArrayList<>();
        for (ObjectError error : fieldErrors) {
            ResultError resultError = new ResultError(className, error.getObjectName(), ((FieldError) error).getField(), error.getDefaultMessage());
            resultErrors.add(resultError);
            logger.info("error class name = {},error filed = {},error message = {}", className, error.getObjectName(), ((FieldError) error).getField(), error.getDefaultMessage());
        }
        return Result.error("500", "插入数据错误|更新数据错误", resultErrors);
    }
}
