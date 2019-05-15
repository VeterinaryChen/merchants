package com.imooc.passbook.passbook.service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.passbook.Constant.Constants;
import com.imooc.passbook.passbook.Vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/14 10:24
 * <h1> 消费 Kafka中的 PassTemplate </h1>
 */
@Component
@Slf4j
public class ConsumePassTemplate {

    /**
     * 功能描述:  pass 相关的 Hbase 服务
     * @auther: JeffChen
     * @date: 2019/5/14 10:27
     */
    private final IHbasePassService passService;

    @Autowired
    public ConsumePassTemplate (IHbasePassService passService) {
        this.passService = passService;
    }

    @KafkaListener(topics = {Constants.TEMPLATE_TOPIC})
    public void receive(@Payload String passTemplate,
                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                        @Header(KafkaHeaders.PARTITION_ID) int partition,
                        @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
    log.info("Consumer Receive PassTemplate:{}",passTemplate);

        PassTemplate pt;

        try {
            pt = JSON.parseObject(passTemplate,PassTemplate.class);
        }catch (Exception ex){
            log.error("Parse PassTemplate Error!:{}",ex.getMessage());
            return;
        }
        log.info("DropPassTemplateToHbase:{}",passService.dropPassTemplateToHbase(pt));
    }


}
