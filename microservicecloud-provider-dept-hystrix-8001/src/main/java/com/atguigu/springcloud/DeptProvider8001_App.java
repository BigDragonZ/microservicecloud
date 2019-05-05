package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:DeptProvider8001_App Description:
 * @Date Create on 2019/5/1 17:01
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@SpringBootApplication
@EnableEurekaClient   // 本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker // 对hystrixR熔断机制的支持
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}