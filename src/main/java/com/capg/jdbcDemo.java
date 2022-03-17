package com.capg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcDemo {
    public static void main(String[] argv){
        try{
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sanju2107");
            System.out.println(c);
            System.out.println(c.isClosed());
            c.close();
            System.out.println(c.isClosed());
        } catch(SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
