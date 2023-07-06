package com.edu.day0704.exercise6.service.impl;

import com.edu.day0704.exercise6.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Integer addUser(int i,String str) {
        System.out.println("核心代码已执行");
        return 6;
    }
}
