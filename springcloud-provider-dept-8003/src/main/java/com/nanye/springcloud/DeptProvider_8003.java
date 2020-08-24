package com.nanye.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/7 14:29
 */
//启动类
@SpringBootApplication
@EnableEurekaClient //在服务启动后自动注册到eureka
@EnableDiscoveryClient
public class DeptProvider_8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class,args);
    }
}
