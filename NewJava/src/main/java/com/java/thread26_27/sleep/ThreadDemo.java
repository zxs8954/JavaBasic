package com.java.thread26_27.sleep;

public class ThreadDemo {
    public static void main(String[] args){
//        for(int i=0;i<5;i++){
//            Thread.sleep(1000);
//            System.out.println(i);
//        }
        new SleepThread().start();
    }
}
