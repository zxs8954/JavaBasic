package com.java.java17;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.09+0.01);
        System.out.println(1.0-0.32);
        System.out.println(1.015*100);
        System.out.println(1.301/100);
        BigDecimal b1=new BigDecimal("0.09");
        BigDecimal b2=new BigDecimal("0.01");
        System.out.println(b1.add(b2));

    }
}
