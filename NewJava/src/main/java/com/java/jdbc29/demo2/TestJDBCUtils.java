package com.java.jdbc29.demo2;

import java.sql.Connection;

public class TestJDBCUtils {
    public static void main(String[] args) {
        Connection con=JDBCUtilsConfig.getConnection();
        System.out.println(con);
    }
}
