package com.imooc.passbook.passbook.service;

import com.imooc.passbook.passbook.Vo.PassTemplate;
import org.springframework.stereotype.Service;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/14 10:20
 */
public interface IHbasePassService {

    /**
     * 功能描述: 将 PassTemplate 写入Hbase
     * @auther: JeffChen
     * @date: 2019/5/14 10:21
     * @param passTemplate {@link PassTemplate}
     * @return true or false
     */
    boolean dropPassTemplateToHbase(PassTemplate passTemplate);

}
