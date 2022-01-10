package Q2.com.demo.dao;
import Q2.com.demo.beans.Server;
import java.util.HashSet;

public interface ServerDao {
    boolean save(Server server); //This is implemented in ServiceDaoImpl to save the entered info of new server
    HashSet<Server> displayAll(); //This is implemented in ServiceDaoImpl to display all server information in Hashset
    void dataset();
}
