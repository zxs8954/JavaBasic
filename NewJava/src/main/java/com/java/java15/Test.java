package com.java.java15;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person("李四",25);
        Person p2=new Person("张三",20);
        boolean b=p1.equals(p2);
        System.out.println(b);
    }
}
