package com.imooc.passbook.mercharts.Controller;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.mercharts.Service.IMerchantsServ;
import com.imooc.passbook.mercharts.Vo.CreateMerchantsRequest;
import com.imooc.passbook.mercharts.Vo.PassTemplate;
import com.imooc.passbook.mercharts.Vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author jeffchen
 * @Date: 2019/5/10 15:11
 * <h1> 商户服务 Controller </h1>
 */
@Slf4j
@RestController
@RequestMapping("/merchants")
public class MerchantsController {

    /**
     * 功能描述: 商户服务接口
     * @auther: JeffChen
     * @date: 2019/5/10 15:17
     */
    private final IMerchantsServ iMerchantsServ;

    @Autowired
    public MerchantsController (IMerchantsServ iMerchantsServ) {
        this.iMerchantsServ = iMerchantsServ;
    }

    @ResponseBody
    @PostMapping("/create")
    public Response createMerchants(@RequestBody CreateMerchantsRequest request){
        log.info("CreateMerchants:{}", JSON.toJSONString(request));
        return iMerchantsServ.createMerchants(request);
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Response buildMerchantsInfoById(@PathVariable Integer id){
        log.info("BuilderMerchantsInfo:{}",id);
        return iMerchantsServ.buildMerchantsInfoById(id);
    }

    @ResponseBody
    @PostMapping("/drop")
    public Response dropPassTemplate(@RequestBody PassTemplate passTemplate){
        log.info("dropPassTemplate:{}",passTemplate);
        return iMerchantsServ.dropPassTemplate(passTemplate);
    }
}
