package com.java.map20.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * 使用呢HashMap集合，存储自定义对象
 * 自定义对象，作为键初夏出现，作为值出现
 *
 * */
public class HashMapDemo {
    public static void main(String[] args) {
        function_1();
    }
    /*
    * HashMap存储自定义对象Person，作为键出现
    * 键的对象是Person类型，只是字符串
    * 保证键的唯一性，存储到键的对象时，重写hashCode equals
    * */
    public static void function_1(){
        HashMap<Person,String> map=new HashMap<Person,String>();
        map.put(new Person("a",20),"里约热内卢");
        map.put(new Person("a",20),"里约热内卢");
        map.put(new Person("a",20),"里约热内卢");
        map.put(new Person("aaa",20),"里约热内卢");
        map.put(new Person("b",21),"索马里");
        map.put(new Person("c",22),"百慕大");
        for(Person key:map.keySet()){
            String value=map.get(key);
            System.out.println(key+value);
        }
        System.out.println("==============");
        for(Map.Entry<Person,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
    /*
     * 存储自定义对象Person，作为值出现
     * 键的对象，是字符串，可以保证唯一性
     * */
    public static void function() {
        HashMap<String, Person> map = new HashMap<String, Person>();
        map.put("beijing", new Person("a", 20));
        map.put("shanghai", new Person("b", 201));
        map.put("guangzhou", new Person("c", 202));
        for (String key : map.keySet()) {
            Person value = map.get(key);
            System.out.println(key + value);
        }
        System.out.println("================");
        for(Map.Entry<String,Person> entry:map.entrySet()){
            String key=entry.getKey();
            Person value=entry.getValue();
            System.out.println(key+value);
        }
    }
}
