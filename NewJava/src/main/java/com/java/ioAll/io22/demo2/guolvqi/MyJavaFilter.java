package com.java.ioAll.io22.cn.demo2.guolvqi;

import java.io.File;
import java.io.FileFilter;

public class MyJavaFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory())
            return true;
        return pathname.getName().endsWith(".java");
    }
}
