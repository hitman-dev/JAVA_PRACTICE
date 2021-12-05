package DAY_16.MAP_COLLECTION_DEMO.com.demo.service;
import java.util.List;
import java.util.TreeSet;
import DAY_16.MAP_COLLECTION_DEMO.com.demo.beans.Student;


public interface StudentService {

	boolean addnewStudent();

	void displayAll();

	boolean deleteById(int id);

	boolean modifyStudent(int id, String addr);

	Student searchById(int num);

	List<Student> searchByName(String nm);

	TreeSet<Student> sortById();

}
