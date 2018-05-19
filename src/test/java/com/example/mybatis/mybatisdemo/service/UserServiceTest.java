package com.example.mybatis.mybatisdemo.service;

import com.example.mybatis.mybatisdemo.model.User;
import com.example.mybatis.mybatisdemo.model.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setName("测试用户001");
        user.setAge(10);
        userService.saveUser(user);
    }

    @Test
    public void testQueryUser() {
        User user = userService.queryUserById(1);
        System.out.printf("id=%d,name=%s,age=%d%n", user.getId(), user.getName(), user.getAge());
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(20);
        userService.updateUserById(user);
    }

    @Test
    public void testUpdateByExample() {
        User user = new User();
        user.setName("李四");

        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(1);
        //相当于是update user set name = "李四" where id = 1
        userService.updateByExampleSelective(user, userExample);
    }
 }
