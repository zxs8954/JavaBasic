package com.java.reflect33.demo1;

import java.lang.reflect.Method;

/*
*反射获取成员方法
* public void eat(){}
* */
public class ReflectDemo6 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.java.reflect33.demo.Person");
        Object obj=c.newInstance();
        //获取class对象中的成员方法
        //Method[] getMethods获取class文件中所有的公共成员方法，包括继承的
//        Method[] methods=c.getMethods();
//        for(Method m:methods){
//            System.out.println(m);
//        }
        //获取指定方法eat()
        //Method getMethod(String methodName,Class ....c)
        //methodName 方法名     Class ....c 参数列表
        Method method=c.getMethod("eat");
        //运行eat()   invoke(Object obj,Object...0)
        method.invoke(obj);
    }
}
