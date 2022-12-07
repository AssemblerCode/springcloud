package com.mashibing.config;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class DBConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    private String url;
    private String username;
    private String password;


    @Primary
    @Bean
    public DataSource dataSource(){
        DruidDataSource dds = new DruidDataSource();

        dds.setDriverClassName(driverClassName);
        dds.setUrl(url);
        dds.setUsername(username);
        dds.setPassword(password);

        DataSourceProxy dsp = new DataSourceProxy(dds);
        return  dsp;
    }
}
