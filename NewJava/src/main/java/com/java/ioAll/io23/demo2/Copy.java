package com.java.ioAll.io23.demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 将数据源d:\\a.txt
 * 复制到e:\\a.txt
 * 字节输入流，绑定数据源
 * 字节输出源，绑定目的地
 *
 * 输入，读取一个字节
 * 输出，写一个字节
 * */
public class Copy {
    public static void main(String[] args) {
        //定义2个流对象变量
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //建立2个流的对象，绑定数据源和数据目的
            fis = new FileInputStream("d:\\a.txt");
            fos = new FileOutputStream("e:\\a.txt");
            //字节输入流，读取一个字节，输出流写一个字节
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("文件复制失败");
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                throw new RuntimeException("释放资源失败");
            } finally {
                try {
                    if (fis != null)
                        fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
    }
}
