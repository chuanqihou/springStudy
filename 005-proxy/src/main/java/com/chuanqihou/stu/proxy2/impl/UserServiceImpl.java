package com.chuanqihou.stu.proxy2.impl;

import com.chuanqihou.stu.proxy2.UserService;

/**
 * @author 传奇后
 * @date 2023/4/17 16:26
 * @description
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户成共");
    }
}
