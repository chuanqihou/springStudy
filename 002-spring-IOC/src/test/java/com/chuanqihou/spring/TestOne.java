package com.chuanqihou.spring;

import com.chuanqihou.spring.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 传奇后
 * @date 2023/4/15 15:27
 * @description
 */
public class TestOne {

    @Test
    public void testCreateUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);

        ((ClassPathXmlApplicationContext)ac).close();
    }

    @Test
    public void testName() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);

        Object u = ac.getBean("u");
        System.out.println(u);

        Object us = ac.getBean("us");
        System.out.println(u);
    }

    @Test
    public void testDependsOn() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testInitMethod() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testDestroy() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testScope() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user1 = ac.getBean("user1");
        System.out.println(user1);
        Object user11 = ac.getBean("user1");
        System.out.println(user11);

        System.out.println("===========================================");

        Object user2 = ac.getBean("user2");
        System.out.println(user2);
        Object user22 = ac.getBean("user2");
        System.out.println(user22);
    }

    @Test
    public void testLazyInit() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user1 = ac.getBean("user1");
        Object user2 = ac.getBean("user2");
    }

    @Test
    public void testStaticFactoryCreateBean() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testFactoryCreateBean() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testConstructorSimpleValue() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testConstructorRefValue() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testSetValue() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testIdAndName() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
    }

}
