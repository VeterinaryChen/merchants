package com.imooc.passbook.mercharts.Constant;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 15:27
 * <h1>错误码枚举定义</h1>
 */
public enum ErrorCode {
    SUCCESS(0,""),
    DUPLICATE_NAME(1,"商户名称重复"),
    EMPTY_LOGO(2,"商户logo为空"),
    EMPTY_BUSSINESS_LICENSE(3,"商户营业执照为空"),
    ERROR_PHONE(4,"商户联系电话错误"),
    ERROR_ADDRESS(5,"商户地址为空"),
    MERCHANTS_NOT_EXISTS(6,"商户不存在");

    /**
     * 功能描述: 错误码
     * @auther: JeffChen
     * @date: 2019/5/9 15:35
     */
    private Integer code;

    /**
     * 功能描述: 错误描述
     * @auther: JeffChen
     * @date: 2019/5/9 15:36
     */
    private String desc;

    ErrorCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
