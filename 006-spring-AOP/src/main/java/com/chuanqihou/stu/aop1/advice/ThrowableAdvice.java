package com.chuanqihou.stu.aop1.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author 传奇后
 * @date 2023/4/18 13:20
 * @description
 */
public class ThrowableAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e) {
        System.out.println("spring原生AOP实现【异常通知】");
    }

}
