package com.chuaniqhou.spring;

import com.chuanqihou.spring4.servlet.UserServlet;
import org.junit.Test;

/**
 * @author 传奇后
 * @date 2023/4/15 19:32
 * @description
 */
public class TestSpring4 {
    @Test
    public void testSpring4() {
        UserServlet userServlet = new UserServlet();
        userServlet.insert();
    }
}
