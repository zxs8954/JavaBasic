package com.java.thread26_27;
/*
* 定义子类继承Thread
* */
public class SubThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("run"+i);
        }
        System.out.println("SubThread");
    }
}
