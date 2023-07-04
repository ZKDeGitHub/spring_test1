package com.edu.day0704.exercise6.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//声明spring容器管理
@Component
//声明是切面类
@Aspect
public class CustomAspect {

    // 替换xml中的切入点配置
    @Pointcut
    public void pc(){

    }
}
