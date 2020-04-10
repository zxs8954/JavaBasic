package com.java.thread26_27.callableDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 实现Callable接口方式
 * 实现步骤：
 *   工厂类， Executors静态方法newFixedThreadPool,创建线程池对象
 *   线程池独享ExecutorService接口实现类，调用submit提交线程任务
 * */
public class ThreadPoolDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        //提交线程任务的方法submit返回Future接口的实现类
        Future<String> future= es.submit(new ThreadPoolCallable());
        String s=future.get();
        System.out.println(s);
    }
}
