package com.java.java21.demo1;

/*
 * try{
 *   被检测的代码
 *   可能出现异常的代码
 * }catch(异常类名 变量){
 *
 * }finally{
 *   必须执行
 * }
 * */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {};
        try {
            int i = getArray(arr);
            System.out.println(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (NullPointerException n){
            System.out.println(n);
        }

    }

    public static int getArray(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("空指针");
        }
        if (arr.length < 3) {
            throw new ArrayIndexOutOfBoundsException("无3索引");
        }
        return arr[3] + 1;
    }
}
