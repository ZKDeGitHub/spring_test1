package com.edu.day0704.exercise5.aspect;

import org.springframework.stereotype.Component;

@Component
public class CutomAspect {
    public void before(){
        System.out.println("前置通知执行了 ");
        System.out.println("开始记录日志");
    }
}
