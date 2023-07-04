package com.edu.day0703.ioc.entity;

public class Student {
    private int id;
    private String name;

    public Student() {
        System.out.println("Student无参构造执行了");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

