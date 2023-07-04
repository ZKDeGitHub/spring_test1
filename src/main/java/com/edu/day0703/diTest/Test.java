package com.edu.day0703.diTest;

import com.edu.day0703.diTest.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zk
 * @className: Server
 * @description: ToDo
 * @date: 2023/07/03/23:16
 * @since: 11
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_di_test.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        System.out.println(studentService);
        studentService.addStudent();
    }
}
