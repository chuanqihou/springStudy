package com.chuanqihou.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 传奇后
 * @date 2023/4/15 17:24
 * @description
 */

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Value("梨书皇")
    private String userName;

    @Autowired
    private Cat cat;

}
