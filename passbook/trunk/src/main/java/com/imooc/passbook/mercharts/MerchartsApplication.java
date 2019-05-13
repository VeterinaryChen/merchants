package com.imooc.passbook.mercharts;

import com.imooc.passbook.mercharts.Security.AuthCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author jeffchen
 */
@SpringBootApplication
public class MerchartsApplication extends WebMvcConfigurerAdapter {

    @Autowired
    private AuthCheckInterceptor authCheckInterceptor;

    public static void main(String[] args) {
        SpringApplication.run(MerchartsApplication.class, args);
    }

    /**
     * 功能描述:  注册拦截器，拦截以 merchants 开头的所有请求
     * @auther: JeffChen
     * @date: 2019/5/10 15:32
     */
    @Override
    public void addInterceptors (InterceptorRegistry registry) {

        registry.addInterceptor(authCheckInterceptor).addPathPatterns("/merchants/**");
        super.addInterceptors(registry);
    }
}
