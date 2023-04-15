package com.chuanqihou.spring3.factory;

import com.chuanqihou.spring3.dao.UserDao;
import com.chuanqihou.spring3.dao.UserDaoImpl;

/**
 * @author 传奇后
 * @date 2023/4/15 19:20
 * @description
 */
public class DefaultFactory {

    public static <T> T getBean(String className) {
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
