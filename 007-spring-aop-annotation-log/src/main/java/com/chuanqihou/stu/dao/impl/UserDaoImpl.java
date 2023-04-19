package com.chuanqihou.stu.dao.impl;

import com.chuanqihou.stu.dao.UserDao;
import com.chuanqihou.stu.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author 传奇后
 * @date 2023/4/18 16:16
 * @description
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int insertUser(User user) {
        System.out.println("成功插入一条数据" + user);
        return 1;
    }
}
