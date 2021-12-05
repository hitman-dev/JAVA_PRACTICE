package DAY_16.MAP_COLLECTION_DEMO.com.demo.test;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import DAY_16.MAP_COLLECTION_DEMO.com.demo.beans.Student;


public class TestMapClasses {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(null,"Aditya");
		hs.put(123,"Eshwari");
		hs.put(111,"deepa");
		hs.put(null,"Amit");
		System.out.println(hs);
		
		Map<String,String> tmap=new TreeMap<>();
		tmap.put("Sanjay","MBBBs");
		tmap.put("Rajesh","Btech");
		tmap.put("Ashu","BDess");
		tmap.put("Rajesh","BBA");
		tmap.put("Deepa","ME");
		System.out.println(tmap);
		Map<Student,String> ts=new TreeMap<>();
		ts.put(new Student(123),"testing");
		ts.put(new Student(345,"Swati","Pune",LocalDate.of(2000,11,11)),"testing");
		for(Student s:ts.keySet()) {
			if(s.getSid()==123) {
				s.setSname("Asawari");
				
			}
		}
		System.out.println(ts);
		
	}

	

}
