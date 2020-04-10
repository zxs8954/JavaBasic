package com.java.map20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map的遍历
 *   利用键获取值
 *   Map接口定义方法KeySet
 *   所有键的值，存储到Set集合中
 * */
public class MapDemo1 {
    public static void main(String[] args) {
        /*
         * 1.调用map集合方法keySet，所有值存储到Set集合中
         *2.遍历set集合，获取set集合中所有的元素（Map的键）
         * 3.调用map集合get，通过键获取到值
         * */
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("c", 4);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println("{" + key + "=" + value + "}");
        }
        System.out.println("===========");
        for (String key : set){
            System.out.println(map.get(key));
        }
    }
}
