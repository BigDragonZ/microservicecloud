package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:DeptConsumer_DashBoard_App Description:
 * @Date Create on 2019/5/2 19:15
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
    }
}