package com.java.java16;

/*
 * 实现正则规则和字符串进行匹配，使用字符串的方法
 * String类三个和正则相关的方法
 *   boolean matches(String 正则的规则)
 * "abc"。matches("[a]")
 *
 * String[] split(String 正则的规则)
 * "abc".split("a")使用规则将字符串进行切割
 *
 * String replaceAll(String 正则规则，String 字符串)
 * */
public class RegexDemo {
    public static void main(String[] args) {
        split_4();
    }
    public static void split_4(){
        String str="Hello123World123132";
        String arr=str.replaceAll("[\\d+]","");
        System.out.println(arr);
    }
    public static void split_3() {
        String ip = "192.168.105.27";
        String[] arr = ip.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void split_2() {
        String str = "18    22 40 65";
        String[] arr = str.split(" +");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
     * String 类方法 split对字符串进行切割
     * 12-35-36-98对-进行切割
     * */
    public static void split_1() {
        String str = "12-35-36-98";
        String[] arr = str.split("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
     * 检查手机号
     * 1开头 34578 0-9 固定11位
     * */
    public static void checkTel() {
        String telNumber = "15547929160";
        boolean b = telNumber.matches("1[34578][0-9]{9}");
        System.out.println(b);
    }

    /*
     * 检查QQ号码是否合法
     * 0不能开头，全数字，位数5,10位
     * */
    public static void checkQQ() {
        String QQ = "123456";
        boolean b = QQ.matches("[1-9][0-9]{4,9}");//[1-9][\\d]{4,9}
        System.out.println(b);
    }
}
