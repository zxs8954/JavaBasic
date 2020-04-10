package com.java.properties25.demo3;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Commons_IODemo1 {
    public static void main(String[] args) throws IOException {
        function3();
    }
    /*
     * FileUtils 工具类
     * static void copyDirectoryToDirectory(File src,File desc)
     * 复制文件夹
     * */
    public static void function3() throws IOException {
        FileUtils.copyDirectoryToDirectory(new File("C:\\data"),new File("d:\\a"));
    }
    /*
     * FileUtils 工具类
     * static void copyFile(File src,File desc)
     * 复制文件
     * */
    public static void function_2() throws IOException {
        FileUtils.copyFile(new File("d:\\1.png"),new File("d:\\2.png"));
    }
    /*
     * FileUtils 工具类
     * static void writeStringToFile(File src,String date)
     * 将字符串直接写到文件中
     * */
    public static void function1() throws IOException {
            FileUtils.writeStringToFile(new File("d:\\10.txt"),"我爱");
    }

    /*
     * FileUtils工具类
     * static String readFileTOString(File src)读取文本，返回字符串
     * */
    public static void function() throws IOException {
        String s = FileUtils.readFileToString(new File("d:\\a.txt"));
        System.out.println(s);
    }
}
