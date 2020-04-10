package com.java.ioAll.io22.cn.demo1;

import java.io.File;

/*
* 文件获取过滤器
* 遍历目录的时候，可以根据需要，只获取满足条件的文件
* 遍历目录方法listFiles()重载形式
* 传递FileFilter接口实现类
* 自定义接口实现类，重写抽象方法
* 接口实现类对象到遍历方法
* */
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("e:\\程序员自学");
        File[] fileArr=file.listFiles(new MyFilter());//accept方法反真，就把路径装进数组，反甲就不装
        for (File f:fileArr){
            System.out.println(f);
        }
    }
}
