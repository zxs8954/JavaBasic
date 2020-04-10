package com.java.properties25.demo;

import java.util.Properties;
import java.util.Set;

/*
 * 继承HashTable，实现Map接口
 * 可以和IO对象结合使用，实现数据的持久存储
 * */
public class PropertiesDemo {
    public static void main(String[] args) {
        function();
    }

    /*
     * 存储键值对
     * setProperty等同于Map接口中的put
     * setProperty(String key,String value)
     * 通过键获取值，getProperty(String key)
     * */
    public static void function() {
        Properties p = new Properties();
        p.setProperty("a", "1");
        p.setProperty("b", "2");
        p.setProperty("c", "3");
        System.out.println(p);
        System.out.println(p.getProperty("a"));
        //方法：stringPropertyNames()将集合中的键存储到Set集合中，类似于Map接口的方法keySet
        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"  "+p.getProperty(key));
        }
    }

}
