package com.atguigu.springcloudAlibaba.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
//@ConfigurationProperties(prefix="service-uris")
public class ServiceUri {

    @Value("${service-uris.consumerOrderUrl}")
    private    String nacosConsumerOrderUrl;

}
