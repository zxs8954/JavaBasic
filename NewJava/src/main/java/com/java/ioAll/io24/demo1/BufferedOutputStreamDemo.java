package com.java.ioAll.io24.demo1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *                        过程   字符--JVM--调用底层系统windows   1个一个转换很慢
 *缓冲流速度快的原理：      将字符加载到JVM中，积累到一定量的时候在发到底层系统
 * 字节输出流的缓冲流
 *       java.io.BufferedOutputStream 作用：提高原有输出流的写入效率
 *       BufferedOutputStream  继承OutputStream
 *       方法write写入字节，字节数组
 *
 *       构造方法：
 *           BufferedOutputStream(OutputStream out)
 *           可以传递任意的字节输出流，传递的是哪个字节流，就对哪个字节流提高效率
 *
 * */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流，绑定文件
        //FileOutputStream fos=new FileOutputStream("c:\\buffer.txt");
        //创建字节输出流的缓冲的对象，构造方法中，传递字节输出流
        BufferedOutputStream bos = new
                BufferedOutputStream(new FileOutputStream("d:\\buffer.txt"));

        bos.write(55);
        byte[] bytes="HeloWorld".getBytes();
        bos.write(bytes);
        bos.write(bytes,2,3);
        bos.close();
    }
}
