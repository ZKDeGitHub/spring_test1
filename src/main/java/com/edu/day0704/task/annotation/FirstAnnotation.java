package com.edu.day0704.task.annotation;

import com.edu.day0704.task.enum1.UserRole;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author zk
 * @Date 2023/7/5 11:10
 * @注释：
 * @since 11
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotation {

    //自建标签设置属性
    UserRole[] value();
}
