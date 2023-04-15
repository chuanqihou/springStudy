package com.chuanqihou.spring1.service;

import com.chuanqihou.spring1.dao.UserDao;
import com.chuanqihou.spring1.dao.UserDaoImpl;

/**
 * @author 传奇后
 * @date 2023/4/15 19:16
 * @description
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();
    public void insert() {
        userDao.insertUser();
    }
}
