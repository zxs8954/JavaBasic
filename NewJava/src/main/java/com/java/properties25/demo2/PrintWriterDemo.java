package com.java.properties25.demo2;

import java.io.*;

/*
 * 打印流
 *   PrintStream
 *   PrintWriter     用他
 * 打印流特点:
 *       1.此流不负责数据源，只负责数据目的地
 *       2.为其他输出流添加功能
 *       3.永远不会抛出IOException
 * 2个打印流方法完全一致
 * 区别：
 *   构造方法不同，就是打印流的输出目的端
 * PrintStream
 *        接受FIle类型，接收字符串文件名，接受字节输出流OutputStream
 *PrintWriter
 *       接收File类型，字符串文件名，字节输出流，接收字符输出流
 * */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        function3();
    }
    /*
    * 打印流，可以打开自动刷新功能
    * 满足2个条件：
    *       1.输出目的必须是流对象
    *       2.必须调用println,printf,format三个方法中的一个，启动自动刷新
    * */
    public static void function3() throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("d:\\5.txt");
        PrintWriter pw=new PrintWriter(fos,true);
        pw.println("自动刷新");
        pw.format("love");
        pw.printf("java");
        pw.close();
    }
    /*
     * 打印流，输出目的，是流对象
     * 可以是字节或者字符输出流
     * */
    public static void function2() throws IOException {
        //FileOutputStream fos = new FileOutputStream("d:\\3.txt");
        FileWriter fw=new FileWriter("d:\\4.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("打印流");
        pw.close();
    }

    /*
     * 打印流，输出目的，String文件名
     * */
    public static void function1() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("d:\\2.txt");
        pw.println(3.5);
        pw.close();
    }

    /*
     * 打印流向File对象的数据目的写入数据
     * 方法print println       原样输出
     * */
    public static void function() throws FileNotFoundException {
        File file = new File("d:\\1.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(100);
        pw.close();
    }
}
