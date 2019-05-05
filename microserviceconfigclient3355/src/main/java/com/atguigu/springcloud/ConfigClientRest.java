package com.atguigu.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:ConfigClientRest Description:
 * @Date Create on 2019/5/2 22:20
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig() {
        String str = "applicationNmae" + applicationName + "\t eurekaServers:" + eurekaServers + "\t port:" + port;
        System.out.println("*********str:" + str);
        return str;

    }
}