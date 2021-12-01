package DAY_7.com.demo.test;
import java.util.Scanner;
import DAY_7.com.demo.bean.STUDENT;


public class TEST_STUDENT {

	public static void main(String[] args) {
		STUDENT ob=new STUDENT();
		//ob.display();
		System.out.println(ob);
		
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter id");
		int id=sc.nextInt();*/
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter address");
		String addr=sc.next();
		STUDENT ob2=new STUDENT(name,addr);
		System.out.println(ob2);

		STUDENT ob1=new STUDENT("Hitesh","Kalyan");
		//ob1.display();
		System.out.println(ob1);
		System.out.println("name : "+ob1.getSname());
		
	    ob1.setSname("Hitman");
	    System.out.println("after setter method");
	    System.out.println(ob1);
	}

}
