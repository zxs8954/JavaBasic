package com.java.java2_10.java3;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();//接受键盘输入整数
        System.out.println(i);
        String s=sc.next();//接受字符串类型
        System.out.println(s);
    }
}
