package com.java.thread26_27;
/*
* 程序的主线程
* */
public class Demo {
    public static void main(String[] args) {
       // System.out.println(0/0);//主线程main
        function();
        System.out.println(Math.abs(-9));
    }
    public static void function(){
        for(int i=0;i<100000;i++){
            System.out.println(i);
        }
    }
}
