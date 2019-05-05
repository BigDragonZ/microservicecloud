package com.atguigu.myrule;


import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:MySelfRule Description:
 * @Date Create on 2019/5/2 13:50
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule_ZDL();
    }
}