package com.java.ioAll.io22.cn.demo;

import java.io.File;

/*
 * File类的获取功能
 * */
public class FileDemo3 {
    public static void main(String[] args) {
        function_3();
    }

    /*
     * File获取功能
     * String getParent()
     * File getParentFile()
     * 获取父路径
     * */
    public static void function_3() {
        File file = new File("d:\\java\\java.xmind");
        File parent = file.getParentFile();
        System.out.println(parent);
    }

    /*
     * File获取功能
     * String getAbsolutePath()
     * File getAbsolutePath（）功能相同
     * 获取绝对路径
     * */
    public static void function_2() {
        File file = new File("d:\\java\\java.xmind");
        File absolute = file.getAbsoluteFile();
        System.out.println(absolute);
    }

    /*
     * File获取功能
     * long length()
     * 返回路径中表示的文件的字节数
     * */
    public static void function_1() {
        File file = new File("d:\\java\\java.xmind");
        long length = file.length();
        System.out.println(length);
    }

    /*
     * File 类的获取功能
     * String getName
     * 返回路径中表示的文件或文件夹名
     * 获取路径最后部分的名字
     * */
    public static void function() {
        File file = new File("d:\\java\\java.xmind");
        String name = file.getName();
        System.out.println(name);
    }
}
