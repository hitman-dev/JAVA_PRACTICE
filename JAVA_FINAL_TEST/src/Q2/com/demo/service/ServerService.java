package Q2.com.demo.service;
import Q2.com.demo.beans.Server;
import java.util.HashSet;

public interface ServerService {
    boolean addNewServer(); //This is implemented in ServerServiceImpl to add new server data to the Hashset
    HashSet<Server> displayAll(); //This is implemented in ServerServiceImpl to display all server information in Hashset
    void dataset();
}
