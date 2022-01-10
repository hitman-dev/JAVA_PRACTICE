package Q1.com.demo.dao;

import Q1.com.demo.beans.Server;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//This class implements ServerDao class
public class ServerDaoImpl implements ServerDao {
	static Connection conn;
	static PreparedStatement ins_server,delById,findByPrice,findByDays; //PreparedStatement Queries
	static {
		try {
			conn=DBUtil.getMyConnection();
			ins_server=conn.prepareStatement("insert into serverinfo values(?,?,?,?,?)"); //Query to insert a new server data in the Database
			delById=conn.prepareStatement("delete from serverinfo where pid=? "); //Query to Delete a server from Database
			findByPrice=conn.prepareStatement("select * from serverinfo where price<=?"); //Query to  display all servers with price < or equal to given price
			findByDays=conn.prepareStatement("select * from serverinfo where Duration<=?"); //Query to display all servers with duration <or equal to given duration
		} catch (SQLException e) {
			e.printStackTrace();
		} // Seeing for any exception during execution od above queries
	}

	//Code save the entered info of new server
	@Override
	public boolean save(Server server) {
		try {

			ins_server.setInt(1, server.getSid());
			ins_server.setString(2, server.getLocation());
			ins_server.setInt(3, server.getDuration());
			java.sql.Date purchaseDate = java.sql.Date.valueOf(server.getPurchaseDate());
			ins_server.setDate(4, purchaseDate);
			java.sql.Date endDate = java.sql.Date.valueOf(server.getEndDate());
			ins_server.setDate(5, endDate);
			ins_server.setInt(6, server.getRam());
			ins_server.setFloat(7, server.getPrice());

			int n=ins_server.executeUpdate();
			if(n>0)
				return true; //If executed successfully return True
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// Seeing for any exception during adding of new server data into database
		
		return false; //If not-executed successfully return False
	}


	//Code to delete the server by ID
	@Override
	public boolean deleteById(int pid) {
		try {
			delById.setInt(1, pid);
			int n=delById.executeUpdate();
			if(n>0)
            	return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	// Code to display all servers with duration <or equal to given duration
	@Override
	public List<Server> displayByDays(int duration) {
		List<Server> serverListByDuration = new ArrayList<>();
		try {
			findByDays.setInt(1, duration);
			ResultSet rs = findByDays.executeQuery();
			while (rs.next()) {
				serverListByDuration.add(new Server(rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getDate(4).toLocalDate(),
						rs.getDate(5).toLocalDate(),
						rs.getInt(6),
						rs.getFloat(7)
				));
			}
			if (serverListByDuration.size() > 0) {
				return serverListByDuration;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//Code to  display all servers with price < or equal to given price
	@Override
	public List<Server> displayByPrice(float price) {
		List<Server> serverListByPrice = new ArrayList<>();
		try {
			findByPrice.setFloat(1, price);
			ResultSet rs = findByPrice.executeQuery();
			while (rs.next()) {
				serverListByPrice.add(new Server(rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getDate(4).toLocalDate(),
						rs.getDate(5).toLocalDate(),
						rs.getInt(6),
						rs.getFloat(7)
				));
			}
			if (serverListByPrice.size() > 0) {
				return serverListByPrice;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

    //Code to close the connection with Database
	@Override
	public void closeConnection() {
		DBUtil.closeMyConnection();

	}


}
