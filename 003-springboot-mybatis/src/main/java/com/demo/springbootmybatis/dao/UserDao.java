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

    @Results(id = "userResult",value = {
            @Result(id = true,property = "userId",column = "user_id"),
            @Result(property = "userName",column = "user_name")
    })


    //删除用户
    @Delete("delete from user where user_id = #{user_id}")
    int deleteUser(int id);

}
