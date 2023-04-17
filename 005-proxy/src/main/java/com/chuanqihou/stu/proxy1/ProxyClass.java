package com.chuanqihou.stu.proxy1;

/**
 * @author 传奇后
 * @date 2023/4/17 16:23
 * @description
 */
public class ProxyClass extends TargetClass {
    @Override
    public void show() {
        System.out.println("前置通知");
        super.show();
        System.out.println("后置通知");
    }
}
