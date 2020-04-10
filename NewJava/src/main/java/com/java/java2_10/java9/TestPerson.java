package com.java.java2_10.java9;

/**
 * 方法的参数是基本数据类型，引用数据类型
 */

public class TestPerson {
    public static void main(String[] args) {
        int a = 1;
        function(a);
        System.out.println(a);
        Person p=new Person();
        p.name="张三";
        function_1(p);
        System.out.println(p.name);
    }

    /**
     * 定义方法，参数类型是基本数据类型
     */
    public static void function(int a) {
        a += 5;
    }
    /**
     * 定义方法，参数类型是引用数据类型
     */
    public static void function_1(Person person){
        person.name="李四";

    }
}
