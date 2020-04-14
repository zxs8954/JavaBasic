package com.java.reflect33.demo1;

import java.lang.reflect.Field;

/*
 * 反射获取成员变量，并修改值
 * Person类中的成员变量String name
 * */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.java.reflect33.demo.Person");
        Object obj=c.newInstance();
        //获取成员变量，Class类的方法getFields()class文件中所有公共的成员变量
        //Field[] getFields()
        //Field[] fields=c.getFields(); 获取共有变量
        //Field[] fields=c.getDeclaredFields(); 获取所有变量
//        Field[] fields=c.getDeclaredFields();//获取所有变量
//        for(Field f:fields){
//            System.out.println(f);
//        }
        //获取指定成员变量
        Field field=c.getField("name");
        //Field类方法void set(Object obj,Object value)，修改成员变量的值
        //Object obj必须有对象支持 Object value修改后的值
        field.set(obj,"王五");
        System.out.println(obj);
        //学到了11节课
    }
}
