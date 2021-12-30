package DAY_16_MAP_ASSIGNMENT.Q2.com.demo.services;

import DAY_16_MAP_ASSIGNMENT.Q2.com.demo.beans.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentServiceImpl implements StudentService {
    HashMap<Student, Set<String>> studentMap = new HashMap<>();

    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    static Scanner sc = new Scanner(System.in);

    @Override
    public void dataset() {
        studentMap.put(new Student(1, "Tony", new Date(10 / 7 / 1965), "Science", 99f), new HashSet<>(Arrays.asList("science", "make things", "Invent tech")));
        studentMap.put(new Student(2, "Thor", new Date(1 / 11 / 1020), "Astronomy", 95f), new HashSet<>(Arrays.asList("thunder", "eat", "fly")));
        studentMap.put(new Student(3, "Steve", new Date(22 / 5 / 1780), "PE", 96f), new HashSet<>(Arrays.asList("run", "read", "exercise")));
        studentMap.put(new Student(4, "Bruce", new Date(18 / 2 / 1950), "Atomic Physics", 98f), new HashSet<>(Arrays.asList("study", "get angry", "make new things")));
    }

    @Override
    public boolean addNewStudent() throws ParseException {
        System.out.print("Enter student id: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter bDate as DD/MM/YYYY: ");
        String string = sc.nextLine();
        Date bDate = format.parse(string);
        System.out.print("Enter degree name: ");
        String degree = sc.nextLine();
        System.out.print("Enter Marks for degree: ");
        float marks = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Skills separated by space: ");
        String[] skills = sc.nextLine().split(" ");

        Set<String> skillSet = new HashSet<>(Arrays.asList(skills));

        boolean flag = studentMap.keySet().stream().anyMatch(student -> student.getStudentId() == studentId);

        if (flag) {
            System.out.print("Student already exists, do you want to overwrite (y/n): ");
            String choice = sc.nextLine();
            if (choice.equals("y")) {
                for (Student student : studentMap.keySet()) {
                    if (student.getStudentId() == studentId) {
                        student.setStudentId(studentId);
                        student.setStudentName(studentName);
                        student.setbDate(bDate);
                        student.setDegree(degree);
                        student.setMarks(marks);
                        studentMap.get(student).addAll(skillSet);
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            studentMap.put(new Student(studentId, studentName, bDate, degree, marks), skillSet);
            return true;
        }
    }

    @Override
    public boolean addNewSkill(int studentId, String skill) {
        for (Student student : studentMap.keySet()) {
            if (student.getStudentId() == studentId) {
                studentMap.get(student).add(skill);
                System.out.println(student + ": " + studentMap.get(student));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteStudent(int studentId) {
        for (Student student : studentMap.keySet()) {
            if (student.getStudentId() == studentId) {
                System.out.println(student);
                studentMap.remove(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteSkill(int studentId, String skill) {
        for (Student student : studentMap.keySet()) {
            if (student.getStudentId() == studentId) {
                return studentMap.get(student).removeIf(s -> s.equals(skill));
            }
        }
        return false;
    }

    @Override
    public HashMap<Student, Set<String>> displayBySkill(String skill) {
        HashMap<Student, Set<String>> mapBySkills = new HashMap<>();
        for (Student student : studentMap.keySet()) {
            if (studentMap.get(student).contains(skill)) {
                mapBySkills.put(student, studentMap.get(student));
            }
        }
        return mapBySkills;
    }

    @Override
    public HashMap<Student, Set<String>> displayByDegree(String degree) {
        HashMap<Student, Set<String>> mapByDegree = new HashMap<>();
        for (Student student : studentMap.keySet()) {
            if (student.getDegree().equals(degree)) {
                mapByDegree.put(student, studentMap.get(student));
            }
        }
        return mapByDegree;
    }

    @Override
    public void displayAll() {
        studentMap.forEach((k, v) -> {
            System.out.println(k + ", Skills: " + v);
        });
    }
}
