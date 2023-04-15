package com.chuanqihou.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author 传奇后
 * @date 2023/4/14 11:42
 * @description
 */
//@Data
@AllArgsConstructor
//@NoArgsConstructor
public class User {
    /**
    * 用户id
    */
    private Integer userId;

    private String userName;

    private String userPassword;

    private Integer userAge;

    public User() {
        System.out.println("user无参构造");
    }

    public void init() {
        System.out.println("init方法执行了");
    }

    public void destroy() {
        System.out.println("bean实例销毁！");
    }

}