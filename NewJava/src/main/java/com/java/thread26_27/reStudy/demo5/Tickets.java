package com.java.thread26_27.reStudy.demo5;

public class Tickets implements Runnable {
    private int ticket = 100;

    public void run() {
        while (true) {
            synchronized (this){
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                System.out.println(Thread.currentThread().getName() + "出售第" + ticket--);
            }
            }
        }
    }
}
