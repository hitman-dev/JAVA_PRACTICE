package DAY_21.com.demo.test;
import java.util.List;
import java.util.Scanner;
import DAY_21.com.demo.beans.Friend;
import DAY_21.com.demo.service.FriendService;
import DAY_21.com.demo.service.FriendServiceImpl;


public class TestCRUDSerialization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FriendService fs=new FriendServiceImpl();
		int sz=fs.readData();
		System.out.println("size: "+sz);
		int choice=0;
		do {
			System.out.println("1. Add new friend\n 2. delete friend by id\n3. modify mobile\n");
			System.out.println("4. display All \n 5. search by id\n 6.search by name\n7.exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				fs.addNewFriend();
				break;
			case 2:
				System.out.println("enetr id to delete");
				int id=sc.nextInt();
				boolean status=fs.deleteById(id);
				if(status) {
					System.out.println("deletec successfully");
					
				}else {
					System.out.println("id not found");
				}
				break;
			case 4:
				List<Friend> lst=fs.displayAll();
				lst.stream().forEach(System.out::println);
				break;
			case 7:
				fs.writeData();
				sc.close();
				System.out.println("thank you for visisitng....");
				break;
			default:
				System.out.println("wrong choice");
				
				
			}
			
		}while(choice!=7);
	}

}
