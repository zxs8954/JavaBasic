package com.java.reflect33.demo1;

import java.lang.reflect.Method;

/*
* 反射运行有参数方法
* public void sleep(String,int,double){}
* */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.java.reflect33.demo.Person");
        Object obj=c.newInstance();
        //调用Class类方法getMethod获取指定的方法sleep
        Method method=c.getMethod("sleep",String.class,int.class,double.class);
        method.invoke(obj,"休眠",100,88.99);
    }
}
