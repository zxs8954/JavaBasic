package com.java.ioAll.io22.cn.demo;

import java.io.File;

/*
 * File类的构造方法
 * 三种重载形式
 * */
public class FileDemo1 {
    public static void main(String[] args) {
        function2();
    }
    /*
    * File(File parent,String child）
    * 传递路径，传递File类型父路径，字符串子路径
    * */
    public static void function2(){
        File parent=new File("d:");
        File file=new File(parent,"java");
        System.out.println(file);
    }
    /*
    * File(String parent,String child)
    * 传递路径，传递字符串父路径，字符串子路径
    * */
    public static void function1(){
        File file=new File("c:","windows");
        System.out.println(file);
    }
    /*
     * File（String pathname）
     * 传递路径名：可以写到一个文件夹，可以写到一个文件
     * 将路径封装成File类型的对象
     * */
    public static void function() {
        File file = new File("E:\\程序员自学\\01_北京黑马最新基础班");//windows路径不区分大小写
        System.out.println(file);
    }
}
