package Q1.com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn; //Defining a static variable conn for connection
	static {
		conn=null; //Initialising conn = null
	}
	//Code to establish connection with Database
	public static Connection getMyConnection() {
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/myserve"; //Database url to connect to database
				conn=DriverManager.getConnection(url,"root","root"); //Establishing connection with Database
			} catch (SQLException e) {
				e.printStackTrace(); //Seeing for any exception during connection
			}
		}
		return conn;
	}

	//Code to close the connection with database
	public static void closeMyConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
