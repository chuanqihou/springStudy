package com.chuanqihou.stu.service.impl;

import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.mapper.UserMapper;
import com.chuanqihou.stu.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 传奇后
 * @date 2023/4/19 9:04
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserById(Long userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    public PageInfo<User> queryUserByPage(Integer pageNum, Integer pageSize) {

        Page<User> userPage = PageHelper.startPage(pageSize, pageNum);

        userMapper.selectAllUser();

        return userPage.toPageInfo();
    }

    /**
     *
     * @param user
     * @return
     */
    @Transactional
    @Override
    public int saveUser(User user) {
        int i = userMapper.insertUser(user);
        //int a = 10 / 0;
        return i;
    }
}
