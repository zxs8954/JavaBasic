package com.java.properties25.demo;

import javax.annotation.PreDestroy;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 继承HashTable，实现Map接口
 * 可以和IO对象结合使用，实现数据的持久存储
 * */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        function2();
    }
    /*
    * Properties集合特有方法store
    * store(OutputStream out)
    * store(Writer w)
    * 接受所有的字节或者字符的输出流，将集合中的减值对，写入集合中
    * */
    public static void function2() throws IOException {
        Properties pro=new Properties();
        pro.setProperty("name","zxs");
        pro.setProperty("age","311");
        FileWriter fw=new FileWriter("d:\\pro.properties");
        //减值对，存回文件，使用 集合的方法store传递字符输出流
        pro.store(fw,"abc");
        fw.close();
    }
    /*
     * Properties集合特有方法load
     * load(InputStream in)
     * lod(Reader r)
     传递任意的字节或者字符输入流，保存到集合
     */
    public static void function1() throws IOException {
        Properties pro=new Properties();
        FileReader fr=new FileReader("d:\\pro.properties");
        //调用集合的方法load,传递字符输出入流
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }

    /*
     * 存储键值对
     * setProperty等同于Map接口中的put
     * setProperty(String key,String value)
     * 通过键获取值，getProperty(String key)
     * */
    public static void function() {
        Properties p = new Properties();
        p.setProperty("a", "1");
        p.setProperty("b", "2");
        p.setProperty("c", "3");
        System.out.println(p);
        System.out.println(p.getProperty("a"));
        //方法：stringPropertyNames()将集合中的键存储到Set集合中，类似于Map接口的方法keySet
        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "  " + p.getProperty(key));
        }
    }

}
