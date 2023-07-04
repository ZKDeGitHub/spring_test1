package com.edu.day0703.ioc.entity;

/**
 * @author: zk
 * @className: Server
 * @description: ToDo
 * @date: 2023/07/03/21:45
 * @since: 11
 */
public class Computer {
   public Computer(){
      System.out.println("Computer构造器执行了");
   }
   public void init(){
      System.out.println("Computer初始化动作");
   }
   public void destory(){
      System.out.println("Computer销毁之前执行的动作");

   }
}
