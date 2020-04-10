package com.java.java2_10.java4;

import java.util.Scanner;

/**
 * 选择语句 switch语句
 * 编写格式
 * switch(表达式){
 *          case 常量1:
 *              要执行的语句;
 *          case 常量2:
 * *           要执行的语句;
 *              break;
 *          default:
 *              要执行的语句
 *              break;
 * }
 * 执行流程： 表达式，和case后面的常量进行比较运算
 * 和哪个case后的常量相同，就执行哪个case后面的程序，遇到break，就全结束
 */

public class SwitchDemo {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();
            switch (week) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期日");
                    break;
                default:
                    System.out.println("星期不存在");
                    break;
            }
        }
    }
}
