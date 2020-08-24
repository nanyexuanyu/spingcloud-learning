package com.nanye.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/7 21:11
 */
@Configuration
public class ConfigBean {

    //配置负载均衡实现RestTemplate
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
