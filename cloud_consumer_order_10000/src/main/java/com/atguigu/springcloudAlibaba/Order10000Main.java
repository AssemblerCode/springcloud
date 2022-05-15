package com.atguigu.springcloudAlibaba;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Order10000Main {

    public static void main(String[] args) {
        SpringApplication.run(Order10000Main.class, args);
    }

}
