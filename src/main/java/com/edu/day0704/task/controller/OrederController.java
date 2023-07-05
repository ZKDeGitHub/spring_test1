package com.edu.day0704.task.controller;

import com.edu.day0704.task.entity.User;
import org.springframework.stereotype.Controller;

/**
 * @Author zk
 * @Date 2023/7/5 11:13
 * @注释：
 * @since 11
 */
@Controller
public class OrederController {

   public void add(User user){
      System.out.println("增加执行");
   }
   public void remove(User user){
      System.out.println("删除执行");

   }
   public void edit(User user){
      System.out.println("修改执行");

   }
   public void query(User user){
      System.out.println("查询执行");
   }
}
