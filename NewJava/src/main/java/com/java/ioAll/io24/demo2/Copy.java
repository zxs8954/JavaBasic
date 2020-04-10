package com.java.ioAll.io24.demo2;

import java.io.*;

/*
 *  文件复制方式，一共4个方式
 * 1.字节流写单个字节   125.25
 * 2.字节流写字节数组      0.193    OK
 * 3.字节缓冲流读写单个字节    1.210
 * 4.字节缓冲流读写字节数组    0.073   OK
 * */
public class Copy {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        copy_2(new File("d:\\q.txt"), new File("d:\\q1.txt "));
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }

    /*
     * 4.字节缓冲流读写字节数组
     * */
    public static void copy_4(File src, File desc) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        byte[] ch = new byte[1024];
        while ((len = bis.read()) != -1) {
            bos.write(ch);
        }
        bis.close();
        bos.close();
    }

    /*
     * 3.字节缓冲流读写单个字节
     * */
    public static void copy_3(File src, File desc) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bis.close();
        bos.close();
    }

    /*
     *   2.字节流写字节数组
     *
     * */
    public static void copy_2(File src, File desc) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0;
        byte[] ch = new byte[1024];
        while ((len = fis.read(ch)) != -1) {
            fos.write(ch, 0, len);
        }
        fos.close();
        fis.close();
    }

    /*
     * 方法，实现文件复制
     * 1.字节流写单个字节
     * */
    public static void copy_1(File src, File desc) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
