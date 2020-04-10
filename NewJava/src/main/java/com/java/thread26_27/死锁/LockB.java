package com.java.thread26_27.死锁;

public class LockB {
    private LockB(){}
    public static final LockB lockB=new LockB();
}
