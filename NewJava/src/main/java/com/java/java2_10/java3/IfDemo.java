package com.java.java2_10.java3;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        //if(条件) 提交：必须是布尔类型
        //成绩判断要求， 成绩>80  成绩>70  成绩>60 不及格
        while (true) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i > 80) {
                System.out.println("优秀");
            } else if (i > 70) {
                System.out.println("良");
            } else if (i > 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }
    }
}
