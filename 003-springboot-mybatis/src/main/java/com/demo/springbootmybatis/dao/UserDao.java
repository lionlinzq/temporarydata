package com.demo.springbootmybatis.dao;

import com.demo.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author lin
 * @PACKAGE_NAME com.demo.springbootmybatis.dao
 */
@Mapper
public interface UserDao {

    @Select("select * from user where user_id = #{user_id}")
    User getById(Integer id);

    @Select("select * from user")
    List<User> getAll();

    @Insert("insert into user (userId,userName) values(#{userId},#{userName})")
    int addUser(User user);

    @Update("update user set user_name=#{username} where user_id = #{user_id}")
    int updateUser(User user);

    //删除用户
    @Delete("delete from user where user_id = #{user_id}")
    int deleteUser(int id);

}
