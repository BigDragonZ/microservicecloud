package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:DeptClientService Description:
 * @Date Create on 2019/5/2 15:28
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
// @FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value ="MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping(value = "dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @PostMapping("/dept/add")
    boolean add(Dept dept);

    @GetMapping("/dept/list")
    List<Dept> list();
}