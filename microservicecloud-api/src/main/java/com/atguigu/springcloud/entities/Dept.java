package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author <a href="mailto:zhangdalong@burcent.com"></a>
 * @ClassName:Dept Description:
 * @Date Create on 2019/5/1 15:19
 * @since version1.0 Copyright 2019 Burcent All Rights Reserved.
 */
@Data
@SuppressWarnings("serial")
// z支持链式调用
@Accessors(chain = true)
public class Dept implements Serializable {
    // 主键
    private Long deptNo;
    // 部门名称
    private String dname;
    // 来自哪个数据库  因为微服务架构一个服务可以对应一个数据库 同一个信息被存储到不同数据库
    private String db_source;
}