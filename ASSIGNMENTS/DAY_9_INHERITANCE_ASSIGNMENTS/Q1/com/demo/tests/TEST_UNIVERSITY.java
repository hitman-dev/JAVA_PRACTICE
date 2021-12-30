package DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.tests;


import DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.services.UNIVERSITY_SERVICE;

import java.util.Scanner;

public class TEST_UNIVERSITY {
    public static void main(String[] args) {
        UNIVERSITY_SERVICE.dataset();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add a student\n2. Add a Faculty\n3. Display Students \n4. Display Faculties\n5. Calculate Faculty salary\n6. Exit");
            System.out.print("Enter a Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    UNIVERSITY_SERVICE.addStudents();
                    break;
                case 2:
                    UNIVERSITY_SERVICE.addFaculty();
                    break;
                case 3:
                    UNIVERSITY_SERVICE.displayStudents();
                    break;
                case 4:
                    UNIVERSITY_SERVICE.displayFaculties();
                    break;
                case 5:
                    UNIVERSITY_SERVICE.facultySalary();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong choice!!");
            }
        } while (true);
    }
}
