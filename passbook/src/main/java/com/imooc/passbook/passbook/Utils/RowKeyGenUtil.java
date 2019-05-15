package com.imooc.passbook.passbook.Utils;

import com.imooc.passbook.passbook.Vo.Feedback;
import com.imooc.passbook.passbook.Vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/13 15:18
 * <h1> Row Key 生成器工具类 </h1>
 */
@Slf4j
public class RowKeyGenUtil {

    /**
     * 功能描述: 根据提供的 PassTemplate 对象生成 RowKey
     * @auther: JeffChen
     * @date: 2019/5/13 15:21
     * @param passTemplate {@link PassTemplate}
     * @return String RowKey
     */
    public static String genPassTemplateRowKey(PassTemplate passTemplate){

        String passInfo = String.valueOf(passTemplate.getId()) + "_" + passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);

        log.info("genPassTemplateRowKey:{},{}",passInfo,rowKey);

        return rowKey;
    }

    /**
     * 功能描述: 根据提供的 Feedback 构造 RowKey
     * @auther: JeffChen
     * @date: 2019/5/13 15:21
     * @param feedback {@link Feedback}
     * @return String RowKey
     */
    public static String genFeedbackRowKey(Feedback feedback){

         return new StringBuilder(String.valueOf(feedback.getId())).reverse().toString()
                 + (Long.MAX_VALUE - System.currentTimeMillis());
    }
}
