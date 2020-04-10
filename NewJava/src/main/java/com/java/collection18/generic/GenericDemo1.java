package com.java.collection18.generic;

import java.util.ArrayList;

/*
 * 带有泛型的类
 * E: element元素，E的实际思想就是一个变量
 * ArrayList<Integer> E接收的类型就是Integer类型
 * public class ArrayList<E>{
 *       public boolean add(E e){
 *           elementData[size++]=e
 *          }
 *   }
 *   Iterator<E>
 * 此类不运行，只是做个例子，介绍泛型
 * */
public class GenericDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(456);
        //ArrayList集合，自己有个方法
        //<T> T[] toArray(T[] a)
        Integer[] i = new Integer[arrayList.size()];
        Integer[] j = arrayList.toArray(i);
        for (Integer k : j) {
            System.out.println(k);
        }
    }
}
