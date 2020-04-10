package com.java.java2_10.java10.demo1;

public class Test {
    public static void main(String[] args) {
        Developer de=new Developer();
        de.name="zhangsan";
        de.work();
        System.out.println(de.name);
        WeiHu w=new WeiHu();
        w.name="李四";
        w.print();
    }
}
