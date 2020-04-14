package com.java.reflect33.demo;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
* 通过反射获取class文件中的构造方法，运行构造方法
* 运行构造方法，创建对象
*   获取class文件对象
*   从class文件对象中，获取需要的成员
* */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c=Class.forName("com.java.reflect33.demo.Person");
        //获取构造方法
        // Constructor[] getConstructors()获取文件对象中所有公共的构造方法
//        Constructor[] cons=c.getConstructors();
//        for(Constructor con:cons){
//            System.out.println(con);
//        }

        //获取指定构造方法,空参数
        Constructor con=c.getConstructor();
        //运行空参数构造方法，Constructor类方法newInstance()运行获取到的构造方法
        Object obj=con.newInstance();
        System.out.println(obj);
    }
}
