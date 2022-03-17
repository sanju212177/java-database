package com.capg;

import java.sql.*;

public class jdbcDemo2 {
    public static void main(String[] argv){
        try{
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sanju2107");
                // CREATING A TABLE VIA JAVA APPLICATION
                Statement statement = c.createStatement();
                //statement.executeUpdate("CREATE TABLE products2(id integer, p_ varchar (55), p_price integer, p_qty integer)");
                statement.executeQuery("SELECT *FROM products2");
                ResultSetMetaData resultSetMetaData = statement.getResultSet().getMetaData();
                System.out.println("Table Name: "+resultSetMetaData.getTableName(1));
                System.out.println("Total Columns : "+resultSetMetaData.getColumnCount());
                System.out.println(resultSetMetaData.getColumnName(2));


        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
