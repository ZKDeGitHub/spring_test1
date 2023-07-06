package com.edu.day0704.exercise6;

import com.edu.day0704.exercise6.config.SpringConfig;
import com.edu.day0704.exercise6.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author zk
 * @Date 2023/7/5 10:32
 * @since 11
 * @注释
 */
public class Tset {
    public static void main(String[] args) {

        //注解方式获取容器的方法
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService bean = context.getBean(UserService.class);
        bean.addUser(10,"test");

    }
}
