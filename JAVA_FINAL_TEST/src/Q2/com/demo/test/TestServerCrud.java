package Q2.com.demo.test;
import Q2.com.demo.beans.Server;
import Q2.com.demo.service.ServerService;
import Q2.com.demo.service.ServerServiceImpl;
import java.util.HashSet;
import java.util.Scanner;

// This class implements the UI for the program
public class TestServerCrud {
    public static void main(String[] args) {
        ServerService ss = new ServerServiceImpl();
        Scanner sc = new Scanner(System.in);
        ss.dataset();
        int choice;
        //Printing the menu for the program
        do{
            System.out.print("""
                    
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    |::::::::::::::::MAIN MENU::::::::::::::::::::|
                    |  1. Add new server                          |
                    |  2. Display all server details              |
                    |  3. Exit                                    |
                    |:::::::::::::::::::::::::::::::::::::::::::::|
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    Enter a choice:\s""");
            choice= sc.nextInt();
            //Implementing the below cases according the option selected by the user
            switch (choice){
                case 1:
                    boolean status = ss.addNewServer();
                    if(status){
                        System.out.println("Server Added");
                    }else {
                        System.out.println("Server Not Added");
                    }
                    break;
                case 2:
                    HashSet<Server> serverHashSet = ss.displayAll();
                    if(serverHashSet.size()!=0){
                        serverHashSet.forEach(System.out::println);
                    }else {
                        System.out.println("No Servers are present in the hashset");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Wrong Choice!!");
            }
        }while(true);
    }
}
