package com.java.ioAll.io24.demo;

import java.io.*;

/*
 * 转换流
 *       java.io.OutPutStreamWriter    继承Writer类
 *       就是一个字符输出流，写文本文件
 *       write() 字符，字符数组，字符串
 *       字符通向字符流的桥梁，可以将符节流转字节流
 * OutputStreamWriter 使用方法
 *   构造方法：
 *       OutputStreamWriter（OutputStream out）接受所有字节输出流
 *       但是：字节输出流：FileOutStream
 * OutputStreamWriter（OutputStream out,String charseName）
 * String charseName 传递编码表名字 gbk,utf-8  编码不区分大小写
 *
 * OutputStreamWriter  有个子类  FileWrite但是他不能指定编码表
 * */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        writeGbk();
    }
    /*
     * 转换流OutputStreamWriter写文本
     * 文本采用utf-8形式写入
     * */
    public static void writeGbk1() throws IOException {
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream("d:\\utf.txt");
        //创建转换流对象，构造方法绑定字节输出流
        OutputStreamWriter ose = new OutputStreamWriter(fos, "UTF-8");//gbk默认可以不写
        //使用转换流写数据
        ose.write("你好1");
        ose.close();
    }
    /*
     * 转换流OutputStreamWriter写文本
     * 文本采用GBK形式写入
     * */
    public static void writeGbk() throws IOException {
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream("d:\\gbk.txt");
        //创建转换流对象，构造方法绑定字节输出流
        OutputStreamWriter ose = new OutputStreamWriter(fos, "GBK");//gbk默认可以不写
        //使用转换流写数据
        ose.write("你好1");
        ose.close();
    }
}
