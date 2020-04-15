package com.java.reflect33.demo3;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 调用Person，调用Student，调用Worker是未知数
* 类和方法都不清楚
* 通过配置文件实现此功能
*       运行类名和方法名字，以键值对的形式，写在文本中
* 实现步骤：
*   1、准备配置文件，键值对
*   2、IO流读，Reader
*   3、文件中键值对存储到集合中Properties
*   4、反射获取指定类class文件对象
*   5、class对象，获取指定方法
*   6、运行方法
* */
public class Test {
    public static void main(String[] args) throws Exception{
        //IO
        Reader reader=new FileReader("D:\\JavaBasic\\NewJava\\src\\main\\java\\com\\java\\reflect33\\config.properties");
        Properties pro=new Properties();
        pro.load(reader);
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");
        Class c=Class.forName(className);
        Method method=c.getMethod("eat");
        Object obj=c.newInstance();
        method.invoke(obj);



        reader.close();
    }
}
