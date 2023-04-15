package com.chuanqihou.spring4.factory;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author 传奇后
 * @date 2023/4/15 19:20
 * @description
 */
public class DefaultFactory {

    private static Properties properties = new Properties();

    static {
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("bean.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T getBean(String beanName) {

        String className = properties.getProperty(beanName);
        if (className == null) {
            return null;
        }
        T t = null;
        try {
            Class<?> objClass = Class.forName(className);
            t = (T) objClass.newInstance();
            return t;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }

}
