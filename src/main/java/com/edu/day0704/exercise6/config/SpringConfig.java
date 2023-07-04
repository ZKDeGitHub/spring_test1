package com.edu.day0704.exercise6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 替换xml文件配置
 */
//替换xml文件头
@Configuration
//开启包扫描，相当于xml中 <context:component-scan base-package="com.edu"></context:component-scan>
@ComponentScan("com.edu.day0704.exercise6")
//开启AOP，相当于xml中 <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
@EnableAspectJAutoProxy
public class SpringConfig {
}
