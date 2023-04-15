package com.chuanqihou.spring2.factory;

import com.chuanqihou.spring2.dao.UserDao;
import com.chuanqihou.spring2.dao.UserDaoImpl;
import com.chuanqihou.spring2.dao.UserDaoImpl2;

/**
 * @author 传奇后
 * @date 2023/4/15 19:20
 * @description
 */
public class DefaultFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

}
