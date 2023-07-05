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

    @Insert("INSERT INTO tb_user VALUES(#{id},#{userName},#{birthday},#{gender},#{address})")
    int insertUser(User user);

    @Delete("DELETE FROM tb_use WHERE id=#{id}")
    int deleteUser(int id);

    @Update("UPDATE tb_user SET user_name=#{userName},user_address=#{userAddress} WHERE id=#{id}")
    int updateUser(User user);

    @Select("SELECT * FROM tb_user WHERE id=#{id}")
    User selectById(int id);

    @Select("SELECT * FROM tb_user")
    List<User> selectAll();


}
