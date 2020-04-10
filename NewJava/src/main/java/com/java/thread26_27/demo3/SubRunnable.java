package com.java.thread26_27.demo3;
/*
* 实现线程的另一个方式接口实现
* 实现Runnable接口重写run方法
* */
public class SubRunnable implements Runnable{

    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("run..."+i);
        }
    }
}
