package com.java.list19.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* set接口，特点不重复，没索引
* set接口的实现类，HashSet(哈希表)
* 特点：无序集合，存储和取出顺序不同，没有索引，不存储重复元素
*
* */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("cn");
        set.add("itcast");
        set.add("java");//重复元素只会取出一个
        set.add("java");
        Iterator<String> it=set.iterator();
        while ((it.hasNext())){
            System.out.println(it.next());
        }
        for(String s:set){
            System.out.println(s);
        }
    }
}
