package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:DeptSrevice Description:
 * @Date Create on 2019/5/1 16:54
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
public interface DeptSrevice {

    boolean add(Dept dept);

    Dept get(Long id);

     List<Dept> list();
}