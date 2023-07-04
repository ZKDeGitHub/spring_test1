package com.edu.day0704.exercise5.aspect;

import org.springframework.stereotype.Component;

@Component
public class SecondAspect {
    public void before(){
        System.out.println("前置通知...");
    }
}
