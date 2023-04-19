package com.chuanqihou.stu.aop2;

import com.chuanqihou.stu.aop2.target.TargetObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 传奇后
 * @date 2023/4/18 13:41
 * @description
 */
public class TestAop2 {
    @Test
    public void testBeforeAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config2.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        targetObject.beforeAdviceTargetMethod();
    }

    @Test
    public void testAfterAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config2.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        String s = targetObject.afterAdviceTargetMethod("Hello");
        System.out.println(s);
    }

    @Test
    public void testAroundAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config2.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        targetObject.aroundTargetMethod();
    }

    @Test
    public void testThrowableAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config2.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        targetObject.throwableTargetMethod();
    }

}
