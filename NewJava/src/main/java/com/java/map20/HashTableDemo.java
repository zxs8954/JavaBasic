package com.java.map20;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/*
* Map接口实现类HashTable
* 底层数据结果哈希表，特点和HashMap是一样的
* HashTable线程安全集合
* HashMap集合线程不安全
* HashTable命运和vector一样
* HashMap允许存储null值和键
* HashTable不允许存储空值
* HashTable子类Properties用的多   HashTable不用了
* */
public class HashTableDemo {
    public static void main(String[] args) {
        Map<String,String> map=new Hashtable<String, String>();//hashTable不能存储null
        map.put(null,null);
        System.out.println(map);

        ArrayList<String> arrayList=new ArrayList<String>();//Lamdba表达式
        arrayList.add("123");
        arrayList.forEach(eye->System.out.println(eye));
    }
}
