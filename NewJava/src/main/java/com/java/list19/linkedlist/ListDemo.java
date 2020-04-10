package com.java.list19.linkedlist;

import java.util.ArrayList;
import java.util.List;

/*
 * list接口派系，继承collection接口
 * List接口特点：有序，有索引，可以重复
 *   实现类ArrayList，LinkedList
 * List接口中的抽象方法，有一部分方法和他的父类接口是一样的
 * List接口自己的特有方法，带有索引的功能
 * */
public class ListDemo {
    public static void main(String[] args) {
        function_2();
    }
    /*
    * E set(int index,E)返回被修改之前的元素,不能索引越界
    * */
    public static void function_2(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer i=list.set(0,5);
        System.out.println(i);
        System.out.println(list);
    }
    /*
    * E remove(int index)
    * 移除指定索引的元素
    * 返回被删除的元素
    * */
    public static void function_1(){
        List<Double> list=new ArrayList<Double>();
        list.add(1.1);
        list.add(1.2);
        list.add(1.3);
        Double d=list.remove(0);
        System.out.println(d);
        System.out.println(list);
    }
    /*
     * add(int index,E)
     * 将元素将元素插入到列表指定索引上
     * */
    public static void function() {
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        System.out.println(list);
        list.add(4, "itCast");
        System.out.println(list);
    }
}
