package org.example.dao;
import org.example.model.Employee;
import org.example.model.User;

import java.util.List;

public interface EmployeeDao {
    public void createTable();
    public void insertEmployee(Employee emp);
    public void updateUser(int empId, Employee newEmp);
    public void deleteUser(int id);
    public List<User> displayUsers();
    public User checkUserForId(int id);
}
