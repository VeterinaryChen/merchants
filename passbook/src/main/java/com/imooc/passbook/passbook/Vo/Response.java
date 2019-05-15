package com.imooc.passbook.passbook.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/14 13:40
 * <h1> Controller 统一响应 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    /**
     * 功能描述: 错误码，正确返回0
     * @auther: JeffChen
     * @date: 2019/5/14 13:43
     */
    private Integer errorCode = 0;

    /**
     * 功能描述: 错误信息，正确返回空字符串
     * @auther: JeffChen
     * @date: 2019/5/14 13:42
     */
    private String errorMsg = "";
    
    /**
     * 功能描述: 返回值对象
     * @auther: JeffChen
     * @date: 2019/5/14 13:43
     */
    private Object Data;

    /**
     * 功能描述: 正确响应的构造函数
     * @auther: JeffChen
     * @date: 2019/5/14 13:47
     */
    public Response(Object data){
        this.Data = data;
    }

    /**
     * 功能描述: 空响应
     * @auther: JeffChen
     * @date: 2019/5/14 13:47
     */
    public static Response success(){
        return new Response();
    }

    /**
     * 功能描述: 错误响应
     * @auther: JeffChen
     * @date: 2019/5/14 13:49
     */
    public static Response failure(String errorMsg){
        return new Response(-1,errorMsg,null);
    }
}
