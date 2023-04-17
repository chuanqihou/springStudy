package com.chuanqihou.stu.proxy3;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author 传奇后
 * @date 2023/4/17 16:32
 * @description
 */
public class TestCjlib {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new CjlibProxy());

        UserService userService = (UserService) enhancer.create();

        userService.add();

    }
}
