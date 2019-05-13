package com.imooc.passbook.mercharts.Security;


import com.imooc.passbook.mercharts.Constant.Constants;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 15:47
 * <h1> 权限拦截器 </h1>
 */
@Component
public class AuthCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        String token = request.getHeader(Constants.TOKEN_STRING);
        if (StringUtils.isEmpty(token)){
            throw new Exception("Header中缺少 "+Constants.TOKEN_STRING + "!");
        }
        if (token!=Constants.TOKEN){
            throw new Exception("Header中 "+Constants.TOKEN_STRING+"错误！");
        }
        AccessContext.setToken(token);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        AccessContext.clearAccessKey();
    }
}
