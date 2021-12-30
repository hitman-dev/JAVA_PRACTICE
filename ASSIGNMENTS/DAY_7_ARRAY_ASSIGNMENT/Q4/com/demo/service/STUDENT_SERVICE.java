package DAY_7_ARRAY_ASSIGNMENT.Q4.com.demo.service;

import DAY_7_ARRAY_ASSIGNMENT.Q4.com.demo.bean.STUDENT;

import java.util.ArrayList;
import java.util.Scanner;


public class STUDENT_SERVICE {
	static ArrayList<STUDENT> studentList = new ArrayList<>(10);

	private static void main() {
		STUDENT s1 = new STUDENT("Spiderman", 90, 98, 99);
		STUDENT s2 = new STUDENT("Antman", 95, 97, 98);
		STUDENT s3 = new STUDENT("Ironman", 98, 100, 100);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

	}

	public static void addNewStudent() {
		Scanner sc = new Scanner(System.in);
		main();
		System.out.print("Want to add a New Student? y/n: ");
		String choice = sc.nextLine();
		while ("y".equals(choice)){
			System.out.print("Enter Student Name: ");
			String name = sc.nextLine();
			System.out.print("Enter M1: ");
			int m1 = sc.nextInt();
			System.out.print("Enter M2: ");
			int m2 = sc.nextInt();
			System.out.print("Enter M3: ");
			int m3 = sc.nextInt();
			sc.nextLine();
			studentList.add(new STUDENT(name, m1, m2, m3));
			System.out.print("\nWant to add another student? y/n: ");
			choice = sc.nextLine();
			choice = choice.toLowerCase();
		}
	}

	public static void displayStudents() {
		System.out.println("All students details is displayed below:");
		for (STUDENT i : studentList) {
			System.out.print(i + "\n");
		}
	}

	public static boolean checkIdExist(ArrayList<STUDENT> studentList, int id) {
		for (STUDENT student : studentList) {
			if (student.getSid() == (id)) {
				return true;
			}
		}
		return false;
	}

	public static void searchByID(int id) {
		if (checkIdExist(studentList, id)) {
			System.out.println(studentList.get(id - 1));
		} else {
			System.out.println("Student Not Found in the Database !!!");
		}
	}

	public static boolean checkNameExist(ArrayList<STUDENT> studentList, String name) {
		for (STUDENT student : studentList) {
			if (student.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public static void searchByName(String name) {
		if (checkNameExist(studentList, name)) {
			for (STUDENT student : studentList) {
				if (name.equals(student.getName())) {
					System.out.println(student);
				}
			}
		} else {
			System.out.print("Student Not Found!!");
		}
	}

	public static void getGPA(int id) {
		if (checkIdExist(studentList, id)) {
			for (STUDENT student : studentList) {
				if (student.getSid() == id) {
					System.out.printf("%.2f\n", student.calculateGPA());
				}
			}
		} else {
			System.out.println("Student Not Found!!");
		}

	}

}
