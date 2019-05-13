package com.imooc.passbook.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 10:26
 * <h1> 日志对象 </h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {

    /**
     * 功能描述:  日志动作类型
     * @auther: JeffChen
     * @date: 2019/5/12 10:27
     */
    private String action;

    /**
     * 功能描述:  用户 id
     * @auther: JeffChen
     * @date: 2019/5/12 10:27
     */
    private Long userId;

    /**
     * 功能描述:  当前时间戳
     * @auther: JeffChen
     * @date: 2019/5/12 10:28
     */
    private Long timestamp;

    /**
     * 功能描述:  客户端 ip 地址
     * @auther: JeffChen
     * @date: 2019/5/12 10:28
     */
    private String remoteIp;

    /**
     * 功能描述:  日志信息
     * @auther: JeffChen
     * @date: 2019/5/12 10:29
     */
    private Object info = null;

}
