package com.java.ioAll.io22.cn.demo1;

import java.io.File;

/*
 * File类获取功能
 * list
 * listFile
 * */
public class FileDemo {
    public static void main(String[] args) {
        function2();
    }
    public static void function2(){
        File[] fileArr=File.listRoots();//打印所有根目录
        for(File f:fileArr){
            System.out.println(f);
        }
    }
    /*
     * File类的获取功能
     * File[] listFiles()
     *
     * */
    public static void function1(){
        File file = new File("e:\\程序员自学\\01_北京黑马最新基础班");
        File[] fileArr=file.listFiles();
        for(File f:fileArr){
            System.out.println(f);
        }
    }
    /*
     * File类的获取功能
     * String[] list()
     * 获取到File构造方法中的路径中的文件和文件夹名（遍历一个目录）
     * */
    public static void function() {
        File file = new File("e:\\程序员自学\\01_北京黑马最新基础班");
        String[] strArr = file.list();
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
