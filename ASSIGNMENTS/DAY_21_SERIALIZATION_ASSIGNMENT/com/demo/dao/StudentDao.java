package DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.dao;

import DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.beans.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentDao {
    int readData(String filepath);
    void writeData(String filepath);
    void csvToTxt(String filepath);
    List<Student> findByDegree(String path, String degree);
    ArrayList<Student> displayAll();
    void save(Student s);
}
