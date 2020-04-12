package com.java.jdbc29;

import java.sql.*;

/*
* JDBC技术，查询数据表，获取结果集
* */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8","root","123");
        //获得执行平台
        Statement sta=con.createStatement();
        //执行sql
        String sql="select * from sort";
        ResultSet set=sta.executeQuery(sql);
        //处理结果集
        //boolean next
        while (set.next()){
            System.out.println(set.getInt("sid")+
                    set.getString("sname")+
                    set.getDouble("sprice")+
                    set.getString("sdesc"));
        }
        //关闭资源
        sta.close();
        con.close();
    }
}
