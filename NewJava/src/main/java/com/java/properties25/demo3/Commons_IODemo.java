package com.java.properties25.demo3;

import org.apache.commons.io.FilenameUtils;

public class Commons_IODemo {
    public static void main(String[] args) {
        function2();
    }
    /*
    * static boolean isExtension
    * 判断是不是以后缀名为结尾
    * */
    public static void function2(){
        boolean b=FilenameUtils.isExtension("Demo.java","java");
        System.out.println(b);
    }
    /*
    * static String getName(String filename)
    * 获取文件名
    * */
    public static void function1(){
        String name=FilenameUtils.getName("abc.java");
        System.out.println(name);
    }
    /*
    * FilenameUtils
    * static String getExtension(String filename)
    * 获取文件扩展名
    * */
    public static void function(){
        String name=FilenameUtils.getExtension("abc.java");
        System.out.println(name);
    }
}
