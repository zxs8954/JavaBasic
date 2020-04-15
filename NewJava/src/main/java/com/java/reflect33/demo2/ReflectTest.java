package com.java.reflect33.demo2;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
*  定义结合泛型String
*   要求向集合中添加Integer
* */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        ArrayList<String> array=new ArrayList<String>();
        array.add("a");
        //array.add(1);会报错，但是泛型是伪泛型，通过反射可以添加
        //编译后的class文件时没有泛型的
        //反射方式，获取集合类的class文件对象
        Class c=array.getClass();
        //获取集合方法add   invoke(Object obj,Object ....o) 第一个参数是对象，第二是多参数
        Method method=c.getMethod("add",Object.class);
        method.invoke(array,1);
        for (Object o:array){
            System.out.println(o);
        }
        System.out.println(array);
    }
}
