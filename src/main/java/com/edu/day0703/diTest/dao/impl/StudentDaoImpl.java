package com.edu.day0703.diTest.dao.impl;

import com.edu.day0703.diTest.dao.StudenDao;

public class StudentDaoImpl implements StudenDao {

    @Override
    public void insertStudent() {
        System.out.println("开始向数据库插入学生信息");
    }

    @Override
    public void deleteStudent(int id) {
        System.out.println("开始向数据库删除学生信息");
    }
}
