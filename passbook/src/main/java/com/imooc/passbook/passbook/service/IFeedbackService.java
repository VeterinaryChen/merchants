package com.imooc.passbook.passbook.service;

import com.imooc.passbook.passbook.Vo.Feedback;
import com.imooc.passbook.passbook.Vo.Response;

/**
 * @author：JeffChen
 * <h1> 评论功能：即用户评论功能实现 </h1>
 */
public interface IFeedbackService {

    /**
     * 功能描述: 创建评论
     * @author: JeffChen
     * @date: 2019/5/15 14:08
     * @param feedback {@link Feedback}
     * @return {@link Response}
     */
    Response createFeedback(Feedback feedback);

    /**
     * 功能描述: 根据用户 id 获取评论
     * @auther: JeffChen
     * @date: 2019/5/15 14:10
     * @param UserId 用户 id
     * @return {@link Response}
     */
    Response getFeedback(Long UserId);
}
