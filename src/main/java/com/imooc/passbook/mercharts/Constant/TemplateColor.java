package com.imooc.passbook.mercharts.Constant;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 15:18
 * <h1>优惠券的背景颜色</h1>
 */
public enum TemplateColor {

    RED(1,"红色"),
    GREEN(2,"绿色"),
    BLUE(3,"蓝色");

    //颜色代码
    private Integer code;

    //颜色描述
    private String color;

    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }
}
