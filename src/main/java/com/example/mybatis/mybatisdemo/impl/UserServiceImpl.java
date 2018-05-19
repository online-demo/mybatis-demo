package com.example.mybatis.mybatisdemo.impl;

import com.example.mybatis.mybatisdemo.dao.UserDao;
import com.example.mybatis.mybatisdemo.model.User;
import com.example.mybatis.mybatisdemo.model.UserExample;
import com.example.mybatis.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    @Override
    public int saveUser(User user) {
        return userDao.insert(user);
    }

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User queryUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    /**
     * 根据id修改用户
     *
     * @param user
     * @return
     */
    @Override
    public int updateUserById(User user) {
        return userDao.updateByPrimaryKey(user);
    }


    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @Override
    public int deleteUserById(int id) {
        return userDao.deleteByPrimaryKey(id);
    }

    /**
     * 根据userExample更新
     *
     * @param user
     * @param userExample
     * @return
     */
    @Override
    public int updateByExampleSelective(User user, UserExample userExample) {
        return userDao.updateByExampleSelective(user, userExample);
    }
}
