package com.chuaniqhou.spring;

import com.chuanqihou.spring1.servlet.UserServlet;
import org.junit.Test;

/**
 * @author 传奇后
 * @date 2023/4/15 19:17
 * @description
 */
public class TestSpring {

    @Test
    public void testSpring1() {
        UserServlet userServlet = new UserServlet();
        userServlet.insert();
    }
}
