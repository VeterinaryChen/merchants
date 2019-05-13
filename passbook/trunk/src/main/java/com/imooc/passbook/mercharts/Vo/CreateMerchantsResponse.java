package com.imooc.passbook.mercharts.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 20:08
 * <h1> 创建商户响应对象 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMerchantsResponse {

    /**
     * 功能描述:  创建商户ID，创建失败则为-1
     * @auther: JeffChen
     * @date: 2019/5/9 20:09
     */
    private Integer id;

}
