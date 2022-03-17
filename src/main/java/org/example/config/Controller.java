package org.example.config;
import java.sql.*;

public class Controller {
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "sanju2107");
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
