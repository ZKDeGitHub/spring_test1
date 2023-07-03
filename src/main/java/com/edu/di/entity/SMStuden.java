package com.edu.di.entity;

import lombok.Data;

@Data
public class SMStuden {
    private int id;
    private String name;
    private Computer computer;

    public SMStuden(){
        System.out.println("SMStuden对象创建了");
    }
}
