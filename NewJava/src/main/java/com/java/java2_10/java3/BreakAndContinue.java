package com.java.java2_10.java3;

/**
 * break 作用于循环中，终止循环的作用
 * continue 在循环中，终止本次循环，开始下一次循环
 */
public class BreakAndContinue {
    public static void main(String[] args) {
//        int i = 1;
//        while (i<2000) {
//            if (i == 3) {
//                break;
//            }else {
//                System.out.println(i);
//            }
//            i++;
//        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
