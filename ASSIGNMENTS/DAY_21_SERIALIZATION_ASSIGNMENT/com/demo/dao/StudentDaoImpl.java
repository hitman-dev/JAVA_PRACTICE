package DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.dao;

import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.beans.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {
    static ArrayList<Student> studentArrayList = new ArrayList<>();

    public int readData(String filepath) {
        File file = new File(filepath);
        if (file.exists()) {
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String[] studentData = sc.nextLine().split(",");
                    Student student = new Student(Integer.parseInt(studentData[0]), studentData[1], studentData[2], studentData[3]);
                    studentArrayList.add(student);
                }
                return studentArrayList.size();
            } catch (IOException e) {
                return 0;
            }
        } else {
            System.out.println("File not found!!");
            return 0;
        }
    }

    @Override
    public void writeData(String filepath) {
        try (FileWriter fw = new FileWriter(filepath)) {
            String[] studentDetails = new String[4];
            for (Student student : studentArrayList) {
                studentDetails[0] = String.valueOf(student.getStudentId());
                studentDetails[1] = student.getStudentName();
                studentDetails[2] = student.getDegree();
                studentDetails[3] = student.getEmail();
                fw.write(String.join(",", studentDetails) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void csvToTxt(String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            for (Student student : studentArrayList) {
                oos.writeObject(student);
            }
        } catch (EOFException e) {
            System.out.println("Reached at the end");
        } catch (IOException e) {
            System.out.println("e");
        }
    }

    public List<Student> findByDegree(String path, String degree) {
        File file = new File(path);
        List<Student> sList = new ArrayList<>();
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
                while (true) {
                    Student student = (Student) ois.readObject();
                    if (student.getDegree().equals(degree)) {
                        sList.add(student);
                    }
                }
            }catch (EOFException e) {
                return sList;
            } catch (IOException | ClassNotFoundException e) {
                System.out.println();
                return sList;
            }
        }
        return sList;
    }

    @Override
    public ArrayList<Student> displayAll() {
        return studentArrayList;
    }

    @Override
    public void save(Student s) {
        Scanner sc = new Scanner(System.in);
        boolean duplicate = studentArrayList.stream().anyMatch(student -> student.getStudentId() == s.getStudentId());
        if (duplicate) {
            for (Student student : studentArrayList) {
                if (student.getStudentId() == s.getStudentId()) {
                    System.out.print("Student already exist, do you want to overwrite (y/n): ");
                    String choice = sc.nextLine();
                    if (choice.equals("y")) {
                        student.setStudentId(s.getStudentId());
                        student.setStudentName(s.getStudentName());
                        student.setDegree(s.getDegree());
                        student.setEmail(s.getEmail());
                        System.out.println("Student's details modified successfully");
                    } else {
                        System.out.println("Student's previous details were not changed.");
                    }
                }
            }
        } else {
            studentArrayList.add(s);
            System.out.println(" New Student added successfully.");
        }
    }
}
