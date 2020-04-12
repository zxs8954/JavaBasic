package com.java.jdbc29.demo1;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class PropertiesDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //使用类加载器
        InputStream in = PropertiesDemo.class.getClassLoader().getResourceAsStream("pro.properties");
        System.out.println(in);
        Properties pro = new Properties();
        pro.load(in);
        String driverClass = pro.getProperty("driverClass");
        String url = pro.getProperty("url");
        String userName = pro.getProperty("userName");
        String password = pro.getProperty("password");
        Class.forName(driverClass);
        Connection con= DriverManager.getConnection(url,userName,password);
        System.out.println(con);

    }
}
