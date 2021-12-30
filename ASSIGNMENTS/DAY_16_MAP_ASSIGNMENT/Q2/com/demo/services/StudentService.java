package DAY_16_MAP_ASSIGNMENT.Q2.com.demo.services;

import DAY_16_MAP_ASSIGNMENT.Q2.com.demo.beans.Student;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Set;

public interface StudentService {

    void dataset();

    boolean addNewStudent() throws ParseException;

    boolean addNewSkill(int id, String skill);

    boolean deleteStudent(int studentId);

    boolean deleteSkill(int studentId, String skill);

    HashMap<Student, Set<String>> displayBySkill(String skill);

    HashMap<Student, Set<String>> displayByDegree(String degree);

    void displayAll();
}
