package com.imooc.passbook.passbook.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 16:34
 * <h1> 用户领取的优惠券 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pass {

    /**
     * 功能描述: 用户Id
     * @auther: JeffChen
     * @date: 2019/5/12 16:35
     */
    private Long userId;
    
    /**
     * 功能描述: pass 在 Hbase 中的 RowKey
     * @auther: JeffChen
     * @date: 2019/5/12 16:35
     */
    private String rowKey;

    /**
     * 功能描述: passTemplate 在 Hbase 中的 RowKey
     * @auther: JeffChen
     * @date: 2019/5/12 16:35
     */
    private String templateId;

    /**
     * 功能描述: 优惠券 token ，有可能为null ，填充-1
     * @auther: JeffChen
     * @date: 2019/5/12 16:36
     */
    private String token;
    
    /**
     * 功能描述: 消费券领取日期
     * @auther: JeffChen
     * @date: 2019/5/12 16:37
     */
    private Date assignedDate;
    
    /**
     * 功能描述: 消费日期，不为空则表示已经被消费
     * @auther: JeffChen
     * @date: 2019/5/12 16:37
     */
    private Date conDate;

}
