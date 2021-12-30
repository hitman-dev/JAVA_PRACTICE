package DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.services;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.beans.User;
import java.util.List;

public interface UserService {

    void closeConnection();

    boolean addNewUser();

    User checkIfExists(String username, String address);

    List<User> displayAll();

    boolean addNewUserIfExists(String username, String address);
}
