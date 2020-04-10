package com.java.ioAll.io24.demo1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
*字节输入流的缓冲流
*       java.io.BufferedOutputStream  继承InputStream，标准的字节输入流
*       读取方法read()单个字节，字节数组
*
*   构造方法：
*       BufferedOutputStream （InputStream in）
*       可以传递任意的字节输入流，传递是谁，就提高谁的效率
*       可以传递的字节输入流FileInputStream
* */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        System.out.println(System.in);
//        System.out.println(System.out);
        //创建字节输入流的缓冲流对象
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\buffer.txt"));
        byte[] bytes=new byte[10];
        int len=0;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
        //当前学到24_09
    }
}
