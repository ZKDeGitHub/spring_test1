package com.edu.day0705.mapper;

import com.edu.day0704.task.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author zk
 * @Date 2023/7/5 15:50
 * @注释：
 * @since 11
 */
@Mapper
public interface UserMapper {
    List<User> selectAll();
}
