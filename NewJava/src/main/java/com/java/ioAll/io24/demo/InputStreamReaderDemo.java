package com.java.ioAll.io24.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 转换流
 *   java.io.InputStreamReader
 *   字符输入流，读取文本文件
 *
 *   read()读取一个字符，读取字符数组
 * 技巧：OutputStreamWriter 写文件
 * InputStreamReader读文件
 * InputStreamReader（OutputStream out）
 * 可以传递字节输入流：FileInputStream
 * OutputStreamWriter（inputStream input,charsetName）
 * */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        readUTF8();
    }
    /*
     * 转换流，InputStreamReader读取文本
     * 采用utf-8
     * */
    public static void readUTF8() throws IOException {
        //创建字节输入流，传递文本文件
        FileInputStream fis = new FileInputStream("d:\\utf.txt");
        //创建转换流独享，构造方法，包装字节输入流即可
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        char[] ch = new char[1024];
        int len = isr.read(ch);
        System.out.println(new String(ch, 0, len));
    }
    /*
     * 转换流，InputStreamReader读取文本
     * 采用默认编码表
     * */
    public static void readGBK() throws IOException {
        //创建字节输入流，传递文本文件
        FileInputStream fis = new FileInputStream("d:\\gbk.txt");
        //创建转换流独享，构造方法，包装字节输入流即可
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        char[] ch = new char[1024];
        int len = isr.read(ch);
        System.out.println(new String(ch, 0, len));
    }
}
