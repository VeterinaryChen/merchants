package com.imooc.passbook.mercharts.Vo;

import com.imooc.passbook.mercharts.Constant.ErrorCode;
import com.imooc.passbook.mercharts.Dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 19:38
 * <h1> 投放的优惠券对象定义 </h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {

    /**
     * 功能描述: 优惠券ID
     * @auther: JeffChen
     * @date: 2019/5/9 19:38
     */
    private Integer id;

    /**
     * 功能描述: 优惠券标题
     * @auther: JeffChen
     * @date: 2019/5/9 19:39
     */
    private String title;

    /**
     * 功能描述:  优惠券摘要
     * @auther: JeffChen
     * @date: 2019/5/9 19:39
     */
    private String summary;

    /**
     * 功能描述: 优惠券详细信息
     * @auther: JeffChen
     * @date: 2019/5/9 19:39
     */
    private String desc;

    /**
     * 功能描述:  最大个数限制
     * @auther: JeffChen
     * @date: 2019/5/9 19:40
     */
    private Long limit;

    /**
     * 功能描述: 优惠券是否有token，用于商户核销
     * token存储于redis set中，每次从redis中获取
     * @auther: JeffChen
     * @date: 2019/5/9 19:40
     */
    private Boolean hasToken;

    /**
     * 功能描述:  优惠券背景色
     * @auther: JeffChen
     * @date: 2019/5/9 19:42
     */
     private Integer background;

    /**
     * 功能描述:  优惠券开始时间
     * @auther: JeffChen
     * @date: 2019/5/9 19:43
     */
     private Date start;

     /**
      * 功能描述:  优惠券结束时间
      * @auther: JeffChen
      * @date: 2019/5/9 19:43
      */
     private Date end;

     /**
      * 功能描述:  校验优惠券对象的有效性
      * @auther: JeffChen
      * @date: 2019/5/9 19:44
      * @param merchantsDao {@link MerchantsDao}
      * @return {@link ErrorCode}
      */
     public ErrorCode validate(MerchantsDao merchantsDao){
        if(null == merchantsDao.findById(id)){
            return ErrorCode.MERCHANTS_NOT_EXISTS;
        }
        return ErrorCode.SUCCESS;
     }
}
