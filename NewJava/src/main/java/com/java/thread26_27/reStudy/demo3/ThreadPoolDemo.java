package com.java.thread26_27.reStudy.demo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(3);
        es.submit(new ThreadPoolRunnableDemo());
        es.submit(new ThreadPoolRunnableDemo());
        es.submit(new ThreadPoolRunnableDemo());
        es.submit(new ThreadPoolRunnableDemo());
        es.shutdown();
    }
}
