package org.example.dao;
import org.example.model.User;

import java.util.List;

public interface UserDao {
    public void createTable();
    public void insertUser(User user);
    public void updateUser(int id, User newUser);
    public void deleteUser(int id);
    public List<User> displayUsers();
    public User checkUserForId(int id);
}
