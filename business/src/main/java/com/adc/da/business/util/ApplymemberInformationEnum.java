package com.adc.da.business.util;

/**
 * 应聘人员表创建or修改信息源枚举类
 * Apply member update information enum(创建信息源或者更新信息源:1:PC端;2:移动端;3:其他)
 * @author ShiHuanYin(施欢迎)
 * **/
public enum ApplymemberInformationEnum {

    /**
     * 创建信息源:PC端
     * **/
    PC(1),

    /**
     * 创建信息源:移动端
     * **/
    MOVE(2),

    /**
     * 创建信息源:其他
     * **/
    OTHERS(3)
    ;

    /**
     * 创建信息源类型
     * **/
    private int updateInformationType;


    private ApplymemberInformationEnum(int updateInformationType) {
        this.updateInformationType = updateInformationType;
    }

    public int getUpdateInformationType() {
        return updateInformationType;
    }
}
