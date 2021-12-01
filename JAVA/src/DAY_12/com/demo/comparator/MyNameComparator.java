package DAY_12.com.demo.comparator;

import java.util.Comparator;

import com.demo.bean.Student;

public class MyNameComparator implements Comparator<Student> {
	   
       public int compare(Student s1,Student s2) {
    	   System.out.println("in name compare "+s1.getSname()+"----->"+s2.getSname());
    	    return s1.getSname().compareTo(s2.getSname());
       }
}
