package com.imooc.passbook.passbook.Constant;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/11 10:33
 * <h1> 优惠券的状态 </h1>
 */
public enum PassStatus {

    UNUSED(1,"未被使用的"),
    USED(2,"已经使用的"),
    ALL(3,"全部领取的");

    /**
     * 功能描述: 状态码
     * @auther: JeffChen
     * @date: 2019/5/11 10:34
     */
    private Integer code;

    /**
     * 功能描述: 状态描述
     * @auther: JeffChen
     * @date: 2019/5/11 10:34
     */
    private String desc;

    PassStatus (Integer code, String desc) {
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
