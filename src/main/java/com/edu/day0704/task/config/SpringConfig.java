package com.edu.day0704.task.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author zk
 * @Date 2023/7/5 11:32
 * @注释：
 * @since 11
 */
@Configuration
@ComponentScan("com.edu.day0704.task")
@EnableAspectJAutoProxy
public class SpringConfig {

}
