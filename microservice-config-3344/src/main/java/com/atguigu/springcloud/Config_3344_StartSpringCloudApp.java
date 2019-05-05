package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:Config_3344_StartSpringCloudApp Description:
 * @Date Create on 2019/5/2 22:02
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
    }
}