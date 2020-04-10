package com.java.map20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 集合操作的工具类
 *   Collections
 * */
public class CollectionsDemo {
    public static void main(String[] args) {
        function_2();
    }
    /*
    * shuffle
    * 对list集合中的元素，进行随机排序
    * */
    public static void function_2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
    /*
     * .binarySearch静态方法
     * 对list进行二分搜索，传递list集合，传递被查找的元素,返回元素的索引
     * */
    public static void function_1() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(20);
        int index = Collections.binarySearch(list, 15);
        System.out.println(index);
    }

    /*
     * .sort静态方法
     *   对于list集合进行升序排列，set没有索引，不能用
     * */
    public static void function() {
        //创建list集合
        List<String> list = new ArrayList<String>();
        list.add("qwe");
        list.add("asd");
        list.add("hgggg");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
