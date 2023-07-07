package com.edu.day0705;


import com.edu.day0705.config.SpringConfig;
import com.edu.day0705.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zk
 * @className: Server
 * @description: ToDo
 * @date: 2023/07/06/8:10
 * @since: 11
 */
public class Test {
   public static void main(String[] args) {

      //注解方式获取容器的方法
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      UserService bean = context.getBean(UserService.class);
      bean.queryById(10007);

   }




}
