package com.imooc.passbook.passbook.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 16:25
 * <h1> User Object </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * 功能描述:  用户ID
     * @auther: JeffChen
     * @date: 2019/5/12 16:26
     */
    private Long id;

    /**
     * 功能描述:  用户基本信息
     * @auther: JeffChen
     * @date: 2019/5/12 16:28
     */
    private BaseInfo baseInfo;

    /**
     * 功能描述: 用户额外信息
     * @auther: JeffChen
     * @date: 2019/5/12 16:30
     */
    private OtherInfo otherInfo;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BaseInfo{
        private String name;
        private String age;
        private String sex;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class OtherInfo{
        private String phone;
        private String address;

    }
}
