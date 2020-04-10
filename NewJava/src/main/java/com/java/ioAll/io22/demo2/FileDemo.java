package com.java.ioAll.io22.cn.demo2;

import java.io.File;

/*
* 对一个目录下的所有内容进行全遍历
* */
public class FileDemo {
    public static void main(String[] args) {
        File dir=new File("e:\\程序员自学\\1");
        getAllDir(dir);
    }
    /*
    * 定义方法，实现目录的全遍历
    * */
    public static void getAllDir(File dir){
        //调用方法listFiled()对目录dir进行遍历
        File[] fileArr=dir.listFiles();
        for(File f:fileArr){
            if(f.isDirectory()){
               //是一个目录，去遍历这个目录
                //本方法，getAllDir,就是给一个目录遍历
                //继续调用getAllDir，传递目录
                getAllDir(f);
            }else {
                System.out.println(f);
            }
        }
    }
}
