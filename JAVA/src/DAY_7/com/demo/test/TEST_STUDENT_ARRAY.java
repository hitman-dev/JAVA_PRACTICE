package DAY_7.com.demo.test;
import DAY_7.com.demo.bean.STUDENT;
import DAY_7.com.demo.service.STUDENT_SERVICE;

import java.util.Scanner;



public class TEST_STUDENT_ARRAY {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
				System.out.println("1. add new student\n 2. display all\n 3. search by id\n 4.search by name\n");
				System.out.println("5. update student 6. exit ");
				System.out.println("enter choice");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					STUDENT_SERVICE.addNewStudent();
					break;
				case 2:
					STUDENT_SERVICE.displayAll();
					break;
				case 3:
					System.out.println("enter id");
					int id=sc.nextInt();
					STUDENT s= STUDENT_SERVICE.searchById(id);
					if(s!=null) {
						System.out.println(s);
					}
					else {
						System.out.println("not found");
					}
					break;
				case 4:
					System.out.println("enter name");
					String nm=sc.next();
					STUDENT[] arr=STUDENT_SERVICE.searchByName(nm);
					if(arr!=null) {
						//Arrays.stream(arr).forEach(sob->System.out.println(sob));
						for(STUDENT ob:arr) {
							if(ob!=null) {
								System.out.println(ob);
							}
							else {
								break;
							}
						}
					}
					else {
						System.out.println("not found");
					}
					break;
				case 5:
					System.out.println("enetr id");
					 id=sc.nextInt();
					 System.out.println("enetr address");
					 String addr=sc.next();
					 boolean status=STUDENT_SERVICE.updateAddress(id,addr);
					 if(status) {
						 System.out.println("updation done");
					 }
					 else {
						 System.out.println("not found");
					 }
					
					break;
				case 6:
					//System.exit(0);
					System.out.println("Thank you for visiting");
					break;
				default:
					System.out.println("wrong choice");
				}
				
		}while(choice!=6);

	}

}
