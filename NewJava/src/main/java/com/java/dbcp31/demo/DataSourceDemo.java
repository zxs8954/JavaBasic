package com.java.dbcp31.demo;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/*
 *连接池，BasicDataSources实现javax.sql.DataSource接口
 * */
public class DataSourceDemo {
    public static void main(String[] args)  {
        //创建DataSource接口的实现类
        //实现类，org.apache.commons.dpcp
        BasicDataSource dataSource = new BasicDataSource();
        //连接数据库的4个基本信息，通过对象setXXX方法设置
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        try {
            Connection con=dataSource.getConnection();
            System.out.println(con);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("连接失败");
        }

    }

}
