package com.chuanqihou.spring4.servlet;

import com.chuanqihou.spring4.service.UserService;
import com.chuanqihou.spring4.service.UserServiceImpl;

/**
 * @author 传奇后
 * @date 2023/4/15 19:08
 * @description
 */
public class UserServlet {

    UserService userService = new UserServiceImpl();

    public void insert() {
        userService.insert();
    }


}
