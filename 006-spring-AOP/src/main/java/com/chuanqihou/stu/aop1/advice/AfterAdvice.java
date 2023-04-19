package com.chuanqihou.stu.aop1.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author 传奇后
 * @date 2023/4/18 11:41
 * @description
 */
public class AfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("spring原生AOP实现【后置通知】");

    }
}
