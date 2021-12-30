package DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.dao;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.beans.User;


import java.util.List;

public interface UserDao {
    boolean save(User user);

    void closeConnection();

    User checkIfExists(String username, String address);

    List<User> displayAll();
}
