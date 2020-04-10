package com.java.java2_10.java4;
/*
* 数组里面存储数组
* */
public class ArrayErWeiDemo {
    public static void main(String[] args) {
        int[][] arr1=new int[3][4]; //3个一维数组，每个数组长度是4
        int[][] arr={{1,2,3},{4,5},{6,7}};
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
