package com.java.java17;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        function();
    }

    public static void function() {
        BigInteger big = new BigInteger("123132123123132123132132123");
        BigInteger big2 = new BigInteger("12312313212313");
        BigInteger bigAdd = big.add(big2);
        System.out.println(bigAdd);
    }
}
