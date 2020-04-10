package com.java.java21;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        int[] arr=null;
        int i=getArray(arr);
        System.out.println(i);
    }
    public static int getArray(int[] arr) throws Exception {
        if(arr==null){
            throw new Exception("传递数组不存在");
        }
        int i=arr[arr.length-1];
        return i*2;
    }
}
