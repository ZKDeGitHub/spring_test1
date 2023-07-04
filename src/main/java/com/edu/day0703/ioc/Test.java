package com.edu.day0703.ioc;

import com.edu.day0703.ioc.entity.Computer;
import com.edu.day0703.ioc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        method5();

    }

    private static void method5() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Computer computer = context.getBean("computer", Computer.class);
        context.close();
    }

    /*
    * 第一次“无参构造执行了”，是因为配置中还有一个单例模式
    * */
    private static void method4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student stu1 = context.getBean("stu2", Student.class);
        Student stu2 = context.getBean("stu2", Student.class);
        System.out.println(stu1);
        System.out.println(stu2);
    }

    /*
    * spring默认情况下是单例的，也就是说一个bean只会创建一个对象，存在内置map中，之后无论获取多少次该bean，都返回同一个对象
    * */
    private static void method3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student stu1 = context.getBean("stu1", Student.class);
        Student stu2 = context.getBean("stu1", Student.class);
        System.out.println(stu1);
        System.out.println(stu2);
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
