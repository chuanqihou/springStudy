package com.chuanqihou.spring3.dao;

/**
 * @author 传奇后
 * @date 2023/4/15 19:14
 * @description
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser() {
        System.out.println("【mysql】成功插入一条用户数据");
    }
}
