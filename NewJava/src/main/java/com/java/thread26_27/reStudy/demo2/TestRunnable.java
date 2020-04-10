package com.java.thread26_27.reStudy.demo2;

public class TestRunnable {
    public static void main(String[] args) {
        RunnableDemo rd=new RunnableDemo();
        Thread t=new Thread(rd);
        t.start();
    }
}
