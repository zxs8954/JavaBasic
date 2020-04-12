package com.java.jdbc29.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * JDBC读取每个数据表sort，每行数据封装到Sort类对象中
 * 很多个Sort类对象，存储到List集合中
 * */
public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8", "root", "123");
        PreparedStatement pst = con.prepareStatement("select * from sort");
        ResultSet rs = pst.executeQuery();
        List<Sort> list = new ArrayList<Sort>();
        while (rs.next()) {
            //获取每个列数据，封装到Sort 对象中
            Sort s = new Sort(rs.getInt("sid"), rs.getString("sname"), rs.getDouble("sprice"), rs.getString("sdesc"));
            //封装Sort对象，存储到集合中
            list.add(s);
        }
        for (Sort s : list) {
            System.out.println(s);
        }
    }
}
