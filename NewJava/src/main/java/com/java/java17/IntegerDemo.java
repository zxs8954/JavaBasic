package com.java.java17;

public class IntegerDemo {
    public static void main(String[] args) {
        function_1();
    }

    /*
     * parseInt(String s) 返回基本数据类型
     * */
    public static void function() {
        int i = Integer.parseInt("12");
        System.out.println(i / 2);
    }

    /*
     * int 转string
     * */
    public static void function_1() {
        int i = 3;
        String s = i + "";
        System.out.println(s + 1);
    }
}
