package com.chuaniqhou.myspring;

import com.chuanqihou.myspring.core.ApplicationContext;
import com.chuanqihou.myspring.core.ClassPathXMLApplicationContext;
import com.chuanqihou.myspring.domain.User;
import org.junit.Test;

/**
 * @author 传奇后
 * @date 2023/4/17 13:49
 * @description
 */
public class TestMySpring {

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXMLApplicationContext("myspring-config.xml");
        Object user = ac.getBean("user");
        System.out.println(user);
        User user1 = ac.getBean("user", User.class);
        System.out.println(user1);
    }

}
