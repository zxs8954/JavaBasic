package com.java.thread26_27.threadPool;

import java.util.concurrent.*;

/*
 * 使用多线程技术求和
 * 2个线程，1个线程计算1+100，另一个线程计算1+200的和
 * 多线程的异步计算
 * */
public class ThreadPoolSumDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = es.submit(new GetSumCallable(100));
        Future<Integer> f2 = es.submit(new GetSumCallable(200));
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }
}
