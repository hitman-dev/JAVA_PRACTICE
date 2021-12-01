package DAY_10.com.demo.test;

import java.util.Scanner;
import DAY_10.com.demo.service.StudentService;
import DAY_10.com.demo.service.StudentServiceImpl;
public class TestStudentList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService ss=new StudentServiceImpl();
		int choice=0;
		do {
		System.out.println("1. add new student\n2. delete By id\n 3. modify address\n4.display all\n");
		System.out.println("5. display by id\n 6. display by name\n7. sort by id\n8.exit");
		System.out.println("choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			ss.addStudent();
			break;
		case 2:
			break;
		case 4:
			ss.displayAll();
			break;
		case 8:
			System.out.println("Thank you for visiting....");
		default :
			System.out.println("wrong choice");
				
			
		}
	}while(choice!=8);

	}

}
