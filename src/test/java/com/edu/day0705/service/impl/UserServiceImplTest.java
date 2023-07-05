package com.edu.day0705.service.impl;

import com.edu.day0705.config.SpringConfig;
import com.edu.day0705.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author: zk
 * @className: Server
 * @description: ToDo
 * @date: 2023/07/05/23:07
 * @since: 11
 */
@RunWith(SpringJUnit4ClassRunner.class) //测试依赖包
@ContextConfiguration(classes = SpringConfig.class) //声明配置文件位置
public class UserServiceImplTest {
   @Resource
   private UserService userService;

   @org.junit.Test
   public void queryById() {
    userService.queryById(10007);
   }

   @org.junit.Test
   public void method1(){
      userService.removeUser(10007);

   }

}