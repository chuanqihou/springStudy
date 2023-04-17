package com.chuanqihou.stu.servlet;

import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 传奇后
 * @date 2023/4/17 11:47
 * @description
 */
@Controller
public class UserServlet {

    @Autowired
    private UserService userService;

    public void addUser(User user) {
        boolean b = userService.saveUser(user);
        System.out.println("servlet，插入状态："+b);
    }

}
