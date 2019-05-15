package com.imooc.passbook.passbook.service;

import com.imooc.passbook.passbook.Vo.Response;
import com.imooc.passbook.passbook.Vo.User;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/14 13:55
 * <h1> 用户服务：创建 User 服务 </h1>
 */
public interface IUserService { 
    
    /**
     * 功能描述: 创建用户
     * @auther: JeffChen
     * @date: 2019/5/14 13:58
     * @param user {@link User}
     * @return {@link Response}
     */
    Response createUser(User user) throws Exception; 
}
