package com.java.ioAll.io24.demo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符输入流缓冲区流
 *       java.io.BufferedReader 继承Reader
 *       读取方法：reader()  单个字符，字符数组
 *       构造方法：
 *             BufferedReader(Reader r)
 *       可以任意的字符输入流
 *          FileReader InputStreamReader
 *
 * readLine()
 * */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        int lineNum = 0;
        //创建字符输入流的换重复对象，构造方法传递字节输入流，包装源文件
        BufferedReader bfr = new BufferedReader(new FileReader("d:\\a.txt"));
        String line = null;

        while ((line = bfr.readLine()) != null) {
            lineNum++;
            System.out.println(lineNum+"  "+line);
        }
        bfr.close();

    }
}
