package DAY_16_MAP_ASSIGNMENT.Q2.com.demo.tests;

import DAY_16_MAP_ASSIGNMENT.Q2.com.demo.beans.Student;
import DAY_16_MAP_ASSIGNMENT.Q2.com.demo.services.StudentService;
import DAY_16_MAP_ASSIGNMENT.Q2.com.demo.services.StudentServiceImpl;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Student_Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        StudentService ss = new StudentServiceImpl();
        ss.dataset();
        int choice;
        do {
            System.out.print("""
                    
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    |::::::::::::::::MAIN MENU::::::::::::::::::::|
                    |  1. Add new Student                         |
                    |  2. Add New Skill for a Student             |
                    |  3. Delete student                          |
                    |  4. Delete Skill for a student              |
                    |  5. Display all students with given skill   |
                    |  6. Display all students with given degree  |
                    |  7. Display all Students                    |
                    |  8. Exit                                    |
                    |:::::::::::::::::::::::::::::::::::::::::::::|
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    Enter a choice:\s""");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    boolean flag = ss.addNewStudent();
                    if (flag) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Student was not added.");
                    }
                    break;
                case 2:
                    System.out.print("Enter student id: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter skill to add: ");
                    String skill = sc.nextLine();
                    flag = ss.addNewSkill(studentId, skill);
                    if (flag) {
                        System.out.println("Skill added successfully");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student id to delete: ");
                    studentId = sc.nextInt();
                    flag = ss.deleteStudent(studentId);
                    if (flag) {
                        System.out.println("Student removed successfully");
                    } else {
                        System.out.println("Student not found!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter student id: ");
                    studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter skill you want to delete: ");
                    skill = sc.nextLine();
                    flag = ss.deleteSkill(studentId, skill);
                    if (flag) {
                        System.out.println("Skill deleted successfully");
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Enter skill: ");
                    skill = sc.nextLine();
                    HashMap<Student, Set<String>> mapBySkills = ss.displayBySkill(skill);
                    if (mapBySkills.size() != 0) {
                        mapBySkills.forEach((k,v)-> System.out.println(k+", Skills: "+v));
                    } else {
                        System.out.println("No student found with this skill!!");
                    }
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Enter degree: ");
                    String degree = sc.nextLine();
                    HashMap<Student, Set<String>> mapByDegree = ss.displayByDegree(degree);
                    if (mapByDegree.size() != 0) {
                        mapByDegree.forEach((k,v)-> System.out.println(k+", Skills: "+v));
                    } else {
                        System.out.println("No student found with this degree!!");
                    }
                    break;
                case 7:
                    ss.displayAll();
                    break;
                case 8:
                    System.out.println("Thank you for visiting");
                    return;
                default:
                    System.out.println("Wrong choice!!");
            }
        } while (true);
    }
}
