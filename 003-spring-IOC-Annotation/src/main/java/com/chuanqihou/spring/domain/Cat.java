package com.chuanqihou.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 传奇后
 * @date 2023/4/17 16:59
 * @description
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {

    @Value("小啸")
    private String name;
    @Value("1")
    private Integer age;

}
