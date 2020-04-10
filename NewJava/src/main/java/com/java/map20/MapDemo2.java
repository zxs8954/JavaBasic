package com.java.map20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合的获取方式
*   entrySet方法，键值对的映射关系（结婚证）获取
*   实现步骤：
*       1.调用map集合方法entrySet（）将集合中的映射关系对象，存储到Set集合中
*       Set<Entry<k,v>>
        2.迭代set集合
        3.获取Set集合的元素，是映射关系
        4.通过映射关系对象方法getKey，getValue获取键值对
* */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"abc");
        map.put(2,"bcd");
        //1.调用map集合entrySet（）将集合中的映射关系 对象存储到Set集合
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        //2.迭代set集合
        Iterator<Map.Entry<Integer,String>> it=set.iterator();
        while (it.hasNext()){
            //3.获取出的Set集合元素，是映射关系对象
            //it.next获取的是什么对象，也是Map.Entry对象
            Map.Entry<Integer,String> entry=it.next();
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+value);
        }
        System.out.println("=====================");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
