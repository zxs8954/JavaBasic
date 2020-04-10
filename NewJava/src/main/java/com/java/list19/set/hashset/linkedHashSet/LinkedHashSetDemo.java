package com.java.list19.set.hashset.linkedHashSet;

import java.util.LinkedHashSet;

/*
* LinkedHashSet 基于链表的哈希表实现
* LinkedHashSet 自身特性，具有顺序，存储和取出的顺序相同
* 线程不安全，运行速度快，双向链
* */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link=new LinkedHashSet<Integer>();
        link.add(123);
        link.add(312);
        link.add(1231312313);
        System.out.println(link);
    }
}
