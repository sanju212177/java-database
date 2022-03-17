package org.example.dao;
import org.example.config.Controller;
import java.sql.*;
import org.example.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void createTable() {
        Connection c = Controller.getConnection();
        try {
            if (c != null) {
                Statement stmt = c.createStatement();
                System.out.println("Created a  table");
                stmt.executeUpdate("create table test2 (id int primary key, name varchar(20))");
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void insertUser(User user) {
        Connection c = Controller.getConnection();
        PreparedStatement stmt = null;
        try {
            if (c != null) {
                stmt = c.prepareStatement("insert into test2 values(?,?)");
                stmt.setInt(1,user.getId());
                stmt.setString(2,user.getName());
                int i=stmt.executeUpdate();
                System.out.println(i+" records inserted");
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void updateUser(int id, User newUser) {
        Connection c = Controller.getConnection();
        PreparedStatement stmt = null;
        try {
            if (c != null) {
                stmt = c.prepareStatement("update test2 set id=?, name=? where id=?");
                stmt.setInt(1,newUser.getId());
                stmt.setString(2,newUser.getName());
                stmt.setInt(3,id);
                int i=stmt.executeUpdate();
                System.out.println(i+" records updated");
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        Connection c = Controller.getConnection();
        PreparedStatement stmt = null;
        try {
            if (c != null) {
                stmt = c.prepareStatement("delete from test2 where id=?");
                stmt.setInt(1,id);
                int i=stmt.executeUpdate();
                System.out.println(i+" records deleted");
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public List<User> displayUsers() {
        List<User> users = new ArrayList<User>();
        Connection c = Controller.getConnection();
        PreparedStatement stmt = null;
        try {
            if (c != null) {
                stmt = c.prepareStatement("select * from test2");
                ResultSet rs=stmt.executeQuery();
                while(rs.next()){
                    users.add(new User(rs.getInt(1), rs.getString(2)));
                }
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return users;
    }

    @Override
    public User checkUserForId(int id) {
        User user = null;
        Connection c = Controller.getConnection();
        PreparedStatement stmt = null;
        try {
            if (c != null) {
                stmt = c.prepareStatement("select * from test2 where id=?");
                stmt.setInt(1,id);
                ResultSet rs=stmt.executeQuery();
                while(rs.next()){
                    user = new User(rs.getInt(1), rs.getString(2));
                }
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return user;
    }
}
