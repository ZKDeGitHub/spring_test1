package com.edu.day0705.mapper;

import com.edu.day0705.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author zk
 * @Date 2023/7/5 15:50
 * @注释：
 * @since 11
 */
@Mapper
public interface UserMapper {
    @Select("select * from tb_user ")
    List<User> selectAll();

    @Select("select * from tb_user where id =#{id}")
    User selectById(int id);

    @Insert("insert into tb_user values(#{id},#{userName},#{birthday},#{gender},#{address}) ")
    int insertUser(User user);

    @Update("update tb_user set user_name=#{userName} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from tb_user where id =#{id}")
    int deleteUser(long id);


}
