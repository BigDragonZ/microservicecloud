package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:DeptDao Description:
 * @Date Create on 2019/5/1 16:50
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@Mapper
@Component
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

     List<Dept> findAll();
}