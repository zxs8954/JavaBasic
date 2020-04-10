package com.java.java2_10.java3;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            int a = r.nextInt(10);
            System.out.println(a);
        }
    }
}
