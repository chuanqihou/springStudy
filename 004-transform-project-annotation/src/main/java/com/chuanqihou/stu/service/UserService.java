package com.chuanqihou.stu.service;

import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.mapper.UserMapper;

/**
 * @author 传奇后
 * @date 2023/4/17 11:46
 * @description
 */
public interface UserService {
    boolean saveUser(User user);
}
