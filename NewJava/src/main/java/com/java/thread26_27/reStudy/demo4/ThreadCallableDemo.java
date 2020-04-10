package com.java.thread26_27.reStudy.demo4;

import java.util.concurrent.Callable;

public class ThreadCallableDemo implements Callable<String> {
    public String call(){
        return "abc";
    }


}
