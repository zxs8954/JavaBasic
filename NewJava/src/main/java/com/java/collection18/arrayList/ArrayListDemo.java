package com.java.collection18.arrayList;

import java.util.ArrayList;
/*
* 集合体系
*   目标：集合本身是一个存储的容器
*           必须会使用集合存储对象
*           遍历集合，取出对象
*           集合自己的特性
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        * 集合ArrayList存储int类型
        * 集合本身不接受基本类，自动装箱
        * */
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }
        /*
        * c存储自定义Person类的对象
        * */
        ArrayList<Person> arrayPer=new ArrayList<Person>();
        arrayPer.add(new Person("a",20));
        arrayPer.add(new Person("b",201));
        arrayPer.add(new Person("c",202));
        for (int i=0;i<arrayPer.size();i++){
            //get(0),取出Person对象
            //打印的是一个对象，必须调用toString()
            System.out.println(arrayPer.get(i));
        }

    }
}
