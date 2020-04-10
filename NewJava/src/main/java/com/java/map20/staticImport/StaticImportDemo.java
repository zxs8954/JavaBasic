package com.java.map20.staticImport;
/*
* 静态导入
* 减少开发代码量
* 标准写法，导入包的时候才能使用
* import static java.lang.System.out;   最末尾必须是一个静态成员
* */

import static java.lang.System.out;
import static java.util.Arrays.sort;
public class StaticImportDemo {
    public static void main(String[] args) {
       out.println("hello"); //静态导入
        int[] arr={1,3,1};
        sort(arr);


    }
}
