package com.chuanqihou.stu.mapper.impl;

import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @author 传奇后
 * @date 2023/4/17 11:45
 * @description
 */
@Repository
public class UserMapperImpl implements UserMapper {
    @Override
    public int insertUser(User user) {
        System.out.println("成功插入一条数据"+user);
        return 1;
    }
}
