package DAY_27.JDBC_Demo.com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestConnectioncreateStatement {

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
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from myproduct");
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
			int n=st.executeUpdate("insert into myproduct values("+pid+",'"+nm+"',"+qty+","+pr+",'"+ldt+"')");
			if(n>0)
				System.out.println("product added");
			else
				System.out.println("not added");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
