package com.java.thread26_27.threadPool;

import java.util.concurrent.Callable;

public class GetSumCallable implements Callable<Integer> {
    private int a;
    public GetSumCallable(int a){
        this.a=a;
    }
    public Integer call(){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        return sum;
    }
}
