package com.java.code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String s1=s.substring(0,5);
            OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("d:\\nn.txt",true));
            osw.write(s1+"\n");
            osw.close();
        }
    }
}
