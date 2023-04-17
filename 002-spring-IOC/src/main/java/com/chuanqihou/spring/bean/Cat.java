package com.chuanqihou.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 传奇后
 * @date 2023/4/15 18:38
 * @description
 */
@AllArgsConstructor
@Data
public class Cat {

    private String name;

    public Cat() {
        System.out.println("cat无参构造");
    }
}
