package com.java.thread26_27.threadName;

/*
 *每个线程都有自己的名字
 * 运行方法main线程，名字就是main
 * 其他线程也有名字，默认名字 thread-*
 *
 * JVM开启主线程，运行方法main,主线程也是线程，是线程就是Thread的对象
 * Thread类中，静态方法
 *  static Thread currentThread()返回正在执行的线程对象
 *
 * 静态不能调用非静态
 * */
public class ThreadDemo2 {
    public static void main(String[] args) {
        NameThread nt = new NameThread();
        //nt.setName("旺财");
        nt.start();
System.out.println(Thread.currentThread().getName());

    }
}
