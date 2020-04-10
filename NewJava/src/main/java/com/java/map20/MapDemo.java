package com.java.map20;

import java.util.HashMap;
import java.util.Map;

/*
 * Map接口常用方法
 *   使用Map接口实现类HashMap
 * */
public class MapDemo {
    public static void main(String[] args) {
        function_2();
    }
    /*
    * 移除集合中的减值对,返回被移除之前的值
    * v remove（k）
    * */
    public static void function_2(){
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        String s=map.remove(1);
        String s1=map.remove(5);//没有这个键会返回null
        System.out.println(s);
        System.out.println(s1);
    }
    /*
    * 通过键对象，获取值对象
    * V get(i)
    * */
    public static void function_1(){
        //创建集合对象，作为键的对象整数，值的对象存储字符串
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map);
        String value=map.get(4); //没有4这个键，返回null
        System.out.println(value);
        System.out.println(map);
    }
    /*
     * 将键值存储到集合中
     *   返回值value put(key,value)
     *   不能有重复键，有重复键，会把原有值覆盖
     *      map.put一般返回的是空，当有重复键的时候，会返回被覆盖的值
     * */
    public static void function() {
        //创建集合对象HashMap存储对象，键是字符串，值是整数

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d",4);
        Integer i=map.put("d",5);//("d",4)被覆盖，返回4
        System.out.println(map);
        System.out.println(i);
    }
}
