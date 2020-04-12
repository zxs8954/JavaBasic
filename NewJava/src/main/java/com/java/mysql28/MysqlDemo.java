package com.java.mysql28;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 注册驱动
 *       告知JVM使用的哪一个驱动
 * 获得连接
 *       使用JDBC完成对mysql的连接
 * 获得执行语句的平台
 *       通过连接对象获取对SQL语句的执行者对象
 * 执行SQL语句
 *       执行SQL，获取结果
 * 处理结果
 * 关闭资源
 * */
public class MysqlDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //注册驱动  反射技术，将驱动类加入到内容
        //java.sql.DriverManager类静态方法registerDriver(Driver driver)
        //Driver 也是接口。传递MYSQL驱动程序中的实现类
        //DriverManager.registerDriver(new Driver());  不推荐这样写
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接
        //static Connection getConnection(String url,String user,String password)
        //返回值是Connection接口实现类，在mysql驱动程序
        //url：数据库地址jdbc:mysql://ip:端口号/数据库名字
        String url = "jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8";
        Connection con = DriverManager.getConnection(url, "root", "123");
        //获得执行语句的平台
        Statement sta = con.createStatement();
        //执行SQL
        //int executeUpdate(String sql) 执行数据库中的SQL语句  insert delete update
        String sql="insert into sort (sname,sprice,sdesc)value ('窗户',100,'刮风')";
        int i=sta.executeUpdate(sql);
        System.out.println(i);
        //获取结果

        // 关闭资源
        sta.close();con.close();
    }

}
