package DAY_7_ARRAY_ASSIGNMENT.Q4.com.demo.test;

import DAY_7_ARRAY_ASSIGNMENT.Q4.com.demo.service.STUDENT_SERVICE;

import java.util.Scanner;

public class TEST_STUDENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        STUDENT_SERVICE.addNewStudent();
        int choice ;
        do {System.out.print("1.Display All Student\n2.Search by ID\n3.Search by name\n4.Calculate GPA of a student\n5.Exit\n");
            System.out.print("Enter a choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    STUDENT_SERVICE.displayStudents();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    STUDENT_SERVICE.searchByID(id);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    STUDENT_SERVICE.searchByName(name);
                    break;
                case 4:
                    System.out.print("Enter student ID to calculate GPA: ");
                    id = sc.nextInt();
                    STUDENT_SERVICE.getGPA(id);
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Wrong choice!!!");
            }
        } while (true);
    }
}
