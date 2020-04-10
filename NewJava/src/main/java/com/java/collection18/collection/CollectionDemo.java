package com.java.collection18.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * collection 接口中的方法
 * 是集合中实现类必须具有的方法
 * 使用collection接口实现类，程序演示
 * ArrayList 实现list接口，list继承了 collection
 * 方法的执行都是实现类的重写
 * */
public class CollectionDemo {
    public static void main(String[] args) {
        function_3();
    }
    /*
    * Collection接口方法
    * boolean remove(Object o)移除集合中指定元素
    * */
    public static void function_3(){
        Collection<String> coll=new ArrayList<String >();
        coll.add("abc");
        coll.add("abc");
        coll.add("itCast");
        coll.add("money");
        System.out.println(coll);
        boolean b=coll.remove("abc");//删除成功返回true,失败返回false
        System.out.println(coll);
        System.out.println(b);
    }
    /*
    * Collection接口方法
    *Object[] toArray() 集合找那个的元素，转成一个数组中额元素，集合转数组
    * 返回一个存储对象的数组，数组存储的数据类型是Object
    * */
    public static void function_2(){
        Collection<String> coll=new ArrayList<String >();
        coll.add("abc");
        coll.add("itCast");
        coll.add("money");
        Object[] objects=coll.toArray();
        for(int i=0;i<objects.length;i++){
            System.out.println(objects[i]);
        }
    }
    /*
     * 学习java中三种长度表现形式
     * 数组 .length 返回int
     * 字符串 .length 返回int
     * 集合 .size 返回int
     * */

    /*
     * collection 接口方法
     * boolean contains(Object o) 判断对象是否存在于集合中对象存在返回true
     * */
    public static void function_1() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("itCast");
        coll.add("money");
        boolean b = coll.contains("abc");
        boolean c = coll.contains(1);
        System.out.println(b);
        System.out.println(c);
    }

    /*
     * Collection 接口方法
     * void clear()清空集合中所有元素
     * 集合本身依然存在，只是clear后元素不显示了
     * */
    public static void function() {
        //有序结合，1、set是无序，不允许重复 2、list,可以重复，有序
        //接口多态方式调用
        Collection<String> coll = new ArrayList<String>();//多态调用，走子类重写
        coll.add("abc");
        coll.add("bcd");
        coll.clear();
        System.out.println(coll);
        coll.add("aaa");
        System.out.println(coll);
    }


}
