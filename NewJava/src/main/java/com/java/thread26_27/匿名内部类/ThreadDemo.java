package com.java.thread26_27.匿名内部类;

/*
 * 使用匿名内部类，实现多线程程序
 * 前提：继承或者接口实现
 * new 父类或接口（）{
 *       重写抽象方法
 * }
 * */
public class ThreadDemo {
    public static void main(String[] args) {
        //继承方式 XXX 继承Thread{public void run(){}}
        new Thread(){
            public void run(){
                System.out.println("！！！");
            }
        }.start();
        //实现接口 XXXimplements Runnable{}
        Runnable r=new Runnable(){
            public void run(){
                System.out.println("********");
            }
        };
        new Thread(r).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("%%%");
            }
        }).start();
    }
}
