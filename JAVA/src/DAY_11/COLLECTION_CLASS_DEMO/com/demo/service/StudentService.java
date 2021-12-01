package DAY_11.COLLECTION_CLASS_DEMO.com.demo.service;
import DAY_11.COLLECTION_CLASS_DEMO.com.demo.bean.Student;


public interface StudentService {

	void addStudent();

	void displayAll();

	Student searchById(int id);

	boolean removeStudent(int id);

}
