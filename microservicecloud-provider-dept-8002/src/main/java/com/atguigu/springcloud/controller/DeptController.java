package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:DeptController Description:
 * @Date Create on 2019/5/1 16:58
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@RestController
public class DeptController {
    @Autowired
    private DeptSrevice deptSrevice;
    @Autowired
   // @Qualifier("discoveryClient")
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptSrevice.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptSrevice.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptSrevice.list();
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> services = client.getServices();
        System.out.println("***********" + services);
        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT8001");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.client;
    }
}