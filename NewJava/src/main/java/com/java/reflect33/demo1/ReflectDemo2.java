package com.java.reflect33.demo1;

import java.lang.reflect.Constructor;

/*
* 通过反射获取有参数构造方法，并运行
* */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.java.reflect33.demo.Person");
        //获取带有，String和int参数的构造方法
        Constructor con=c.getConstructor(String.class,int.class);
        //T newInstance()
        Object obj=con.newInstance("aa",22);
        System.out.println(obj);
    }
}
