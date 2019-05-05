package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:ConfigBean Description:
 * @Date Create on 2019/5/1 17:56
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }
}