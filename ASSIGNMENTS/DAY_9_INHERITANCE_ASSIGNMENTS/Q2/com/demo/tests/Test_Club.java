package DAY_9_INHERITANCE_ASSIGNMENTS.Q2.com.demo.tests;
import DAY_9_INHERITANCE_ASSIGNMENTS.Q2.com.demo.services.Club_Service;

import java.text.ParseException;
import java.util.Scanner;

public class Test_Club {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Club_Service.dataset();
        int choice;
        do {
            System.out.print("""
                    +++++++++++++++++++++++++++++++++++++++++|
                    ::::::::::::::::MAIN MENU::::::::::::::::|
                    1. Add new Person                        |
                    2. Display Employee of a particular type |
                    3. Search by ID                          |
                    4. Search by Name                        |
                    5. Display All Employee                  |
                    6. Calculate salary by designation       |
                    7. Display 5 Employee by department      |
                    8. Exit                                  |
                    +++++++++++++++++++++++++++++++++++++++++|
                    Enter a choice:\s""");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Club_Service.addPerson();
                    break;
                case 2:
                    Club_Service.displayEmployee();
                    break;
                case 3:
                    Club_Service.searchById();
                    break;
                case 4:
                    Club_Service.searchByName();
                    break;
                case 5:
                    Club_Service.displayAllEmployee();
                    break;
                case 6:
                    Club_Service.salaryByDesignation();
                    break;
                case 7:
                    Club_Service.employeeByDepartment();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Incorrect Choice!!");
            }
        } while (true);
    }
}
