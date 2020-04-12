package com.java.jdbc29;

import java.sql.*;
/*
* 防止注入攻击
*  使用PrepareStatement接口，实现数据表的更新操作
*
* */
public class JDBCDemo3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8","root","123");
        Statement sta=con.createStatement();
       String sql="update sort set sname=?,sprice=?where sid=?";
       PreparedStatement pst=con.prepareStatement(sql);
       //调用pst的方法set???设置？ 占位
        pst.setObject(1,"汽车美容");
        pst.setObject(2,"49988");
        pst.setObject(3,7);
        //调用pst方法执行sql
        pst.executeUpdate();
        pst.close();
        con.close();
    }
}
