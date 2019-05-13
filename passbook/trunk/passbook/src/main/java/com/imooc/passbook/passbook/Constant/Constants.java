package com.imooc.passbook.passbook.Constant;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/11 10:39
 * <h1> 普通常量类定义 </h1>
 */
public class Constants {

    /**
     * 功能描述: 商户优惠券 kafka topic
     * @auther: JeffChen
     * @date: 2019/5/11 10:41
     */
    public static final String TEMPLATE_TOPIC ="merchants-template";

    /**
     * 功能描述: token 文件存储目录
     * @auther: JeffChen
     * @date: 2019/5/11 10:42
     */
    public static final String TOKEN_DIR = "/tmp/token/";
    
    /**
     * 功能描述: 已使用的 token 文件名后缀
     * @auther: JeffChen
     * @date: 2019/5/11 10:42
     */
    public static final String USED_TOKEN_SUFFIX = "_";

    /**
     * 功能描述: 用户数的 redis-key
     * @auther: JeffChen
     * @date: 2019/5/11 10:45
     */
    public static final String USED_COUNT_REDIS_KEY = "imooc-user-count";

    /**
     * 功能描述: User Hbase Table
     * @auther: JeffChen
     * @date: 2019/5/11 10:46
     */
    public class UserTable{

        /**
         * 功能描述:  User Hbase 表名
         * @auther: JeffChen
         * @date: 2019/5/11 10:48
         */
        public static final String TABLE_NAME = "pb:user";

        /**
         * 功能描述: 基本信息列族
         * @auther: JeffChen
         * @date: 2019/5/11 10:48
         */
        public static final String FAMILY_B = "b";

        /**
         * 功能描述: 用户名
         * @auther: JeffChen
         * @date: 2019/5/11 10:50
         */
        public static final String NAME = "name";

        /**
         * 功能描述: 用户年龄
         * @auther: JeffChen
         * @date: 2019/5/11 10:51
         */
        public static final String AGE = "age";

        /**
         * 功能描述: 用户性别
         * @auther: JeffChen
         * @date: 2019/5/11 10:51
         */
        public static final String SEX = "sex";

        /**
         * 功能描述: 额外信息列族
         * @auther: JeffChen
         * @date: 2019/5/11 10:51
         */
        public static final String FAMILY_O = "o";

        /**
         * 功能描述: 电话
         * @auther: JeffChen
         * @date: 2019/5/11 10:51
         */
        public static final String PHONE = "phone";

        /**
         * 功能描述: 住址
         * @auther: JeffChen
         * @date: 2019/5/11 10:51
         */
        public static final String ADDRESS = "address";

    }
    
    /**
     * 功能描述: PassTemplate Hbase Table
     * @auther: JeffChen
     * @date: 2019/5/11 12:53
     */
    public class PassTemplateTable{

        /**
         * 功能描述:   PassTemplate 表名
         * @auther: JeffChen
         * @date: 2019/5/11 12:56
         */
        public static final String TABLE_NAME = "pb:passtemplate";

        /**
         * 功能描述:   基本信息列族
         * @auther: JeffChen
         * @date: 2019/5/11 12:56
         */
        public static final String FAMILY_B = "b";
        
        /**
         * 功能描述: 商户ID
         * @auther: JeffChen
         * @date: 2019/5/11 12:58
         */
        public static final String ID = "id";

        /**
         * 功能描述: 优惠券标题
         * @auther: JeffChen
         * @date: 2019/5/11 12:58
         */
        public static final String TITLE = "title";

        /**
         * 功能描述: 优惠券摘要
         * @auther: JeffChen
         * @date: 2019/5/11 12:58
         */
        public static final String SUMMARY = "summary";

        /**
         * 功能描述: 优惠券详细信息
         * @auther: JeffChen
         * @date: 2019/5/11 12:58
         */
        public static final String DESC = "desc";

        /**
         * 功能描述: 优惠券背景色
         * @auther: JeffChen
         * @date: 2019/5/11 12:58
         */
        public static final String BACKGROUND = "background";

        /**
         * 功能描述: 约束信息列族
         * @auther: JeffChen
         * @date: 2019/5/11 13:03
         */
        public static final String FAMILY_C = "c";

        /**
         * 功能描述: 优惠券最大个数
         * @auther: JeffChen
         * @date: 2019/5/11 13:03
         */
        public static final String LIMIT = "limit";

        /**
         * 功能描述:  优惠券开始时间
         * @auther: JeffChen
         * @date: 2019/5/11 13:04
         */
        public static final String START = "start";

        /**
         * 功能描述:  优惠券结束时间
         * @auther: JeffChen
         * @date: 2019/5/11 13:04
         */
        public static final String END = "end";

    }

    /**
     * 功能描述:  Pass Hbase Table
     * @auther: JeffChen
     * @date: 2019/5/11 13:05
     */
    public class PassTable{

        /**
         * 功能描述:  Pass HBase 表名
         * @auther: JeffChen
         * @date: 2019/5/11 13:06
         */
        public static final String TABLE_NAME = "pb:pass";

        /**
         * 功能描述:  信息列族
         * @auther: JeffChen
         * @date: 2019/5/11 13:07
         */
        public static final String FAMILY_I ="i";
        
        /**
         * 功能描述: User ID
         * @auther: JeffChen
         * @date: 2019/5/11 13:08
         */
        public static final String USER_ID = "user_id";

        /**
         * 功能描述:  优惠券ID
         * @auther: JeffChen
         * @date: 2019/5/11 13:10
         */
        public static final String TEMPLATE_ID = "template_id";

        /**
         * 功能描述:  优惠券识别码
         * @auther: JeffChen
         * @date: 2019/5/11 13:10
         */
        public static final String TOKEN = "token";

        /**
         * 功能描述:  优惠券领取日期
         * @auther: JeffChen
         * @date: 2019/5/11 13:14
         */
        public static final String ASSIGNED_DATE = "assigned_date";
        
        /**
         * 功能描述:  消费日期
         * @auther: JeffChen
         * @date: 2019/5/11 13:14
         */
        public static final String CON_DATE = "con_date";
    }

    public class Feedback{

        /**
         * 功能描述:  feedback hbase 表名
         * @auther: JeffChen
         * @date: 2019/5/11 13:17
         */
        public static final String TABLE_NAME = "pb:feedback";

        /**
         * 功能描述:
         * @auther: JeffChen
         * @date: 2019/5/11 13:18
         */
        public static final String FAMILY_I = "i";

        /**
         * 功能描述: 用户ID
         * @auther: JeffChen
         * @date: 2019/5/12 09:29
         */
        public static final String USER_ID = "user_id";

        /**
         * 功能描述: 评论类型，
         * @auther: JeffChen
         * @date: 2019/5/12 09:29
         */
        public static final String TYPE = "type";

        /**
         * 功能描述:  PassTemplateRowKey 如果是app评论，则设置为-1
         * @auther: JeffChen
         * @date: 2019/5/12 09:30
         */
        public static final String TEMPLATE_ID = "template_id";

        /**
         * 功能描述: 评论
         * @auther: JeffChen
         * @date: 2019/5/12 09:32
         */
        public static final String COMMENT = "comment";


    }
}
