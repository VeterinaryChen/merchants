package com.imooc.passbook.passbook.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/14 10:07
 * <h1> 全局统一异常处理 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorInfo<T> {

    /**
     * 功能描述: 错误码
     * @auther: JeffChen
     * @date: 2019/5/14 10:09
     */
    public static final Integer ERROR = -1;

    /**
     * 功能描述: 特定错误码
     * @auther: JeffChen
     * @date: 2019/5/14 10:09
     */
    private Integer code;

    /**
     * 功能描述:  错误信息
     * @auther: JeffChen
     * @date: 2019/5/14 10:10
     */
    private String message;

    /**
     * 功能描述: 请求的 url
     * @auther: JeffChen
     * @date: 2019/5/14 10:10
     */
    private String url;

    /**
     * 功能描述: 请求返回的对象
     * @auther: JeffChen
     * @date: 2019/5/14 10:10
     */
    private T data;
    
}
