package com.java.collection18.forMax;

/*
 * jdk1.5新特性，增强for循环
 * jdk1.5版本后，出现新接口java.lang.Iterable
 *  Collection 继承Iterable
 *   Iterable作用为是实现 增强for循环
 * 格式：
 *      for(数据类型 变量名： 数组或者集合){
 *          sop(变量)
 *      }
 * */
import com.java.collection18.arrayList.Person;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        function_2();
    }
    /*
    * 增强for遍历集合
    * 存储自定义Person类型
    * */
    public static void function_2(){
        ArrayList<Person> array=new ArrayList<Person>();
        array.add(new Person("a",20));
        array.add(new Person("b",21));
        for(Person p:array){
            System.out.println(p);
        }
    }
    public static void function_1() {
        String[] str = {"abc", "it", "cn"};
        for (String s : str) {
            System.out.println(s);
        }
    }

    /*
     * 实现for循环，遍历数组
     * 好处：代码少了，方便遍历容器的元素
     * 弊端：没有索引，不能操作容器的元素
     * */
    public static void function() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
