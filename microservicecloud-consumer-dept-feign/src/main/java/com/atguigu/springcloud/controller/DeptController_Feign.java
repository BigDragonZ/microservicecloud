package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:DeptController_Consumer Description:
 * @Date Create on 2019/5/1 17:58
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@RestController
public class DeptController_Feign {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return service.add(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return service.list();
    }

}