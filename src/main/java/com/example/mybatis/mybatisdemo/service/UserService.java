package com.example.mybatis.mybatisdemo.service;

import com.example.mybatis.mybatisdemo.model.User;
import com.example.mybatis.mybatisdemo.model.UserExample;

public interface UserService {

    /**
     * 新增用户
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User queryUserById(int id);

    /**
     * 根据id修改用户
     * @param user
     * @return
     */
    int updateUserById(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteUserById(int id);

    /**
     * 根据userExample更新
     * @param user
     * @param userExample
     * @return
     */
    int updateByExampleSelective(User user, UserExample userExample);
}
