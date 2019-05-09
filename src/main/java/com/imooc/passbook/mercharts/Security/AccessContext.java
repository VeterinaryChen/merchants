package com.imooc.passbook.mercharts.Security;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 15:42
 * <h1>   用ThreadLocal 去单独存储每一个线程携带的token信息  </h1>
 */
public class AccessContext {

    private static final ThreadLocal<String> token = new ThreadLocal<>();

    public static String getToken(){
        return token.get();
    }

    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }

    public static void clearAccessKey(){
        token.remove();
    }
}
