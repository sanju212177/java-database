package com.capg;

import java.sql.*;

public class InsertRecord {
    public static void main(String[] argv){
        Connection c = null;
        try{
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sanju2107");

            Statement statement = c.createStatement();
            statement.executeUpdate("INSERT INTO products2 VALUES(107, 'item7', 40, 1)");
            ResultSet res = statement.executeQuery("SELECT *FROM products2");
            while(res.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print(res.getString(i) + " \t");
                }
                System.out.println();
            }
            System.out.println();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
