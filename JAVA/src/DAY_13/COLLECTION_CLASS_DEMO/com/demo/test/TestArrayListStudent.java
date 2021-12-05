package DAY_13.COLLECTION_CLASS_DEMO.com.demo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import DAY_13.COLLECTION_CLASS_DEMO.com.demo.bean.Student;

public class TestArrayListStudent {
	public static void main(String[] args) {
		SimpleDateFormat sdt=new SimpleDateFormat("dd-MM-yyyy");
		List<Student> slist=new ArrayList<>();
		//slist.add(new Student(12,"xxx","dddd", new Date())); SEE THIS
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter date(DD-MM-yyyy)");
		String dt=sc.next();
		
		/*try {
			Date bdate=sdt.parse(dt);
			slist.add(new Student(sid,nm,address,bdate));
			slist.add(new Student(sid,nm,address,new Date("12/04/2021"))); //mm/dd/yyyy
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(slist);
		
		LocalDate ldt=LocalDate.now();
		System.out.println("enter date");
		String dt1=sc.next();
		
		ldt=LocalDate.parse(dt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	}

}
