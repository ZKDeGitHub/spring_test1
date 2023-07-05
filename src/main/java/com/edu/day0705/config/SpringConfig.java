package com.edu.day0705.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author zk
 * @Date 2023/7/5 15:50
 * @注释：
 * @since 11
 */
@Configuration
@ComponentScan("com.edu.day0705")//包扫描
@EnableAspectJAutoProxy//开启aop注解
@EnableTransactionManagement //开启事务注解
public class SpringConfig {
}
