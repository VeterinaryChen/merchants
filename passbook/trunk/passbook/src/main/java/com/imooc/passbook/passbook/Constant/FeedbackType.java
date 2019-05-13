package com.imooc.passbook.passbook.Constant;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/11 10:37
 * <h1> 评论类型，枚举 </h1>
 */
public enum FeedbackType {

    PASS(1,"针对优惠券的评论"),
    APP(2,"针对卡包APP的评论");

    /**
     * 功能描述:  状态码
     * @auther: JeffChen
     * @date: 2019/5/11 10:38
     */
    private Integer code;

    /**
     * 功能描述:  状态描述
     * @auther: JeffChen
     * @date: 2019/5/11 10:38
     */
    private String desc;

    FeedbackType (Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode () {
        return code;
    }

    public String getDesc () {
        return desc;
    }
}
