package com.java.collection18.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //集合可以存储任意类型的对象
        //集合中不指定存储的数据类型，集合什么都存
        Collection coll=new ArrayList();
        coll.add("abcasdad");
        coll.add("bcd");
        //迭代器获取
        Iterator it=coll.iterator();
        while (it.hasNext()){
            //it.next()获取出来是什么数据类型，object类型
            //Object obj=it.next();
            String s=(String)it.next();
            System.out.println(s.length());
            //目的就是用集合的时候要加泛型
        }
    }
}
