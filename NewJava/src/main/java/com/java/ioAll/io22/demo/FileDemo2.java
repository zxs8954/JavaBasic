package com.java.ioAll.io22.cn.demo;

import java.io.File;
import java.io.IOException;

/*
 * File 类的创建和删除功能
 * 文件或者是目录
 * 删除方法不走回收站
 * */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        function2();
    }
    /*
     * File删除功能
     * boolean delete()
     * 删除文件或者是文件夹，在File的构造方法中给出
     * */
    public static void function2(){
        File file=new File("d:\\创建文件夹\\abc\\bcd\\a.txt");//删除的是bcd目录下的a.txt
        boolean b=file.delete();
        System.out.println(b);
    }
    /*
     * File创建文件夹
     * boolean mkdir()  不推荐使用
     * boolean mkdirs()创建多级文件夹
     * 创建的路径在File构造方法中给出
     * */
    public static void function1(){
        File file=new File("d:\\创建文件夹\\abc\\bcd");
        boolean b=file.mkdirs();
        System.out.println(b);
    }
    /*
     * File创建文件功能
     * boolean createNewFile()
     * 创建的文件路径和文件名，在File构造方法中给出
     * 文件已经存在就不在创建
     * */
    public static void function() throws IOException {
        File file = new File("d:\\a.txt");//只能创建文件
        boolean b = file.createNewFile();
        System.out.println(b);
    }
}
