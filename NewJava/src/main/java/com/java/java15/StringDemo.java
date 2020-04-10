package com.java.java15;

public class StringDemo {
    public static void main(String[] args) {
        String str1=new String("abc");
        String str2="abc";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);//引用数据类型比较的是内存地址
        System.out.println(str1.equals(str2));
    }
}
