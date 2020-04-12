package com.java.jdbc30.demo2;

import com.java.jdbc29.demo2.JDBCUtilsConfig;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * QueryRunner数据查询操作
 *       调用QueryRunner类方法query(Connection con,String  sql,ResultSetHandler r,Object....param)
 *       ResultSetHandler r结果集处理方式，传递ResultSetHandler接口实现类
 *       注意：query返回值是泛型
 * */
public class QueryRunnerDemo1 {
    private static Connection con = JDBCUtilsConfig.getConnection();

    public static void main(String[] args) throws SQLException {
        //arrayHandler();
        //arrayListHandler();
        //beanHandler();
        //beanListHandler();
        //columnListHandler();
        //scalarHandler();
        //mapHandler();
        mapListHandler();
    }

    /*
     *结果集第8种处理方式MapListHandler
     *将结果接每一行存储到Map集合，键列名，值：数据
     * Map集合过多，存储到List中
     * */
    public static void mapListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        //返回的是List集合，存储的是Map集合
        List<Map<String, Object>> list = qr.query(con, sql, new MapListHandler());
        for (Map<String, Object> map : list) {
            for (String key : map.keySet()) {
                System.out.print(key + " " + map.get(key));
            }
            System.out.println();
        }
    }

    /*
     *结果集第七种处理方式MapHandler
     *将结果集第一行存储到Map集合中
     * Map<键，值>
     * */
    public static void mapHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        //返回值Map集合
        Map<String, Object> map = qr.query(con, sql, new MapHandler());
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }
    }

    /*
     *结果集第六种处理方式ScalarHandler
     * 对于查询后，只有1个结果
     * */
    public static void scalarHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select count(*) from sort";
        long count = qr.query(con, sql, new ScalarHandler<Long>());
        System.out.println(count);
    }

    /*
     *结果集第五种处理方式ColumnListHandler
     * 将结果集的指定列存储到List集合
     * 返回List<Object> 每个列数据类型不同
     * */
    public static void columnListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        List<Object> list = qr.query(con, sql, new ColumnListHandler<Object>("sname"));
        for (Object s : list) {
            System.out.println(s);
        }
    }

    /*
     *结果集第四种处理方式BeanListHandler
     * 将结果集的每一行数据封装成javabean对象
     * 多个javabean独享封装到List集合中
     *注意：被封装成数据到JavaBean,sort类必须有空参构造
     * */
    public static void beanListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        List<Sort> s = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
        for (Sort s1 : s) {
            System.out.println(s1 + "\t");
        }

    }

    /*
     *结果集第三种处理方式BeanHandler
     * 将结果集的第一行数据封装成javabean对象
     *注意：被封装成数据到JavaBean,sort类必须有空参构造
     * */
    public static void beanHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        Sort s = qr.query(con, sql, new BeanHandler<Sort>(Sort.class));
        System.out.println(s);
    }

    /*
     *结果集第二种处理方式ArrayListHandler
     * 将结果集的每一行存储到对象数组中，出现很多对象数组
     * 对象存储到List集合
     * */
    public static void arrayListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        //返回值，每行是一个对象数组
        List<Object[]> result = qr.query(con, sql, new ArrayListHandler());
        for (Object[] obj : result) {
            for (Object i : obj) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    /*
     *结果集第一种处理方式ArrayHandler
     * 将结果集的第一行存储到对象数组中 Object[]
     * */
    public static void arrayHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        //调用query执行查询，传递连接对象SQL语句，结果集处理方式的实现类
        //返回对象数组
        Object[] result = qr.query(con, sql, new ArrayHandler());
        for (Object obj : result) {
            System.out.print(obj + "\t");
        }
    }
}
