package com.java.thread26_27.threadPool;

public class ThreadPoolRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"线程提交任务");
    }
}
