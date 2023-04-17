package com.chuanqihou.spring.factory;

import com.chuanqihou.spring.bean.User;

/**
 * @author 传奇后
 * @date 2023/4/17 8:27
 * @description
 */
public class StaticFactoryDemo {

    public static User createBean() {
        return new User();
    }

}
