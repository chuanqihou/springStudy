package com.chuanqihou.stu.mapper;

import com.chuanqihou.stu.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 传奇后
 * @date 2023/4/19 8:57
 * @description
 */
public interface UserMapper {

    /**
     * 根据Id查询用户信息
     * @param userId    用户Id
     * @return  User对象
     */
    User selectUserById(@Param("userId") Long userId);

    /**
     * 查询所有用户信息
     * @return  返回用户数据
     */
    List<User> selectAllUser();

    /**
     * 插入用户信息
     * @param user
     * @return
     */
    int insertUser(User user);

}
