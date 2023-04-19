package com.chuanqihou.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author 传奇后
 * @date 2023/4/17 21:15
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    private List<String> listString;

    private Map<String,String> mapString;

    private String[] array;
}
