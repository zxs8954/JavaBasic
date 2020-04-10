package com.java.thread26_27;

/*
 *
 * 创建和启动一个线程
 *   创建Thread子类对象
 *   子类对象调用方法start()
 *          让线程程序执行，让JVN调用线程中的run()
 *
 *
 * 栈多线程运行内存图： main方法先进栈，虚拟机新开个栈，调用run方法
 * */
public class ThreadDemo {
    public static void main(String[] args) {
        SubThread sy=new SubThread();
        sy.start();//开启新线程

        for(int i=0;i<50;i++){
            System.out.println("main"+i);
        }
    }
}
