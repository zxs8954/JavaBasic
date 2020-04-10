package com.java.list19.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 迭代器的并发修改异常
* java.util.ConcurrentModificationException 在遍历的过程中使用了集合的方法修改了集合的长度
* */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        //对集合使用迭代器进行获取，获取的时候判断集合是否存在adb3对象
        //如果有，添加ABC3
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String s=it.next();
            //对取出的元素s判断，是否有abc3
            if(s.equals("abc3")){
                //list.add("ABC3");   遍历的过程中不允许修改集合长度
            }
            System.out.println(s);
        }
    }
}
