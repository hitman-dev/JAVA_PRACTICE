package DAY_6_JAVA_ASSIGNMENT_3.Q2.com.demo.test;

import DAY_6_JAVA_ASSIGNMENT_3.Q2.com.demo.bean.STUDENT;

import java.util.ArrayList;
import java.util.Scanner;

public class TEST_STUDENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        ArrayList<STUDENT> studentList = new ArrayList<>(5);
        do {
            System.out.println("Enter Student details: ");
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter M1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter M2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter M3: ");
            int m3 = sc.nextInt();
            sc.nextLine();
            studentList.add(new STUDENT( name, m1, m2, m3));
            System.out.print("\nWant to add another student? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
        System.out.println("Student Details are below:");

        for (STUDENT student : studentList) {
            System.out.print(student.getSid() + "\n");
        }
    }

}
