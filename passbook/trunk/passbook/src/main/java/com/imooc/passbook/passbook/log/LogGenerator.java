package com.imooc.passbook.passbook.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 10:31
 * <h1> 日志生成器 </h1>
 */
@Slf4j
public class LogGenerator {

    /**
     * 功能描述:  生成log
     * @auther: JeffChen
     * @date: 2019/5/12 10:33
     * @param request {@link HttpServletRequest}
     * @param userId 用户id
     * @param action 日志类型
     * @param info 日志信息,可以是null
     */
    public static void genLog(HttpServletRequest request,Long userId,String action,Object info){
        log.info(
                JSON.toJSONString(
                        new LogObject(action,userId,System.currentTimeMillis(),request.getRemoteAddr(),info)
                )
        );
    }

}
