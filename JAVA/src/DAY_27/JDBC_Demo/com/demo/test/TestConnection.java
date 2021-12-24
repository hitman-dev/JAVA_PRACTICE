package DAY_27.JDBC_Demo.com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		
		try {
			///step 1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/test";
			//step 2
			Connection conn=DriverManager.getConnection(url,"root","root123");
			if(conn!=null) {
				System.out.println("connection done!!");
			}
			else {
				System.out.println("connection not done");
			}
			//step 3
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
