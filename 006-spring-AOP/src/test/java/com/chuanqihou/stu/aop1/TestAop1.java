package com.chuanqihou.stu.aop1;

import com.chuanqihou.stu.aop1.target.TargetObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 传奇后
 * @date 2023/4/18 11:39
 * @description
 */
public class TestAop1 {

    @Test
    public void testBeforeAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config1.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        targetObject.beforeAdviceTargetMethod();
    }

    @Test
    public void testAfterAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config1.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        targetObject.afterAdviceTargetMethod();
    }

    @Test
    public void testAroundAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config1.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        targetObject.aroundAdviceTargetMethod();
    }

    @Test
    public void testThrowableAdvice() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config1.xml");
        TargetObject targetObject = ac.getBean("targetObject", TargetObject.class);
        targetObject.throwableAdviceTargetMethod();
    }

}
