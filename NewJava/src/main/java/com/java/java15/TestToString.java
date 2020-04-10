package com.java.java15;

public class TestToString {
    public static void main(String[] args) {
        //调用Person方法toString（）
        Person p=new Person("张三",20);
        String s=p.toString();
        System.out.println(p);
        System.out.println(s);
    }
}
