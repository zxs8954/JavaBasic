package com.java.ioAll.io22.cn.demo;

import java.io.File;

/*
*   java.io.File
*       将操作系统中的文件，目录（文件夹）,路径，封装成File对象
*       提供方法，操作系统中的内容
*       File与系统无关
*       文件：file
*       目录：directory
*       路径：path
* */
public class FileDemo {
    public static void main(String[] args) {
        //File类静态成员变量
        //与系统有关的路径分割符
        String separator=File.pathSeparator;
        System.out.println(separator);//是一个 ; 路径分隔符，表示目录分割，Linux是：
        //与系统有关的默认名称分割符
        separator=File.separator;
        System.out.println(separator); // \向右目录名称分隔符
    }
}
