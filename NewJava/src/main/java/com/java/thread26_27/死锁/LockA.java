package com.java.thread26_27.死锁;

public class LockA {
    //私有构造方法，保证了其他方法不能new
    private LockA(){}
    //保证唯一对象
    public static final LockA lockA=new LockA();

}
