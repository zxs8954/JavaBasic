package com.java.reflect33.demo1;

/*
 * 反射获取构造方法并运行，快速方法
 * 有一个前提：
 *       被反射的类，必须具有空参数构造器
 *       构造方法权限必须public
 * */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.java.reflect33.demo.Person");
        //快捷方式Class类中定义方法，T newInstance直接创建被反射类的对象实例
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
