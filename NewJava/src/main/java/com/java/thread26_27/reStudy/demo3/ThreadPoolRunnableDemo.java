package com.java.thread26_27.reStudy.demo3;

public class ThreadPoolRunnableDemo implements Runnable{
    public void run(){
        System.out.println("线程提交任务"+Thread.currentThread().getName());
    }
}
