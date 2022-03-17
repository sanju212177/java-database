package org.example.ui;
import org.example.model.User;
import org.example.service.UserServiceImpl;
import java.util.*;

public class MainCLI {
    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("\n---Menu---");
            System.out.println("1. Create table");
            System.out.println("2. Insert into table");
            System.out.println("3. Update table");
            System.out.println("4. Delete from table");
            System.out.println("5. Select all table");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            String ch = s.nextLine();
            switch (ch){
                case "1":
                    usi.createTable();
                    break;
                case "2":
                    User user = new User();
                    System.out.println("Enter id: ");
                    user.setId(s.nextInt());
                    s.nextLine();
                    System.out.print("Enter the name: ");
                    user.setName(s.nextLine());
                    usi.insertUser(user);
                    break;
                case "3":
                    User user2 = new User();
                    System.out.print("Enter id to be updated: ");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter id: ");
                    user2.setId(s.nextInt());
                    s.nextLine();
                    System.out.print("Enter name: ");
                    user2.setName(s.nextLine());
                    usi.updateUser(id, user2);
                    break;
                case "4":
                    System.out.println("Enter id to be deleted: ");
                    int id2 = s.nextInt();
                    s.nextLine();
                    usi.deleteUser(id2);
                    break;
                case "5":
                    List<User> users = usi.displayUsers();
                    for(User user3 : users){
                        System.out.println(user3);
                    }
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
