package com.chuanqihou.myspring.core;

/**
 * @author 传奇后
 * @date 2023/4/17 11:53
 * @description
 */
public interface ApplicationContext {

    Object getBean(String beanId);

    <T> T getBean(String beanId, Class<T> tClass);

}
