package com.java.jdbc29;

import java.sql.*;

public class JDBCDemo2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8","root","123");
        Statement sta=con.createStatement();
        //执行SQL语句，数据表，查询用户名密码，存在登录成功，不存在失败
        String sql="select * from users where username='123123' or 1=1";
        ResultSet rs=sta.executeQuery(sql);
        while (rs.next()){
            System.out.println(rs.getString("id")+rs.getString("username")+rs.getString("password"));
        }


        con.close();
        sta.close();
    }
}
