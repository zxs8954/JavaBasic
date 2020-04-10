package com.java.java17;

public class SystemDemo {
    public static void main(String[] args) {
            function_2();
    }
    public static void function_2(){
        System.out.println(System.getProperties());
    }
    public static void function_1() {
        new Person();
        System.gc();
    }

    public static void function() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
