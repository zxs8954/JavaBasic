package com.java.java2_10.java5;

public class MethodDemo3 {
    public static void main(String[] args) {
        function(3,4);
        int[] arr={1,2,3,45,5};
        function_1(arr,2);
    }
    public static void function(int a,int b){
        System.out.println(a+b);
    }
    public static void function_1(int[] arr,int i){
        System.out.println(arr[i]);
    }
}
