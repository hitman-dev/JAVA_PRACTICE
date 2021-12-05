package DAY_15.com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import DAY_15.com.demo.beans.Student;
import DAY_15.com.demo.service.StudentService;
import DAY_15.com.demo.service.StudentServiceImpl;


public class TestStudentHashSet {

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
			boolean status=ss.addnewStudent();
			if(status) {
				System.out.println("new student added");
			}
			else {
				System.out.println("duplicate student");
			}
			break;
		case 2:
			System.out.println("enter id for delete");
			int id=sc.nextInt();
			status=ss.deleteById(id);
			if(status) {
				System.out.println("Student info deleted");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enetr id");
			id=sc.nextInt();
			System.out.println("enter address");
			String addr=sc.next();
			status=ss.modifyStudent(id,addr);
			if(status) {
				System.out.println("Student info updated");
			}
			else {
				System.out.println("not found");
			}
			
			break;
		case 4:
			ss.displayAll();
			break;
		case 5:
			System.out.println("enetr id");
			id=sc.nextInt();
			Student s=ss.searchById(id);
			if(s!=null) {
				System.out.println(s);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 6:
			System.out.println("enter name");
			String nm=sc.next();
			List<Student> slist=ss.searchByName(nm);
			if(slist!=null) {
				slist.stream().forEach(x->System.out.println(x));
			}else {
				System.out.println("not found");
			}
			
			break;
		case 7:
			TreeSet<Student> ts=ss.sortById();
			ts.stream().forEach(x->System.out.println(x));
			break;
		case 8:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default :
			System.out.println("wrong choice");
		}
		}while(choice!=8);

	}

}
