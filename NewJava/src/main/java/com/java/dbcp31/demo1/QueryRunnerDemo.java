package com.java.dbcp31.demo1;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.SQLException;
import java.util.List;

/*
 * 测试写好的工具类
 * 提供的是一个DataSource接口的数据源
 * QueryRunner类构造方法，接受DataSource接口的实现类
 * 后面，调用方法update,query无需传递Connection连接对象
 * */
public class QueryRunnerDemo {
    public static void main(String[] args) {
       // insert();
        select();
    }

    //定义2个方法，实现数据表的添加，数据表查询
    //QueryRunner类对象，写在类成员位置
    private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

    //查询数据
    public static void select() {
        String sql = "select * from sort";
        List<Object[]> list = null;
        try {
            list = qr.query(sql, new ArrayListHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (Object[] objs : list) {
            for (Object obj : objs) {
                System.out.print(obj + "\t");
            }
            System.out.println();
        }
    }

    //数据添加数据
    public static void insert() {
        String sql = "insert into sort (sname,sprice,sdesc) values (?,?,?)";
        Object[] params = {"水果", 40.5, "水果贵"};
        try {
            int row = qr.update(sql, params);
            System.out.println(row);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("添加失败");
        }
    }
}
