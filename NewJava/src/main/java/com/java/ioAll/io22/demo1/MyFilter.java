package com.java.ioAll.io22.cn.demo1;

import java.io.File;
import java.io.FileFilter;
/*
* 自定义过滤器
* 实现FileFilter接口，重写抽象方法
* */
public class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
        * pathname接收的也是文件的全路径
        * e:\\程序员自学
        * 对路径进行判断，如果是java文件，返回true,不是返回false
        * 文件的后缀结尾数.java
        * */
        String name=pathname.getName();
        return name.endsWith(".java");
    }
}
