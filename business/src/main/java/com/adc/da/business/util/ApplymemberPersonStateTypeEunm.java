package com.adc.da.business.util;

/**
 * 应聘人员表人员状态枚举类
 * Apply member person state type:(应聘人员状态:0:淘汰;1:投递;2:审批;3:录用)
 * **/
public enum ApplymemberPersonStateTypeEunm {

    /**
     * 淘汰
     * **/
    ELIMINATE(1),

    /**
     * 投递
     * **/
    DELIVERY(2),

    /**
     * 审批
     * **/
    APPROVAL(3),

    /**
     * 录用
     * **/
    EMPLOYMENT(4)
    ;

    private int personState;

    private ApplymemberPersonStateTypeEunm(int personState) {
        this.personState = personState;
    }

    public int getPersonState() {
        return personState;
    }
}
