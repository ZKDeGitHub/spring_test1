package com.edu.ioc;

import com.edu.ioc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

    }

    private static void method2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        // 方式一
        Object stu1 = context.getBean("stu1");

        // 方式二
        Student stu2 = context.getBean(Student.class);

        // 方式三
        Student stu3 = context.getBean("stu1", Student.class);
    }

    private static void method1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student stu1 = (Student) context.getBean("stu1");
        System.out.println(stu1);

    }
}
