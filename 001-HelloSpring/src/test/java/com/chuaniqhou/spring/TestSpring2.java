package com.chuaniqhou.spring;

import com.chuanqihou.spring2.servlet.UserServlet;
import org.junit.Test;

/**
 * @author 传奇后
 * @date 2023/4/15 19:22
 * @description
 */
public class TestSpring2 {
    @Test
    public void testSpring1() {
        UserServlet userServlet = new UserServlet();
        userServlet.insert();
    }
}
