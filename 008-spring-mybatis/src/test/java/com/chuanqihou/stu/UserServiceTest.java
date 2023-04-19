package com.chuanqihou.stu;

import com.chuanqihou.stu.domain.User;
import com.chuanqihou.stu.service.UserService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 传奇后
 * @date 2023/4/19 10:19
 * @description
 */
public class UserServiceTest {

    @Test
    public void testQueryUserById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        User user = userService.queryUserById(2L);
        System.out.println(user);
    }

    @Test
    public void testQueryUserAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        PageInfo<User> userPageInfo = userService.queryUserByPage(1, 2);

        System.out.println(userPageInfo);
        System.out.println(userPageInfo.getList());
    }

}
