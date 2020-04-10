package com.java.collection18.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* 泛型的作用：指定集合中存储的数据类型，防止出现类型转换异常
* JDK1.5出现新的安全机制，保证程序的安全性
* 泛型：指明了集合中存储数据的类型<数据类型>
* java中的泛型是伪泛型，规定了泛型，泛型不符合编译失败，但是在.class中不存在泛型，保证安全性，泛型符合编译通过
* */
public class GenericDemo {
    public static void main(String[] args) {
        function();
    }

    public static void function() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("adaadsa");
        //coll.add(678999987);  数据类型为String，所以int类型不可以
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            //System.out.println(it.next());
            //String s=it.next();
            System.out.println(it.next().length());
        }
    }
}
