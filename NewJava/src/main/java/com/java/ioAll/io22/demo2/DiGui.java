package com.java.ioAll.io22.cn.demo2;
/*
* 方法的递归调用
*   方法自己调用自己
* 适合方法中运算主体不变，但是运行的时候，参与运行的方法参数可能会变化
* 注意：
*   递归一定要有出口
*   递归次数不能过多
*   构造方法禁止递归
* */
public class DiGui {
    public static void main(String[] args) {
        int a=getSum(3);
        System.out.println(a);
        int b=getJieCheng(30);
        System.out.println(b);
        System.out.println(getFBNQ(12));
    }
    /*
    * 计算阶乘
    * 5*4*3*2*1
    * */
    public static int getJieCheng(int i){
        if(i==1){
            return 1;
        }
        return i*getJieCheng(i-1);
    }
    /*
    * 方法递归菲波那切数列
    *       从第三项开始，后面每项是前面2项的和
    * */
    public static int getFBNQ(int month){
        if(month==1){
            return 1;
        }
        if(month==2){
            return 2;
        }
        return getFBNQ(month-1)+getFBNQ(month-2);
    }
    /*
    * 计算1+2+3+。。。n的和
    * 计算规律：
    *   n+(n-1)+(n-1-1)...
    *   100+(100-1)+(100-1-1)....+(100-1)
    * */
   public static int getSum(int n){
       if(n==1){
           return 1;
       }
       return n+getSum(n-1);
   }
}
