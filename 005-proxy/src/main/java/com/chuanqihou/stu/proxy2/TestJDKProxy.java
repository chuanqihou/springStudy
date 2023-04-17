package com.chuanqihou.stu.proxy2;

import com.chuanqihou.stu.proxy2.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 传奇后
 * @date 2023/4/17 16:26
 * @description
 */
public class TestJDKProxy {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        UserService u = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前置通知");
                method.invoke(userService, args);
                System.out.println("后置通知");
                return null;
            }
        });

        u.add();

    }
}
