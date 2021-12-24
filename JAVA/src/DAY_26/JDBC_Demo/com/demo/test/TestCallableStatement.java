package DAY_26.JDBC_Demo.com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCallableStatement {

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
			CallableStatement cs=conn.prepareCall("{call getcnt1(?,?)}");
			int pid=35;
			cs.setInt(1, pid);
			cs.registerOutParameter(2, java.sql.Types.INTEGER);
			boolean status=cs.execute();
			int cnt=cs.getInt(2);
			
			System.out.println("number of products :"+cnt);
		
			
			
			//step 3
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
