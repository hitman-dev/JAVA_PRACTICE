package DAY_7_ARRAY_ASSIGNMENT.Q_Q2.com.demo.test;

import DAY_7_ARRAY_ASSIGNMENT.Q_Q2.com.demo.service.FRIENDS_SERVICE;

import java.text.ParseException;
import java.util.Scanner;

public class TEST_FRIENDS {
        public static void main(String[] args) throws ParseException {
            Scanner sc = new Scanner(System.in);
            FRIENDS_SERVICE.addFriends();
            int choice;
            do {
                System.out.print("1. Display Friends\n2 Search by id\n3.Search by name\n4.Display friends with a particular hobby\n5. Exit\nEnter choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        FRIENDS_SERVICE.displayFriends();
                        break;
                    case 2:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        FRIENDS_SERVICE.searchById(id);
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.print("Enter first name: ");
                        String fName = sc.nextLine();
                        System.out.print("Enter last name: ");
                        String lName = sc.nextLine();
                        FRIENDS_SERVICE.searchByName(fName, lName);
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.print("Enter a hobby: ");
                        String hobby = sc.nextLine();
                        FRIENDS_SERVICE.searchByHobby(hobby);
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Incorrect choice!!");
                }
            } while (true);

        }
}
