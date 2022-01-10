package Q1.com.demo.dao;
import Q1.com.demo.beans.Server;

import java.util.List;


public interface ServerDao {

	boolean save(Server product); //This is implemented in ServiceDaoImpl to save the entered info of new server

	boolean deleteById(int pid); //This is implemented in ServiceDaoImpl to delete the server by ID

	void closeConnection(); //This is implemented in ServiceDaoImpl to close the connection with Database

	List<Server> displayByDays(int duration); //This is implemented in ServiceDaoImpl to display all servers with duration <or equal to given duration

	List<Server> displayByPrice(float price); //This is implemented in ServiceDaoImpl to  display all servers with price < or equal to given price


}
