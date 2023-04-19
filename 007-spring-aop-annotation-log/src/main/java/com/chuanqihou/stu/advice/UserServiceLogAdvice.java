package com.chuanqihou.stu.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 传奇后
 * @date 2023/4/18 16:19
 * @description
 */
@Component
@Aspect
public class UserServiceLogAdvice {

    private static Logger logger = Logger.getLogger(UserServiceLogAdvice.class);

    @Before("execution(* com.chuanqihou.stu.service..*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        logger.debug("开始执行业务方法..............");
        logger.debug("目标类：" + joinPoint.getTarget() + "，目标方法：" + joinPoint.getSignature().getName() + "，目标方法参数：" + joinPoint.getArgs());
    }

    @AfterReturning(pointcut = "execution(* com.chuanqihou.stu.service..*(..))",returning = "returnValue")
    public void afterAdvice(JoinPoint joinPoint, Object returnValue) {
        logger.debug("执行结束....................");
        logger.debug("目标类：" + joinPoint.getTarget() + "，目标方法：" + joinPoint.getSignature().getName() + "，目标方法参数：" + joinPoint.getArgs()+"，返回值："+returnValue);
    }

    @Around("execution(* com.chuanqihou.stu.service..*(..))")
    public Object roundAdvice(ProceedingJoinPoint joinPoint) {
        logger.debug("环绕通知——前");
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.debug("环绕通知——后");
        return proceed;
    }

}
