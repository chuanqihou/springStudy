package com.chuanqihou.stu.service;

import com.chuanqihou.stu.domain.User;
import com.github.pagehelper.PageInfo;

/**
 * @author 传奇后
 * @date 2023/4/19 9:01
 * @description
 */
public interface UserService {

    User queryUserById(Long userId);

    PageInfo<User> queryUserByPage(Integer pageNum, Integer pageSize);

    int saveUser(User user);

}
