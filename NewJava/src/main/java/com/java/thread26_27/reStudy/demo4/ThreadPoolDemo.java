package com.java.thread26_27.reStudy.demo4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(3);

        Future<String> fu=es.submit(new ThreadCallableDemo());
        String s=fu.get();
        System.out.println(s);
    }
}
