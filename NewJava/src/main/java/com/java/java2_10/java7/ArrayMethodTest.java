package com.java.java2_10.java7;

/*
 * 数组的逆序
 * */
public class ArrayMethodTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        for(int min=0,max=arr.length-1;min<max;min++,max--){
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
    }
}
