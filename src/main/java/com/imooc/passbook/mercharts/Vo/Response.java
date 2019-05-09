package com.imooc.passbook.mercharts.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 19:48
 * <h1> 通用的响应类型 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    /**
     * 功能描述: 错误码，正确则返回0
     * @auther: JeffChen
     * @date: 2019/5/9 19:49
     */
    private Integer errorCode;

    /**
     * 功能描述:  错误信息，正确则返回空字符串
     * @auther: JeffChen
     * @date: 2019/5/9 19:49
     */
    private String errorMsg;

    /**
     * 功能描述:  返回值对象
     * @auther: JeffChen
     * @date: 2019/5/9 19:50
     */
    private Object data;

    /**
     * 功能描述:  正确的响应构造函数
     * @auther: JeffChen
     * @date: 2019/5/9 19:51
     * @param data
     */
    public Response (Object data) {
        this.data = data;
    }
}
