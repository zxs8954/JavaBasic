package com.java.jdbc29.jdbcUtil;

import java.sql.*;

/*
* 实现JDBC的工具类
* 定义方法，直接返回数据的的连接对象
* */
public class JDBCUtils {
    private JDBCUtils(){}
    private static Connection con;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8","root","123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * 定义静态方法，返回数据库的连接对象
    * */
    public static Connection getConnection(){
        return con;
    }
    public static void close(Connection con, Statement stat, ResultSet rs) throws SQLException {
        con.close();
        stat.close();
        rs.close();
    }
}
