package DAY_18.ENUM_DEMO.com.demo.test;
import java.util.Scanner;
import DAY_18.ENUM_DEMO.com.demo.beans.Student;
import DAY_18.ENUM_DEMO.com.demo.beans.Student.Grade;


public class TestStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student no");
		int id=sc.nextInt();
		System.out.println("enter student name");
		String nm=sc.next();
		System.out.println("enter student marks");
		double m=sc.nextDouble();
		
		
		Student sob=new Student(id,nm,m);
		System.out.println(sob);
	}

}
