package com.edu.day0705.service.impl;

import com.edu.day0705.entity.User;
import com.edu.day0705.mapper.UserMapper;
import com.edu.day0705.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author zk
 * @Date 2023/7/5 15:51
 * @注释：
 * @since 11
 */
@Service
public class UserServiceImpl implements UserService {

/*
    @Resource // 交给spring创建此bean
    UserMapper userMapper;
*/

    @Override
    public void queryById(int id) {
        System.out.println("UserServiceImpl.queryById()：" + id);

    }

   /* @Override
    public int addUser(User user) {
*//*        int i = userMapper.insertUser(user);
        return i;*//*
        System.out.println("UserServiceImpl的addUser执行了");
        return 0;
    }

    @Override
    public int editUser(User user) {
        return 0;

    }

    @Override
    public int removeUser(int id) {
        System.out.println("UserServiceImpl的removeUser执行了");
*//*        int i = userMapper.deleteUser(id);
        return i;*//*
        return 0;
    }*/
}
