package com.chuanqihou.spring3.service;

import com.chuanqihou.spring3.dao.UserDao;
import com.chuanqihou.spring3.factory.DefaultFactory;

/**
 * @author 传奇后
 * @date 2023/4/15 19:16
 * @description
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = DefaultFactory.getBean("com.chuanqihou.spring3.dao.UserDaoImpl");

    public void insert() {
        userDao.insertUser();
    }
}
