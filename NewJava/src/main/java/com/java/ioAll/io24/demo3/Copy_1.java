package com.java.ioAll.io24.demo3;

import java.io.*;

/*
* 使用缓冲区流对象，复制文件
* 数据源BufferedReader+FileReader读取
* 数据目的BufferedWrite+FileWrite写入
* 读一行，写一行
* */
public class Copy_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr=new BufferedReader(new FileReader("d:\\a.txt"));
        BufferedWriter bfw=new BufferedWriter(new FileWriter("d:\\b.txt"));
        String line=null;
        while ((line=bfr.readLine())!=null){
            bfw.write(line);
            bfw.newLine();;
            bfw.flush();
        }
        bfr.close();
        bfw.close();
    }
}
