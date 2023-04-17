package com.chuanqihou.stu.proxy3;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 传奇后
 * @date 2023/4/17 16:30
 * @description
 */
public class CjlibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("后置");
        return o1;
    }
}
