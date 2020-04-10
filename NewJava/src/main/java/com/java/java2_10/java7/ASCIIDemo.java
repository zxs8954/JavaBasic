package com.java.java2_10.java7;

/*
 * int和char转换
 * */
public class ASCIIDemo {
    public static void main(String[] args) {
        char c = 'a';
        int i = c + 1;
        System.out.println(i);
        char b = '你';
        int b1 = (int) b;//此时会查询Unicode
        System.out.println(b1);
        System.out.println((char) 6);
        function_1();
    }

    //打印英文字符
    public static void function() {
        char daxie = 'A';
        char xiaoxie = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(xiaoxie + " " + daxie);
            xiaoxie++;
            daxie++;

        }
    }

    //99乘法表
    public static void function_1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i+"\t");
            }
            System.out.println();
        }
    }
}
