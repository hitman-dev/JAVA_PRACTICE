package DAY_26.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/hitman";
			Connection conn=DriverManager.getConnection(url,"root","root");
			if(conn!=null) {
				System.out.println("connection done!!");
			}
			else {
				System.out.println("connection not done");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
