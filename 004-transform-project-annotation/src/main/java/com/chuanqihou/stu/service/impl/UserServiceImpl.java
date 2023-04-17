package com.chuanqihou.stu.service.impl;

import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.mapper.UserMapper;
import com.chuanqihou.stu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 传奇后
 * @date 2023/4/17 11:47
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean saveUser(User user) {
        System.out.println("userservice");
        int i = userMapper.insertUser(user);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
