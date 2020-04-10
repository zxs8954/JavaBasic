package com.java.ioAll.io23.demo3;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 字节输出流：
 *       java.io.writer 所有字符输出流的超类
 *       写文件，写文本文件
 *
 * 写的方法write
 *   write(int c)写一个字符
 *   write(char[] c)写字符数组
 *   write(char[] c,int,int)字符数组一部分，开始索引，写几个
 *   write(String s)写入字符串
 *
 * Writer 子类对象FileWriter
 * 构造方法：写入的数据目的
 *   File 类型对象
 *   String 文件名
 *
 * 字符输出流：写数字的时候，必须运行一个功能，刷新功能
 * */
public class WriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("d:\\b.txt");
        //写一个字符
        fw.write(100);
        fw.flush();//写字符必须刷新
        //写字符数组
        char[] c={'a','b','c','d','e'};
        fw.write(c);
        fw.flush();
        //写字符数组的一部分
        fw.write(c,2,2);
        fw.flush();
        //写入字符串
        fw.write("写入的字符串");
        fw.flush();
        fw.close();
    }
}
