package com.java.properties25.demo2;

import java.io.*;

/*
 * 打印流实现文本复制
 *       读取数据源BufferedReader +File 读取文本行
 *       写入目的地PrintWriter+println
 * */
public class PrintWriterDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("d:\\a.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("d:\\7.txt"),true);
        String line = null;
        while ((line = bfr.readLine()) != null) {
            pw.println(line);
        }
        pw.close();
        bfr.close();
    }
}
