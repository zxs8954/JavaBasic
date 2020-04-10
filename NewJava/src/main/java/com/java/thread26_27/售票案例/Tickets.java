package com.java.thread26_27.售票案例;

/**
 * 通过线程休眠出现安全问题
 * 解决安全问题
 * 公式：  synchronized(任意的对象){
 * 线程要操作的共享数据
 * }
 * 同步代码块
 */

public class Tickets implements Runnable {
    //定义出售的票源
    private int ticket = 100;
    private Object obj = new Object();

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
            synchronized (obj) {
                //对票数判断，大于0可以出售
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception ex) {
                    }
                    System.out.println(Thread.currentThread().getName() + "出售第" + ticket--);
                }
            }
        }
    }
}
