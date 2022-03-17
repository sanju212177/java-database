package org.example.service;
import org.example.dao.UserDaoImpl;
import org.example.model.User;
import java.util.List;

public class UserServiceImpl implements UserService{
    UserDaoImpl udi = new UserDaoImpl();

    @Override
    public void createTable() {
        udi.createTable();
    }

    @Override
    public void insertUser(User user) {
        if(udi.checkUserForId(user.getId()) != null){
            System.out.println("User with this id already exists!");
            return;
        }
        udi.insertUser(user);
    }

    @Override
    public void updateUser(int id, User newUser) {
        if(udi.checkUserForId(id) == null){
            System.out.println("User with this id does not exists!");
            return;
        }
        udi.updateUser(id, newUser);
    }

    @Override
    public void deleteUser(int id) {
        if(udi.checkUserForId(id) == null){
            System.out.println("User with this id does not exists!");
            return;
        }
        udi.deleteUser(id);
    }

    @Override
    public List<User> displayUsers() {
        return udi.displayUsers();
    }

}
