package DAY_26.JDBC_Demo.com.demo.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestPrepareStatement {
public static void main(String[] args) {
	Connection conn=null;
		try {
			///step 1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/test";
			//step 2
			 conn=DriverManager.getConnection(url,"root","root123");
			//conn.setAutoCommit(false);
			if(conn!=null) {
				System.out.println("connection done!!");
			}
			else {
				System.out.println("connection not done");
			}
			//step 3
			PreparedStatement ps=conn.prepareStatement("select * from myproduct");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("product id :" +rs.getInt(1));
				System.out.println("product name :" +rs.getString(2));
				System.out.println("Product qty : "+rs.getInt(3));
				System.out.println("product price :" +rs.getDouble(4));
				System.out.println("product mfgdate :" +rs.getDate(5));
				System.out.println("----------------------------" );
			}
		////accept data from user and insert data into table
					Scanner sc=new Scanner(System.in);
					System.out.println("enetr pid");
					int pid=sc.nextInt();
					System.out.println("enter name");
					String nm=sc.next();
					System.out.println("enetr qty");
					int qty=sc.nextInt();
					System.out.println("enetr price");
					double pr=sc.nextDouble();
					System.out.println("enetr date(dd/mm/yyyy");
					String dt=sc.next();
					LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					
					PreparedStatement ps1=conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
					ps1.setInt(1,pid);
					ps1.setString(2,nm);
					ps1.setInt(3, qty);
					ps1.setDouble(4, pr);
					Date date = Date.valueOf(ldt);
				    ps1.setDate(5,date);
					int n=ps1.executeUpdate();
					if(n>0) {
						System.out.println("product added");
						//conn.commit();
					}
					else
						System.out.println("not added");
					
			
			
		} catch (SQLException e) {
			//try {
				//conn.rollback();
			//} catch (SQLException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			//}
			e.printStackTrace();
		}
		

	}

}
