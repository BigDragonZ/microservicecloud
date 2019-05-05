package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:Zuul_9527_StartSpringCloudApp Description:
 * @Date Create on 2019/5/2 19:27
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@EnableZuulProxy
@SpringBootApplication
public class Zuul_9527_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}