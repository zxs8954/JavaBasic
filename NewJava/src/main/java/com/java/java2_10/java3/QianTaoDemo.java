package com.java.java2_10.java3;

public class QianTaoDemo {
    public static void main(String[] args) {
        //外循环控制次数，内循环控制圈数
        //外循环控制行数，内循环控制每行的个数
        for(int i=0;i<9;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
