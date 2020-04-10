package com.java.ioAll.io22.cn.demo2.guolvqi;

import java.io.File;

/*
* 遍历所有目录下的.java文件
* 遍历多级目录，方法递归实现
* 遍历过程中，使用过滤器过滤掉不是java文件
* */
public class FileDemo1 {
    public static void main(String[] args) {
        File file=new File("e:\\程序员自学\\1");
        getAllJava(file);
    }
    /*
    * 定义方法，实现遍历指定目录
    * 获取目录中所有的.java文件
    * */
    public static void getAllJava(File dir){
        //调用File对象方法listFiles()获取，胶乳过滤器
        File[] fileArr=dir.listFiles(new MyJavaFilter());
        for(File f:fileArr){
            //对f进行判断，是不是文件夹
            if(f.isDirectory()){
                //递归文件夹遍历
                getAllJava(f);
            }else {
                System.out.println(f);
            }
        }
    }
}
