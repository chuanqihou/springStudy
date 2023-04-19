package com.chuanqihou.stu.aop1.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author 传奇后
 * @date 2023/4/18 11:30
 * @description
 */
public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("spring原生AOP实现【前置通知】");

    }
}
