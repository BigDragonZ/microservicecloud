package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptSrevice;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Gett")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptSrevice.get(id);
        if (null == dept) {
            throw new RuntimeException("不存在对应信息");
        }
        return deptSrevice.get(id);
    }

    public Dept processHystrix_Gett(@PathVariable("id") Long id) {
        return new Dept().setDeptNo(id).setDname("该id" + id + "没有对应信息").setDb_source("no this database in mysql");
    }
}