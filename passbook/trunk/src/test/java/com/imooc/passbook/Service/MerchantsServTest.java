package com.imooc.passbook.Service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.mercharts.Service.IMerchantsServ;
import com.imooc.passbook.mercharts.Vo.CreateMerchantsRequest;
import com.imooc.passbook.mercharts.Vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/9 20:42
 * <h1> 商户服务测试类 </h1>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {

    @Autowired
    private IMerchantsServ iMerchantsServ;

//    @Test
//    public void testMerchantsServ(){
//        CreateMerchantsRequest createMerchantsRequest = new CreateMerchantsRequest();
//
//        createMerchantsRequest.setName("imooc");
//        createMerchantsRequest.setLogoUrl("www.imooc.com");
//        createMerchantsRequest.setBussinessLicenseUrl("www.imooc.com");
//        createMerchantsRequest.setPhone("123456");
//        createMerchantsRequest.setAddress("南京市");
//
//        System.out.println(JSON.toJSONString(iMerchantsServ.createMerchants(createMerchantsRequest)));
//    }

    @Test
    public void testBuildMerchantsInfoById(){

        System.out.println(JSON.toJSONString(iMerchantsServ.buildMerchantsInfoById(17)));
    }

    @Test
    public void testDropPassTemplate(){

        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(17);
        passTemplate.setTitle("title:慕课");
        passTemplate.setSummary("简介：幕客");
        passTemplate.setLimit(10000L);
        passTemplate.setHasToken(false);
        passTemplate.setDesc("详情：幕客");
        passTemplate.setBackground(2);
        passTemplate.setStart(new Date());
        passTemplate.setEnd(DateUtils.addDays(new Date(),10));

        System.out.println(JSON.toJSONString(iMerchantsServ.dropPassTemplate(passTemplate)));
    }



}
