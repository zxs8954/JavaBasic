package com.java.thread26_27.同步方法;
/*
 * 采用同步方法形式，解决线程安全问题
 * 好处：代码简介
 * 将线程共享数据和同步抽取到一个方法中
 * 在方法的声明上加上同步关键字
 * 问题： 同步方法中有锁吗？   有的   对象锁是本类引用this
 * 如果方法是静态,同步有锁吗？锁是本类自己.class
 * */

/**
 * 通过线程休眠出现安全问题
 * 解决安全问题
 * 公式：  synchronized(任意的对象){
 * 线程要操作的共享数据
 * }
 * 同步代码块
 */

public class Tickets implements Runnable {
    //    StringBuffer;   //线程安全
//    StringBuilder      //线程不安全
    //定义出售的票源
    private  int ticket = 100;

    public void run() {
        while (true) {
            //共享数据，保证安全，加入同步代码块
            //sing kou  nai zi
            //同步锁，对象监视器
            //同步保证安全性：没有锁的线程不能执行只能等
            //线程遇到同步代码块后，线程判断同步锁还有没有
            //同步锁有：获取锁，进入同步中去执行了
            //执行完毕后，出去了同步代码块，线程在将锁对象还回去
            /*
             * 没有锁的线程，不能进入同步中执行，被阻挡在同步代码块外面，这样就保证多线程的安全性
             * 没有锁的同步不能进入同步
             * */
            payTicket();
        }
    }

    public  synchronized void payTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            }
            System.out.println(Thread.currentThread().getName() + "出售第" + ticket--);
        }
    }
}
