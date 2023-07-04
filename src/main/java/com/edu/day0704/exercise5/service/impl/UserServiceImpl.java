package com.edu.day0704.exercise5.service.impl;

import com.edu.day0704.exercise5.service.UserService;
import com.edu.day0704.exercise5.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public void addUser() {
        userDao.insertUser();
    }
}
