package Q2.com.demo.dao;
import Q2.com.demo.beans.Server;
import java.time.LocalDate;
import java.util.HashSet;

public class ServerDaoImpl implements ServerDao {
    HashSet<Server> serverHashSet = new HashSet<>();
    //Entering custom data into the Hashset
    public void dataset(){
        serverHashSet.add(new Server(1,"Dubai",15, LocalDate.of(2000, 04, 01), LocalDate.of(2000, 05, 11),50,200000f));
        serverHashSet.add(new Server(2,"India",10, LocalDate.of(2000, 04, 01), LocalDate.of(2000, 05, 11),50,200000f));
        serverHashSet.add(new Server(3,"Australia",12, LocalDate.of(2000, 04, 01), LocalDate.of(2000, 05, 11),50,500000f));
        serverHashSet.add(new Server(4,"USA",13, LocalDate.of(2001, 05, 01), LocalDate.of(2001, 05, 11),50,500000f));
        serverHashSet.add(new Server(5,"Russia",22, LocalDate.of(2001, 05, 01), LocalDate.of(2001, 05, 11),50,700000f));
    }

    //Code save the entered info of new server
    @Override
    public boolean save(Server server) {
        for (Server s : serverHashSet) {
            if (s.getDuration() == server.getDuration() && s.getLocation().equals(server.getLocation())){
                System.out.println("Duplicate Server");
                return false;
            }else{
                serverHashSet.add(server);
                return true;
            }
        }
        return false;
    }
    //Code to display all server information in Hashset
    @Override
    public HashSet<Server> displayAll() {
        return serverHashSet;
    }
}
