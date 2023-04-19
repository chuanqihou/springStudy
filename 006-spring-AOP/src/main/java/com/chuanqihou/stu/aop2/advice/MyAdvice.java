package com.chuanqihou.stu.aop2.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 传奇后
 * @date 2023/4/18 13:33
 * @description
 */
public class MyAdvice {

    public void beforeAdvice() {
        System.out.println("aspecjt【前置通知/增强】");
    }

    public String afterAdvice(String msg,String returnValue) {
        System.out.println("aspectj【后置通知/增强（带参/返回值）msg="+msg+",return:"+returnValue);
        //msg += "123";
        return returnValue;
    }

    public void roundAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("aspectj【环绕通知】前");
        try {
            Object proceed = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("aspectj【环绕通知】后");
    }

    public void throwableAdvice(Exception e) {
        System.out.println("aspectj【异常通知】");
    }


}
