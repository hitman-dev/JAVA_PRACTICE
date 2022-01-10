package Q1.com.demo.service;
import Q1.com.demo.beans.Server;
import Q1.com.demo.dao.ServerDao;
import Q1.com.demo.dao.ServerDaoImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


//This class implements ServerService class
public class ServerServiceImpl implements ServerService {
      private ServerDao serverDao;

	public ServerServiceImpl() {
		super();
		serverDao=new ServerDaoImpl();
	}


	//Code to add new server data to the database
	@Override
	public boolean addNewServer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sid");
		int sid=sc.nextInt();
		System.out.println("enter Location");
		String sloc=sc.next();
		System.out.println("enter Duration");
		int sduration=sc.nextInt();
		System.out.println("enter Purchase date(dd/mm/yyyy");
		String pd=sc.next();
		LocalDate pdate=LocalDate.parse(pd,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter validity end date(dd/mm/yyyy");
		String vd=sc.next();
		LocalDate vdate=LocalDate.parse(vd,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter RAM size");
		int ram=sc.nextInt();
		System.out.println("enetr price");
		float price=sc.nextFloat();
		return serverDao.save(new Server(sid,sloc,sduration,pdate,vdate,ram,price));
		
	}

	//Code to delete the server by ID
	@Override
	public boolean deleteById(int pid) {
		return serverDao.deleteById(pid);
	}


	//Code to display all servers with duration <or equal to given duration
	@Override
	public List<Server> displayByDays(int duration) {
		return serverDao.displayByDays(duration);
	}

	//Code to  display all servers with price < or equal to given price
	@Override
	public List<Server> displayByPrice(float price) {
		return serverDao.displayByPrice(price);
	}


	//Code to close the connection with Databa
	@Override
	public void closeConnection() {
		serverDao.closeConnection();
		
	}

}
