package com.java.ioAll.io23.demo3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流复制文本，必须是文本文件
 * 字符流查询本机默认编码表，简体中文GBK
 * FileReader读取数据源
 * FileWriter写入到数据目的
 * */
public class CopyDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("d:\\b.txt");
            fw=new FileWriter("d:\\1.txt");
            char[] ch=new char[1024];
            int len=0;
            while ((len=fr.read(ch))!=-1){
                fw.write(ch,0,len);
                fw.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        }finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                throw new RuntimeException("释放资源失败");
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException ex) {
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
    }
}
