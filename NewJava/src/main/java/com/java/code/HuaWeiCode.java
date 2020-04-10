package com.java.code;

import java.util.Scanner;
import java.util.TreeSet;


/*
 * 华为机考题
 * */
public class HuaWeiCode {
    public static void main(String[] args) {
       // inputStr();
        System.out.println("123456789".substring(8));
    }

    /*
     * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
     *  长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     * */
    public static void inputStr() {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            split(s);
        }
    }

    public static void split(String s){
        while(s.length()>=8){
            System.out.println(s.substring(0, 8));
            s=s.substring(8);
        }
        if(s.length()<8&&s.length()>0){
            s=s+"00000000";
            System.out.println(s.substring(0, 8));
        }
    }


    /*
     * 明明想在学校中请一些同学一起做一项问卷调查，
     * 为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
     * 对于其中重复的数字，只保留一个，把其余相同的数去掉，
     * 不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
     * 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
     * */
    public static void sort() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            TreeSet<Integer> tree = new TreeSet<Integer>();
            for (int i = 0; i < num; i++) {
                int curr = sc.nextInt();
                tree.add(curr);
            }
            for (Integer i : tree) {
                System.out.println(i);
            }
        }
    }

    /*
    *计算字符串最后一个单词的长度，单词以空格隔开。
输入描述:
一行字符串，非空，长度小于5000。
输出描述:
整数N，最后一个单词的长度。
    * */
    public static void getLastLength() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        while (sc.hasNextLine()) {
            int i = s1.length() - 1 - s1.lastIndexOf(" ");
            System.out.println(i);
        }
    }

    /*
    * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。

输入描述:
第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。

输出描述:
输出输入字符串中含有该字符的个数。
    * */
    public static void getCount() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        int count = 0;
        char a = s2.charAt(0);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == a) {
                count++;
            }
        }
        System.out.println(count);
    }
}
