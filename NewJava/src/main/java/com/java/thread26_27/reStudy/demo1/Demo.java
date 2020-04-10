package com.java.thread26_27.reStudy.demo1;

public class Demo extends Thread{
    public void run(){
        System.out.println(1+Thread.currentThread().getName());
    }
}
