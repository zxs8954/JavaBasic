package com.java.ioAll.io24.demo3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流缓冲区流
 *       java.io.BufferedWrite 继承Writer
 *       写入方法：write()  单个字符，字符数组，字符串
 *
 *
 *       构造方法：
 *           BufferedWrite(Writer w)传递任意字符输出流
 *           传谁，就高效谁 FileWrite,OutPutStreamWriter
 * BufferedWriter 具有自己的特有方法
 *       void newLine()写换行  \r \n也是换行
 *      方法具有平台无关性
 * Windows \r \n
 * Linux \n
 * */
public class BufferedWriteDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流，封装文件
        FileWriter fw = new FileWriter("d:\\buffer.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write(100);
        bfw.flush();
        bfw.write("你好".toCharArray());//变成字符数组
        bfw.flush();
        bfw.newLine();//换行作用
        bfw.write("大家都好");
        bfw.flush();


        bfw.close();
        String s = "张雪松";
        char[] a = s.toCharArray();//将字符串转变为字符数组
        for (char b : a) {
            System.out.println(b);

        }
    }
}
