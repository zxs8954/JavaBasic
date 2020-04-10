package com.java.collection18.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 泛型的通配符
* */
public class GenericDemo3 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();

        HashSet<Integer> set=new HashSet<Integer>();
        array.add("123");
        array.add("456");
        set.add(789);
        set.add(890);
        iterator(array);
        iterator(set);
    }
    /*
    * 定义一个方法同时迭代2个集合
    * 参数：怎么实现？  2个集合参数类型不同
    * 参数：共同实现的接口
    * 泛型的通配，匹配所有的数据类型 ？
    * */
    public static void iterator(Collection<?> coll){
        Iterator<?> it=coll.iterator();
        while (it.hasNext()){
            //it.next()获取对象，什么类型
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}
