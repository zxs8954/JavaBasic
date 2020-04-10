package com.java.java2_10.java4;
/*
* 计算数组最值
* */
public class MaxDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        //定义变量保存数组0索引的值
        int max=arr[0];
        //max和数组中其他元素比较，数组遍历
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max );
    }
}
