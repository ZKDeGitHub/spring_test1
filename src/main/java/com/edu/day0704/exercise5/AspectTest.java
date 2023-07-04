package com.edu.day0704.exercise5;

import com.edu.day0704.exercise5.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_aspect.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.addUser();
    }
}
