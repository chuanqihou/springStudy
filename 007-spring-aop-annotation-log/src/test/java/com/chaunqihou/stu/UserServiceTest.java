package com.chaunqihou.stu;

import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 传奇后
 * @date 2023/4/18 16:25
 * @description
 */
public class UserServiceTest {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService bean = ac.getBean(UserService.class);
        int aa = bean.saveUser(new User(1001, "李四"));
        System.out.println(aa);
    }
}
