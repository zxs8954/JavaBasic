package com.java.java2_10.java4;

//数据类型[] 变量名=new 数据类型[存储元素的个数]
//数组是定长的
public class ArrayDemo {
    public static void main(String[] args) {
        //定义输出，存储整数，3个
        int[] arr = new int[3];
        arr[0]=3;
        System.out.println(arr[0]);
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr1.length);
        System.out.println(arr1[1]);
        System.out.println(arr);//地址
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
