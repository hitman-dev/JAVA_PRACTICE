package Q2.com.demo.service;
import Q2.com.demo.dao.ServerDao;
import Q2.com.demo.beans.Server;
import Q2.com.demo.dao.ServerDaoImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

//This class implements ServerService class
public class ServerServiceImpl implements ServerService {
    private ServerDao serverDao;

    public ServerServiceImpl() {
        serverDao = new ServerDaoImpl();
    }

    //Code to add new server data to the Hashset
    @Override
    public boolean addNewServer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter server id: ");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter server location: ");
        String location = sc.nextLine();
        System.out.print("Enter duration: ");
        int duration = sc.nextInt();
        System.out.print("Enter Purchase Date(dd-mm-yyyy): ");
        String pdt = sc.next();
        LocalDate purchaseDate = LocalDate.parse(pdt, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.print("Enter Validity End Date(dd-mm-yyyy): ");
        String edt = sc.next();
        LocalDate endDate = LocalDate.parse(edt, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.print("Enter RAM: ");
        int ram = sc.nextInt();
        System.out.print("Enter Price: ");
        float price = sc.nextFloat();
        return serverDao.save(new Server(sid, location, duration, purchaseDate, endDate, ram, price));
    }

    //Code to display all server information in Hashset
    @Override
    public HashSet<Server> displayAll() {
        return serverDao.displayAll();
    }

    @Override
    public void dataset() {
        serverDao.dataset();
    }

}
