package com.chuanqihou.spring;

import com.chuanqihou.spring.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 传奇后
 * @date 2023/4/15 17:25
 * @description
 */
public class TestAnnotation {

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = ac.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = ac.getBean("user", User.class);
        System.out.println(user);
    }
}
