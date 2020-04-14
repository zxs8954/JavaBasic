package com.java.reflect33.demo1;

import java.lang.reflect.Constructor;

/*
* 获取私有构造方法
* 不推荐，破坏程序封装和安全性
* */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.java.reflect33.demo.Person");
        //Constructor[] getDeclaredConstructors()获取所有构造方法，包括私有的
        Constructor[] cons=c.getDeclaredConstructors();
        for(Constructor con:cons){
            System.out.println(con);
        }
//获取私有构造方法 getDeclaredConstructor（Class...c）获取指定参数列表的参数构造方法
        Constructor c1=c.getDeclaredConstructor(int.class,String.class);
        //Constructor 父类AccessibleObject,定义方法setAccessible(boolean b)
        c1.setAccessible(true);//这样才可以调用私有构造器,取消了权限检查，菜实现了私有构造方法的获取
        Object obj=c1.newInstance(18,"123");
        System.out.println(obj);
    }
}
