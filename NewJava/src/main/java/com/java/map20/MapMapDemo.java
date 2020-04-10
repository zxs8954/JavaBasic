package com.java.map20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合的嵌套，Map中存储的还是Map集合
* 要求：
*   传智播客
*       java基础班
*           001 张三
*           002 李四
*       java就业办
*           001王五
*           002赵六
* 对以上对象进行集合的存储
* 001 张三 键值对
*
* */
public class MapMapDemo {
    public static void main(String[] args) {
        //定义基础班级
        HashMap<String,String> javaSe=new HashMap<String, String>();
        //定义就业班
        HashMap<String,String> javaEe=new HashMap<String, String>();
        //向班级集合中存储学生信息
        javaSe.put("001","张三");
        javaSe.put("002","李四");
        javaEe.put("001","王五");
        javaEe.put("002","赵六");
        //创建传智播客容器，键是班级名字，值是2个班级容器
        HashMap<String,HashMap<String,String>> czbk=new HashMap<String, HashMap<String, String>>();
        czbk.put("基础班",javaSe);
        czbk.put("就业班",javaEe);
        System.out.println(czbk);
        entrySet(czbk);
    }
    public static void keySet(HashMap<String,HashMap<String,String>> czbk){
        //调用czbk集合方法keySet将键存储到Set集合
        Set<String> classNameSet=czbk.keySet();
        //迭代set集合
        Iterator<String> classNameIt=classNameSet.iterator();
        while (classNameIt.hasNext()){
            //classNameIt.next获取出来的是Set集合元素，czbk的键
            String classNameKey=classNameIt.next();
            //czbk集合的方法get获取值，只是一个HashMap集合
            HashMap<String,String> classMap=czbk.get(classNameKey);
            //调用classMap集合方法keySet，键存储到Set集合
            Set<String> studentNum=classMap.keySet();
            Iterator<String> studentIt=studentNum.iterator();
            while (studentIt.hasNext()){
                //studentIt.next获取出来的是classMap的键，学号
                String numKey=studentIt.next();
                //调用classMap集合中方法get获取值
                String nameValue=classMap.get(numKey);
                System.out.println(classNameKey+".."+numKey+"..."+nameValue);
            }
        }
    }
    public static void entrySet(HashMap<String,HashMap<String,String>> czbk){
        //调用czbk集合方法entrySet方法，将czbk集合的键值对关系对象存储到Set集合
        Set<Map.Entry<String,HashMap<String,String>>> classNameSet=czbk.entrySet();
        //迭代器迭代set集合
        Iterator<Map.Entry<String,HashMap<String,String>>> classNameIt=classNameSet.iterator();
        while (classNameIt.hasNext()){
            //classNameIt.next方法，取出的是czbk集合的键值对关系对象
            Map.Entry<String,HashMap<String,String>> classEntry=classNameIt.next();
            //classEntry方法getKey和getValue
            String classNameKey=classEntry.getKey();
            //获取值，值是一个HashMap集合
            HashMap<String,String> classMap=classEntry.getValue();
            //调用班级集合classMap方法entrySet，键值对关系对象存储Set集合
            Set<Map.Entry<String,String>> studentSet=classMap.entrySet();
            //迭代set集合
            Iterator<Map.Entry<String,String>> studentIt=studentSet.iterator();
            while (studentIt.hasNext()){
                //studentIt.hasNext()方法next获取出的是班级集合的键值对关系对象
                Map.Entry<String,String> studentEntry=studentIt.next();
                //studentEntry方法getKey和getValue
                String numKey=studentEntry.getKey();
                String nameValue=studentEntry.getValue();
                System.out.println(classNameKey+"..."+numKey+".."+nameValue);
            }
        }
    }
}
