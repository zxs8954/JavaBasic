package com.java.thread26_27.唤醒等待案例;

/*
输出线程，对资源对象Resource中成员变量输出
*
* */
public class Output implements Runnable {
    private Resource r;

    public Output(Resource r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            synchronized (r) {
                //判断标记是false,等待
                if (!r.flag) {
                    try {
                        r.wait();
                    } catch (Exception ex) {
                    }
                }
                System.out.println(r.name + "..." + r.sex);
                //标记改成false，唤醒对方线程
                r.flag=false;
                r.notify();
            }
        }
    }
}
