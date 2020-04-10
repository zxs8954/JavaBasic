package com.java.thread26_27.唤醒等待案例;

/*
 *定义资源类name sex
 * 同时有2个线程，对资源中的变量操作
 * 1个对name，age赋值
 * 2个对name，age做变量输出打印
 *
 * */
public class Resource {
    public String name;
    public String sex;
    public boolean flag=false;
}
