package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:EurekaServer7001_App Description:
 * @Date Create on 2019/5/1 21:13
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}