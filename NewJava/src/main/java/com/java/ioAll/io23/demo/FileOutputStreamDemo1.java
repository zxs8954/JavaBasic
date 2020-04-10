package com.java.ioAll.io23.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* FileOutputStream 文件的续写和换行
*   续写：FileOutputStream构造方法，第二个参数中加入true
*   换行：符号换行
* */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\a.txt");
        FileOutputStream fos=new FileOutputStream(file,true);
        fos.write("原先存在内容".getBytes());
        fos.write("\r\n续写内容".getBytes());

        fos.close();
    }
}
