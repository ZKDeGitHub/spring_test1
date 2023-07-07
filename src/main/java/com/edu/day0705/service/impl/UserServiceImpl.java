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

    @Resource
    private UserMapper userMapper;
    @Override
    public User queryById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int editUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int removeUser(long id) {
        return userMapper.deleteUser(id);
    }
}
