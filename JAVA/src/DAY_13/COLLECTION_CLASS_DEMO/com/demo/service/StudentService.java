package DAY_13.COLLECTION_CLASS_DEMO.com.demo.service;
import java.util.List;
import DAY_13.COLLECTION_CLASS_DEMO.com.demo.bean.Student;


public interface StudentService {

	void addStudent();

	void displayAll();

	Student searchById(int id);

	boolean removeStudent(int id);

	List<Student> searchByName(String nm);

	Boolean modifyAddress(int id, String addr);

	List<Student> sortById(int ch);

}
