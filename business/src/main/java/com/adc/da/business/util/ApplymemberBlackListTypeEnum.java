package com.adc.da.business.util;

/**
 *应聘人员表是否进入黑名单枚举类
 * Apply member black list type enum
 * **/
public enum ApplymemberBlackListTypeEnum {

    /**
     * 黑名单,如果用户账号和密码验证通过后,应聘用户仍然不允许登录
     * **/
    BLACK_LIST(0),

    /**
     * 白名单,如果用户账号和密码验证通过后,应聘用户仍然允许登录
     * **/
    WITE_LIST(1)
    ;

    private ApplymemberBlackListTypeEnum(int type) {
        this.type = type;
    }

    private int type;

    public int getType() {
        return type;
    }
}
