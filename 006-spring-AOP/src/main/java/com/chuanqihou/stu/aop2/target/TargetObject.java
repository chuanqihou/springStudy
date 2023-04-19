package com.chuanqihou.stu.aop2.target;

/**
 * @author 传奇后
 * @date 2023/4/18 13:32
 * @description
 */
public interface TargetObject {

    void beforeAdviceTargetMethod();

    String afterAdviceTargetMethod(String msg);

    void aroundTargetMethod();

    void throwableTargetMethod();

}
