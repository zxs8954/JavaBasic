package com.java.map20;
/*
* 方法的可变参数
* 前提：方法的数据类型确定，但是参数的个数可以是任意
* 可变参数语法：数据类型 ...变量名
* 可变参数本质就是一个数组
* */
public class VarArgumentsDemo {
    public static void main(String[] args) {
        //调用带有可变参数的方法，传递参数，可以任意
        int a=getSum(1,23);
        System.out.println(a);
        getSum();
        int c=getSum(1,1,12);
        System.out.println(c);
    }
    /*
    * 可变参数的注意事项
    * 1.一个方法中，可变参只能有一个
    * 2.可变参数必须写在列表的最后一位
    * */
    public static void function(int b,int c,int... a){

    }

    /*
    * 计算10个整数和
    * 方法的可变参数实现
    * */
    public static int getSum(int...a){
        System.out.println(a.length);
        int sum=0;
        for(int i:a){
            sum+= i;
        }
        return sum;
    }
    /*
    * 定义方法，计算2个整数和
    */
    public static int getSum(int a,int b){
        return a+b;
    }
}
