package com.chuanqihou.stu.aop1.target.impl;

import com.chuanqihou.stu.aop1.target.TargetObject;

/**
 * @author 传奇后
 * @date 2023/4/18 11:32
 * @description
 */
public class TargetObjectImpl implements TargetObject {
    @Override
    public void beforeAdviceTargetMethod() {
        System.out.println("具体业务代码——测试前置通知");
    }

    @Override
    public void afterAdviceTargetMethod() {
        System.out.println("具体业务代码实现——测试后置通知");
    }

    @Override
    public void aroundAdviceTargetMethod() {
        System.out.println("具体业务代码实现——测试环绕通知");
    }

    @Override
    public void throwableAdviceTargetMethod() {
        System.out.println("具体业务代码实现——测试异常通知");
        int a = 10 / 0;
    }
}
