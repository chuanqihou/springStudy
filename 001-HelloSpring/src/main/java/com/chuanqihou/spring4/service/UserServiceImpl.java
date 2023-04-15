package com.chuanqihou.spring4.service;

import com.chuanqihou.spring4.dao.UserDao;
import com.chuanqihou.spring4.factory.DefaultFactory;
import com.chuanqihou.spring4.factory.DefaultFactory2;

/**
 * @author 传奇后
 * @date 2023/4/15 19:16
 * @description
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = DefaultFactory2.getBean("userDao");

    public void insert() {
        userDao.insertUser();
    }
}
