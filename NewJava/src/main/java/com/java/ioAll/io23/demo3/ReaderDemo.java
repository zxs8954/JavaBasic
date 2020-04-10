package com.java.ioAll.io23.demo3;

import java.io.FileReader;
import java.io.IOException;

/*
 * 字符输入流读取文本文件
 *   作用：专门读取文本文件
 *   读取的方法：read()
 *       read()读取一个字符，字符数组
 * Reader是抽象类，找到子类FileReader
 * 构造方法：绑定数据源
 *   参数：String
 *           File
 * */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("d:\\b.txt");
//        int len=0;
//        while ((len=fr.read())!=-1){
//            System.out.print((char)len);//char查询unicode万国码
//        }
//        fr.close();
        char[] ch=new char[1024*10];
        int len=0;
        while ((len=fr.read(ch))!=-1){
            System.out.print(new String(ch,0,len));
        }
        fr.close();
    }
}
