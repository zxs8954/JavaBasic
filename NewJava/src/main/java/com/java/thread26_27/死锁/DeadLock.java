package com.java.thread26_27.死锁;

public class DeadLock implements Runnable {
    private int i = 0;

    public void run() {
        while (true) {
            if (i % 2 == 0) {
                //先进入A同步，再进入B同步
                synchronized (LockA.lockA) {
                    System.out.println("if...lockA");
                    synchronized (LockB.lockB) {
                        System.out.println("if...lockB");
                    }
                }
            } else {
                //先进入B同步，在进入A同步
                synchronized (LockB.lockB) {
                    System.out.println("else...lockB");
                    synchronized (LockA.lockA){
                        System.out.println("else...lockA");
                    }
                }
            }
            i++;
        }
    }
}
