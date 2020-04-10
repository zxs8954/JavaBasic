package com.java.thread26_27.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过线程休眠出现安全问题
 * 解决安全问题
 * 公式：  synchronized(任意的对象){
 * 线程要操作的共享数据
 * }
 * 同步代码块
 */
/*
 * 使用JDM1.5的接口Lock，替代同步代码块实现线程安全性
 * Lock接口方法 lock获取锁 unlock释放锁
 * Lock是接口，要用实现类ReentrantLock
 * */
public class Tickets implements Runnable {
    //定义出售的票源
    private int ticket = 100;
    //在类的成员位置，创建Lock接口实现类对象
    private Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            //调用Lock接口方法lock获取锁
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "出售第" + ticket--);
                } catch (Exception ex) {

                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
