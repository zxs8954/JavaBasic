package com.java.jdbc30.demo1;

import com.java.jdbc29.demo2.JDBCUtilsConfig;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/*
 * 使用QueryRunner类，实现对数据表的   insert   delete update
 * 调用QueryRunner类的方法update(Connection con,String sql,Object ....param)
 * Object ....param 可变参数，Object类型，Sql语句会出现?占位符
 * 数数据库连接对象，自定义的工具类传递
 * */
public class QueryRunnerDemo {
    private static Connection con = JDBCUtilsConfig.getConnection();
    public static QueryRunner qr;
    public static void main(String[] args) throws SQLException {
        //update();
        delete();
    }
    /*
    * 定义方法，使用QueryRunner类想数据库修改数据
    * */
    public static void update() throws SQLException {
        qr=new QueryRunner();
        String sql="update sort set sname=?,sprice=?,sdesc=? where sid=?";
        Object[] params={"花卉",100.5,"花卉好卖",5};
        qr.update(con,sql,params);
    }
    /*
    * 删除
    * */
    public static void delete() throws SQLException {
        String sql="delete from sort where sid=?";
        qr=new QueryRunner();
        int param=10;
        qr.update(con,sql,param);

    }
    /*
     * 定义方法，使用QueryRunner类的方法update
     * */
    public static void insert() throws SQLException {
        //创建QueryRunner类的对象
        qr = new QueryRunner();
        String sql = "insert into sort (sname,sprice,sdesc) values(?,?,?)";
        //将三个？占位符实际参数写在数组中
        Object[] params = {"体育用品", 289.32, "篮球"};
        int i = qr.update(con, sql, params);
        System.out.println(i);
        DbUtils.closeQuietly(con);
    }
}
