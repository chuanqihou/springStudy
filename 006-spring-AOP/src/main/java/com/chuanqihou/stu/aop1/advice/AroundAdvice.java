package com.chuanqihou.stu.aop1.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author 传奇后
 * @date 2023/4/18 11:48
 * @description
 */
public class AroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("前——【环绕通知】");
        Object proceed = invocation.proceed();
        System.out.println("后——【环绕通知】");
        return proceed;
    }
}
