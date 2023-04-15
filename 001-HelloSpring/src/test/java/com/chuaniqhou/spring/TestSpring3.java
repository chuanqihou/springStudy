package com.chuaniqhou.spring;

import com.chuanqihou.spring3.servlet.UserServlet;
import org.junit.Test;

/**
 * @author 传奇后
 * @date 2023/4/15 19:26
 * @description
 */
public class TestSpring3 {
    @Test
    public void testSpring3() {
        UserServlet userServlet = new UserServlet();
        userServlet.insert();
    }
}
