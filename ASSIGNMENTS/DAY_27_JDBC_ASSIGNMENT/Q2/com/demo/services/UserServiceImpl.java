package DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.services;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.beans.User;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.dao.UserDao;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.dao.UserDaoImpl;

import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    Scanner sc = new Scanner(System.in);
    private UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public boolean addNewUser() {

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter User Address: ");
        String address = sc.nextLine();
        System.out.print("Enter User mobile number: ");
        long mobileno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter User E-mail: ");
        String email = sc.nextLine();

        return userDao.save(new User(username, address, mobileno, email));
    }

    @Override
    public User checkIfExists(String username, String address) {
        return userDao.checkIfExists(username,address);
    }

    @Override
    public List<User> displayAll() {
        return userDao.displayAll();
    }

    @Override
    public boolean addNewUserIfExists(String username, String address) {
        System.out.println("Enter Username: " +username);
        System.out.println("Enter User Address: " +address);
        System.out.print("Enter User mobile number: ");
        long mobileno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter User E-mail: ");
        String email = sc.nextLine();
        return userDao.save(new User(username, address, mobileno, email));
    }

    @Override
    public void closeConnection() {
        userDao.closeConnection();
    }
}
