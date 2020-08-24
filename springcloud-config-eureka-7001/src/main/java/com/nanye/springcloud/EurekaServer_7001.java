package com.nanye.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/8 12:22
 */
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 服务端的启动类，可以接收别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
