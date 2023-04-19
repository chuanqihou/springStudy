package com.chuanqihou.stu.aop1.target;

/**
 * @author 传奇后
 * @date 2023/4/18 11:32
 * @description
 */
public interface TargetObject {

    void beforeAdviceTargetMethod();

    void afterAdviceTargetMethod();

    void aroundAdviceTargetMethod();

    void throwableAdviceTargetMethod();

}
