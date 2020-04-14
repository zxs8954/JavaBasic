package com.java.net28Tcp.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 互联网的IP地址
 *       java.net.InetAdderss
 *       静态方法
 *           static InetAddress getLocalHost()   获取本地主机
 *
 *  非静态方法
 *       String getHostName()获取主机名
 *               getHostAddress()   获取Ip
 *
 * */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        function_1(); 
    }
    public static void function() throws UnknownHostException {
        InetAddress inet = InetAddress.getLocalHost();
        //输出结果主机名和IP
        System.out.println(inet.getHostAddress());
        System.out.println(inet.getHostName());
    }
    /*
     * static InetAddress getByName(String hostName)传递主机名，获取IP
     */
    public static void function_1() throws UnknownHostException {
        InetAddress inet = InetAddress.getByName("DESKTOP-AV3T2CQ");
        System.out.println(inet);
    }
}