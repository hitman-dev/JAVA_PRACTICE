package DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.test;

import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.beans.User;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.services.UserService;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.services.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class TestUserCrud {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("""
                    
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    |::::::::::::::::MAIN MENU::::::::::::::::::::|
                    |  1. Add new User                            |
                    |  2. Check if User Exist                     |
                    |  3. Display All User                        |
                    |  4. Exit                                    |
                    |:::::::::::::::::::::::::::::::::::::::::::::|
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    Enter a choice:\s"""); choice = sc.nextInt();
            switch (choice) {
                case 1:
                    boolean status = us.addNewUser();
                    if (status) {
                        System.out.println("User Added");
                    }
                    break;
                case 2:
                    System.out.println("Enter UserName: ");
                    String username = sc.next();
                    System.out.println("Enter Address: ");
                    String address = sc.next();
                    User u=us.checkIfExists(username,address);
                    if(u!=null) {
                        System.out.println(u);
                    }
                    else {
                        System.out.println("No such User exists ,Do you want to add this user? y/n :");
                        String ch = sc.next();
                        ch = ch.toLowerCase();
                        if(!"n".equals(ch)){
                            boolean status1 = us.addNewUserIfExists(username,address);
                            if (status1) {
                                System.out.println("User Added");
                            }
                        }

                    }
                    break;
                case 3:
                    List<User>plist=us.displayAll();
                    if(plist!=null) {
                        plist.stream().forEach(System.out::println);
                    }
                    else {
                        System.out.println("No User exists");
                    }
                    break;

                case 4:
                    sc.close();
                    us.closeConnection();
                    break;
            }
        } while (true);
    }
}
