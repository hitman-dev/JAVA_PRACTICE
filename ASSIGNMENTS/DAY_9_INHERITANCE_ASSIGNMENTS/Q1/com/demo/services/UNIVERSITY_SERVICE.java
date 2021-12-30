package DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.services;

import DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans.BACHELOR_STUDENTS;
import DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans.FACULTY;
import DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans.Phd_STUDENTS;
import DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans.STUDENTS;

import java.util.ArrayList;
import java.util.Scanner;

public class UNIVERSITY_SERVICE {
    static ArrayList<STUDENTS> studentList = new ArrayList<>();
    static ArrayList<FACULTY> facultyList = new ArrayList<>();
    public static void dataset() {
        Phd_STUDENTS ps1 = new Phd_STUDENTS("Jenny", "M.Tech In AstroPhysics", 91,88,95,"Gravity", 90, "Marvin");
        Phd_STUDENTS ps2 = new Phd_STUDENTS("Bruce", "M.TECH in Electronics amd atomic physics", 93,89,97,"Super soldier serum", 88, "Hulk");
        BACHELOR_STUDENTS bs1 = new BACHELOR_STUDENTS("Wanda", "M.TECH in MetaPhysics", 80,98,95,"Striker Industries", "Manipulation of particles", 92);
        FACULTY f1 = new FACULTY("Tony", "Robotics",  new String[]{"Python","ML","Java"},1000000f);
        FACULTY f2 = new FACULTY("Steven", "Stem Surgery",  new String[]{"BioMedicine","Stem cell cultivation","Bone structures"},5000000f);
        facultyList.add(f1);
        facultyList.add(f2);
        studentList.add(ps1);
        studentList.add(ps2);
        studentList.add(bs1);
    }

    public static void addBachelorStudent() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter degree: ");
            String degree = sc.nextLine();

            System.out.print("Enter M1: ");
            float m1 = sc.nextInt();

            System.out.print("Enter M2: ");
            float m2 = sc.nextInt();

            System.out.print("Enter M3: ");
            float m3 = sc.nextInt();

            System.out.print("Enter Internship Company name: ");
            sc.nextLine();
            String internship = sc.nextLine();

            System.out.print("Enter Special Subject name: ");
            String spSubject = sc.nextLine();

            System.out.print("Enter Special Subject marks: ");
            float marksSpSubject = sc.nextFloat();

            studentList.add(new BACHELOR_STUDENTS(name, degree, m1, m2, m3, internship,spSubject,marksSpSubject));
            System.out.print("\nWant to add another Bachelor student? y/n: ");
            sc.nextLine();
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    public static void addPhdStudent() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter degree: ");
            String degree = sc.nextLine();

            System.out.print("Enter M1: ");
            float m1 = sc.nextInt();

            System.out.print("Enter M2: ");
            float m2 = sc.nextInt();

            System.out.print("Enter M3: ");
            float m3 = sc.nextInt();

            System.out.print("Enter Thesis name: ");
            sc.nextLine();
            String thesisName = sc.nextLine();

            System.out.print("Enter Thesis marks: ");
            float thMarks = sc.nextInt();

            System.out.print("Enter guide name: ");
            String guide = sc.nextLine();

            studentList.add(new Phd_STUDENTS(name, degree, m1, m2, m3, thesisName, thMarks, guide));
            System.out.print("\nWant to add another Phd student? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    public static void addStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Add a Bachelor student\n2. Add a Phd student\n");
        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        if (choice==1){
            addBachelorStudent();
        }
        else if(choice==2){
            addPhdStudent();
        }
        else{
            System.out.println("Wrong input!!");
        }
    }

    public static void addFaculty() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter Faculty Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Special subject: ");
            String spSubject = sc.nextLine();

            String[] skills = acceptSkills();

            System.out.print("Enter Salary: ");
            float salary = sc.nextInt();
            facultyList.add(new FACULTY(name,spSubject,skills,salary));

            System.out.print("\nWant to add another Faculty? y/n: ");
            sc.nextLine();
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    public static String[] acceptSkills() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter skills separated by space: ");
        return sc.nextLine().split(" ");
    }

    public static void displayStudents(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.print("1. Display all Students\n2. Display all Bachelor Students\n3. Display all Phd Students\n4. Return to Main Menu\nEnter a choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    for (STUDENTS student: studentList){
                        System.out.println(student);
                    }
                    break;
                case 2:
                    for(STUDENTS student: studentList){
                        if (student instanceof BACHELOR_STUDENTS){
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    for(STUDENTS student: studentList){
                        if(student instanceof Phd_STUDENTS){
                            System.out.println(student);
                        }
                    }
                    break;
                case 4:
                    return;
            }
        }while (true);
    }

    public static void displayFaculties(){
        for(FACULTY faculty: facultyList){
            System.out.println(faculty);
        }
    }

    public static void facultySalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Faculty name: ");
        String name = sc.nextLine();
        if (checkFacultyExist(facultyList,name)) {
            for (FACULTY faculty: facultyList) {
                if (name.equals(faculty.getName())) {
                    System.out.print("Faculty: "+faculty.getName()+", Salary: "+faculty.calculateSalary()+"\n");
                }
            }
        } else {
            System.out.print("Faculty Not Found!!\n");
        }

    }

    public static boolean checkFacultyExist(ArrayList<FACULTY> facultyList, String name) {
        for (FACULTY faculty : facultyList) {
            if (faculty.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
