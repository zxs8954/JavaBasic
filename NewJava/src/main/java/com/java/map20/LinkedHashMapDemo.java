package com.java.map20;

import java.util.LinkedHashMap;

/*
* LinkedHashMap继承自HashMap
* 保证迭代的顺序
* */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> link=new LinkedHashMap<String,String>();
        link.put("1","a");
        link.put("2","b");
        link.put("3","c");
        System.out.println(link);
    }
}
