package DAY_10.com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import DAY_10.com.demo.bean.Student;


public class StudentServiceImpl implements StudentService {
    static List<Student> slist;
    static {
    	slist=new ArrayList<>();
    	slist.add(new Student(10,"Rajan","Aundh",LocalDate.of(2000,11,10)));
    	slist.add(new Student(1,"Revati","baner",LocalDate.of(1997,05,10)));
    	slist.add(new Student(13,"Anil","baner",LocalDate.of(1978,05,10)));
    }
	@Override
	public void addStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter date(dd/MM/yyyy)");
		String dt=sc.next();
		slist.add(new Student(sid,nm,address,LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		
	}
	@Override
	public void displayAll() {
		//java 1.8
		//slist.stream().forEach(s->System.out.println(s));
		//java 1.7
		/*for(Student s:slist) {
			System.out.println(s);
		}*/
		//java 1.5 
		Iterator<Student> it=slist.iterator();
		while(it.hasNext()) {
		   Student s=it.next();
		   System.out.println(s);
		}
	}

}
