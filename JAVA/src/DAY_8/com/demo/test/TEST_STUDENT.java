package DAY_8.com.demo.test;
import DAY_8.com.demo.beans.BACHELOR_STUDENTS;
import DAY_8.com.demo.beans.PERSON;
import DAY_8.com.demo.beans.Phd_STUDENTS;

import java.util.Scanner;

public class TEST_STUDENT {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("1. phd student\n2.Bachelor student\n3.Faculty \n 4.exit");
		System.out.println("choice");
		int choice=sc.nextInt();
		PERSON ob=null;
		switch(choice) {
			case 1:
				ob=new Phd_STUDENTS(12,"ssss","BE",88,99,78,"thesis1",89,"guide1");
				System.out.println(ob);
				System.out.println(ob.calculatePercentage());
				//ob.m1();
				((Phd_STUDENTS)ob).m1();  // to call child class specific method
				break;
			case 2:
				ob=new BACHELOR_STUDENTS(12,"ssss","BE",88,99,78,"xxx","yyy",89);
				System.out.println(ob);
				System.out.println(ob.calculatePercentage());
				//ob.m2();
				((BACHELOR_STUDENTS)ob).m2();  //to call child class specific methods
				break;
			case 3:
				break;
			case 4:
				System.out.println("Thank you for visiting");
				break;
			default:
				System.out.println("wrong choice");
		}
//		STUDENTS s=new STUDENTS();
//		System.out.println(s);
//		STUDENTS s1=new STUDENTS(11,"Ashu","Bsc",88.00f,99.93f,89.23f);
//		System.out.println(s1);
//		Phd_STUDENTS ob=new Phd_STUDENTS(12,"ssss","BE",88,99,78,"thesis1",89,"guide1");
//		System.out.println(ob);
	}

}


