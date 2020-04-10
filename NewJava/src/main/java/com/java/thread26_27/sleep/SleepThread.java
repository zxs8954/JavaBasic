package com.java.thread26_27.sleep;

public class SleepThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);

            } catch (Exception ex) {

            }
            System.out.println(i);

        }
    }
}
