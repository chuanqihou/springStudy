package com.chuanqihou.stu.aop2.target.impl;

import com.chuanqihou.stu.aop2.target.TargetObject;

/**
 * @author 传奇后
 * @date 2023/4/18 13:32
 * @description
 */
public class TargetObjectImpl implements TargetObject {
    @Override
    public void beforeAdviceTargetMethod() {
        System.out.println("具体业务代码实现——测试前置通知");
    }

    @Override
    public String afterAdviceTargetMethod(String msg) {
        System.out.println("具体业务代码实现——测试后置通知" + msg);
        return msg;
    }

    @Override
    public void aroundTargetMethod() {
        System.out.println("具体业务代码实现——测试环绕通知");
    }

    @Override
    public void throwableTargetMethod() {
        System.out.println("具体业务代码实现——测试异常通知");
        int a = 10 / 0;
    }


}
