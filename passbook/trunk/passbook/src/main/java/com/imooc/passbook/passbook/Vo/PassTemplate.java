package com.imooc.passbook.passbook.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 16:31
 * <h1> 投放的优惠券对象定义 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassTemplate {

    private Integer id;

    private String title;

    private String summary;

    private String desc;

    private Long limit;

    private Boolean hasToken;

    private Integer background;

    private Date start;

    private Date end;

}
