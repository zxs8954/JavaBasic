package com.java.dbcp31.demo1;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/*
 * 使用DBCP实现数据库的连接池
 * 连接配置自定义类
 * 最基本4项
 * 对于数据的其他配置，自定义
 * */
public class JDBCUtils {
    //创建出BasicDataSource类独享
    private static BasicDataSource dataSource = new BasicDataSource();

    //静态代码块，对象BasicDataSource对象中的配置
    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/my123123131?serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        //对象连接池中的数量配置
        dataSource.setInitialSize(10);//初始化的连接数
        dataSource.setMaxActive(8);//最大连接数量
        dataSource.setMaxIdle(5);//最大空闲
        dataSource.setMinIdle(1);//最小空闲
    }

    //定义静态方法，返回BasicDataSource类对象
    public static DataSource getDataSource() {
        return dataSource;
    }
}
