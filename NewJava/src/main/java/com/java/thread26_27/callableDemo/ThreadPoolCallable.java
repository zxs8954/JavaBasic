package com.java.thread26_27.callableDemo;

import java.util.concurrent.Callable;

/*
*
* Callable 接口实现类，作为线程提交任务出现
* 使用方法返回值
* */
public class ThreadPoolCallable implements Callable<String> {
    public String call(){
        return "abc";
    }
}
