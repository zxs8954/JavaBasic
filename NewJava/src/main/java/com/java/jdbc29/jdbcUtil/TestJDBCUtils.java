package com.java.jdbc29.jdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCUtils {
    public static void main(String[] args) throws SQLException {
        Connection con=JDBCUtils.getConnection();
        PreparedStatement pst=con.prepareStatement("select sname from sort");
        ResultSet rs=pst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("sname"));
        }
        JDBCUtils.close(con,pst,rs);
    }
}
