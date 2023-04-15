package com.chuanqihou.spring2.service;

import com.chuanqihou.spring2.dao.UserDao;
import com.chuanqihou.spring2.dao.UserDaoImpl;
import com.chuanqihou.spring2.factory.DefaultFactory;

/**
 * @author 传奇后
 * @date 2023/4/15 19:16
 * @description
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = DefaultFactory.getUserDao();

    public void insert() {
        userDao.insertUser();
    }
}
