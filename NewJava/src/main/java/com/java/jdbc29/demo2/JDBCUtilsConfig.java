package com.java.jdbc29.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 * 编写JDBC的工具类，读取数据的连接
 * 采用读取配置文件的方式
 * 读取配置文件，执行一次，static{}
 * */
public class JDBCUtilsConfig {
    private static Connection con;
    private static String driverClass;
    private static String url;
    private static String userName;
    private static String password;

    static {
        try {
            readConfig();
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, userName, password);
        } catch (Exception ex) {
            throw new RuntimeException("");
        }
    }

    public static Connection getConnection() {
        return con;
    }

    private static void readConfig() throws IOException {
        InputStream in = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("pro.properties");
        Properties pro = new Properties();
        pro.load(in);
        driverClass = pro.getProperty("driverClass");
        url = pro.getProperty("url");
        userName = pro.getProperty("userName");
        password = pro.getProperty("password");
    }


}
