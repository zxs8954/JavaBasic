package com.java.properties25.demo1;

import java.io.*;

/*
       静态不能序列化
 * 使用IO流对象，实现Person类的序列化和反序列化
 * ObjectOutputStream    ObjectInputStream
 transient  使用这个关键字，不能被序列化,只能用于成员变量
 Serializable   标记型接口（没有方法的接口），序列化必须实现该接口
 * */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        function1();
    }

    /*
     * ObjectInputStream(InputStream out)
     * 构造方法：ObjectInputStream(InputStream in)
     * 传递任意的字节输出流
     * 传递任意字节流输入流，输入流封装文件，必须是序列化的文件
     * Object readObject()读取对象
     * */
    public static void function1() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("d:\\person.txt");
        //创建反序列化流，在构造传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        //调用反序列化流方法
        Object obj = ois.readObject();
        System.out.println(obj.toString());
        ois.close();
    }

    /*
     * ObjectOutputStream
     * 构造方法  ObjectOutputStream(OutputStream out)
     * 传递任意的字节输出流
     * void writeObject(Object obj)写出对象的方法
     * */
    public static void function() throws IOException {
        //创建字节输出流，封装文件
        FileOutputStream fos = new FileOutputStream("d:\\person.txt");
        //传贵安写出对象的序列化的对象，构造方法传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person p = new Person("lisi", 25);
        //调用序列化流的方法writeObject,写出对象
        oos.writeObject(p);
        oos.close();
    }

}
