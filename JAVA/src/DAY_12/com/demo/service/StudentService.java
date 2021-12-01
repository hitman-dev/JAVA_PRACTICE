package DAY_12.com.demo.service;

import java.util.List;

import com.demo.bean.Student;

public interface StudentService {

	void addStudent();

	void displayAll();

	Student searchById(int id);

	boolean removeStudent(int id);

	List<Student> searchByName(String nm);

	Boolean modifyAddress(int id, String addr);

	List<Student> sortById(int ch);

}
