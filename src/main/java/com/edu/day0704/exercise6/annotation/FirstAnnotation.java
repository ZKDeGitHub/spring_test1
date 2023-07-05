package com.edu.day0704.exercise6.annotation;


import java.lang.annotation.*;

/**
 * 使用注解必须要有元注解
 * 自定义注解内部若有成员，必须赋值
 * 元注解的成名名称为value时可以省略，例如下面的@Target
 */

//@Target(value = {ElementType.FIELD,ElementType.TYPE})
@Target({ElementType.METHOD})//表示用于何处，此例为用于方法
@Retention(RetentionPolicy.RUNTIME)//表示生命周期可以到运行时
@Documented//生成文档相关
public @interface FirstAnnotation {
}
