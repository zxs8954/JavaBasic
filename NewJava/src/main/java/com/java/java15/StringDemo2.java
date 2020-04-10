package com.java.java15;

public class StringDemo2 {
    public static void main(String[] args) {
        function_1();
    }

    public static void function() {
        String str = "abc";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }
    public static void function_1(){
        String str="itcast";
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
