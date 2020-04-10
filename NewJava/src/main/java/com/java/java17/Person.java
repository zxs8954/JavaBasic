package com.java.java17;

public class Person {
    public void finalize(){
        System.out.println("垃圾回收了");
    }
}
