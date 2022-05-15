package com.atguigu.springcloudAlibaba.controller;

import com.atguigu.springcloudAlibaba.config.ServiceUri;
import com.atguigu.springcloudAlibaba.server.OrderServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/pay")

//支持nacos动态更新配置@RefreshScope
@RefreshScope
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String info;

    @Autowired
    private ServiceUri su;

    @Autowired
    OrderServer os;

    @Autowired
    RestTemplate rt;

    @GetMapping("/getInfo")
    String getInfo(){
        log.info("info="+info);
        return info;
    }

    @GetMapping("/getUri/{id}")
    String getUri(@PathVariable("id") Integer id){
        String result = "nacos register port="+port+",id="+id;
        return result;
    }

    @GetMapping("/feignLoadBalanced/createOrderNo")
    String feignLoadBalancedCreateOrderNo(){
        long now = System.currentTimeMillis();
        String orderNo = os.getOrderNo(now);
        return orderNo;
    }

    @GetMapping("/restTemplate/createOrderNo")
    String restTemplateCreateOrderNo(){
        String nacosConsumerOrderUrl = su.getNacosConsumerOrderUrl()+"/order/createOrderNo/"+System.currentTimeMillis();
        ResponseEntity<String> entity = rt.getForEntity(nacosConsumerOrderUrl, String.class);
        String body = entity.getBody();
        return body;
    }

}

