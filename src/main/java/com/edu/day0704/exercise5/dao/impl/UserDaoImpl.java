package com.edu.day0704.exercise5.dao.impl;

import com.edu.day0704.exercise5.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void insertUser() {
        System.out.println("userDao向数据库插入了代码");
    }
}
