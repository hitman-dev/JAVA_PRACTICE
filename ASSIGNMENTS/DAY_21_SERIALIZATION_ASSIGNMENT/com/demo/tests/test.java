package DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.tests;

import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.beans.Student;
import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.services.StudentService;
import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.services.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService ss = new StudentServiceImpl();

        String filepath = "java-repo/src/SerialStudent/resources/student.csv";
        String path = "java-repo/src/SerialStudent/resources/student.txt";

        int sz = ss.readData(filepath);
        ss.csvToTxt(path);
        System.out.println("Size: " + sz);
        int choice;
        do{
            System.out.print("1. Add new Student\n2. Find Student by degree\n3. Display All students\n4. Exit\nChoice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ss.addNewStudent();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter degree name: ");
                    String degree = sc.nextLine();
                    List<Student> sList = ss.findByDegree(path,degree);
                    if(sList.size()!=0){
                        sList.forEach(System.out::println);
                    }else {
                        System.out.println("No student found with this degree!!");
                    }
                    break;
                case 3:
                    ArrayList<Student> lst = ss.displayAll();
                    lst.forEach(System.out::println);
                    break;
                case 4:
                    ss.writeData(filepath);
                    ss.csvToTxt(path);
                    System.out.println("Thank you for visiting");
                    return;
                default:
                    System.out.println("Wrong Choice!!");
            }
        }while(true);
    }
}
