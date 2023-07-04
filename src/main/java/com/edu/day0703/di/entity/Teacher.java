package com.edu.day0703.di.entity;

import lombok.Data;

import java.util.*;

/**
 * @author: zk
 * @className: Server
 * @description: 基本注入测试类
 * @date: 2023/07/03/22:31
 * @since: 11
 */
/*@Data ： 注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法*/
@Data
public class Teacher {
    private Integer id;
    private String password;
    private String gender;
    private Integer age;
    private Date birthday;
    private String[] hobbies;
    private Set<String> phones;
    private List<String> names;
    private Map<String, String> countries;
    private Properties files;
}
