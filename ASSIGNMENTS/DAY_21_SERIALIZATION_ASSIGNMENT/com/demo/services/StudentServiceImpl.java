package DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.services;

import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.beans.Student;
import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.dao.StudentDao;
import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.dao.StudentDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

    private StudentDao sDao;

    public StudentServiceImpl() {
        sDao = new StudentDaoImpl();
    }

    @Override
    public int readData(String filepath) {
        return sDao.readData(filepath);
    }

    @Override
    public void writeData(String filepath) {
        sDao.writeData(filepath);
    }

    @Override
    public void csvToTxt(String path) {
        sDao.csvToTxt(path);
    }

    @Override
    public List<Student> findByDegree(String path, String degree) {
        return sDao.findByDegree(path,degree);
    }

    @Override
    public ArrayList<Student> displayAll() {
        return sDao.displayAll();
    }

    @Override
    public void addNewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter degree: ");
        String degree = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        Student s = new Student(studentId, studentName, degree, email);
        sDao.save(s);
    }
}
