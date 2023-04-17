package com.chuanqihou.myspring.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 传奇后
 * @date 2023/4/17 11:56
 * @description
 */
public class ClassPathXMLApplicationContext implements ApplicationContext{

    private String classLocation;

    private Map<String, Object> objectMap;

    public ClassPathXMLApplicationContext(String classLocation) {
        this.classLocation = classLocation;
        try {
            //解析xml文件
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(ClassLoader.getSystemResourceAsStream(classLocation));
            Element rootElement = document.getRootElement();

            List<Element> elements = rootElement.elements();

            objectMap = new HashMap<>();

            elements.forEach(element -> {
                try {
                    String beanId = element.attributeValue("id");
                    String className = element.attributeValue("class");
                    System.out.println("beanId:"+beanId+","+className);

                    Class<?> myClass = Class.forName(className);

                    Object o = myClass.newInstance();

                    objectMap.put(beanId, o);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            });

            //System.out.println(objectMap);

        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object getBean(String beanId) {
        return objectMap.get(beanId);
    }

    @Override
    public <T> T getBean(String beanId, Class<T> tClass) {
        return (T) objectMap.get(beanId);
    }
}
