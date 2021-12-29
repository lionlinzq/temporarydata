package com.demo.springbootmybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.springbootmybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lin
 * @PACKAGE_NAME com.demo.springbootmybatisplus.dao
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
