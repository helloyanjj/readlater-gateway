package com.nju.readlatergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableZuulProxy
@EnableDiscoveryClient
public class ReadlaterGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadlaterGatewayApplication.class, args);
    }

}
