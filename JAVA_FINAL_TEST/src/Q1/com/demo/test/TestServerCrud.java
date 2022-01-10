package Q1.com.demo.test;
import Q1.com.demo.beans.Server;
import Q1.com.demo.service.ServerService;
import Q1.com.demo.service.ServerServiceImpl;
import java.util.List;
import java.util.Scanner;

// This class implements the UI for the program
public class TestServerCrud {

	public static void main(String[] args) {
		ServerService ss=new ServerServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		//Printing the menu for the program
		do {
			System.out.print("""
                    
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    |::::::::::::::::MAIN MENU::::::::::::::::::::|
                    |  1. Add new server                          |
                    |  2. Delete a server                         |
                    |  3. Search servers based on no of days      |
                    |  4. Search servers based on price           |
                    |  5. Exit                                    |
                    |:::::::::::::::::::::::::::::::::::::::::::::|
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    Enter a choice:\s""");
			choice=sc.nextInt();
			//Implementing the below cases according the option selected by the user
			switch(choice) {
				case 1:
					boolean status=ss.addNewServer();
					if(status) {
						System.out.println("product added");
					}
					break;
				case 2:
					System.out.println("enetr id");
					int sid=sc.nextInt();
					status=ss.deleteById(sid);
					if(status) {
						System.out.println("deleted successfully");
					}
					else {
						System.out.println("not found");
					}

					break;
				case 3:
					System.out.print("Enter duration: ");
					int sduration = sc.nextInt();
					List<Server> serverList = ss.displayByDays(sduration);
					if (serverList != null) {
						System.out.println("Server with duration less than given duration are: ");
						serverList.forEach(System.out::println);
					} else {
						System.out.println("No Such server found");
					}

					break;
				case 4:
					System.out.print("Enter price: ");
					float price = sc.nextFloat();
					serverList = ss.displayByPrice(price);
					if (serverList != null) {
						System.out.println("Server with price less than given price are: ");
						serverList.forEach(System.out::println);
					} else {
						System.out.println("No Such server found");
					}


					break;

				case 5:
					sc.close();
					ss.closeConnection();
					break;


			}
			
		
		}while(choice!=5);

	}

}
