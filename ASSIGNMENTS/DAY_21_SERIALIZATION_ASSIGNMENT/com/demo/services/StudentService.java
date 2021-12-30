package DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.services;

import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.beans.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    int readData(String filepath);

    void writeData(String filepath);

    void csvToTxt(String path);

    List<Student> findByDegree(String path, String degree);
    ArrayList<Student> displayAll();

    void addNewStudent();

}
