package com.java.ioAll.io23.demo1;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 读取文件
 *       读取方法 int read(byte[] b) 读取字节数组
 *       数组作用：缓冲的作用，提升效率
 *       read返回的int，表示什么含义   读取的字节数
 * */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\a.txt");
        //创建字节数组
        byte[] b = new byte[1024];
        int len=0;
        while ((len=fis.read(b))!=-1){
            System.out.println(new String(b,0,len));//读取的标准写法
        }
//        int len = fis.read(b);
//        System.out.println(new String(b));
//        System.out.println(len);
//        len = fis.read(b);
//        System.out.println(new String(b));
//        System.out.println(len);
//        len = fis.read(b);
//        System.out.println(new String(b));
//        System.out.println(len);
//        fis.close();
    }
}
