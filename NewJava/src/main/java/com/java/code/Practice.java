package com.java.code;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*
* 获取随机手机号，并存储到文档中
* */
public class Practice {
    public static void main(String[] args) throws InterruptedException, IOException {
        while (true) {
            //Thread.sleep(200);
            int i = (int) (Math.random() * 10000 - 1);
            String pNum = "1554792" + i;
            ArrayList<String> arr = new ArrayList<String>();
            if (!(arr.contains(pNum)) && pNum.length() == 11) {
                arr.add(pNum);
                Practice.writeNum(new File("d:\\a.txt"), pNum);
            } else {
                Practice.writeNum(new File("d:\\c.txt"), pNum);
            }
            for (String s : arr) {
                System.out.println(s);
            }
        }

    }

    public static void writeNum(File file, String pNum) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(file, true));
        osw.write(pNum + "\n");
        osw.close();
    }
}

