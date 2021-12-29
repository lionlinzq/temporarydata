package com.demo.springbootmybatis;

import com.demo.springbootmybatis.dao.UserDao;
import com.demo.springbootmybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        System.out.println(userDao.getById(1));
        List<User> list = userDao.getAll();
        System.out.println(list);
    }

    @Test
    void addUser() {
            User user = new User();
            user.setUserId(11);
            user.setUserName("a");
            userDao.addUser(user);
    }

}
