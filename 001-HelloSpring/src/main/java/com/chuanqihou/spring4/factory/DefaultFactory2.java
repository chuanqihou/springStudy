package com.chuanqihou.spring4.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 传奇后
 * @date 2023/4/15 19:20
 * @description
 */
public class DefaultFactory2 {

    private static Properties properties = new Properties();

    private static Map<String, Object> map = new HashMap<>();

    static {
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("bean.properties"));

            Set<String> keys = properties.stringPropertyNames();
            for (String key : keys) {
                String value = properties.getProperty(key);
                Class<?> objClass = Class.forName(value);
                Object o = objClass.newInstance();
                map.put(key, o);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static <T> T getBean(String beanName) {
        Object o = map.get(beanName);
        if (o == null) {
            return null;
        }
        return (T) o;
    }

}
