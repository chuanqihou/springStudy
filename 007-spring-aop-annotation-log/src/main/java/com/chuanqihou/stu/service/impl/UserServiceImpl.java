package com.chuanqihou.stu.service.impl;

import com.chuanqihou.stu.dao.UserDao;
import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 传奇后
 * @date 2023/4/18 16:14
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int saveUser(User user) {
        return userDao.insertUser(user);
    }
}
