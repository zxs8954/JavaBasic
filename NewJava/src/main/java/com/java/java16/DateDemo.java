package com.java.java16;

import java.util.Date;

/*
 * 毫秒1000ms=1s
 * */
public class DateDemo {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date=new Date();
        System.out.println(date);
    }
}
