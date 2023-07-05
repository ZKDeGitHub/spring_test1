package com.edu.day0705.service;

import com.edu.day0705.entity.User;

/**
 * @Author zk
 * @Date 2023/7/5 15:51
 * @注释：
 * @since 11
 */
public interface UserService {

    void queryById(int id);

    int addUser(User user);

    int editUser(User user);

    int removeUser(int id);

}
