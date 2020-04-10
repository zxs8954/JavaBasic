package com.java.list19.set.hashset;

import java.util.HashSet;


/*
* HashSet 存储：会先调用hashcode比较哈希值，如果哈希值相同，然后调用对象的equals比较哈希值相同的元素比教，他们是不是相同元素
* */
public class HashSetDemo1 {
    public static void main(String[] args) {
//        HashSet<String> set=new HashSet<String>();
//        set.add(new String("abc"));
//        set.add(new String("bbc"));
//        set.add(new String("abc"));
//        set.add(new String("bbc"));
//        set.add(new String("cba"));
//        System.out.println(set);

        //将Person对象的姓名和年龄相同的数据看做同一个对象
        //判断对象是否重复，依赖对象自己的方法，hashCode和equals
        HashSet<Person> setPerson=new HashSet<Person>();
        setPerson.add(new Person("a",20));
        setPerson.add(new Person("b",21));
        setPerson.add(new Person("b",21));// 相同b不输出的原因是因为Person重写了hashCode和equals
        setPerson.add(new Person("c",22));
        System.out.println(setPerson);
    }
}
