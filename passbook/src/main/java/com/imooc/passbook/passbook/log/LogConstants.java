package com.imooc.passbook.passbook.log;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 10:15
 * <h1> 日志记录常量定义 </h1>
 */
public class LogConstants {

    /**
     * 功能描述:  用户动作名称
     * @auther: JeffChen
     * @date: 2019/5/12 10:15
     */
    public class ActionName{

        /**
         * 功能描述:  用户查看优惠券信息
         * @auther: JeffChen
         * @date: 2019/5/12 10:18
         */
        public static final String USER_PASS_INFO = "UserPassInfo";

        /**
         * 功能描述:  用户查看已使用的优惠券信息
         * @auther: JeffChen
         * @date: 2019/5/12 10:21
         */
        public static final String USER_USED_PASS_INFO = "UserUsedPassInfo";

        /**
         * 功能描述: 用户使用优惠券
         * @auther: JeffChen
         * @date: 2019/5/12 10:22
         */
        public static final String USER_USE_PASS = "UserUsePass";

        /**
         * 功能描述:  用户查看优惠券库存
         * @auther: JeffChen
         * @date: 2019/5/12 10:23
         */
        public static final String INVENTORY_INFO = "InventoryInfo";

        /**
         * 功能描述: 用户领取优惠券
         * @auther: JeffChen
         * @date: 2019/5/12 10:24
         */
        public static final String GAIN_PASS_TEMPLATE = "GainPassTemplate";

        /**
         * 功能描述: 用户创建评论
         * @auther: JeffChen
         * @date: 2019/5/12 10:25
         */
        public static final String CREATE_FEEDBACK = "CreateFeedback";

        /**
         * 功能描述: 用户获取评论
         * @auther: JeffChen
         * @date: 2019/5/12 10:25
         */
        public static final String GET_FEEDBACK = "GetFeedback";
    }


}
