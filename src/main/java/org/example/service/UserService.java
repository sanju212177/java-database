package org.example.service;
import org.example.model.User;
import java.util.List;

public interface UserService {
    public void createTable();
    public void insertUser(User user);
    public void updateUser(int id, User newUser);
    public void deleteUser(int id);
    public List<User> displayUsers();
}
