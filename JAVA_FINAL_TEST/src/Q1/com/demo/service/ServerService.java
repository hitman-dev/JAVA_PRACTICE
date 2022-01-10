package Q1.com.demo.service;
import Q1.com.demo.beans.Server;

import java.util.List;


public interface ServerService {

	boolean deleteById(int sid); //This is implemented in ServerServiceImpl to delete the server by ID

	void closeConnection(); //This is implemented in ServerServiceImpl to close the connection with Database

	List<Server> displayByDays(int sduration); //This is implemented in ServerServiceImpl to display all servers with duration <or equal to given duration

	List<Server> displayByPrice(float price); //This is implemented in ServerServiceImpl to  display all servers with price < or equal to given price

	boolean addNewServer(); //This is implemented in ServerServiceImpl to add new server data to the database
}
