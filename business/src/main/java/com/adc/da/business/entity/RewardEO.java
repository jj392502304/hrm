package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>REWARD RewardEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-29 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class RewardEO extends BaseEntity {

    private String reward;
    private String applymemberkey;
    private String prize;
    private String awardwinninglevel;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date awardwinningtime;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>reward -> reward</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>prize -> prize</li>
     * <li>awardwinninglevel -> awardwinninglevel</li>
     * <li>awardwinningtime -> awardwinningtime</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "reward": return "reward";
            case "applymemberkey": return "applymemberkey";
            case "prize": return "prize";
            case "awardwinninglevel": return "awardwinninglevel";
            case "awardwinningtime": return "awardwinningtime";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>reward -> reward</li>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>prize -> prize</li>
     * <li>awardwinninglevel -> awardwinninglevel</li>
     * <li>awardwinningtime -> awardwinningtime</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "reward": return "reward";
            case "applymemberkey": return "applymemberkey";
            case "prize": return "prize";
            case "awardwinninglevel": return "awardwinninglevel";
            case "awardwinningtime": return "awardwinningtime";
            default: return null;
        }
    }
    
    /**  **/
    public String getReward() {
        return this.reward;
    }

    /**  **/
    public void setReward(String reward) {
        this.reward = reward;
    }

    /**  **/
    public String getApplymemberkey() {
        return this.applymemberkey;
    }

    /**  **/
    public void setApplymemberkey(String applymemberkey) {
        this.applymemberkey = applymemberkey;
    }

    /**  **/
    public String getPrize() {
        return this.prize;
    }

    /**  **/
    public void setPrize(String prize) {
        this.prize = prize;
    }

    /**  **/
    public String getAwardwinninglevel() {
        return this.awardwinninglevel;
    }

    /**  **/
    public void setAwardwinninglevel(String awardwinninglevel) {
        this.awardwinninglevel = awardwinninglevel;
    }

    /**  **/
    public Date getAwardwinningtime() {
        return this.awardwinningtime;
    }

    /**  **/
    public void setAwardwinningtime(Date awardwinningtime) {
        this.awardwinningtime = awardwinningtime;
    }

}
