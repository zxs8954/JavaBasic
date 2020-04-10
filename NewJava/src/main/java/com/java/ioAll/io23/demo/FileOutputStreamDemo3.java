package com.java.ioAll.io23.demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO流异常处理
 * try catch
 *  细节：
 *  1.保证流对象变量作用域足够
 *  2.catch，怎么处理异常
 *      输出异常信息，看到哪里出现了问题
 *      停下程序，重新尝试
 * 3.如果流对象建立失败，需要关闭资源吗？
 *  new对象失败，失败了，没有占用资源,释放资源时，判断对象是不是空
 * */
public class FileOutputStreamDemo3 {
    public static void main(String[] args) {
        FileOutputStream fos = null;//try外声明变量，里面建立对象
        try {
            fos = new FileOutputStream("d:\\a.txt");//
            fos.write("100".getBytes());

        } catch (IOException ex) {
            System.out.println(ex.toString()+ex.getMessage());
            throw new RuntimeException("文件写入失败，请重试");
        } finally {
            try {
                if(fos!=null)
                fos.close();
            } catch (IOException ex) {
                throw new RuntimeException("关闭资源失败");
            }

        }

    }
}
