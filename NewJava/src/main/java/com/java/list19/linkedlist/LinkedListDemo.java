package com.java.list19.linkedlist;

import java.util.LinkedList;

/*
 * LinkedList 链表集合的特有功能
 *  自身特点：链表底层实现，查询慢，增删快
 *
 * 子类特有功能，不能多态调用
 *
 * */
public class LinkedListDemo {
    public static void main(String[] args) {
        function_3();
    }
    /*
    * E removeFirst() 移除并返回链表的开头
    * E removeLast() 移除并返回链表的结尾
    * */
    public static void function_3(){
        LinkedList<String> link=new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        String first=link.removeFirst();
        String last=link.removeLast();
        System.out.println(link);
        System.out.println(first+last);
    }
    /*
     * E getFirst() 获取链表的开头
     * E getLast() 获取链表的结尾
     * */
    public static void function_2() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        //link.clear();
        //if(!link.isEmpty())和 if (link.size() != 0) 效果是一样的
        if (link.size() != 0) {
            String first = link.getFirst();
            String last = link.getLast();
            System.out.println(first);
            System.out.println(last);
        }
    }

    public static void function_1() {
        LinkedList<String> link = new LinkedList<String>();
        link.addLast("a");
        link.addLast("b");
        link.addLast("c");
        link.addLast("d");
        link.addFirst("1");
        link.addFirst("2");
        link.addFirst("3");
        System.out.println(link);
    }

    /*
     * addFirst(E)  添加到链表开头
     * addLast(E)    添加到链表结尾
     * */
    public static void function() {
        LinkedList<String> link = new LinkedList<String>();
        link.addLast("黑马");//此时链表是空的，只添加了这一个元素
        link.add("abc");
        link.add("bcd");
        link.addFirst("itCast");
        link.addLast("最后");
        System.out.println(link);
    }
}
