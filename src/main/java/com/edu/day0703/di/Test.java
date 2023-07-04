package com.edu.day0703.di;

import com.edu.day0703.di.entity.SMStuden;
import com.edu.day0703.di.entity.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zk
 * @className: Server
 * @description: ToDo
 * @date: 2023/07/03/22:40
 * @since: 11
 */
public class Test {
   public static void main(String[] args) {
      method3();
   }

   /*测试自动注入*/
   private static void method3() {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_di_3.xml");
      SMStuden smStudent = context.getBean("smStudent", SMStuden.class);
      SMStuden smStudent2 = context.getBean("smStudent2", SMStuden.class);
      System.out.println(smStudent);
      System.out.println(smStudent2);
   }

   /*测试引用注入*/
   private static void method2() {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_di_2.xml");
      SMStuden smStudent = context.getBean("smStudent", SMStuden.class);
      System.out.println(smStudent);
   }

   /*
   * 测试基本注入
   * */
   private static void method1() {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_di_1.xml");
      Teacher teacher = context.getBean("teacher", Teacher.class);
      System.out.println(teacher);
   }
}
